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

import java.util.*;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import haven.Config;

public class Gob implements Sprite.Owner {
    public Coord rc, sc;
    int clprio = 0;
    public int id, frame, initdelay = (int)(Math.random() * 3000);
    public final Glob glob;
    Map<Class<? extends GAttrib>, GAttrib> attr = new HashMap<Class<? extends GAttrib>, GAttrib>();
    public Collection<Overlay> ols = new LinkedList<Overlay>();

    public static class Overlay {
	public Indir<Resource> res;
	public Message sdt;
	public Sprite spr;
	public int id;
	public boolean delign = false;
	
	public Overlay(int id, Indir<Resource> res, Message sdt) {
	    this.id = id;
	    this.res = res;
	    this.sdt = sdt;
	    spr = null;
	}
	
	public static interface CDel {
	    public void delete();
	}
    }
    
    public Gob(Glob glob, Coord c, int id, int frame) {
	this.glob = glob;
	this.rc = c;
	this.id = id;
	this.frame = frame;
    }
	
    public Gob(Glob glob, Coord c) {
	this(glob, c, 0, 0);
    }
	
    public static interface ANotif<T extends GAttrib> {
	public void ch(T n);
    }

    // arksu: �������� ��� �������
    public String GetResName() {
        String s = "";
        Drawable d = getattr(Drawable.class);
        ResDrawable dw = getattr(ResDrawable.class);
        if (d != null)
        {
            if (dw != null)
            {
                if (dw.res.get() != null) {
                    s = dw.res.get().name;
                }
            }
        }
        return s;
    }
    
    // �������� ���� �� �������
    public byte GetBlob(int index) {
        Drawable d = getattr(Drawable.class);
        ResDrawable dw = getattr(ResDrawable.class);
        if (dw != null && d != null)
        {
        	if (index < dw.sdt.blob.length && index >= 0)
                return dw.sdt.blob[index];
        }
        return 0;
    }

    public void ctick(int dt) {
	int dt2 = dt + initdelay;
	initdelay = 0;
	for(GAttrib a : attr.values()) {
	    if(a instanceof Drawable)
		a.ctick(dt2);
	    else
		a.ctick(dt);
	}
	for(Iterator<Overlay> i = ols.iterator(); i.hasNext();) {
	    Overlay ol = i.next();
	    if(ol.spr == null) {
		if(((getattr(Drawable.class) == null) || (getneg() != null)) && (ol.res.get() != null))
		    ol.spr = Sprite.create(this, ol.res.get(), ol.sdt);
	    } else {
		boolean done = ol.spr.tick(dt);
		if((!ol.delign || (ol.spr instanceof Overlay.CDel)) && done)
		    i.remove();
	    }
	}
    }
	
    public Overlay findol(int id) {
	for(Overlay ol : ols) {
	    if(ol.id == id)
		return(ol);
	}
	return(null);
    }

    public void tick() {
	for(GAttrib a : attr.values())
	    a.tick();
    }
	
    public void move(Coord c) {
	Moving m = getattr(Moving.class);
	if(m != null)
	    m.move(c);
	this.rc = c;
    }
	
    public Coord getc() {
	Moving m = getattr(Moving.class);
	if(m != null)
	    return(m.getc());
	else
	    return(rc);
    }
	
    private Class<? extends GAttrib> attrclass(Class<? extends GAttrib> cl) {
	while(true) {
	    Class<?> p = cl.getSuperclass();
	    if(p == GAttrib.class)
		return(cl);
	    cl = p.asSubclass(GAttrib.class);
	}
    }

    public void setattr(GAttrib a) {
	Class<? extends GAttrib> ac = attrclass(a.getClass());
	attr.put(ac, a);
    }
	
    public <C extends GAttrib> C getattr(Class<C> c) {
	GAttrib attr = this.attr.get(attrclass(c));
	if(!c.isInstance(attr))
	    return(null);
	return(c.cast(attr));
    }
	
    public void delattr(Class<? extends GAttrib> c) {
	attr.remove(attrclass(c));
    }
	
    public Coord drawoff() {
	Coord ret = Coord.z;
	DrawOffset dro = getattr(DrawOffset.class);
	if(dro != null)
	    ret = ret.add(dro.off);
	Following flw = getattr(Following.class);
	if(flw != null)
	    ret = ret.add(flw.doff);
	return(ret);
    }
	
    public void drawsetup(Sprite.Drawer drawer, Coord dc, Coord sz) {
        Drawable d = getattr(Drawable.class);
        ResDrawable dw = getattr(ResDrawable.class);
        String resourceName = (dw != null && dw.res.get() != null ? dw.res.get().name : "");
        Coord dro = drawoff();
        boolean need_draw = true;

        for (Overlay ol : ols) {
            if (ol.spr != null) {
                ol.spr.setup(drawer, dc, dro);
            }
        }
            if (d != null)
            {
                // use ark method
                if (resourceName.length() > 0)
                {
                    /*if (Config.ark_hide_tree)
                        if (resourceName.indexOf("trees") >= 0)
                            need_draw = false;

                    if (Config.ark_hide_plants)
                        if (resourceName.indexOf("gfx/terobjs/plants") >= 0)
                            need_draw = false;

                    if (Config.ark_hide_buildings)
                        if (resourceName.indexOf("gfx/arch") >= 0)
                            need_draw = false;

                    if (Config.ark_hide_stones)
                        if (resourceName.indexOf("gfx/terobjs/bumlings") >= 0)
                            need_draw = false;

                    if (Config.ark_hide_walls)
                        if ((resourceName.indexOf("gfx/arch/walls") >= 0) || (resourceName.indexOf("gfx/arch/gates") >= 0) )
                            need_draw = false;

                    if (Config.ark_hide_houses)
                        if ( (resourceName.indexOf("gfx/arch/cabin") >= 0) || (resourceName.indexOf("gfx/arch/inn") >= 0) )
                            need_draw = false;

                    if (Config.ark_hide_flavobjs)
                        if ( (resourceName.indexOf("gfx/tiles/wald/flavobjs") >= 0) || (resourceName.indexOf("gfx/tiles/dwald") >= 0) )
                            need_draw = false;
                                           */

                    // use gilbertus method

                    if (!Config.IsHideable(resourceName) && need_draw)
                        d.setup(drawer, dc, dro);
                }
                else
                {
                    d.setup(drawer, dc, dro);
                }
            }
            //----------------------------------------------------------
    }
    
    public Random mkrandoom() {
	if(id < 0)
	    return(MCache.mkrandoom(rc));
	else
	    return(new Random(id));
    }
    
    public Resource.Neg getneg() {
	Drawable d = getattr(Drawable.class);
	if(d instanceof ResDrawable) {
	    ResDrawable rd = (ResDrawable)d;
	    Resource r;
	    if((r = rd.res.get()) == null)
		return(null);
	    return(r.layer(Resource.negc));
	} else if(d instanceof Layered) {
	    Layered l = (Layered)d;
	    Resource r;
	    if((r = l.base.get()) == null)
		return(null);
	    return(r.layer(Resource.negc));
	}
	return(null);
    }
}
