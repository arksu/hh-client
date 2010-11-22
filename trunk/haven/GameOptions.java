/**
 * @(#)Menu.java
 *
 *
 * @author
 * @version 1.00 2009/10/23
 */
package haven;
import java.awt.Color;
public class GameOptions extends Window{

	static {
	Widget.addtype("gopts", new WidgetFactory() {
		public Widget create(Coord c, Widget parent, Object[] args) {
		    if(args.length < 2)
			return(new Window(c, (Coord)args[0], parent, null));
		    else
			return(new Window(c, (Coord)args[0], parent, (String)args[1]));
		}
	    });
	    wbox = new IBox("gfx/hud", "tl", "tr", "bl", "br", "extvl", "extvr", "extht", "exthb");
    }
	Label sfxVol;
	Label musicVol;
	FillBox sfxVolBar;
	FillBox musicVolBar;
	CheckBox musicToggle;
	CheckBox soundToggle;
	Button okBtn;
	Button cancelBtn;

    public GameOptions(Widget parent) {
    	super (MainFrame.getInnerSize().div(2).add(-200,-200), Coord.z.add(200,200), parent, "Game Options");

    	//	SFX volume
    	sfxVol = new Label(new Coord(0,0), this, "SFX Vol:");
    	sfxVolBar = new FillBox(Coord.z.add(sfxVol.sz.x + 5, 0), Coord.z.add(120,20), CustomConfig.sfxVol, this);

    	//	Music volume bar
    	musicVol = new Label(new Coord(0, 30), this, "Music Vol:");
    	musicVolBar = new FillBox(Coord.z.add(sfxVol.sz.x + 5, 30), Coord.z.add(120, 20), CustomConfig.musicVol, this);

		//	Sound toggle
		soundToggle = new CheckBox(Coord.z.add(0,140), this, "Sound On/Off");
		soundToggle.a = CustomConfig.isSoundOn;

		//	Music toggle
    	musicToggle = new CheckBox(Coord.z.add(soundToggle.sz.x,140), this, "Music On/Off");
    	musicToggle.a = CustomConfig.isMusicOn;
    	
    	//	Ok button
	//	okBtn = new Button(new Coord(50, 190), 50, this, "Ok");

		//	Cancel button
	//	cancelBtn = new Button(okBtn.c.add(okBtn.sz.x+10,0), okBtn.sz.x, this, "Cancel");

    	ui.bind(sfxVolBar, CustomConfig.wdgtID++);
    	ui.bind(musicVolBar, CustomConfig.wdgtID++);
    	ui.bind(musicToggle, CustomConfig.wdgtID++);
    	ui.bind(soundToggle, CustomConfig.wdgtID++);
    	ui.bind(okBtn, CustomConfig.wdgtID++);
    	ui.bind(cancelBtn, CustomConfig.wdgtID++);
    	pack();
    }
    public void wdgmsg(Widget sender, String msg, Object... args) {
		if(sender == cbtn)
		{
			super.toggle();
            return;
		} else if(sender == sfxVolBar && msg == "change")
		{
			CustomConfig.sfxVol = args[0] != null ? ((Integer)args[0]).intValue() : CustomConfig.sfxVol;
			return;
		} else if(sender == musicVolBar && msg == "change")
		{
			CustomConfig.musicVol = args[0] != null ?  ((Integer)args[0]).intValue() : CustomConfig.musicVol;
			return;
		} else if(sender == musicToggle && msg == "ch")
		{
			CustomConfig.isMusicOn = args[0] != null ? ((Boolean)args[0]).booleanValue() : CustomConfig.isMusicOn;
			return;
		} else if(sender == soundToggle && msg == "ch")
		{
			CustomConfig.isSoundOn = args[0] != null ? ((Boolean)args[0]).booleanValue() : CustomConfig.isSoundOn;
			return;
		}else if(sender == okBtn && msg == "activate")
		{
			return;
		}else if (sender == cancelBtn && msg == "activate")
		{
			return;
		}
		super.wdgmsg(sender, msg, args);
	}
}
class FillBox extends Widget
    {
    	IBox borders = new IBox("gfx/hud", "tl", "tr", "bl", "br", "extvl", "extvr", "extht", "exthb");
    	protected int value;
    	boolean mouseDown = false;
    	public FillBox(Coord loc, Coord size, int startValue, Widget parent)
    	{
    		super(loc, size, parent);
    		value = startValue;
    	}
    	public void draw(GOut g)
    	{
    		borders.draw(g, Coord.z, sz);
    		g.frect(Coord.z.add(10,6), new Coord(value, sz.y-12));
    	}
    	public boolean mousedown(Coord c, int button)
    	{
    		if(button == 1)
    		{
    			mouseDown = true;
    			ui.grabmouse(this);
    			if(c.x > 10 && c.x < 110)
    				value = (c.x-10)%100;
    			return true;
    		}
    		return super.mousedown(c, button);
    	}
    	public boolean mouseup(Coord c, int button)
    	{
    		if(button == 1 && mouseDown)
    		{
    			mouseDown = false;
    			ui.grabmouse(null);
    			return true;
    		}
    		return super.mouseup(c, button);
    	}
    	public void mousemove(Coord c)
    	{
    		if(mouseDown)
    		{
    			if(c.x > 10 && c.x < 110)
    				value = (c.x-10)%100;
    			wdgmsg(this, "change", Integer.valueOf(value));
    			return;
    		}
    		super.mousemove(c);
    	}
    }