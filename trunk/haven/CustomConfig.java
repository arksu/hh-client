 /**
 * @(#)CustomConfig.java
 *
 *
 * @author
 * @version 1.00 2009/10/19
 */

package haven;
import java.io.*;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class CustomConfig {

	static class FilteredTextField extends JTextField {

	    String defbadchars = "`~!@#$%^&*()_-+=\\|\"':;?/>.<, ";
	    String badchars = defbadchars;
	    boolean noLetters = false;
	    boolean noNumbers = false;
	    int maxCharacters = 0;

	    public void processKeyEvent(KeyEvent ev) {

	        char c = ev.getKeyChar();

	        if(Character.isDigit(c) && noNumbers && !ev.isAltDown() || badchars.indexOf(c) > -1)
	        {
	            ev.consume();
	            return;
	        }
	        if(Character.isLetter(c) && noLetters && !ev.isAltDown() || badchars.indexOf(c) > -1)
	        {
	        	ev.consume();
	        	return;
	        }
	        if(	   getText().length() >= maxCharacters
	        	&& maxCharacters > 0
	        	&& ev.getKeyCode() != KeyEvent.VK_BACK_SPACE
	        	&& ev.getKeyCode() != KeyEvent.VK_LEFT
	        	&& ev.getKeyCode() != KeyEvent.VK_RIGHT
	        	&& ev.getKeyCode() != KeyEvent.VK_HOME
	        	&& ev.getKeyCode() != KeyEvent.VK_END)
	        {
	        	ev.consume();
	        	return;
	        }
	        super.processKeyEvent(ev);

	    }
	    public void setBadChars(String badchars)
	    {
	    	this.badchars = badchars;
	    }
	    public void setMaxCharacters(int maxChars)
	    {
	    	maxCharacters = maxChars;
	    }
	    public void setDefaultBadChars()
	    {
	    	badchars = defbadchars;
	    }
	    public void setNoNumbers(boolean state)
	    {
	    	noNumbers = state;
	    }
	    public void setNoLetters(boolean state)
	    {
	    	noLetters = state;
	    }
	}
	static class CharData
	{
		String name;
		int hudActiveBelt = 1;
		String[][]hudBelt = new String[10][10];

		public CharData(String name)
		{
			this.name = name;
		}
		public String toString()
		{
			return "Name=\"" + name + "\"";
		}
	}
	public static Coord invCoord = Coord.z;
	public static int sfxVol = 100;
	public static int musicVol = 100;
	public static List<CharData> characterList = new ArrayList<CharData>();
	public static CharData activeCharacter;
	public static int wdgtID = 1000;
	public static boolean isMusicOn = false;
	public static boolean isSoundOn = false;
	public static boolean hasNightVision = true;
	public static boolean isSaveable = false;
	public static boolean noChars = true;

	public static void setDefaults()
	{
		sfxVol = 100;
		musicVol = 100;
		isMusicOn = false;
		isSoundOn = false;
		hasNightVision = true;
	}
    public static boolean load() {
    	setDefaults();
    	BufferedReader reader = null;
    	try{
    		SAXParserFactory spFactory = SAXParserFactory.newInstance();
	    	SAXParser saxParser = spFactory.newSAXParser();

	    	XMLReader xmlReader = saxParser.getXMLReader();
		    xmlReader.setContentHandler(new DefaultHandler(){
			    public void startElement(String namespaceURI, String localName,
			    							String qName, Attributes atts) throws SAXException
			    {
			    	String value;
			    	String key = qName.toUpperCase().trim();

			    	//	Logs the loading sequence on the console
			    	if(key.equals("SOUND")){
			    		value = atts.getValue("enabled") == null ? "true" : atts.getValue("enabled");
			    		isSoundOn = Boolean.parseBoolean(value);

			    		value = atts.getValue("volume") == null ? "100" : atts.getValue("volume");
			    		sfxVol = Integer.parseInt(value);
			    	}else if(key.equals("MUSIC")){
			    		value = atts.getValue("enabled") == null ? "true" : atts.getValue("enabled");
			    		isMusicOn = Boolean.parseBoolean(value);

			    		value = atts.getValue("volume") == null ? "100" : atts.getValue("volume");
			    		musicVol = Integer.parseInt(value);
			    	}
			    }
			});
			if(ResCache.global != null){
				xmlReader.parse(new InputSource(ResCache.global.fetch("config.xml")));
			}else {
				xmlReader.parse("config.xml");
			}
    		return true;
    	}catch (FileNotFoundException fileNotFound){
    		System.out.println("Config file not found, creating a new one");
    	}catch (IOException IOExcep){
    		IOExcep.printStackTrace();
    	}catch (NullPointerException NPExcep)
    	{
    		System.out.println("File format corrupted, creating a new one");
    		NPExcep.printStackTrace();
    	}catch (NumberFormatException NFExcep)
    	{
    		System.out.println("Wrong config file format, creating a new one");
    	}catch (ParserConfigurationException pcExcep){
    		pcExcep.printStackTrace();
    	}catch (SAXException saxExcep){
	    	saxExcep.printStackTrace();
	    }finally{
    		try
    		{
    			reader.close();
    		}catch(Exception e){}
    	}
    	return false;
    }
    public static double getSFXVolume()
    {
    	return (double)sfxVol/100;
    }
    public static synchronized void saveSettings()
    {
    	try{
    			BufferedWriter writer;
    			if(ResCache.global != null){
    				writer = new BufferedWriter(new OutputStreamWriter(ResCache.global.store("config.xml")));
    			}else {
    				writer = new BufferedWriter(new FileWriter(new File("config.xml")));
    			}
    			writer.write("<?xml version=\"1.0\" ?>\n");
    			writer.write("<CONFIG>\n");
    			writer.write("\t<SOUND enabled=\"" + Boolean.toString(isSoundOn)
    						+ "\" volume=\"" + Integer.toString(sfxVol) + "\"/>\n");
    			writer.write("\t<MUSIC enabled=\"" + Boolean.toString(isMusicOn)
    						+ "\" volume=\"" + Integer.toString(musicVol) + "\"/>\n");

    			writer.write("</CONFIG>");
    			writer.close();
    	}catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    public static void main(final String args[])
    {
    	if(!load())
    	{
    		setDefaults();
    		final JFrame configFrame = new JFrame("Screen Size");
    		Container contentPane = configFrame.getContentPane();
    		final JPanel clientSettingsPanel = new JPanel(new GridBagLayout(), true);
    		JButton startBtn = new JButton("Start!");
    		GridBagConstraints constraints;
    		final FilteredTextField xField = new FilteredTextField();
    		final FilteredTextField yField = new FilteredTextField();
    		final JRadioButton typeStandard = new JRadioButton("Standard resolution:", true);
    		final JRadioButton typeCustom = new JRadioButton("Custom resolution:", false);
    		final JComboBox stdRes = new JComboBox(new Coord[]{
    			new Coord(800, 600),
    			new Coord(1024, 768),
    			new Coord(1280, 720),
    			new Coord(1280, 768),
    			new Coord(1280, 800)
    		});

    		configFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		stdRes.setSelectedIndex(0);
    		stdRes.setEditable(false);

    		xField.setNoLetters(true);
    		yField.setNoLetters(true);
    		xField.setColumns(4);
    		yField.setColumns(4);
    		xField.setText("800");
    		yField.setText("600");
    		xField.setEditable(false);
    		yField.setEditable(false);

    		contentPane.setLayout(new GridBagLayout());

    		//	Adding client components
    		constraints = new GridBagConstraints();
    		constraints.anchor = GridBagConstraints.WEST;

    		constraints.gridx = 0;
    		constraints.gridy = 0;
    		clientSettingsPanel.add(typeStandard, constraints);

    		constraints.gridx = 1;
    		constraints.gridwidth = 2;
    		clientSettingsPanel.add(stdRes, constraints);

    		constraints.gridx = 0;
    		constraints.gridy = 1;
    		constraints.gridwidth = 1;
    		clientSettingsPanel.add(typeCustom, constraints);

    		constraints.gridx = 1;
    		clientSettingsPanel.add(xField, constraints);

    		constraints.gridx = 2;
    		clientSettingsPanel.add(yField, constraints);

    		//	Adding panel components
    		constraints.anchor = GridBagConstraints.NORTH;
    		constraints.gridx = 0;
    		constraints.gridy = 0;
    		contentPane.add(clientSettingsPanel, constraints);

    		constraints.gridx = 2;
    		constraints.gridy = 2;
    		constraints.insets.top = 10;
    		clientSettingsPanel.add(startBtn, constraints);
    		
    		constraints.gridx = 1;
    		constraints.gridy = 3;
    		constraints.insets.top = 0;

    		typeStandard.addChangeListener(new ChangeListener(){
    			public void stateChanged(ChangeEvent e)
    			{
    				if(!typeStandard.isSelected() && !typeCustom.isSelected())
    				{
    					typeStandard.setSelected(true);
    				}
    				if(typeStandard.isSelected())
	    			{
	    				stdRes.setEnabled(true);
	    				typeCustom.setSelected(false);
	    			} else
	    			{
	    				stdRes.setEnabled(false);
	    			}
    			}
    		});
    		typeCustom.addChangeListener(new ChangeListener(){
    			public void stateChanged(ChangeEvent e)
    			{
    				if(!typeStandard.isSelected() && !typeCustom.isSelected())
    				{
    					typeCustom.setSelected(true);
    				}
    				if(typeCustom.isSelected())
    				{
    					xField.enable();
    					yField.enable();
    					xField.setEditable(true);
    					yField.setEditable(true);
    					typeStandard.setSelected(false);
    					stdRes.disable();
    				} else
    				{
    					xField.setEditable(false);
    					yField.setEditable(false);
    					xField.disable();
    					yField.disable();
    					stdRes.enable();
    				}
    			}
    		});
    		xField.addFocusListener(new FocusListener(){
    			public void focusGained(FocusEvent e){}
    			public void focusLost(FocusEvent e)
    			{
    				try{
    					if(Integer.parseInt(xField.getText()) < 800)
	    				{
	    					xField.setText("800");
	    				}
    				} catch(NumberFormatException NFExcep)
    				{
    					xField.setText("800");
    				}
    			}
    		});
    		yField.addFocusListener(new FocusListener(){
    			public void focusGained(FocusEvent e){}
    			public void focusLost(FocusEvent e)
    			{
    				try{
    					if(Integer.parseInt(yField.getText()) < 600)
    					{
    						yField.setText("600");
    					}
    				} catch(NumberFormatException NFExcep)
    				{
    					yField.setText("600");
    				}
    			}
    		});
    		startBtn.addActionListener(new ActionListener(){
	   			public void actionPerformed(ActionEvent e)
    			{
    				saveSettings();
    				Thread mainThread = new Thread(){
    					public void run()
    					{
    						MainFrame.main(args);
    					}
    				};
    				mainThread.start();
    				configFrame.dispose();
    			}
    		});
    		configFrame.pack();
    		Toolkit toolkit = Toolkit.getDefaultToolkit();
    		configFrame.setLocation((int)(toolkit.getScreenSize().getWidth() - configFrame.getWidth())/2,
    								(int)(toolkit.getScreenSize().getHeight() - configFrame.getHeight())/2);
    		configFrame.setVisible(true);
    	} else
    	{
    		saveSettings();
    		MainFrame.main(args);
    	}
    }
}