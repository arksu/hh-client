/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/



package haven.hhl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class hhlLexer extends Lexer {
    public static final int FUNCTION=94;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int FUNCTIONS=71;
    public static final int LETTER=102;
    public static final int NOP=88;
    public static final int STMTS=80;
    public static final int T__160=160;
    public static final int NOT=65;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int TYPE=99;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int MAP_INTERACT_CLICK=15;
    public static final int INCLUDE=68;
    public static final int RETURN=77;
    public static final int SET_ITEM_EQUIP=55;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int INT=101;
    public static final int SET_SHOW_VAR=53;
    public static final int T__141=141;
    public static final int MAP_PLACE=63;
    public static final int T__142=142;
    public static final int SAY=50;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int EMPTY=87;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int BUFF_METER=60;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=107;
    public static final int T__129=129;
    public static final int CALL=72;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int INCLUDELIST=69;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int CRAFT=38;
    public static final int ITEM_DROP=34;
    public static final int T__118=118;
    public static final int MAP_ABS_INTERACT_CLICK=24;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int ITEM_QUALITY=27;
    public static final int SLEEP=6;
    public static final int T__114=114;
    public static final int SET_ITEM_INDEX=25;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int VARDECL=89;
    public static final int GET_ITEMS_COUNT=23;
    public static final int MULTILINE_COMMENT=105;
    public static final int MAP_MOVE_STEP=10;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int IDENT=98;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int PRINT_STRING=5;
    public static final int BUILD_CLICK=64;
    public static final int NEXT_BUFF=59;
    public static final int INPUT_GET_OBJECT=18;
    public static final int ARRAYDECL=90;
    public static final int ITEM_NUM=32;
    public static final int SEND_ACTION2=13;
    public static final int PRINT=4;
    public static final int GET_OBJECT_BLOB=57;
    public static final int DROP=17;
    public static final int BLOCK=86;
    public static final int VARPARAM=95;
    public static final int PROGRAM=67;
    public static final int MAP_MOVE=9;
    public static final int INVENTORY2=43;
    public static final int NEXT_ITEM=22;
    public static final int STRING=100;
    public static final int ITEM_CLICK=28;
    public static final int PREFIX=93;
    public static final int POSTFIX=92;
    public static final int WHILE=75;
    public static final int RENDER_MODE=56;
    public static final int IFELSE=74;
    public static final int LINECOMMENT=106;
    public static final int BREAK=78;
    public static final int OPEN_INVENTORY=52;
    public static final int IS_CURSOR=11;
    public static final int BUFF_TIME_METER=61;
    public static final int VAR=83;
    public static final int CHECK_CRAFT=36;
    public static final int IS_ITEM_NAME=26;
    public static final int FIND_MAP_OBJECT=51;
    public static final int EXIT=48;
    public static final int WAIT_CRAFT=35;
    public static final int RESET_INVENTORY=21;
    public static final int SEND_ACTION=12;
    public static final int FIND_OBJECT_BY_NAME=37;
    public static final int T__200=200;
    public static final int EQUIP=41;
    public static final int T__201=201;
    public static final int FIND_OBJECT_BY_TYPE=40;
    public static final int INVENTORY=42;
    public static final int RESET_BUFF=58;
    public static final int FOR=76;
    public static final int HAVE_INVENTORY=19;
    public static final int ITEM_CLICK2=29;
    public static final int ITEM_COORD_X=30;
    public static final int ITEM_COORD_Y=31;
    public static final int IF=73;
    public static final int INDEX=84;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int PARAMATERS=97;
    public static final int T__197=197;
    public static final int EXPR=81;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int CONTINUE=79;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int DO_CLICK=7;
    public static final int SELECT_CONTEXT_MENU=8;
    public static final int LOGOUT=49;
    public static final int SET_ITEM_DRAG=54;
    public static final int DIGIT=103;
    public static final int ITEM_METER=33;
    public static final int T__184=184;
    public static final int MAP_INTERACT_CLICK2=16;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int IS_BUFF_NAME=62;
    public static final int T__189=189;
    public static final int SET_INVENTORY=20;
    public static final int T__180=180;
    public static final int EXPRLIST=82;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int ITEM_DROP_TO_INVENTORY=39;
    public static final int NEGATE=66;
    public static final int IS_ITEM_TOOLTIP=47;
    public static final int NUM=85;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int ARRAYPARAM=96;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int MAP_ABS_CLICK=44;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int NEWLINE=104;
    public static final int T__176=176;
    public static final int MAP_CLICK=14;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ASSIGN=91;
    public static final int VARIABLES=70;
    public static final int MY_COORD_Y=46;
    public static final int T__169=169;
    public static final int MY_COORD_X=45;

    
    

    public hhlLexer() {;} 
    public hhlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public hhlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return ""; }

    
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("#include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("sleep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("logout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("say"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("do_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("select_context_menu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_move_step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("send_action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_interact_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_abs_interact_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("reset_inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("set_item_index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("set_item_drag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_drop_to_inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("craft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("equip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_abs_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("wait_craft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("open_inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("set_show_var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("render_mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("reset_buff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("map_place"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("build_click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("set_item_equip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("is_cursor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("input_get_object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("have_inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("set_inventory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("next_item"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("get_items_count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("is_item_name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("is_item_tooltip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_quality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_coord_x"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_coord_y"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_num"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("item_meter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("find_object_by_name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("find_object_by_type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("find_map_object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("my_coord_x"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("my_coord_y"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("check_craft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("get_object_blob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("next_buff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("buff_meter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("buff_time_meter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("is_buff_name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='v') ) {
                alt1=1;
            }
            else if ( (LA1_0=='i') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    
                    {
                    match("void"); 


                    }
                    break;
                case 2 :
                    
                    {
                    match("int"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            
            
            {
            match('\"'); 
             StringBuilder b = new StringBuilder(); 
            
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='\"') ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    
            	    {
            	    match('\"'); 
            	    match('\"'); 
            	     b.appendCodePoint('"');

            	    }
            	    break;
            	case 2 :
            	    
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c);

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 
             setText(b.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mDIGIT() throws RecognitionException {
        try {
            
            
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    

    
    public final void mLETTER() throws RecognitionException {
        try {
            
            
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    

    
    public final void mNEWLINE() throws RecognitionException {
        try {
            
            
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    

    
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            match("/*"); 

            
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mLINECOMMENT() throws RecognitionException {
        try {
            int _type = LINECOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            	match("//"); 

            
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mNEWLINE(); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
            
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||(LA7_0>='\f' && LA7_0<='\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    

    public void mTokens() throws RecognitionException {
        
        int alt8=101;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                
                {
                mT__108(); 

                }
                break;
            case 2 :
                
                {
                mT__109(); 

                }
                break;
            case 3 :
                
                {
                mT__110(); 

                }
                break;
            case 4 :
                
                {
                mT__111(); 

                }
                break;
            case 5 :
                
                {
                mT__112(); 

                }
                break;
            case 6 :
                
                {
                mT__113(); 

                }
                break;
            case 7 :
                
                {
                mT__114(); 

                }
                break;
            case 8 :
                
                {
                mT__115(); 

                }
                break;
            case 9 :
                
                {
                mT__116(); 

                }
                break;
            case 10 :
                
                {
                mT__117(); 

                }
                break;
            case 11 :
                
                {
                mT__118(); 

                }
                break;
            case 12 :
                
                {
                mT__119(); 

                }
                break;
            case 13 :
                
                {
                mT__120(); 

                }
                break;
            case 14 :
                
                {
                mT__121(); 

                }
                break;
            case 15 :
                
                {
                mT__122(); 

                }
                break;
            case 16 :
                
                {
                mT__123(); 

                }
                break;
            case 17 :
                
                {
                mT__124(); 

                }
                break;
            case 18 :
                
                {
                mT__125(); 

                }
                break;
            case 19 :
                
                {
                mT__126(); 

                }
                break;
            case 20 :
                
                {
                mT__127(); 

                }
                break;
            case 21 :
                
                {
                mT__128(); 

                }
                break;
            case 22 :
                
                {
                mT__129(); 

                }
                break;
            case 23 :
                
                {
                mT__130(); 

                }
                break;
            case 24 :
                
                {
                mT__131(); 

                }
                break;
            case 25 :
                
                {
                mT__132(); 

                }
                break;
            case 26 :
                
                {
                mT__133(); 

                }
                break;
            case 27 :
                
                {
                mT__134(); 

                }
                break;
            case 28 :
                
                {
                mT__135(); 

                }
                break;
            case 29 :
                
                {
                mT__136(); 

                }
                break;
            case 30 :
                
                {
                mT__137(); 

                }
                break;
            case 31 :
                
                {
                mT__138(); 

                }
                break;
            case 32 :
                
                {
                mT__139(); 

                }
                break;
            case 33 :
                
                {
                mT__140(); 

                }
                break;
            case 34 :
                
                {
                mT__141(); 

                }
                break;
            case 35 :
                
                {
                mT__142(); 

                }
                break;
            case 36 :
                
                {
                mT__143(); 

                }
                break;
            case 37 :
                
                {
                mT__144(); 

                }
                break;
            case 38 :
                
                {
                mT__145(); 

                }
                break;
            case 39 :
                
                {
                mT__146(); 

                }
                break;
            case 40 :
                
                {
                mT__147(); 

                }
                break;
            case 41 :
                
                {
                mT__148(); 

                }
                break;
            case 42 :
                
                {
                mT__149(); 

                }
                break;
            case 43 :
                
                {
                mT__150(); 

                }
                break;
            case 44 :
                
                {
                mT__151(); 

                }
                break;
            case 45 :
                
                {
                mT__152(); 

                }
                break;
            case 46 :
                
                {
                mT__153(); 

                }
                break;
            case 47 :
                
                {
                mT__154(); 

                }
                break;
            case 48 :
                
                {
                mT__155(); 

                }
                break;
            case 49 :
                
                {
                mT__156(); 

                }
                break;
            case 50 :
                
                {
                mT__157(); 

                }
                break;
            case 51 :
                
                {
                mT__158(); 

                }
                break;
            case 52 :
                
                {
                mT__159(); 

                }
                break;
            case 53 :
                
                {
                mT__160(); 

                }
                break;
            case 54 :
                
                {
                mT__161(); 

                }
                break;
            case 55 :
                
                {
                mT__162(); 

                }
                break;
            case 56 :
                
                {
                mT__163(); 

                }
                break;
            case 57 :
                
                {
                mT__164(); 

                }
                break;
            case 58 :
                
                {
                mT__165(); 

                }
                break;
            case 59 :
                
                {
                mT__166(); 

                }
                break;
            case 60 :
                
                {
                mT__167(); 

                }
                break;
            case 61 :
                
                {
                mT__168(); 

                }
                break;
            case 62 :
                
                {
                mT__169(); 

                }
                break;
            case 63 :
                
                {
                mT__170(); 

                }
                break;
            case 64 :
                
                {
                mT__171(); 

                }
                break;
            case 65 :
                
                {
                mT__172(); 

                }
                break;
            case 66 :
                
                {
                mT__173(); 

                }
                break;
            case 67 :
                
                {
                mT__174(); 

                }
                break;
            case 68 :
                
                {
                mT__175(); 

                }
                break;
            case 69 :
                
                {
                mT__176(); 

                }
                break;
            case 70 :
                
                {
                mT__177(); 

                }
                break;
            case 71 :
                
                {
                mT__178(); 

                }
                break;
            case 72 :
                
                {
                mT__179(); 

                }
                break;
            case 73 :
                
                {
                mT__180(); 

                }
                break;
            case 74 :
                
                {
                mT__181(); 

                }
                break;
            case 75 :
                
                {
                mT__182(); 

                }
                break;
            case 76 :
                
                {
                mT__183(); 

                }
                break;
            case 77 :
                
                {
                mT__184(); 

                }
                break;
            case 78 :
                
                {
                mT__185(); 

                }
                break;
            case 79 :
                
                {
                mT__186(); 

                }
                break;
            case 80 :
                
                {
                mT__187(); 

                }
                break;
            case 81 :
                
                {
                mT__188(); 

                }
                break;
            case 82 :
                
                {
                mT__189(); 

                }
                break;
            case 83 :
                
                {
                mT__190(); 

                }
                break;
            case 84 :
                
                {
                mT__191(); 

                }
                break;
            case 85 :
                
                {
                mT__192(); 

                }
                break;
            case 86 :
                
                {
                mT__193(); 

                }
                break;
            case 87 :
                
                {
                mT__194(); 

                }
                break;
            case 88 :
                
                {
                mT__195(); 

                }
                break;
            case 89 :
                
                {
                mT__196(); 

                }
                break;
            case 90 :
                
                {
                mT__197(); 

                }
                break;
            case 91 :
                
                {
                mT__198(); 

                }
                break;
            case 92 :
                
                {
                mT__199(); 

                }
                break;
            case 93 :
                
                {
                mT__200(); 

                }
                break;
            case 94 :
                
                {
                mT__201(); 

                }
                break;
            case 95 :
                
                {
                mTYPE(); 

                }
                break;
            case 96 :
                
                {
                mIDENT(); 

                }
                break;
            case 97 :
                
                {
                mSTRING(); 

                }
                break;
            case 98 :
                
                {
                mINT(); 

                }
                break;
            case 99 :
                
                {
                mMULTILINE_COMMENT(); 

                }
                break;
            case 100 :
                
                {
                mLINECOMMENT(); 

                }
                break;
            case 101 :
                
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\2\uffff\1\55\1\57\10\uffff\1\61\15\47\1\uffff\1\47\1\uffff\1\120"+
        "\1\122\1\124\1\uffff\1\127\1\uffff\4\47\13\uffff\16\47\1\161\5\47"+
        "\1\171\4\47\1\176\3\47\11\uffff\17\47\1\u0091\11\47\1\uffff\6\47"+
        "\1\u00a1\1\uffff\4\47\1\uffff\1\u00a8\1\47\1\u00aa\1\u00ab\16\47"+
        "\1\uffff\4\47\1\u00bf\1\47\1\u00c1\2\47\1\u00c4\5\47\1\uffff\6\47"+
        "\1\uffff\1\47\2\uffff\3\47\1\u00a1\3\47\1\u00dc\3\47\1\u00e1\1\47"+
        "\1\u00e3\4\47\1\u00e9\1\uffff\1\u00ea\1\uffff\2\47\1\uffff\15\47"+
        "\1\u00fe\6\47\1\u0107\2\47\1\uffff\4\47\1\uffff\1\47\1\uffff\5\47"+
        "\2\uffff\1\u0115\22\47\1\uffff\10\47\1\uffff\15\47\1\uffff\41\47"+
        "\1\u015f\6\47\1\u0166\1\u0168\11\47\1\u0173\25\47\1\uffff\6\47\1"+
        "\uffff\1\47\1\uffff\1\u0193\3\47\1\u0197\3\47\1\u019d\1\47\1\uffff"+
        "\1\47\1\u01a0\1\47\1\u01a2\7\47\1\u01aa\1\u01ab\4\47\1\u01b0\2\47"+
        "\1\u01b3\12\47\1\uffff\3\47\1\uffff\1\u01c1\1\u01c2\1\u01c3\2\47"+
        "\1\uffff\1\47\1\u01c7\1\uffff\1\47\1\uffff\3\47\1\u01cc\3\47\2\uffff"+
        "\4\47\1\uffff\1\u01d4\1\u01d5\1\uffff\1\47\1\u01d7\1\47\1\u01d9"+
        "\11\47\3\uffff\3\47\1\uffff\4\47\1\uffff\7\47\2\uffff\1\47\1\uffff"+
        "\1\47\1\uffff\4\47\1\u01f8\4\47\1\u01fd\1\u01fe\1\47\1\u0200\1\47"+
        "\1\u0202\1\47\1\u0204\12\47\1\u020f\1\47\1\u0211\1\uffff\1\u0212"+
        "\2\47\1\u0215\2\uffff\1\47\1\uffff\1\47\1\uffff\1\47\1\uffff\11"+
        "\47\1\u0222\1\uffff\1\u0223\2\uffff\2\47\1\uffff\3\47\1\u0229\2"+
        "\47\1\u022c\2\47\1\u022f\1\u0230\1\47\2\uffff\4\47\1\u0236\1\uffff"+
        "\1\47\1\u0239\1\uffff\1\u023a\1\u023b\2\uffff\4\47\1\u0240\1\uffff"+
        "\2\47\3\uffff\4\47\1\uffff\3\47\1\u024a\4\47\1\u024f\1\uffff\2\47"+
        "\1\u0252\1\u0253\1\uffff\2\47\2\uffff\2\47\1\u0258\1\u0259\2\uffff";
    static final String DFA8_eofS =
        "\u025a\uffff";
    static final String DFA8_minS =
        "\1\11\1\uffff\2\75\10\uffff\1\75\1\145\1\162\1\150\1\141\1\162"+
        "\1\154\2\157\1\141\1\146\1\141\1\160\1\151\1\uffff\1\156\1\uffff"+
        "\1\75\1\53\1\55\1\uffff\1\52\1\uffff\1\145\1\141\1\145\1\157\13"+
        "\uffff\1\156\1\145\1\146\1\156\1\141\2\145\1\171\1\154\2\151\1\165"+
        "\1\163\1\147\1\60\1\157\1\160\1\137\1\145\1\160\1\60\1\137\2\151"+
        "\1\145\1\60\1\162\1\156\1\144\11\uffff\1\164\1\170\1\166\1\164\1"+
        "\151\1\165\1\145\1\144\1\141\1\154\1\146\1\164\1\146\1\143\1\145"+
        "\1\60\1\145\1\144\1\137\1\156\1\164\1\151\1\145\1\157\1\143\1\uffff"+
        "\1\160\1\137\1\143\1\155\1\145\1\165\1\60\1\uffff\1\142\1\164\1"+
        "\154\1\156\1\uffff\1\60\1\144\2\60\1\164\1\145\1\137\1\144\1\162"+
        "\1\164\1\145\1\153\1\144\1\137\1\151\1\164\1\153\1\160\1\uffff\1"+
        "\143\1\137\1\151\1\164\1\60\1\160\1\60\1\165\1\154\1\60\1\141\1"+
        "\157\1\137\1\156\1\164\1\uffff\1\165\1\164\1\165\1\137\1\145\1\137"+
        "\1\uffff\1\137\2\uffff\2\137\1\151\1\60\1\156\1\137\1\162\1\60\1"+
        "\137\1\155\1\156\1\60\1\137\1\60\1\164\1\141\1\156\1\150\1\60\1"+
        "\uffff\1\60\1\uffff\1\164\1\151\1\uffff\1\157\1\154\1\156\1\142"+
        "\1\154\1\157\1\143\1\164\1\137\1\162\1\145\1\146\1\143\1\60\1\151"+
        "\1\155\1\142\1\151\1\164\1\142\1\60\1\142\1\137\1\uffff\1\143\1"+
        "\145\1\151\1\165\1\uffff\1\143\1\uffff\1\137\1\143\1\145\1\166\1"+
        "\157\2\uffff\1\60\1\143\1\166\1\151\1\164\1\163\1\141\1\162\1\154"+
        "\1\162\2\165\1\145\1\157\1\147\1\163\1\155\1\146\1\162\1\uffff\1"+
        "\156\1\142\1\141\1\164\1\165\1\156\1\145\1\152\1\uffff\1\156\1\165"+
        "\1\155\1\154\1\164\1\155\1\145\1\162\1\143\1\164\1\155\1\145\1\167"+
        "\1\uffff\1\153\1\145\1\143\1\145\1\137\1\143\1\144\1\151\2\157\1"+
        "\141\1\155\1\164\1\162\1\145\1\157\2\137\1\141\1\166\1\152\1\160"+
        "\1\145\1\146\1\166\1\155\1\145\1\166\1\146\1\157\1\151\2\145\1\60"+
        "\1\141\1\157\1\151\1\137\1\156\1\137\2\60\1\153\1\162\1\143\1\145"+
        "\1\137\1\143\1\162\1\160\1\154\1\60\1\145\1\171\1\164\1\162\2\156"+
        "\1\146\2\145\1\137\1\155\1\146\1\145\1\163\1\143\1\145\1\146\1\144"+
        "\1\143\1\162\1\137\1\uffff\1\146\1\156\1\157\1\144\1\164\1\166\1"+
        "\uffff\1\163\1\uffff\1\60\1\141\1\156\1\154\1\60\1\170\1\153\1\144"+
        "\1\60\1\151\1\uffff\1\162\1\60\1\137\1\60\1\141\1\157\1\141\1\164"+
        "\1\156\1\143\1\157\2\60\1\156\1\137\1\164\1\156\1\60\1\145\1\153"+
        "\1\60\1\155\2\164\2\156\1\162\1\161\1\157\1\141\1\164\1\uffff\1"+
        "\143\1\164\1\151\1\uffff\3\60\1\137\1\164\1\uffff\1\164\1\60\1\uffff"+
        "\1\157\1\uffff\1\155\1\157\1\155\1\60\2\164\1\142\2\uffff\1\164"+
        "\1\143\1\137\1\164\1\uffff\2\60\1\uffff\1\145\1\60\1\145\1\60\1"+
        "\144\1\141\1\165\2\162\1\145\1\164\1\145\1\143\3\uffff\1\170\1\157"+
        "\1\171\1\uffff\1\142\1\145\1\154\1\145\1\uffff\1\157\1\137\1\152"+
        "\2\157\1\142\1\157\2\uffff\1\164\1\uffff\1\170\1\uffff\1\145\1\147"+
        "\1\151\1\171\1\60\1\160\1\137\1\162\1\153\2\60\1\137\1\60\1\152"+
        "\1\60\1\164\1\60\1\162\1\142\1\145\1\162\1\165\1\154\1\162\1\145"+
        "\1\164\1\170\1\60\1\160\1\60\1\uffff\1\60\1\143\1\141\1\60\2\uffff"+
        "\1\151\1\uffff\1\145\1\uffff\1\151\1\uffff\2\171\1\143\1\171\1\156"+
        "\1\157\1\171\1\162\1\137\1\60\1\uffff\1\60\2\uffff\1\154\1\143\1"+
        "\uffff\1\156\1\143\1\160\1\60\1\137\1\164\1\60\1\164\1\142\2\60"+
        "\1\155\2\uffff\1\151\1\164\1\166\1\164\1\60\1\uffff\1\156\1\60\1"+
        "\uffff\2\60\2\uffff\1\145\1\143\1\137\1\145\1\60\1\uffff\1\141\1"+
        "\171\3\uffff\1\156\1\153\1\143\1\156\1\uffff\1\155\1\160\1\165\1"+
        "\60\1\154\1\164\2\145\1\60\1\uffff\1\151\1\157\2\60\1\uffff\1\143"+
        "\1\162\2\uffff\1\153\1\171\2\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\1\uffff\1\76\1\75\10\uffff\1\75\1\145\1\165\1\162\1\154"+
        "\1\162\1\170\1\157\1\162\1\171\1\164\1\150\1\162\1\157\1\uffff\1"+
        "\156\1\uffff\1\75\1\53\1\55\1\uffff\1\57\1\uffff\1\157\1\141\1\145"+
        "\1\157\13\uffff\1\164\1\145\1\151\1\156\1\141\2\145\1\171\1\164"+
        "\2\151\1\165\1\163\1\147\1\172\1\157\1\160\1\137\1\145\1\166\1\172"+
        "\1\137\2\151\1\145\1\172\1\162\1\156\1\144\11\uffff\1\164\1\170"+
        "\1\166\1\164\1\151\1\165\1\145\1\144\1\141\1\154\1\146\1\164\1\146"+
        "\1\143\1\145\1\172\1\145\1\144\1\137\1\156\1\164\1\151\1\145\1\157"+
        "\1\143\1\uffff\1\160\1\137\1\143\1\155\1\145\1\165\1\172\1\uffff"+
        "\1\151\1\164\1\154\1\156\1\uffff\1\172\1\144\2\172\1\164\1\145\1"+
        "\137\1\144\1\162\1\164\1\145\1\153\1\144\1\137\1\151\1\164\1\153"+
        "\1\160\1\uffff\1\143\1\137\1\163\1\164\1\172\1\160\1\172\1\165\1"+
        "\154\1\172\1\160\1\157\1\137\1\156\1\164\1\uffff\1\165\1\164\1\165"+
        "\1\137\1\145\1\137\1\uffff\1\137\2\uffff\2\137\1\157\1\172\1\156"+
        "\1\137\1\162\1\172\1\137\1\164\1\156\1\172\1\137\1\172\1\164\1\141"+
        "\1\164\1\150\1\172\1\uffff\1\172\1\uffff\1\164\1\151\1\uffff\1\157"+
        "\1\154\1\156\1\142\1\154\1\157\1\161\1\164\1\137\1\162\1\145\1\146"+
        "\1\143\1\172\1\151\1\157\2\151\1\164\1\142\1\172\1\151\1\137\1\uffff"+
        "\1\143\1\145\1\151\1\165\1\uffff\1\143\1\uffff\1\137\1\143\1\145"+
        "\1\166\1\157\2\uffff\1\172\1\143\1\166\1\151\1\164\1\163\1\141\1"+
        "\162\1\157\1\162\2\165\1\145\1\157\1\147\1\163\1\155\1\146\1\162"+
        "\1\uffff\1\156\1\142\1\141\1\164\1\165\1\156\1\145\1\152\1\uffff"+
        "\1\156\1\165\1\155\1\154\1\164\1\155\1\145\1\162\1\143\1\164\1\155"+
        "\1\145\1\167\1\uffff\1\153\1\145\1\143\1\145\1\137\1\143\1\144\1"+
        "\151\2\157\1\141\1\155\1\164\1\162\1\145\1\157\2\137\1\141\1\166"+
        "\1\152\1\160\1\145\1\146\1\166\1\155\1\145\1\166\1\146\1\157\1\151"+
        "\2\145\1\172\1\141\1\157\1\151\1\137\1\156\1\137\2\172\1\153\1\162"+
        "\1\151\1\145\1\137\1\143\1\162\1\160\1\154\1\172\1\145\1\171\1\164"+
        "\1\162\1\164\1\156\1\146\2\145\1\137\1\155\1\146\1\145\1\163\1\143"+
        "\1\145\1\146\1\144\1\143\1\162\1\137\1\uffff\1\146\1\156\1\157\1"+
        "\151\1\164\1\166\1\uffff\1\163\1\uffff\1\172\1\141\1\156\1\154\1"+
        "\172\1\171\1\153\1\144\1\172\1\151\1\uffff\1\162\1\172\1\137\1\172"+
        "\1\141\1\157\1\141\1\164\1\156\1\143\1\157\2\172\1\156\1\137\1\164"+
        "\1\156\1\172\1\145\1\153\1\172\1\155\2\164\2\156\1\162\1\161\1\157"+
        "\1\141\1\164\1\uffff\1\143\1\164\1\151\1\uffff\3\172\1\137\1\164"+
        "\1\uffff\1\164\1\172\1\uffff\1\157\1\uffff\1\155\1\157\1\155\1\172"+
        "\2\164\1\142\2\uffff\1\164\1\143\1\137\1\164\1\uffff\2\172\1\uffff"+
        "\1\145\1\172\1\145\1\172\1\144\1\141\1\165\2\162\1\145\1\164\1\145"+
        "\1\143\3\uffff\1\171\1\157\1\171\1\uffff\1\142\1\145\1\154\1\145"+
        "\1\uffff\1\157\1\137\1\152\2\157\1\142\1\157\2\uffff\1\164\1\uffff"+
        "\1\170\1\uffff\1\145\1\147\1\151\1\171\1\172\1\160\1\137\1\162\1"+
        "\153\2\172\1\137\1\172\1\152\1\172\1\164\1\172\1\162\1\142\1\145"+
        "\1\162\1\165\1\154\1\162\1\145\1\164\1\170\1\172\1\160\1\172\1\uffff"+
        "\1\172\1\143\1\141\1\172\2\uffff\1\151\1\uffff\1\145\1\uffff\1\151"+
        "\1\uffff\2\171\1\143\1\171\1\156\1\157\1\171\1\162\1\137\1\172\1"+
        "\uffff\1\172\2\uffff\1\154\1\143\1\uffff\1\156\1\143\1\160\1\172"+
        "\1\137\1\164\1\172\1\164\1\142\2\172\1\155\2\uffff\1\151\1\164\1"+
        "\166\1\164\1\172\1\uffff\1\164\1\172\1\uffff\2\172\2\uffff\1\145"+
        "\1\143\1\137\1\145\1\172\1\uffff\1\141\1\171\3\uffff\1\156\1\153"+
        "\1\143\1\156\1\uffff\1\155\1\160\1\165\1\172\1\154\1\164\2\145\1"+
        "\172\1\uffff\1\151\1\157\2\172\1\uffff\1\143\1\162\2\uffff\1\153"+
        "\1\171\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\16\uffff"+
        "\1\66\1\uffff\1\70\3\uffff\1\100\1\uffff\1\102\4\uffff\1\140\1\141"+
        "\1\142\1\145\1\73\1\75\1\2\1\74\1\3\1\71\1\14\35\uffff\1\72\1\103"+
        "\1\105\1\76\1\106\1\77\1\143\1\144\1\101\31\uffff\1\64\7\uffff\1"+
        "\61\4\uffff\1\65\22\uffff\1\24\17\uffff\1\137\6\uffff\1\60\1\uffff"+
        "\1\67\1\104\23\uffff\1\22\1\uffff\1\62\2\uffff\1\35\27\uffff\1\16"+
        "\4\uffff\1\44\1\uffff\1\20\5\uffff\1\21\1\45\23\uffff\1\63\10\uffff"+
        "\1\15\15\uffff\1\23\111\uffff\1\17\6\uffff\1\25\1\uffff\1\27\12"+
        "\uffff\1\122\37\uffff\1\32\3\uffff\1\55\5\uffff\1\42\2\uffff\1\46"+
        "\1\uffff\1\107\7\uffff\1\113\1\133\4\uffff\1\54\2\uffff\1\134\15"+
        "\uffff\1\127\1\130\1\41\3\uffff\1\123\4\uffff\1\50\7\uffff\1\53"+
        "\1\56\1\uffff\1\131\1\uffff\1\31\36\uffff\1\52\4\uffff\1\120\1\121"+
        "\1\uffff\1\117\1\uffff\1\115\1\uffff\1\136\12\uffff\1\40\1\uffff"+
        "\1\112\1\30\2\uffff\1\47\14\uffff\1\37\1\57\5\uffff\1\51\2\uffff"+
        "\1\111\2\uffff\1\36\1\135\5\uffff\1\116\2\uffff\1\126\1\114\1\132"+
        "\4\uffff\1\110\11\uffff\1\33\4\uffff\1\26\2\uffff\1\124\1\125\4"+
        "\uffff\1\34\1\43";
    static final String DFA8_specialS =
        "\u025a\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\52\1\uffff\2\52\22\uffff\1\52\1\35\1\50\1\1\1\uffff\1\42"+
            "\1\34\1\uffff\1\4\1\5\1\40\1\36\1\6\1\37\1\uffff\1\41\12\51"+
            "\1\uffff\1\13\1\2\1\14\1\3\2\uffff\32\47\1\7\1\uffff\1\10\1"+
            "\uffff\1\47\1\uffff\1\33\1\16\1\17\1\24\1\22\1\31\1\45\1\44"+
            "\1\26\2\47\1\23\1\25\1\43\1\30\1\21\1\47\1\15\1\20\2\47\1\46"+
            "\1\27\3\47\1\11\1\32\1\12",
            "",
            "\1\54\1\53",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\62",
            "\1\63\2\uffff\1\64",
            "\1\67\6\uffff\1\65\2\uffff\1\66",
            "\1\71\3\uffff\1\72\6\uffff\1\70",
            "\1\73",
            "\1\76\4\uffff\1\75\6\uffff\1\74",
            "\1\77",
            "\1\100\2\uffff\1\101",
            "\1\102\27\uffff\1\103",
            "\1\106\7\uffff\1\105\4\uffff\1\107\1\104",
            "\1\110\6\uffff\1\111",
            "\1\112\1\uffff\1\113",
            "\1\115\5\uffff\1\114",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\121",
            "\1\123",
            "",
            "\1\125\4\uffff\1\126",
            "",
            "\1\131\11\uffff\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\4\uffff\1\136\1\135",
            "\1\140",
            "\1\142\2\uffff\1\141",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150\1\uffff\1\151\5\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\47\7\uffff\32\47\4\uffff\1\160\1\uffff\32\47",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\3\uffff\1\170\1\uffff\1\166",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00a4\1\u00a2\5\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\11\uffff\1\u00bd",
            "\1\u00be",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c2",
            "\1\u00c3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c8\1\uffff\1\u00c6\5\uffff\1\u00c7\3\uffff\1\u00c5\2"+
            "\uffff\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\5\uffff\1\u00d8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00dd",
            "\1\u00de\6\uffff\1\u00df",
            "\1\u00e0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e7\5\uffff\1\u00e6",
            "\1\u00e8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3\1\u00f4\10\uffff\1\u00f7\1\u00f6\2\uffff\1\u00f5",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ff",
            "\1\u0101\1\uffff\1\u0100",
            "\1\u0103\6\uffff\1\u0102",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0109\6\uffff\1\u0108",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d\2\uffff\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\u0167\1\uffff\32\47",
            "\1\u0169",
            "\1\u016a",
            "\1\u016c\5\uffff\1\u016b",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178\5\uffff\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018e\1\u018f\3\uffff\1\u018d",
            "\1\u0190",
            "\1\u0191",
            "",
            "\1\u0192",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0198\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\12\47\7\uffff\32\47\4\uffff\1\u019c\1\uffff\32\47",
            "\1\u019e",
            "",
            "\1\u019f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01b1",
            "\1\u01b2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01c4",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01d6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01d8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "",
            "",
            "\1\u01e3\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "",
            "\1\u01f2",
            "",
            "\1\u01f3",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ff",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0201",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0203",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0210",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0213",
            "\1\u0214",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u0216",
            "",
            "\1\u0217",
            "",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u0224",
            "\1\u0225",
            "",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u022a",
            "\1\u022b",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u022d",
            "\1\u022e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0231",
            "",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0237\5\uffff\1\u0238",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0241",
            "\1\u0242",
            "",
            "",
            "",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0250",
            "\1\u0251",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0254",
            "\1\u0255",
            "",
            "",
            "\1\u0256",
            "\1\u0257",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | TYPE | IDENT | STRING | INT | MULTILINE_COMMENT | LINECOMMENT | WS );";
        }
    }
 

}