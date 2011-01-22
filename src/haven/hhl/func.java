/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/

  package haven.hhl;

    import java.util.HashMap;
    import java.util.Vector;
    import java.util.Map;
    import java.io.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class func extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PRINT", "PRINT_STRING", "SLEEP", "DO_CLICK", "SELECT_CONTEXT_MENU", "MAP_MOVE", "MAP_MOVE_STEP", "IS_CURSOR", "SEND_ACTION", "SEND_ACTION2", "MAP_CLICK", "MAP_INTERACT_CLICK", "MAP_INTERACT_CLICK2", "DROP", "INPUT_GET_OBJECT", "HAVE_INVENTORY", "SET_INVENTORY", "RESET_INVENTORY", "NEXT_ITEM", "GET_ITEMS_COUNT", "MAP_ABS_INTERACT_CLICK", "SET_ITEM_INDEX", "IS_ITEM_NAME", "ITEM_QUALITY", "ITEM_CLICK", "ITEM_CLICK2", "ITEM_COORD_X", "ITEM_COORD_Y", "ITEM_NUM", "ITEM_METER", "ITEM_DROP", "WAIT_CRAFT", "CHECK_CRAFT", "FIND_OBJECT_BY_NAME", "CRAFT", "ITEM_DROP_TO_INVENTORY", "FIND_OBJECT_BY_TYPE", "EQUIP", "INVENTORY", "INVENTORY2", "MAP_ABS_CLICK", "MY_COORD_X", "MY_COORD_Y", "IS_ITEM_TOOLTIP", "EXIT", "LOGOUT", "SAY", "FIND_MAP_OBJECT", "OPEN_INVENTORY", "SET_SHOW_VAR", "SET_ITEM_DRAG", "SET_ITEM_EQUIP", "RENDER_MODE", "GET_OBJECT_BLOB", "RESET_BUFF", "NEXT_BUFF", "BUFF_METER", "BUFF_TIME_METER", "IS_BUFF_NAME", "MAP_PLACE", "BUILD_CLICK", "NOT", "NEGATE", "PROGRAM", "INCLUDE", "INCLUDELIST", "VARIABLES", "FUNCTIONS", "CALL", "IF", "IFELSE", "WHILE", "FOR", "RETURN", "BREAK", "CONTINUE", "STMTS", "EXPR", "EXPRLIST", "VAR", "INDEX", "NUM", "BLOCK", "EMPTY", "NOP", "VARDECL", "ARRAYDECL", "ASSIGN", "POSTFIX", "PREFIX", "FUNCTION", "VARPARAM", "ARRAYPARAM", "PARAMATERS", "IDENT", "TYPE", "STRING", "INT", "LETTER", "DIGIT", "NEWLINE", "MULTILINE_COMMENT", "LINECOMMENT", "WS", "'#include'", "'<'", "'>'", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "';'", "'='", "'return'", "'break'", "'continue'", "'sleep'", "'print'", "'exit'", "'logout'", "'say'", "'do_click'", "'select_context_menu'", "'map_move'", "'map_move_step'", "'send_action'", "'map_click'", "'map_interact_click'", "'map_abs_interact_click'", "'drop'", "'reset_inventory'", "'set_item_index'", "'set_item_drag'", "'item_click'", "'item_drop'", "'item_drop_to_inventory'", "'craft'", "'equip'", "'inventory'", "'map_abs_click'", "'wait_craft'", "'open_inventory'", "'set_show_var'", "'render_mode'", "'reset_buff'", "'map_place'", "'build_click'", "'set_item_equip'", "'for'", "'if'", "'else'", "'while'", "'do'", "'or'", "'||'", "'and'", "'&&'", "'=='", "'!='", "'<>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'not'", "'++'", "'--'", "'is_cursor'", "'input_get_object'", "'have_inventory'", "'set_inventory'", "'next_item'", "'get_items_count'", "'is_item_name'", "'is_item_tooltip'", "'item_quality'", "'item_coord_x'", "'item_coord_y'", "'item_num'", "'item_meter'", "'find_object_by_name'", "'find_object_by_type'", "'find_map_object'", "'my_coord_x'", "'my_coord_y'", "'check_craft'", "'get_object_blob'", "'next_buff'", "'buff_meter'", "'buff_time_meter'", "'is_buff_name'"
    };
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



        public func(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public func(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return func.tokenNames; }
    public String getGrammarFileName() { return ""; }



    public final void program() throws RecognitionException {
        try {
            {
            match(input,INCLUDELIST,FOLLOW_INCLUDELIST_in_program58);

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null);
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==INCLUDE||LA1_0==EMPTY) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                 case 1 :
                     {
                     pushFollow(FOLLOW_include_in_program60);
                     include();

                     state._fsp--;


                     }
                     break;

                 default :
                     break loop1;
                    }
                } while (true);


                match(input, Token.UP, null);
            }
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program65);

            match(input, Token.DOWN, null);
            match(input,VARIABLES,FOLLOW_VARIABLES_in_program68);

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null);
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=PRINT && LA2_0<=201)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==UP) ) {
                        alt2=2;
                    }


                    switch (alt2) {
                 case 1 :
                     {
                     matchAny(input);

                     }
                     break;

                 default :
                     break loop2;
                    }
                } while (true);


                match(input, Token.UP, null);
            }
            match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_program75);

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null);
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==FUNCTION) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                 case 1 :
                     {
                     pushFollow(FOLLOW_functionDecl_in_program77);
                     functionDecl();

                     state._fsp--;


                     }
                     break;

                 default :
                     break loop3;
                    }
                } while (true);


                match(input, Token.UP, null);
            }
            matchAny(input);

            match(input, Token.UP, null);
            match(input,EOF,FOLLOW_EOF_in_program84);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }


    public final void include() throws RecognitionException {
        CommonTree include_name=null;

        try {
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EMPTY) ) {
                alt4=1;
            }
            else if ( (LA4_0==INCLUDE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_include111);

                    }
                    break;
                case 2 :
                    {
                    match(input,INCLUDE,FOLLOW_INCLUDE_in_include122);

                    match(input, Token.DOWN, null);
                    include_name=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_include128);

                    match(input, Token.UP, null);
                    hhl_main.IncludeScript((include_name!=null?include_name.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }

    public static class functionDecl_return extends TreeRuleReturnScope {
    };

    public final func.functionDecl_return functionDecl() throws RecognitionException {
        func.functionDecl_return retval = new func.functionDecl_return();
        retval.start = input.LT(1);

        CommonTree t=null;
        CommonTree name=null;
        FunctionParam par = null;



            Vector params=new Vector();

        try {
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl164);

            match(input, Token.DOWN, null);
            t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_functionDecl168);
            name=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_functionDecl172);
            match(input,PARAMATERS,FOLLOW_PARAMATERS_in_functionDecl175);

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null);
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EMPTY||(LA5_0>=VARPARAM && LA5_0<=ARRAYPARAM)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                 case 1 :
                     {
                     pushFollow(FOLLOW_paramDecl_in_functionDecl180);
                     par=paramDecl();

                     state._fsp--;

                     if (par != null) params.add(par);

                     }
                     break;

                 default :
                     break loop5;
                    }
                } while (true);


                match(input, Token.UP, null);
            }
            matchAny(input);

            match(input, Token.UP, null);

            }


                    CommonTree blockNode = (CommonTree)((CommonTree)retval.start).getChild(3);
                    hhl_main.symbols.declare_function((name!=null?name.getText():null),(t!=null?t.getText():null),params,blockNode);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }


    public final FunctionParam paramDecl() throws RecognitionException {
        FunctionParam p = null;

        CommonTree IDENT1=null;
        CommonTree TYPE2=null;
        CommonTree IDENT3=null;
        CommonTree TYPE4=null;

        try {
            int alt6=3;
            switch ( input.LA(1) ) {
            case EMPTY:
                {
                alt6=1;
                }
                break;
            case VARPARAM:
                {
                alt6=2;
                }
                break;
            case ARRAYPARAM:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_paramDecl210);
                    p = null;

                    }
                    break;
                case 2 :
                    {
                    match(input,VARPARAM,FOLLOW_VARPARAM_in_paramDecl223);

                    match(input, Token.DOWN, null);
                    TYPE2=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_paramDecl225);
                    IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_paramDecl227);

                    match(input, Token.UP, null);
                    p =new FunctionParam((IDENT1!=null?IDENT1.getText():null),(TYPE2!=null?TYPE2.getText():null), "scalar");

                    }
                    break;
                case 3 :
                    {
                    match(input,ARRAYPARAM,FOLLOW_ARRAYPARAM_in_paramDecl241);

                    match(input, Token.DOWN, null);
                    TYPE4=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_paramDecl243);
                    IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_paramDecl245);

                    match(input, Token.UP, null);
                    p =new FunctionParam((IDENT3!=null?IDENT3.getText():null),(TYPE4!=null?TYPE4.getText():null),"array");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return p;
    }





    public static final BitSet FOLLOW_INCLUDELIST_in_program58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_include_in_program60 = new BitSet(new long[]{0x0000000000000008L,0x0000000000800010L});
    public static final BitSet FOLLOW_PROGRAM_in_program65 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLES_in_program68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FUNCTIONS_in_program75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionDecl_in_program77 = new BitSet(new long[]{0x0000000000000008L,0x0000000040000000L});
    public static final BitSet FOLLOW_EOF_in_program84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_include111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_include128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_functionDecl168 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_functionDecl172 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_PARAMATERS_in_functionDecl175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDecl_in_functionDecl180 = new BitSet(new long[]{0x0000000000000008L,0x0000000180800000L});
    public static final BitSet FOLLOW_EMPTY_in_paramDecl210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARPARAM_in_paramDecl223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_paramDecl225 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_paramDecl227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYPARAM_in_paramDecl241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_paramDecl243 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_paramDecl245 = new BitSet(new long[]{0x0000000000000008L});

}
