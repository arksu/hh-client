package haven;
import java.awt.*;
import java.io.*;
import java.util.Vector;

public class ark_log {
    public static boolean Drawable = false;
    static Vector Messages = new Vector();
    static int MaxMessages = 20;
    static Coord LogScreenPos = new Coord(30, 300);
    static int MeesageHeight = 14;
    static int LogScreenWidth = 650;

    static void Draw(GOut g) {
        if (!Drawable) return;

        g.chcolor(new Color(0,0,0,100));
        g.frect(LogScreenPos, new Coord(LogScreenWidth, MeesageHeight*MaxMessages+MeesageHeight));
        g.chcolor(Color.WHITE);
        String s;
        int y = LogScreenPos.y + MeesageHeight;
        for (int i = 0; i < Messages.size(); i++){
            s = (String)Messages.elementAt(i);
            g.atext(s, new Coord(LogScreenPos.x, y), 0, 1);
            y += MeesageHeight;
        }
    }

    static void LogPrint(String Msg) {
        while (Messages.size() > MaxMessages-1)
            Messages.remove(0);
        Messages.addElement(Msg);
    }

    static void LogWarning(String Msg) {
        LogPrint("WARNING: "+Msg);
    }

    static void LogError(String Msg) {
        LogPrint("ERROR: "+Msg);
    }

    static void Show() {
        Drawable = true;
    }

    static void Hide() {
        Drawable = false;
    }
}
