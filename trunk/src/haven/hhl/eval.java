/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/

  package haven.hhl;
  import java.util.Vector;
  import haven.ark_bot;
  import haven.Coord;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class eval extends TreeParser {
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



        public eval(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public eval(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return eval.tokenNames; }
    public String getGrammarFileName() { return ""; }


        Stack<TreeNodeStream> Inputs = new Stack<TreeNodeStream>();


        public void PushInputTree(CommonTree tree) {
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            Inputs.push(getTreeNodeStream());
            setTreeNodeStream(nodes);
        }

        public void PopInputTree() {
            setTreeNodeStream(Inputs.pop());
        }



    public final void program() throws RecognitionException {
        try {
            {
            match(input,INCLUDELIST,FOLLOW_INCLUDELIST_in_program64); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=PRINT && LA1_0<=201)) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==UP) ) {
                        alt1=2;
                    }


                    switch (alt1) {
                 case 1 :
                     {
                     matchAny(input); if (state.failed) return ;

                     }
                     break;

                 default :
                     break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program71); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,VARIABLES,FOLLOW_VARIABLES_in_program74); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==EMPTY||(LA2_0>=VARDECL && LA2_0<=ASSIGN)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                 case 1 :
                     {
                     pushFollow(FOLLOW_varDecl_in_program76);
                     varDecl();

                     state._fsp--;
                     if (state.failed) return ;

                     }
                     break;

                 default :
                     break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }
            match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_program81); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=PRINT && LA3_0<=201)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==UP) ) {
                        alt3=2;
                    }


                    switch (alt3) {
                 case 1 :
                     {
                     matchAny(input); if (state.failed) return ;

                     }
                     break;

                 default :
                     break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }
            pushFollow(FOLLOW_call_in_program87);
            call();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_program90); if (state.failed) return ;

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


    public final void varDecl() throws RecognitionException {
        CommonTree name=null;
        CommonTree size=null;
        CommonTree TYPE1=null;
        CommonTree IDENT2=null;
        CommonTree TYPE3=null;
        eval.expression_return a = null;


        try {
            int alt4=4;
            switch ( input.LA(1) ) {
            case EMPTY:
                {
                alt4=1;
                }
                break;
            case VARDECL:
                {
                alt4=2;
                }
                break;
            case ASSIGN:
                {
                alt4=3;
                }
                break;
            case ARRAYDECL:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_varDecl109); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    {
                    match(input,VARDECL,FOLLOW_VARDECL_in_varDecl120); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    TYPE1=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varDecl122); if (state.failed) return ;
                    name=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_varDecl126); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      hhl_main.symbols.declare_variable((name!=null?name.getText():null),(TYPE1!=null?TYPE1.getText():null));
                    }

                    }
                    break;
                case 3 :
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_varDecl140); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_varDecl142); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_varDecl146);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      hhl_main.symbols.set_value((IDENT2!=null?IDENT2.getText():null),a.value);
                    }

                    }
                    break;
                case 4 :
                    {
                    match(input,ARRAYDECL,FOLLOW_ARRAYDECL_in_varDecl160); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    TYPE3=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varDecl162); if (state.failed) return ;
                    name=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_varDecl166); if (state.failed) return ;
                    size=(CommonTree)match(input,INT,FOLLOW_INT_in_varDecl170); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      hhl_main.symbols.declare_array((name!=null?name.getText():null),(TYPE3!=null?TYPE3.getText():null),Integer.parseInt((size!=null?size.getText():null)));
                    }

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

    public static class expression_return extends TreeRuleReturnScope {
        public int value;
        public String id_name;
    };

    public final eval.expression_return expression() throws RecognitionException {
        eval.expression_return retval = new eval.expression_return();
        retval.start = input.LT(1);

        CommonTree cname=null;
        CommonTree msg=null;
        CommonTree action=null;
        CommonTree name=null;
        CommonTree n=null;
        CommonTree wnd=null;
        CommonTree IDENT6=null;
        CommonTree INT7=null;
        CommonTree IDENT8=null;
        CommonTree INT9=null;
        CommonTree INT10=null;
        CommonTree IDENT11=null;
        CommonTree IDENT12=null;
        CommonTree IDENT14=null;
        CommonTree IDENT15=null;
        eval.expression_return a = null;

        eval.expression_return b = null;

        eval.expression_return i = null;

        eval.expression_return r = null;

        eval.expression_return x = null;

        eval.expression_return y = null;

        eval.expression_return id = null;

        eval.expression_return ind = null;

        eval.orStatement_return orStatement4 = null;

        eval.andStatement_return andStatement5 = null;

        int call13 = 0;


         retval.id_name = null;
        try {
            int alt5=47;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    {
                    pushFollow(FOLLOW_orStatement_in_expression202);
                    orStatement4=orStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (orStatement4!=null?orStatement4.value:0);
                    }

                    }
                    break;
                case 2 :
                    {
                    pushFollow(FOLLOW_andStatement_in_expression248);
                    andStatement5=andStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (andStatement5!=null?andStatement5.value:0);
                    }

                    }
                    break;
                case 3 :
                    {
                    match(input,164,FOLLOW_164_in_expression292); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression296);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression300);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value == b.value)? 1 : 0;
                    }

                    }
                    break;
                case 4 :
                    {
                    match(input,165,FOLLOW_165_in_expression324); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression328);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression332);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value != b.value)? 1 : 0;
                    }

                    }
                    break;
                case 5 :
                    {
                    match(input,110,FOLLOW_110_in_expression356); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression360);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression364);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value > b.value)? 1 : 0;
                    }

                    }
                    break;
                case 6 :
                    {
                    match(input,109,FOLLOW_109_in_expression389); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression393);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression397);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value < b.value)? 1 : 0;
                    }

                    }
                    break;
                case 7 :
                    {
                    match(input,167,FOLLOW_167_in_expression422); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression426);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression430);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value >= b.value)? 1 : 0;
                    }

                    }
                    break;
                case 8 :
                    {
                    match(input,168,FOLLOW_168_in_expression454); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression458);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression462);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value <= b.value)? 1 : 0;
                    }

                    }
                    break;
                case 9 :
                    {
                    match(input,166,FOLLOW_166_in_expression486); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression490);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression494);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value != b.value)? 1 : 0;
                    }

                    }
                    break;
                case 10 :
                    {
                    match(input,169,FOLLOW_169_in_expression518); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression522);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression526);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = a.value+b.value;
                    }

                    }
                    break;
                case 11 :
                    {
                    match(input,170,FOLLOW_170_in_expression551); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression555);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression559);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = a.value-b.value;
                    }

                    }
                    break;
                case 12 :
                    {
                    match(input,171,FOLLOW_171_in_expression584); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression588);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression592);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = a.value*b.value;
                    }

                    }
                    break;
                case 13 :
                    {
                    match(input,172,FOLLOW_172_in_expression617); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression621);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression625);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = a.value/b.value;
                    }

                    }
                    break;
                case 14 :
                    {
                    match(input,PREFIX,FOLLOW_PREFIX_in_expression650); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,VAR,FOLLOW_VAR_in_expression653); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression655); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,NUM,FOLLOW_NUM_in_expression659); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_expression661); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = hhl_main.symbols.get_value((IDENT6!=null?IDENT6.getText():null))+Integer.parseInt((INT7!=null?INT7.getText():null)); hhl_main.symbols.set_value((IDENT6!=null?IDENT6.getText():null),retval.value);
                    }

                    }
                    break;
                case 15 :
                    {
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_expression686); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,VAR,FOLLOW_VAR_in_expression689); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression691); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,NUM,FOLLOW_NUM_in_expression695); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    INT9=(CommonTree)match(input,INT,FOLLOW_INT_in_expression697); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = hhl_main.symbols.get_value((IDENT8!=null?IDENT8.getText():null)); hhl_main.symbols.set_value((IDENT8!=null?IDENT8.getText():null),retval.value+Integer.parseInt((INT9!=null?INT9.getText():null)));
                    }

                    }
                    break;
                case 16 :
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expression721); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression725);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = -a.value;
                    }

                    }
                    break;
                case 17 :
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression760); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression764);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (a.value!=0)? 0 : 1;
                    }

                    }
                    break;
                case 18 :
                    {
                    match(input,NUM,FOLLOW_NUM_in_expression802); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    INT10=(CommonTree)match(input,INT,FOLLOW_INT_in_expression804); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = Integer.parseInt((INT10!=null?INT10.getText():null));
                    }

                    }
                    break;
                case 19 :
                    {
                    match(input,VAR,FOLLOW_VAR_in_expression851); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression853); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = hhl_main.symbols.get_value((IDENT11!=null?IDENT11.getText():null)); retval.id_name =(IDENT11!=null?IDENT11.getText():null);
                    }

                    }
                    break;
                case 20 :
                    {
                    match(input,INDEX,FOLLOW_INDEX_in_expression898); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression900); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression904);
                    i=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = hhl_main.symbols.get_value((IDENT12!=null?IDENT12.getText():null),i.value);
                    }

                    }
                    break;
                case 21 :
                    {
                    pushFollow(FOLLOW_call_in_expression933);
                    call13=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = call13;
                    }

                    }
                    break;
                case 22 :
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expression985); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    IDENT14=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression987); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression991);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      hhl_main.symbols.set_value((IDENT14!=null?IDENT14.getText():null),a.value); retval.value =(a!=null?a.value:0);
                    }

                    }
                    break;
                case 23 :
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expression1020); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,INDEX,FOLLOW_INDEX_in_expression1023); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    IDENT15=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression1025); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1029);
                    i=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1034);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      hhl_main.symbols.set_value((IDENT15!=null?IDENT15.getText():null),a.value,i.value); ; retval.value =(a!=null?a.value:0);
                    }

                    }
                    break;
                case 24 :
                    {
                    match(input,IS_CURSOR,FOLLOW_IS_CURSOR_in_expression1050); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    cname=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1054); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (ark_bot.cursor_name.equals((cname!=null?cname.getText():null)))? 1 : 0;
                    }

                    }
                    break;
                case 25 :
                    {
                    match(input,INPUT_GET_OBJECT,FOLLOW_INPUT_GET_OBJECT_in_expression1086); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    msg=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1090); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.input_get_object((msg!=null?msg.getText():null));
                    }

                    }
                    break;
                case 26 :
                    {
                    match(input,HAVE_INVENTORY,FOLLOW_HAVE_INVENTORY_in_expression1117); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    action=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1121); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.HaveInventory((action!=null?action.getText():null));
                    }

                    }
                    break;
                case 27 :
                    {
                    match(input,SET_INVENTORY,FOLLOW_SET_INVENTORY_in_expression1147); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1151); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.set_inventory((name!=null?name.getText():null));
                    }

                    }
                    break;
                case 28 :
                    {
                    match(input,NEXT_ITEM,FOLLOW_NEXT_ITEM_in_expression1179); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.next_item();
                    }

                    }
                    break;
                case 29 :
                    {
                    match(input,GET_ITEMS_COUNT,FOLLOW_GET_ITEMS_COUNT_in_expression1225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.get_items_count();
                    }

                    }
                    break;
                case 30 :
                    {
                    match(input,IS_ITEM_NAME,FOLLOW_IS_ITEM_NAME_in_expression1266); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1270); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.is_item_name((name!=null?name.getText():null));
                    }

                    }
                    break;
                case 31 :
                    {
                    match(input,IS_ITEM_TOOLTIP,FOLLOW_IS_ITEM_TOOLTIP_in_expression1300); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1304); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.is_item_tooltip((name!=null?name.getText():null));
                    }

                    }
                    break;
                case 32 :
                    {
                    match(input,ITEM_QUALITY,FOLLOW_ITEM_QUALITY_in_expression1330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.item_quality();
                    }

                    }
                    break;
                case 33 :
                    {
                    match(input,ITEM_COORD_X,FOLLOW_ITEM_COORD_X_in_expression1373); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.item_coord_x();
                    }

                    }
                    break;
                case 34 :
                    {
                    match(input,ITEM_COORD_Y,FOLLOW_ITEM_COORD_Y_in_expression1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.item_coord_y();
                    }

                    }
                    break;
                case 35 :
                    {
                    match(input,ITEM_NUM,FOLLOW_ITEM_NUM_in_expression1459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.item_num();
                    }

                    }
                    break;
                case 36 :
                    {
                    match(input,ITEM_METER,FOLLOW_ITEM_METER_in_expression1506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.item_meter();
                    }

                    }
                    break;
                case 37 :
                    {
                    match(input,FIND_OBJECT_BY_NAME,FOLLOW_FIND_OBJECT_BY_NAME_in_expression1552); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1556); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1560);
                    r=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.find_object_by_name((n!=null?n.getText():null),(r!=null?r.value:0));
                    }

                    }
                    break;
                case 38 :
                    {
                    match(input,FIND_OBJECT_BY_TYPE,FOLLOW_FIND_OBJECT_BY_TYPE_in_expression1576); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1580); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1584);
                    r=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.find_object_by_type((n!=null?n.getText():null),(r!=null?r.value:0));
                    }

                    }
                    break;
                case 39 :
                    {
                    match(input,MY_COORD_X,FOLLOW_MY_COORD_X_in_expression1599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.my_coord_x();
                    }

                    }
                    break;
                case 40 :
                    {
                    match(input,MY_COORD_Y,FOLLOW_MY_COORD_Y_in_expression1644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.my_coord_y();
                    }

                    }
                    break;
                case 41 :
                    {
                    match(input,CHECK_CRAFT,FOLLOW_CHECK_CRAFT_in_expression1690); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    wnd=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1694); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.check_craft((wnd!=null?wnd.getText():null));
                    }

                    }
                    break;
                case 42 :
                    {
                    match(input,FIND_MAP_OBJECT,FOLLOW_FIND_MAP_OBJECT_in_expression1726); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1730); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1734);
                    r=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1738);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1742);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = ark_bot.find_map_object((n!=null?n.getText():null), (r!=null?r.value:0), (x!=null?x.value:0), (y!=null?y.value:0));
                    }

                    }
                    break;
                case 43 :
                    {
                    match(input,GET_OBJECT_BLOB,FOLLOW_GET_OBJECT_BLOB_in_expression1758); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1762);
                    id=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1766);
                    ind=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value =ark_bot.get_object_blob((id!=null?id.value:0), (ind!=null?ind.value:0));
                    }

                    }
                    break;
                case 44 :
                    {
                    match(input,NEXT_BUFF,FOLLOW_NEXT_BUFF_in_expression1781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = ark_bot.next_buff();
                    }

                    }
                    break;
                case 45 :
                    {
                    match(input,BUFF_METER,FOLLOW_BUFF_METER_in_expression1827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = ark_bot.buff_meter();
                    }

                    }
                    break;
                case 46 :
                    {
                    match(input,BUFF_TIME_METER,FOLLOW_BUFF_TIME_METER_in_expression1872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = ark_bot.buff_time_meter();
                    }

                    }
                    break;
                case 47 :
                    {
                    match(input,IS_BUFF_NAME,FOLLOW_IS_BUFF_NAME_in_expression1913); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1917); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.value = ark_bot.is_buff_name((n!=null?n.getText():null));
                    }

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
        return retval;
    }


    public final void block() throws RecognitionException {

            hhl_main.symbols.enter_block();

        try {
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EMPTY) ) {
                alt7=1;
            }
            else if ( (LA7_0==BLOCK) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_block1969); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_block1980); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=PRINT && LA6_0<=NEGATE)||(LA6_0>=CALL && LA6_0<=IF)||LA6_0==WHILE||(LA6_0>=RETURN && LA6_0<=CONTINUE)||(LA6_0>=VAR && LA6_0<=PREFIX)||(LA6_0>=109 && LA6_0<=110)||(LA6_0>=160 && LA6_0<=172)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                     case 1 :
                         {
                         pushFollow(FOLLOW_statement_in_block1982);
                         statement();

                         state._fsp--;
                         if (state.failed) return ;

                         }
                         break;

                     default :
                         if ( cnt6 >= 1 ) break loop6;
                         if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;

            }
            if ( state.backtracking==0 ) {

                  hhl_main.symbols.exit_block();

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


    public final void statement() throws RecognitionException {
        CommonTree s=null;
        CommonTree sname=null;
        CommonTree sname2=null;
        CommonTree action=null;
        CommonTree n=null;
        CommonTree act=null;
        CommonTree wnd=null;
        eval.expression_return obj = null;

        eval.expression_return btn = null;

        eval.expression_return mod = null;

        eval.expression_return id = null;

        eval.expression_return x = null;

        eval.expression_return y = null;

        eval.expression_return i = null;

        eval.expression_return a = null;

        eval.expression_return slot = null;

        eval.expression_return expression16 = null;

        eval.expression_return expression17 = null;

        eval.expression_return expression18 = null;



            try{
            if((! ((call_scope)call_stack.peek()).can_run) || ((whileStatement_scope)whileStatement_stack.peek()).breaked || ((whileStatement_scope)whileStatement_stack.peek()).continued){
                matchAny(input);
                return;
            }
            }catch(java.util.EmptyStackException ignore){}

        try {
            int alt8=46;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    {
                    pushFollow(FOLLOW_expression_in_statement2016);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    {
                    pushFollow(FOLLOW_varDecl_in_statement2028);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2041); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2043);
                    expression16=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      ((call_scope)call_stack.peek()).return_val =(expression16!=null?expression16.value:0); ((call_scope)call_stack.peek()).can_run =false;
                    }

                    }
                    break;
                case 4 :
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_statement2064); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2066);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println((expression17!=null?expression17.value:0));
                    }

                    }
                    break;
                case 5 :
                    {
                    match(input,PRINT_STRING,FOLLOW_PRINT_STRING_in_statement2088); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2092); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println((s!=null?s.getText():null));
                    }

                    }
                    break;
                case 6 :
                    {
                    match(input,SLEEP,FOLLOW_SLEEP_in_statement2109); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2111);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      try {hhl_main.thread.sleep((expression18!=null?expression18.value:0));} catch (Exception e) {e.printStackTrace();}
                    }

                    }
                    break;
                case 7 :
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2132); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      ((whileStatement_scope)whileStatement_stack.peek()).breaked =true;
                    }

                    }
                    break;
                case 8 :
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2166); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      ((whileStatement_scope)whileStatement_stack.peek()).continued =true;
                    }

                    }
                    break;
                case 9 :
                    {
                    match(input,EXIT,FOLLOW_EXIT_in_statement2197); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.exit_command();
                    }

                    }
                    break;
                case 10 :
                    {
                    match(input,LOGOUT,FOLLOW_LOGOUT_in_statement2232); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.logout_command();
                    }

                    }
                    break;
                case 11 :
                    {
                    match(input,SAY,FOLLOW_SAY_in_statement2266); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2270); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.say((s!=null?s.getText():null));
                    }

                    }
                    break;
                case 12 :
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement2313);
                    ifStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement2325);
                    whileStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    {
                    match(input,DO_CLICK,FOLLOW_DO_CLICK_in_statement2338); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2342);
                    obj=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2346);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2350);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      ark_bot.DoClick((obj!=null?obj.value:0), (btn!=null?btn.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 15 :
                    {
                    match(input,SELECT_CONTEXT_MENU,FOLLOW_SELECT_CONTEXT_MENU_in_statement2391); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sname=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2395); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.SelectFlowerMenuOpt((sname!=null?sname.getText():null));
                    }

                    }
                    break;
                case 16 :
                    {
                    match(input,MAP_MOVE,FOLLOW_MAP_MOVE_in_statement2435); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2439);
                    id=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2443);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2447);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_move((id!=null?id.value:0), new Coord((x!=null?x.value:0), (y!=null?y.value:0)));
                    }

                    }
                    break;
                case 17 :
                    {
                    match(input,MAP_MOVE_STEP,FOLLOW_MAP_MOVE_STEP_in_statement2487); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2491);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2495);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_move_step((x!=null?x.value:0), (y!=null?y.value:0));
                    }

                    }
                    break;
                case 18 :
                    {
                    match(input,SEND_ACTION,FOLLOW_SEND_ACTION_in_statement2535); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sname=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2539); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.SendAction((sname!=null?sname.getText():null));
                    }

                    }
                    break;
                case 19 :
                    {
                    match(input,SEND_ACTION2,FOLLOW_SEND_ACTION2_in_statement2579); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sname=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2583); if (state.failed) return ;
                    sname2=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2587); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      ark_bot.SendAction((sname!=null?sname.getText():null), (sname2!=null?sname2.getText():null));
                    }

                    }
                    break;
                case 20 :
                    {
                    match(input,MAP_CLICK,FOLLOW_MAP_CLICK_in_statement2628); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2632);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2636);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2640);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2644);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_click((x!=null?x.value:0), (y!=null?y.value:0), (btn!=null?btn.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 21 :
                    {
                    match(input,MAP_INTERACT_CLICK,FOLLOW_MAP_INTERACT_CLICK_in_statement2684); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2688);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2692);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2696);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_interact_click((x!=null?x.value:0), (y!=null?y.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 22 :
                    {
                    match(input,MAP_INTERACT_CLICK2,FOLLOW_MAP_INTERACT_CLICK2_in_statement2736); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2740);
                    id=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2744);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_interact_click((id!=null?id.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 23 :
                    {
                    match(input,MAP_ABS_INTERACT_CLICK,FOLLOW_MAP_ABS_INTERACT_CLICK_in_statement2784); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2788);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2792);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2796);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_abs_interact_click((x!=null?x.value:0), (y!=null?y.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 24 :
                    {
                    match(input,DROP,FOLLOW_DROP_in_statement2836); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2840);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.drop_thing((mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 25 :
                    {
                    match(input,RESET_INVENTORY,FOLLOW_RESET_INVENTORY_in_statement2883); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.reset_inventory();
                    }

                    }
                    break;
                case 26 :
                    {
                    match(input,SET_ITEM_INDEX,FOLLOW_SET_ITEM_INDEX_in_statement2923); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2927);
                    i=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.set_item_index((i!=null?i.value:0));
                    }

                    }
                    break;
                case 27 :
                    {
                    match(input,ITEM_CLICK,FOLLOW_ITEM_CLICK_in_statement2968); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    action=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement2972); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.item_click((action!=null?action.getText():null), 0);
                    }

                    }
                    break;
                case 28 :
                    {
                    match(input,ITEM_CLICK2,FOLLOW_ITEM_CLICK2_in_statement3013); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    action=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3017); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3021);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.item_click((action!=null?action.getText():null),(mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 29 :
                    {
                    match(input,ITEM_DROP,FOLLOW_ITEM_DROP_in_statement3062); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3066);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3070);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.item_drop(new Coord((x!=null?x.value:0), (y!=null?y.value:0)));
                    }

                    }
                    break;
                case 30 :
                    {
                    match(input,ITEM_DROP_TO_INVENTORY,FOLLOW_ITEM_DROP_TO_INVENTORY_in_statement3111); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3115); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3119);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3123);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.item_drop_to_inventory((n!=null?n.getText():null), new Coord((x!=null?x.value:0), (y!=null?y.value:0)));
                    }

                    }
                    break;
                case 31 :
                    {
                    match(input,CRAFT,FOLLOW_CRAFT_in_statement3164); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3168);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.craft((a!=null?a.value:0));
                    }

                    }
                    break;
                case 32 :
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_statement3209); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3213);
                    slot=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    act=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3217); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.equip((slot!=null?slot.value:0), (act!=null?act.getText():null));
                    }

                    }
                    break;
                case 33 :
                    {
                    match(input,INVENTORY,FOLLOW_INVENTORY_in_statement3258); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3263); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3267);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3271);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    act=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3275); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.inventory((n!=null?n.getText():null), (x!=null?x.value:0), (y!=null?y.value:0), (act!=null?act.getText():null), 0);
                    }

                    }
                    break;
                case 34 :
                    {
                    match(input,INVENTORY2,FOLLOW_INVENTORY2_in_statement3315); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    n=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3320); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3324);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3328);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    act=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3332); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3336);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.inventory((n!=null?n.getText():null), (x!=null?x.value:0), (y!=null?y.value:0), (act!=null?act.getText():null), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 35 :
                    {
                    match(input,MAP_ABS_CLICK,FOLLOW_MAP_ABS_CLICK_in_statement3376); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3380);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3384);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3388);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3392);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_abs_click((x!=null?x.value:0), (y!=null?y.value:0), (btn!=null?btn.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 36 :
                    {
                    match(input,WAIT_CRAFT,FOLLOW_WAIT_CRAFT_in_statement3432); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    wnd=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3436); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.wait_craft((wnd!=null?wnd.getText():null));
                    }

                    }
                    break;
                case 37 :
                    {
                    match(input,OPEN_INVENTORY,FOLLOW_OPEN_INVENTORY_in_statement3475); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.OpenInventory();
                    }

                    }
                    break;
                case 38 :
                    {
                    match(input,SET_SHOW_VAR,FOLLOW_SET_SHOW_VAR_in_statement3514); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_statement3518); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       synchronized (hhl_main.symbols.ShowNames) { hhl_main.symbols.ShowNames.add((s!=null?s.getText():null)); }
                    }

                    }
                    break;
                case 39 :
                    {
                    match(input,SET_ITEM_DRAG,FOLLOW_SET_ITEM_DRAG_in_statement3557); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.set_item_drag();
                    }

                    }
                    break;
                case 40 :
                    {
                    match(input,RENDER_MODE,FOLLOW_RENDER_MODE_in_statement3596); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3600);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.set_render_mode((x!=null?x.value:0));
                    }

                    }
                    break;
                case 41 :
                    {
                    match(input,RESET_BUFF,FOLLOW_RESET_BUFF_in_statement3639); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.reset_buff_iterator();
                    }

                    }
                    break;
                case 42 :
                    {
                    match(input,MAP_PLACE,FOLLOW_MAP_PLACE_in_statement3678); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3682);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3686);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3690);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3694);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if (ark_bot.mapview != null) ark_bot.mapview.map_place((x!=null?x.value:0), (y!=null?y.value:0), (btn!=null?btn.value:0), (mod!=null?mod.value:0));
                    }

                    }
                    break;
                case 43 :
                    {
                    match(input,BUILD_CLICK,FOLLOW_BUILD_CLICK_in_statement3733); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.build_click();
                    }

                    }
                    break;
                case 44 :
                    {
                    match(input,SET_ITEM_EQUIP,FOLLOW_SET_ITEM_EQUIP_in_statement3772); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement3776);
                    i=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ark_bot.set_item_equip((i!=null?i.value:0));
                    }

                    }
                    break;
                case 45 :
                    {
                    pushFollow(FOLLOW_block_in_statement3815);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 46 :
                    {
                    match(input,NOP,FOLLOW_NOP_in_statement3827); if (state.failed) return ;

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

    protected static class whileStatement_scope {
        Boolean breaked;
        Boolean continued;
    }
    protected Stack whileStatement_stack = new Stack();

    public static class whileStatement_return extends TreeRuleReturnScope {
    };

    public final eval.whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_stack.push(new whileStatement_scope());
        eval.whileStatement_return retval = new eval.whileStatement_return();
        retval.start = input.LT(1);

        try {
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement3857); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

            if ( state.backtracking==0 ) {

                  CommonTree stmtNode=(CommonTree)((CommonTree)retval.start).getChild(1);
                  CommonTree exprNode=(CommonTree)((CommonTree)retval.start).getChild(0);

                  int test;

                  ((whileStatement_scope)whileStatement_stack.peek()).breaked =false;
                  while(((whileStatement_scope)whileStatement_stack.peek()).breaked==false){
                          PushInputTree(exprNode);
                          ((whileStatement_scope)whileStatement_stack.peek()).continued =false;
                          test=expression().value;
                          PopInputTree();
                          if (test==0) break;
                          PushInputTree(stmtNode);
                          statement();
                          PopInputTree();
                      }


            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            whileStatement_stack.pop();
        }
        return retval;
    }

    public static class ifStatement_return extends TreeRuleReturnScope {
    };

    public final eval.ifStatement_return ifStatement() throws RecognitionException {
        eval.ifStatement_return retval = new eval.ifStatement_return();
        retval.start = input.LT(1);

        eval.expression_return v = null;


        try {
            {
            match(input,IF,FOLLOW_IF_in_ifStatement3886); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            match(input,EXPR,FOLLOW_EXPR_in_ifStatement3889); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_ifStatement3893);
            v=expression();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

            if ( state.backtracking==0 ) {

                  CommonTree stmtNode = null;
                  if ((v!=null?v.value:0)!=0){
                      stmtNode = (CommonTree)((CommonTree)retval.start).getChild(1);
                  }else{
                      stmtNode = (CommonTree)((CommonTree)retval.start).getChild(2);
                  }
                       PushInputTree(stmtNode);
                       statement();
                       PopInputTree();

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }

    public static class orStatement_return extends TreeRuleReturnScope {
        public int value;
    };

    public final eval.orStatement_return orStatement() throws RecognitionException {
        eval.orStatement_return retval = new eval.orStatement_return();
        retval.start = input.LT(1);

        eval.expression_return a = null;


        try {
            {
            if ( (input.LA(1)>=160 && input.LA(1)<=161) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_orStatement3942);
            a=expression();

            state._fsp--;
            if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

            if ( state.backtracking==0 ) {

                  if ((a!=null?a.value:0)!=0){
                      retval.value =1;
                  }else{
                          PushInputTree((CommonTree)((CommonTree)retval.start).getChild(1));
                          retval.value = expression().value;
                          if (retval.value != 0) retval.value = 1;
                          PopInputTree();
                      }

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }

    public static class andStatement_return extends TreeRuleReturnScope {
        public int value;
    };

    public final eval.andStatement_return andStatement() throws RecognitionException {
        eval.andStatement_return retval = new eval.andStatement_return();
        retval.start = input.LT(1);

        eval.expression_return a = null;


        try {
            {
            if ( (input.LA(1)>=162 && input.LA(1)<=163) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_andStatement3988);
            a=expression();

            state._fsp--;
            if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

            if ( state.backtracking==0 ) {

                  if ((a!=null?a.value:0)==0){
                      retval.value =0;
                  }else{
                          PushInputTree((CommonTree)((CommonTree)retval.start).getChild(1));
                          retval.value = expression().value;
                          if (retval.value != 0) retval.value = 1;
                          PopInputTree();
                      }

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }

    protected static class call_scope {
        int return_val;
        Boolean can_run;
        Boolean in_paramater_defs;
    }
    protected Stack call_stack = new Stack();


    public final int call() throws RecognitionException {
        call_stack.push(new call_scope());
        int value = 0;

        CommonTree IDENT20=null;
        eval.expression_return expression19 = null;




            Vector params;
            Function fcn = null;
            int p_i;
            ((call_scope)call_stack.peek()).can_run =true;
            params=new Vector();
            p_i=0;

        try {
            {
            match(input,CALL,FOLLOW_CALL_in_call4023); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            IDENT20=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_call4025); if (state.failed) return value;
            if ( state.backtracking==0 ) {
            }
            match(input,EXPRLIST,FOLLOW_EXPRLIST_in_call4030); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==IS_CURSOR||(LA9_0>=INPUT_GET_OBJECT && LA9_0<=SET_INVENTORY)||(LA9_0>=NEXT_ITEM && LA9_0<=GET_ITEMS_COUNT)||(LA9_0>=IS_ITEM_NAME && LA9_0<=ITEM_QUALITY)||(LA9_0>=ITEM_COORD_X && LA9_0<=ITEM_METER)||(LA9_0>=CHECK_CRAFT && LA9_0<=FIND_OBJECT_BY_NAME)||LA9_0==FIND_OBJECT_BY_TYPE||(LA9_0>=MY_COORD_X && LA9_0<=IS_ITEM_TOOLTIP)||LA9_0==FIND_MAP_OBJECT||LA9_0==GET_OBJECT_BLOB||(LA9_0>=NEXT_BUFF && LA9_0<=IS_BUFF_NAME)||(LA9_0>=NOT && LA9_0<=NEGATE)||LA9_0==CALL||(LA9_0>=VAR && LA9_0<=NUM)||(LA9_0>=ASSIGN && LA9_0<=PREFIX)||(LA9_0>=109 && LA9_0<=110)||(LA9_0>=160 && LA9_0<=172)) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                 case 1 :
                     {
                     pushFollow(FOLLOW_expression_in_call4033);
                     expression19=expression();

                     state._fsp--;
                     if (state.failed) return value;
                     if ( state.backtracking==0 ) {

                                   if ((expression19!=null?expression19.id_name:null) != null) {
                                       params.add(hhl_main.symbols.get_variable((expression19!=null?expression19.id_name:null)));
                                   }else{
                                       params.add((expression19!=null?expression19.value:0));
                                   }
                                   p_i++;

                     }

                     }
                     break;

                 default :
                     break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return value;
            }

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

                      if (hhl_main.IncludeDepth <= 1)
                          fcn=hhl_main.symbols.get_function((IDENT20!=null?IDENT20.getText():null), params);
                      if (fcn == null) { hhl_main.PrintError("No such function: " + (IDENT20!=null?IDENT20.getText():null)); }
                      if ((fcn != null) && (hhl_main.IncludeDepth <= 1)) {
                      hhl_main.symbols.enter_frame(fcn,params);

                          PushInputTree(fcn.tree);
                          block();
                          PopInputTree();
                          value = ((call_scope)call_stack.peek()).return_val;

                      hhl_main.symbols.exit_frame();
                      }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            call_stack.pop();
        }
        return value;
    }

    public final void synpred1_eval_fragment() throws RecognitionException {
        {
        pushFollow(FOLLOW_expression_in_synpred1_eval2016);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }

    public final void synpred2_eval_fragment() throws RecognitionException {
        {
        pushFollow(FOLLOW_varDecl_in_synpred2_eval2028);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }

    public final void synpred45_eval_fragment() throws RecognitionException {
        {
        pushFollow(FOLLOW_block_in_synpred45_eval3815);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }


    public final boolean synpred1_eval() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_eval_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_eval() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_eval_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_eval() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_eval_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA5_eotS =
        "\62\uffff";
    static final String DFA5_eofS =
        "\62\uffff";
    static final String DFA5_minS =
        "\1\13\25\uffff\1\2\30\uffff\1\124\2\uffff";
    static final String DFA5_maxS =
        "\1\u00ac\25\uffff\1\2\30\uffff\1\142\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\30\1\31\1"+
        "\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\26\1\27";
    static final String DFA5_specialS =
        "\62\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\27\6\uffff\1\30\1\31\1\32\1\uffff\1\33\1\34\2\uffff\1\35"+
            "\1\37\2\uffff\1\40\1\41\1\42\1\43\2\uffff\1\50\1\44\2\uffff"+
            "\1\45\4\uffff\1\46\1\47\1\36\3\uffff\1\51\5\uffff\1\52\1\uffff"+
            "\1\53\1\54\1\55\1\56\2\uffff\1\21\1\20\5\uffff\1\25\12\uffff"+
            "\1\23\1\24\1\22\5\uffff\1\26\1\17\1\16\17\uffff\1\6\1\5\61\uffff"+
            "\2\1\2\2\1\3\1\4\1\11\1\7\1\10\1\12\1\13\1\14\1\15",
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
            "\1\57",
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
            "",
            "",
            "\1\61\15\uffff\1\60",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "41:1: expression returns [int value, String id_name] : ( orStatement | andStatement | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '<>' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( PREFIX ^( VAR IDENT ) ^( NUM INT ) ) | ^( POSTFIX ^( VAR IDENT ) ^( NUM INT ) ) | ^( NEGATE a= expression ) | ^( NOT a= expression ) | ^( NUM INT ) | ^( VAR IDENT ) | ^( INDEX IDENT i= expression ) | call | ^( ASSIGN IDENT a= expression ) | ^( ASSIGN ^( INDEX IDENT i= expression ) a= expression ) | ^( IS_CURSOR cname= STRING ) | ^( INPUT_GET_OBJECT msg= STRING ) | ^( HAVE_INVENTORY action= STRING ) | ^( SET_INVENTORY name= STRING ) | NEXT_ITEM | GET_ITEMS_COUNT | ^( IS_ITEM_NAME name= STRING ) | ^( IS_ITEM_TOOLTIP name= STRING ) | ITEM_QUALITY | ITEM_COORD_X | ITEM_COORD_Y | ITEM_NUM | ITEM_METER | ^( FIND_OBJECT_BY_NAME n= STRING r= expression ) | ^( FIND_OBJECT_BY_TYPE n= STRING r= expression ) | MY_COORD_X | MY_COORD_Y | ^( CHECK_CRAFT wnd= STRING ) | ^( FIND_MAP_OBJECT n= STRING r= expression x= expression y= expression ) | ^( GET_OBJECT_BLOB id= expression ind= expression ) | NEXT_BUFF | BUFF_METER | BUFF_TIME_METER | ^( IS_BUFF_NAME n= STRING ) );";
        }
    }
    static final String DFA8_eotS =
        "\136\uffff";
    static final String DFA8_eofS =
        "\136\uffff";
    static final String DFA8_minS =
        "\1\4\25\uffff\1\0\30\uffff\1\0\56\uffff";
    static final String DFA8_maxS =
        "\1\u00ac\25\uffff\1\0\30\uffff\1\0\56\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\56\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
        "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
        "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56";
    static final String DFA8_specialS =
        "\26\uffff\1\0\30\uffff\1\1\56\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\63\1\64\1\65\1\75\1\76\1\77\1\100\1\1\1\101\1\102\1\103"+
            "\1\104\1\105\1\107\3\1\1\110\2\1\1\106\1\111\2\1\1\112\1\113"+
            "\4\1\1\114\1\123\2\1\1\116\1\115\1\1\1\117\1\120\1\121\1\122"+
            "\3\1\1\70\1\71\1\72\1\1\1\124\1\125\1\126\1\133\1\127\1\1\1"+
            "\130\4\1\1\131\1\132\2\1\5\uffff\1\1\1\73\1\uffff\1\74\1\uffff"+
            "\1\62\1\66\1\67\3\uffff\3\1\1\134\1\57\1\135\2\60\1\26\2\1\17"+
            "\uffff\2\1\61\uffff\15\1",
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
            "\1\uffff",
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
            "",
            "",
            "\1\uffff",
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
            return "103:1: statement options {backtrack=true; } : ( expression | varDecl | ^( RETURN expression ) | ^( PRINT expression ) | ^( PRINT_STRING s= STRING ) | ^( SLEEP expression ) | BREAK | CONTINUE | EXIT | LOGOUT | ^( SAY s= STRING ) | ifStatement | whileStatement | ^( DO_CLICK obj= expression btn= expression mod= expression ) | ^( SELECT_CONTEXT_MENU sname= STRING ) | ^( MAP_MOVE id= expression x= expression y= expression ) | ^( MAP_MOVE_STEP x= expression y= expression ) | ^( SEND_ACTION sname= STRING ) | ^( SEND_ACTION2 sname= STRING sname2= STRING ) | ^( MAP_CLICK x= expression y= expression btn= expression mod= expression ) | ^( MAP_INTERACT_CLICK x= expression y= expression mod= expression ) | ^( MAP_INTERACT_CLICK2 id= expression mod= expression ) | ^( MAP_ABS_INTERACT_CLICK x= expression y= expression mod= expression ) | ^( DROP mod= expression ) | RESET_INVENTORY | ^( SET_ITEM_INDEX i= expression ) | ^( ITEM_CLICK action= STRING ) | ^( ITEM_CLICK2 action= STRING mod= expression ) | ^( ITEM_DROP x= expression y= expression ) | ^( ITEM_DROP_TO_INVENTORY n= STRING x= expression y= expression ) | ^( CRAFT a= expression ) | ^( EQUIP slot= expression act= STRING ) | ^( INVENTORY n= STRING x= expression y= expression act= STRING ) | ^( INVENTORY2 n= STRING x= expression y= expression act= STRING mod= expression ) | ^( MAP_ABS_CLICK x= expression y= expression btn= expression mod= expression ) | ^( WAIT_CRAFT wnd= STRING ) | OPEN_INVENTORY | ^( SET_SHOW_VAR s= STRING ) | SET_ITEM_DRAG | ^( RENDER_MODE x= expression ) | RESET_BUFF | ^( MAP_PLACE x= expression y= expression btn= expression mod= expression ) | BUILD_CLICK | ^( SET_ITEM_EQUIP i= expression ) | block | NOP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
         int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA8_22 = input.LA(1);


                        int index8_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_eval()) ) {s = 1;}

                        else if ( (synpred2_eval()) ) {s = 48;}


                        input.seek(index8_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA8_47 = input.LA(1);


                        int index8_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_eval()) ) {s = 48;}

                        else if ( (synpred45_eval()) ) {s = 92;}


                        input.seek(index8_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }


    public static final BitSet FOLLOW_INCLUDELIST_in_program64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PROGRAM_in_program71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLES_in_program74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDecl_in_program76 = new BitSet(new long[]{0x0000000000000008L,0x000000000E800000L});
    public static final BitSet FOLLOW_FUNCTIONS_in_program81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_call_in_program87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EOF_in_program90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_varDecl109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_varDecl120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_varDecl122 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_varDecl126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_varDecl140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_varDecl142 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_varDecl146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYDECL_in_varDecl160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_varDecl162 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_varDecl166 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_varDecl170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_orStatement_in_expression202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andStatement_in_expression248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_expression292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression296 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_165_in_expression324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression328 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_110_in_expression356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression360 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_109_in_expression389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression393 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_167_in_expression422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression426 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_168_in_expression454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression458 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_166_in_expression486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression490 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_169_in_expression518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression522 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_170_in_expression551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression555 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_171_in_expression584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression588 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_172_in_expression617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression621 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_expression650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_expression653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_expression659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expression661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTFIX_in_expression686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_expression689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_expression695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expression697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_expression721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_expression802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expression804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_expression851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_expression898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression900 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_call_in_expression933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_expression985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression987 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expression1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INDEX_in_expression1023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expression1025 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression1034 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_CURSOR_in_expression1050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INPUT_GET_OBJECT_in_expression1086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVE_INVENTORY_in_expression1117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_INVENTORY_in_expression1147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEXT_ITEM_in_expression1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_ITEMS_COUNT_in_expression1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_ITEM_NAME_in_expression1266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_ITEM_TOOLTIP_in_expression1300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITEM_QUALITY_in_expression1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_COORD_X_in_expression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_COORD_Y_in_expression1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_NUM_in_expression1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_METER_in_expression1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIND_OBJECT_BY_NAME_in_expression1552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1556 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIND_OBJECT_BY_TYPE_in_expression1576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1580 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MY_COORD_X_in_expression1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MY_COORD_Y_in_expression1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_CRAFT_in_expression1690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIND_MAP_OBJECT_in_expression1726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1730 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1734 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1738 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_OBJECT_BLOB_in_expression1758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1762 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_expression1766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEXT_BUFF_in_expression1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUFF_METER_in_expression1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUFF_TIME_METER_in_expression1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_BUFF_NAME_in_expression1913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_expression1917 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EMPTY_in_block1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block1980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block1982 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x000060003FF8EB07L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_statement2064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_STRING_in_statement2088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement2092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLEEP_in_statement2109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_statement2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGOUT_in_statement2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAY_in_statement2266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement2270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_CLICK_in_statement2338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2342 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2346 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CONTEXT_MENU_in_statement2391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement2395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_MOVE_in_statement2435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2439 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2443 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_MOVE_STEP_in_statement2487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2491 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2495 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEND_ACTION_in_statement2535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement2539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEND_ACTION2_in_statement2579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement2583 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement2587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_CLICK_in_statement2628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2632 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2636 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2640 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_INTERACT_CLICK_in_statement2684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2688 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2692 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_INTERACT_CLICK2_in_statement2736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2740 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_ABS_INTERACT_CLICK_in_statement2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2788 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2792 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement2796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_in_statement2836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESET_INVENTORY_in_statement2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_ITEM_INDEX_in_statement2923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITEM_CLICK_in_statement2968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement2972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITEM_CLICK2_in_statement3013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement3017 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITEM_DROP_in_statement3062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3066 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITEM_DROP_TO_INVENTORY_in_statement3111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement3115 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3119 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRAFT_in_statement3164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_statement3209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3213 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVENTORY_in_statement3258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement3263 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3267 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3271 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVENTORY2_in_statement3315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement3320 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3324 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3328 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3332 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAP_ABS_CLICK_in_statement3376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3380 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3384 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3388 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_CRAFT_in_statement3432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement3436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPEN_INVENTORY_in_statement3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_SHOW_VAR_in_statement3514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_statement3518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_ITEM_DRAG_in_statement3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RENDER_MODE_in_statement3596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESET_BUFF_in_statement3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_PLACE_in_statement3678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3682 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3686 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3690 = new BitSet(new long[]{0x7A08E133CCDC0800L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_statement3694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUILD_CLICK_in_statement3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_ITEM_EQUIP_in_statement3772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOP_in_statement3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement3857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_in_ifStatement3886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_ifStatement3889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement3893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_orStatement3934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_orStatement3942 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_set_in_andStatement3980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_andStatement3988 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_CALL_in_call4023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_call4025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EXPRLIST_in_call4030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_call4033 = new BitSet(new long[]{0x7A08E133CCDC0808L,0x0000600038380106L,0x00001FFF00000000L});
    public static final BitSet FOLLOW_expression_in_synpred1_eval2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred2_eval2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred45_eval3815 = new BitSet(new long[]{0x0000000000000002L});

}
