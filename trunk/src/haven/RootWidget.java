/*
 *  This file is part of the Haven & Hearth game client.
 *  Copyright (C) 2009 Fredrik Tolf <fredrik@dolda2000.com>, and
 *                     Björn Johannessen <johannessen.bjorn@gmail.com>
 *
 *  Redistribution and/or modification of this file is subject to the
 *  terms of the GNU Lesser General Public License, version 3, as
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Other parts of this source tree adhere to other copying
 *  rights. Please see the file `COPYING' in the root directory of the
 *  source tree for details.
 *
 *  A copy the GNU Lesser General Public License is distributed along
 *  with the source tree of which this file is a part in the file
 *  `doc/LPGL-3'. If it is missing for any reason, please see the Free
 *  Software Foundation's website at <http://www.fsf.org/>, or write
 *  to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 *  Boston, MA 02111-1307 USA
 */

package haven;

import haven.hhl.hhl_main;

import java.awt.event.KeyEvent;

public class RootWidget extends ConsoleHost {
    public static Resource defcurs = Resource.load("gfx/hud/curs/arw");
    Logout logout = null;
    Profile gprof;
    GameOptions opts;
    boolean afk = false;

    public RootWidget(UI ui, Coord sz) {
	super(ui, new Coord(0, 0), sz);
	setfocusctl(true);
	cursor = defcurs;
    }
	
    public boolean globtype(char key, KeyEvent ev) {
	if(!super.globtype(key, ev)) {
	    if(Config.profile && (key == '`')) {
//		new Profwnd(findchild(SlenHud.class), findchild(MapView.class).prof, "MV prof");
	    } else if(Config.profile && (key == '~')) {
//		new Profwnd(findchild(SlenHud.class), gprof, "Glob prof");
	    } else if(Config.profile && (key == '!')) {
//		new Profwnd(findchild(SlenHud.class), findchild(MapView.class).mask.prof, "ILM prof");
	    } else if(key == ':') {
		    entercmd();
	    } else if(key+96 == 'o' && ev.isControlDown())
	    {
	   	    if(opts == null)
	   	    {
	   	    	opts = new GameOptions(this);
	   	    	ui.bind(opts, CustomConfig.wdgtID++);
	   	    }
	    	else{
	    		opts.raise();
	    	}
        } else if ((ev.getKeyCode() == KeyEvent.VK_Y) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            Config.render_enable = !Config.render_enable;
            Config.saveOptions();
	   	// 12.12.2010
        } else if ((ev.getKeyCode() == KeyEvent.VK_Z) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            Config.assign_to_tile = !Config.assign_to_tile;
            Config.saveOptions();
        // 11.12.2010
        } else if ((ev.getKeyCode() == KeyEvent.VK_D) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            Config.debug_flag = !Config.debug_flag;
        // arksu: 18.11.2010
        } else if ((ev.getKeyCode() == KeyEvent.VK_X) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            Config.xray = !Config.xray;
            Config.saveOptions();
        } else if ((ev.getKeyCode() == KeyEvent.VK_H) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            Config.hide = !Config.hide;
            Config.saveOptions();
        } else if ((ev.getKeyCode() == KeyEvent.VK_N) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            CustomConfig.hasNightVision = !CustomConfig.hasNightVision;
        } else if ((ev.getKeyCode() == KeyEvent.VK_F) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            if (ark_bot.mapview != null) ark_bot.mapview.ResetCam();
        // arksu: 20.11.2010
        } else if ((ev.getKeyCode() == KeyEvent.VK_G) && ((ev.getModifiers() & ev.CTRL_MASK) != 0)) {
            Config.show_map_grid = !Config.show_map_grid;
            Config.saveOptions();
        // arksu: 28.06.2010
        // F4
        } else if (ev.getKeyCode() == KeyEvent.VK_F4) {
                OptWnd.ToggleHide("gfx/tiles/wald");
                OptWnd.ToggleHide("gfx/tiles/dwald");
        // F5
        } else if (ev.getKeyCode() == KeyEvent.VK_F5) {
                OptWnd.ToggleHide("gfx/terobjs/trees");
        // F6
        } else if (ev.getKeyCode() == KeyEvent.VK_F6) {
                OptWnd.ToggleHide("gfx/terobjs/bumlings");
        // F7
        } else if (ev.getKeyCode() == KeyEvent.VK_F7) {
                OptWnd.ToggleHide("gfx/arch/walls");
                OptWnd.ToggleHide("gfx/arch/gates");
        // F8
        } else if (ev.getKeyCode() == KeyEvent.VK_F8) {
                OptWnd.ToggleHide("gfx/arch/inn");
                OptWnd.ToggleHide("gfx/arch/cabin");
        // F9
        } else if (ev.getKeyCode() == KeyEvent.VK_F9) {
                OptWnd.ToggleHide("gfx/terobjs/plants");
        // F10
//        } else if (ev.getKeyCode() == KeyEvent.VK_F10) {
//            Config.ark_hide_plants = !Config.ark_hide_plants;
        // F11
//        } else if (ev.getKeyCode() == KeyEvent.VK_F11) {
//            Config.ark_hide_flavobjs = !Config.ark_hide_flavobjs;
//            ark_log.LogPrint("Test message");
        // F12
        } else if (ev.getKeyCode() == KeyEvent.VK_F12) {
            Config.ark_debug_drawto_console = true;

            if (ark_log.Drawable)
                ark_log.Hide();
            else
                ark_log.Show();
	    }

        else if(key != 0) {
		wdgmsg("gk", (int)key);
	    }
	}
	return(true);
    }

    public void draw(GOut g) {
	super.draw(g);
	drawcmd(g, new Coord(20, 580));
/*	if(!afk && (System.currentTimeMillis() - ui.lastevent > 300000)) {
	    afk = true;
	    Widget slen = findchild(SlenHud.class);
	    if(slen != null)
		slen.wdgmsg("afk");
	} else if(afk && (System.currentTimeMillis() - ui.lastevent < 300000)) {
	    afk = false;
	}
*/    }

    public void error(String msg) {
    }
}
