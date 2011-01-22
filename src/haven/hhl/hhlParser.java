/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/

package haven.hhl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class hhlParser extends Parser {
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
    public static final int T__142=142;
    public static final int MAP_PLACE=63;
    public static final int SAY=50;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int EMPTY=87;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int BUFF_METER=60;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=107;
    public static final int T__129=129;
    public static final int CALL=72;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int INCLUDELIST=69;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int CRAFT=38;
    public static final int ITEM_DROP=34;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int MAP_ABS_INTERACT_CLICK=24;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int SLEEP=6;
    public static final int ITEM_QUALITY=27;
    public static final int T__115=115;
    public static final int SET_ITEM_INDEX=25;
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
    public static final int T__179=179;
    public static final int MAP_ABS_CLICK=44;
    public static final int T__178=178;
    public static final int NEWLINE=104;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int MAP_CLICK=14;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int VARIABLES=70;
    public static final int ASSIGN=91;
    public static final int MY_COORD_Y=46;
    public static final int T__169=169;
    public static final int MY_COORD_X=45;



        public hhlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public hhlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return hhlParser.tokenNames; }
    public String getGrammarFileName() { return ""; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.start_return start() throws RecognitionException {
        hhlParser.start_return retval = new hhlParser.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hhlParser.includeList_return includeList1 = null;

        hhlParser.program_return program2 = null;


        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        RewriteRuleSubtreeStream stream_includeList=new RewriteRuleSubtreeStream(adaptor,"rule includeList");
        try {
            {
            pushFollow(FOLLOW_includeList_in_start381);
            includeList1=includeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_includeList.add(includeList1.getTree());
            pushFollow(FOLLOW_program_in_start383);
            program2=program();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_program.add(program2.getTree());


            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            if (stream_includeList.size() > 0 ) {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INCLUDELIST, "INCLUDELIST"), root_1);

                adaptor.addChild(root_1, stream_includeList.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_program.nextTree());

            }
            else 
            {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INCLUDELIST, "INCLUDELIST"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_program.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.program_return program() throws RecognitionException {
        hhlParser.program_return retval = new hhlParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hhlParser.varList_return varList3 = null;

        hhlParser.functionList_return functionList4 = null;


        RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");
        RewriteRuleSubtreeStream stream_varList=new RewriteRuleSubtreeStream(adaptor,"rule varList");
        try {
            {
            pushFollow(FOLLOW_varList_in_program484);
            varList3=varList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varList.add(varList3.getTree());
            pushFollow(FOLLOW_functionList_in_program486);
            functionList4=functionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionList.add(functionList4.getTree());


            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            if (stream_varList.size()>0 ) {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLES, "VARIABLES"), root_2);

                adaptor.addChild(root_2, stream_varList.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_2);

                adaptor.addChild(root_2, stream_functionList.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_2);

                adaptor.addChild(root_2, adaptor.create(IDENT,"main"));
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRLIST, "EXPRLIST"), root_3);

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else 
            {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLES, "VARIABLES"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                adaptor.addChild(root_1, root_2);
                }
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_2);

                adaptor.addChild(root_2, stream_functionList.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_2);

                adaptor.addChild(root_2, adaptor.create(IDENT,"main"));
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRLIST, "EXPRLIST"), root_3);

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class includeList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.includeList_return includeList() throws RecognitionException {
        hhlParser.includeList_return retval = new hhlParser.includeList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hhlParser.include_return include5 = null;



        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==108) ) {
                    alt1=1;
                }


                switch (alt1) {
             case 1 :
                 {
                 pushFollow(FOLLOW_include_in_includeList624);
                 include5=include();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, include5.getTree());

                 }
                 break;

             default :
                 break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class include_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.include_return include() throws RecognitionException {
        hhlParser.include_return retval = new hhlParser.include_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal6=null;
        Token char_literal7=null;
        Token IDENT8=null;
        Token char_literal9=null;

        CommonTree string_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree IDENT8_tree=null;
        CommonTree char_literal9_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");

        try {
            {
            {
            string_literal6=(Token)match(input,108,FOLLOW_108_in_include649); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_108.add(string_literal6);

            char_literal7=(Token)match(input,109,FOLLOW_109_in_include651); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_109.add(char_literal7);

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_include653); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT8);

            char_literal9=(Token)match(input,110,FOLLOW_110_in_include655); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_110.add(char_literal9);


            }



            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INCLUDE, "INCLUDE"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class functionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.functionList_return functionList() throws RecognitionException {
        hhlParser.functionList_return retval = new hhlParser.functionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hhlParser.functionDeclaration_return functionDeclaration10 = null;



        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
             case 1 :
                 {
                 pushFollow(FOLLOW_functionDeclaration_in_functionList696);
                 functionDeclaration10=functionDeclaration();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration10.getTree());

                 }
                 break;

             default :
                 if ( cnt2 >= 1 ) break loop2;
                 if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        hhlParser.functionDeclaration_return retval = new hhlParser.functionDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE11=null;
        Token IDENT12=null;
        hhlParser.block_return act = null;

        hhlParser.paramList_return paramList13 = null;


        CommonTree TYPE11_tree=null;
        CommonTree IDENT12_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            {
            TYPE11=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration716); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE11);

            IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionDeclaration718); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT12);

            pushFollow(FOLLOW_paramList_in_functionDeclaration720);
            paramList13=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList13.getTree());
            pushFollow(FOLLOW_block_in_functionDeclaration724);
            act=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(act.getTree());


            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_act=new RewriteRuleSubtreeStream(adaptor,"rule act",act!=null?act.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_TYPE.nextNode());
                adaptor.addChild(root_1, stream_IDENT.nextNode());
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMATERS, "PARAMATERS"), root_2);

                adaptor.addChild(root_2, stream_paramList.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_act.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class paramList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.paramList_return paramList() throws RecognitionException {
        hhlParser.paramList_return retval = new hhlParser.paramList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal14=null;
        Token char_literal15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        hhlParser.paramDecl_return paramDecl17 = null;

        hhlParser.paramDecl_return paramDecl19 = null;


        CommonTree char_literal14_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_paramDecl=new RewriteRuleSubtreeStream(adaptor,"rule paramDecl");
        try {
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==111) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==112) ) {
                    alt4=1;
                }
                else if ( (LA4_1==TYPE) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    {
                    char_literal14=(Token)match(input,111,FOLLOW_111_in_paramList767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal14);

                    char_literal15=(Token)match(input,112,FOLLOW_112_in_paramList769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal15);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    char_literal16=(Token)match(input,111,FOLLOW_111_in_paramList811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal16);

                    pushFollow(FOLLOW_paramDecl_in_paramList813);
                    paramDecl17=paramDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramDecl.add(paramDecl17.getTree());
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==113) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                     case 1 :
                         {
                         char_literal18=(Token)match(input,113,FOLLOW_113_in_paramList816); if (state.failed) return retval;
                         if ( state.backtracking==0 ) stream_113.add(char_literal18);

                         pushFollow(FOLLOW_paramDecl_in_paramList818);
                         paramDecl19=paramDecl();

                         state._fsp--;
                         if (state.failed) return retval;
                         if ( state.backtracking==0 ) stream_paramDecl.add(paramDecl19.getTree());

                         }
                         break;

                     default :
                         break loop3;
                        }
                    } while (true);

                    char_literal20=(Token)match(input,112,FOLLOW_112_in_paramList822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal20);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        if ( !(stream_paramDecl.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_paramDecl.hasNext() ) {
                            adaptor.addChild(root_0, stream_paramDecl.nextTree());

                        }
                        stream_paramDecl.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class paramDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.paramDecl_return paramDecl() throws RecognitionException {
        hhlParser.paramDecl_return retval = new hhlParser.paramDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE21=null;
        Token IDENT22=null;
        Token TYPE23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token IDENT26=null;

        CommonTree TYPE21_tree=null;
        CommonTree IDENT22_tree=null;
        CommonTree TYPE23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree IDENT26_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==TYPE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==IDENT) ) {
                    alt5=1;
                }
                else if ( (LA5_1==114) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    {
                    TYPE21=(Token)match(input,TYPE,FOLLOW_TYPE_in_paramDecl855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE21);

                    IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_paramDecl857); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT22);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARPARAM, "VARPARAM"), root_1);

                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    TYPE23=(Token)match(input,TYPE,FOLLOW_TYPE_in_paramDecl902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE23);

                    char_literal24=(Token)match(input,114,FOLLOW_114_in_paramDecl904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_114.add(char_literal24);

                    char_literal25=(Token)match(input,115,FOLLOW_115_in_paramDecl906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_115.add(char_literal25);

                    IDENT26=(Token)match(input,IDENT,FOLLOW_IDENT_in_paramDecl908); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT26);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYPARAM, "ARRAYPARAM"), root_1);

                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.block_return block() throws RecognitionException {
        hhlParser.block_return retval = new hhlParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        hhlParser.statement_return statement30 = null;


        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==116) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==117) ) {
                    alt7=1;
                }
                else if ( ((LA7_1>=IDENT && LA7_1<=TYPE)||LA7_1==INT||LA7_1==111||LA7_1==116||LA7_1==118||(LA7_1>=120 && LA7_1<=156)||(LA7_1>=158 && LA7_1<=159)||LA7_1==170||(LA7_1>=174 && LA7_1<=201)) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    {
                    char_literal27=(Token)match(input,116,FOLLOW_116_in_block958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_116.add(char_literal27);

                    char_literal28=(Token)match(input,117,FOLLOW_117_in_block960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_117.add(char_literal28);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    char_literal29=(Token)match(input,116,FOLLOW_116_in_block1006); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_116.add(char_literal29);

                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=IDENT && LA6_0<=TYPE)||LA6_0==INT||LA6_0==111||LA6_0==116||LA6_0==118||(LA6_0>=120 && LA6_0<=156)||(LA6_0>=158 && LA6_0<=159)||LA6_0==170||(LA6_0>=174 && LA6_0<=201)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                     case 1 :
                         {
                         pushFollow(FOLLOW_statement_in_block1008);
                         statement30=statement();

                         state._fsp--;
                         if (state.failed) return retval;
                         if ( state.backtracking==0 ) stream_statement.add(statement30.getTree());

                         }
                         break;

                     default :
                         if ( cnt6 >= 1 ) break loop6;
                         if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    char_literal31=(Token)match(input,117,FOLLOW_117_in_block1011); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_117.add(char_literal31);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        if ( !(stream_statement.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.statement_return statement() throws RecognitionException {
        hhlParser.statement_return retval = new hhlParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token s=null;
        Token sname=null;
        Token sname2=null;
        Token action=null;
        Token n=null;
        Token act=null;
        Token wnd=null;
        Token char_literal32=null;
        Token char_literal35=null;
        Token IDENT36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token string_literal43=null;
        Token char_literal45=null;
        Token string_literal46=null;
        Token char_literal47=null;
        Token string_literal48=null;
        Token char_literal49=null;
        Token string_literal50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token string_literal55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token string_literal60=null;
        Token char_literal61=null;
        Token char_literal62=null;
        Token char_literal63=null;
        Token string_literal64=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal67=null;
        Token string_literal68=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token string_literal72=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token string_literal78=null;
        Token char_literal79=null;
        Token char_literal80=null;
        Token char_literal81=null;
        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token char_literal87=null;
        Token string_literal88=null;
        Token char_literal89=null;
        Token char_literal90=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token string_literal93=null;
        Token char_literal94=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token string_literal97=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Token string_literal102=null;
        Token char_literal103=null;
        Token char_literal104=null;
        Token char_literal105=null;
        Token char_literal106=null;
        Token char_literal107=null;
        Token char_literal108=null;
        Token string_literal109=null;
        Token char_literal110=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token string_literal115=null;
        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token string_literal126=null;
        Token char_literal127=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token string_literal130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token char_literal133=null;
        Token string_literal134=null;
        Token char_literal135=null;
        Token char_literal136=null;
        Token char_literal137=null;
        Token string_literal138=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal141=null;
        Token string_literal142=null;
        Token char_literal143=null;
        Token char_literal144=null;
        Token char_literal145=null;
        Token string_literal146=null;
        Token char_literal147=null;
        Token char_literal148=null;
        Token char_literal149=null;
        Token char_literal150=null;
        Token string_literal151=null;
        Token char_literal152=null;
        Token char_literal153=null;
        Token char_literal154=null;
        Token char_literal155=null;
        Token string_literal156=null;
        Token char_literal157=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal161=null;
        Token string_literal162=null;
        Token char_literal163=null;
        Token char_literal164=null;
        Token char_literal165=null;
        Token string_literal166=null;
        Token char_literal167=null;
        Token char_literal168=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token string_literal171=null;
        Token char_literal172=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal175=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token string_literal178=null;
        Token char_literal179=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Token char_literal182=null;
        Token char_literal183=null;
        Token char_literal184=null;
        Token char_literal185=null;
        Token string_literal186=null;
        Token char_literal187=null;
        Token char_literal188=null;
        Token char_literal189=null;
        Token char_literal190=null;
        Token char_literal191=null;
        Token char_literal192=null;
        Token string_literal193=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal196=null;
        Token string_literal197=null;
        Token char_literal198=null;
        Token char_literal199=null;
        Token string_literal200=null;
        Token char_literal201=null;
        Token char_literal202=null;
        Token char_literal203=null;
        Token string_literal204=null;
        Token char_literal205=null;
        Token char_literal206=null;
        Token char_literal207=null;
        Token string_literal208=null;
        Token char_literal209=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token string_literal212=null;
        Token char_literal213=null;
        Token char_literal214=null;
        Token char_literal215=null;
        Token char_literal216=null;
        Token char_literal217=null;
        Token char_literal218=null;
        Token string_literal219=null;
        Token char_literal220=null;
        Token char_literal221=null;
        Token char_literal222=null;
        Token string_literal223=null;
        Token char_literal224=null;
        Token char_literal225=null;
        Token char_literal226=null;
        hhlParser.expression_return obj = null;

        hhlParser.expression_return btn = null;

        hhlParser.expression_return mod = null;

        hhlParser.expression_return id = null;

        hhlParser.expression_return x = null;

        hhlParser.expression_return y = null;

        hhlParser.expression_return index = null;

        hhlParser.expression_return a = null;

        hhlParser.expression_return slot = null;

        hhlParser.expression_return i = null;

        hhlParser.varDeclaration_return varDeclaration33 = null;

        hhlParser.expression_return expression34 = null;

        hhlParser.expression_return expression38 = null;

        hhlParser.if_statement_return if_statement40 = null;

        hhlParser.while_statement_return while_statement41 = null;

        hhlParser.for_statement_return for_statement42 = null;

        hhlParser.expression_return expression44 = null;

        hhlParser.expression_return expression52 = null;

        hhlParser.expression_return expression57 = null;

        hhlParser.block_return block227 = null;


        CommonTree s_tree=null;
        CommonTree sname_tree=null;
        CommonTree sname2_tree=null;
        CommonTree action_tree=null;
        CommonTree n_tree=null;
        CommonTree act_tree=null;
        CommonTree wnd_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree IDENT36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal90_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree char_literal103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree char_literal136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree char_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree char_literal147_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree char_literal149_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree char_literal152_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree char_literal158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree char_literal163_tree=null;
        CommonTree char_literal164_tree=null;
        CommonTree char_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree char_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree string_literal171_tree=null;
        CommonTree char_literal172_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal175_tree=null;
        CommonTree char_literal176_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree string_literal178_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree char_literal180_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal184_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree string_literal186_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree char_literal188_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree char_literal190_tree=null;
        CommonTree char_literal191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree string_literal193_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree char_literal196_tree=null;
        CommonTree string_literal197_tree=null;
        CommonTree char_literal198_tree=null;
        CommonTree char_literal199_tree=null;
        CommonTree string_literal200_tree=null;
        CommonTree char_literal201_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree string_literal204_tree=null;
        CommonTree char_literal205_tree=null;
        CommonTree char_literal206_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree string_literal208_tree=null;
        CommonTree char_literal209_tree=null;
        CommonTree char_literal210_tree=null;
        CommonTree char_literal211_tree=null;
        CommonTree string_literal212_tree=null;
        CommonTree char_literal213_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree char_literal215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal217_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree string_literal219_tree=null;
        CommonTree char_literal220_tree=null;
        CommonTree char_literal221_tree=null;
        CommonTree char_literal222_tree=null;
        CommonTree string_literal223_tree=null;
        CommonTree char_literal224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            int alt8=48;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    {
                    char_literal32=(Token)match(input,118,FOLLOW_118_in_statement1067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal32);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NOP, "NOP"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement1113);
                    varDeclaration33=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration33.getTree());

                    }
                    break;
                case 3 :
                    {
                    pushFollow(FOLLOW_expression_in_statement1123);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());
                    char_literal35=(Token)match(input,118,FOLLOW_118_in_statement1125); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal35);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    {
                    IDENT36=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement1160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT36);

                    char_literal37=(Token)match(input,119,FOLLOW_119_in_statement1162); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_119.add(char_literal37);

                    pushFollow(FOLLOW_expression_in_statement1164);
                    expression38=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression38.getTree());
                    char_literal39=(Token)match(input,118,FOLLOW_118_in_statement1166); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal39);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement1197);
                    if_statement40=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement40.getTree());

                    }
                    break;
                case 6 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1207);
                    while_statement41=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement41.getTree());

                    }
                    break;
                case 7 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1217);
                    for_statement42=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement42.getTree());

                    }
                    break;
                case 8 :
                    {
                    string_literal43=(Token)match(input,120,FOLLOW_120_in_statement1227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_120.add(string_literal43);

                    pushFollow(FOLLOW_expression_in_statement1229);
                    expression44=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression44.getTree());
                    char_literal45=(Token)match(input,118,FOLLOW_118_in_statement1231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal45);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    {
                    string_literal46=(Token)match(input,121,FOLLOW_121_in_statement1261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_121.add(string_literal46);

                    char_literal47=(Token)match(input,118,FOLLOW_118_in_statement1263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal47);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BREAK, "BREAK"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    {
                    string_literal48=(Token)match(input,122,FOLLOW_122_in_statement1301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_122.add(string_literal48);

                    char_literal49=(Token)match(input,118,FOLLOW_118_in_statement1303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal49);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CONTINUE, "CONTINUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    {
                    string_literal50=(Token)match(input,123,FOLLOW_123_in_statement1338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_123.add(string_literal50);

                    char_literal51=(Token)match(input,111,FOLLOW_111_in_statement1340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal51);

                    pushFollow(FOLLOW_expression_in_statement1342);
                    expression52=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());
                    char_literal53=(Token)match(input,112,FOLLOW_112_in_statement1344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal53);

                    char_literal54=(Token)match(input,118,FOLLOW_118_in_statement1346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal54);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLEEP, "SLEEP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    {
                    string_literal55=(Token)match(input,124,FOLLOW_124_in_statement1369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_124.add(string_literal55);

                    char_literal56=(Token)match(input,111,FOLLOW_111_in_statement1371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal56);

                    pushFollow(FOLLOW_expression_in_statement1373);
                    expression57=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
                    char_literal58=(Token)match(input,112,FOLLOW_112_in_statement1375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal58);

                    char_literal59=(Token)match(input,118,FOLLOW_118_in_statement1377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal59);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINT, "PRINT"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    {
                    string_literal60=(Token)match(input,124,FOLLOW_124_in_statement1400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_124.add(string_literal60);

                    char_literal61=(Token)match(input,111,FOLLOW_111_in_statement1402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal61);

                    s=(Token)match(input,STRING,FOLLOW_STRING_in_statement1406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(s);

                    char_literal62=(Token)match(input,112,FOLLOW_112_in_statement1408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal62);

                    char_literal63=(Token)match(input,118,FOLLOW_118_in_statement1410); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal63);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINT_STRING, "PRINT_STRING"), root_1);

                        adaptor.addChild(root_1, stream_s.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    {
                    string_literal64=(Token)match(input,125,FOLLOW_125_in_statement1436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_125.add(string_literal64);

                    char_literal65=(Token)match(input,118,FOLLOW_118_in_statement1438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal65);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    {
                    string_literal66=(Token)match(input,126,FOLLOW_126_in_statement1479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_126.add(string_literal66);

                    char_literal67=(Token)match(input,118,FOLLOW_118_in_statement1481); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal67);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGOUT, "LOGOUT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    {
                    string_literal68=(Token)match(input,127,FOLLOW_127_in_statement1520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_127.add(string_literal68);

                    char_literal69=(Token)match(input,111,FOLLOW_111_in_statement1522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal69);

                    s=(Token)match(input,STRING,FOLLOW_STRING_in_statement1526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(s);

                    char_literal70=(Token)match(input,112,FOLLOW_112_in_statement1528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal70);

                    char_literal71=(Token)match(input,118,FOLLOW_118_in_statement1530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal71);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SAY, "SAY"), root_1);

                        adaptor.addChild(root_1, stream_s.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    {
                    string_literal72=(Token)match(input,128,FOLLOW_128_in_statement1558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_128.add(string_literal72);

                    char_literal73=(Token)match(input,111,FOLLOW_111_in_statement1560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal73);

                    pushFollow(FOLLOW_expression_in_statement1564);
                    obj=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(obj.getTree());
                    char_literal74=(Token)match(input,113,FOLLOW_113_in_statement1566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal74);

                    pushFollow(FOLLOW_expression_in_statement1570);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(btn.getTree());
                    char_literal75=(Token)match(input,113,FOLLOW_113_in_statement1572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal75);

                    pushFollow(FOLLOW_expression_in_statement1576);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal76=(Token)match(input,112,FOLLOW_112_in_statement1578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal76);

                    char_literal77=(Token)match(input,118,FOLLOW_118_in_statement1580); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal77);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_btn=new RewriteRuleSubtreeStream(adaptor,"rule btn",btn!=null?btn.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_obj=new RewriteRuleSubtreeStream(adaptor,"rule obj",obj!=null?obj.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO_CLICK, "DO_CLICK"), root_1);

                        adaptor.addChild(root_1, stream_obj.nextTree());
                        adaptor.addChild(root_1, stream_btn.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    {
                    string_literal78=(Token)match(input,129,FOLLOW_129_in_statement1649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_129.add(string_literal78);

                    char_literal79=(Token)match(input,111,FOLLOW_111_in_statement1651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal79);

                    sname=(Token)match(input,STRING,FOLLOW_STRING_in_statement1655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(sname);

                    char_literal80=(Token)match(input,112,FOLLOW_112_in_statement1657); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal80);

                    char_literal81=(Token)match(input,118,FOLLOW_118_in_statement1659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal81);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_sname=new RewriteRuleTokenStream(adaptor,"token sname",sname);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECT_CONTEXT_MENU, "SELECT_CONTEXT_MENU"), root_1);

                        adaptor.addChild(root_1, stream_sname.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    {
                    string_literal82=(Token)match(input,130,FOLLOW_130_in_statement1722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_130.add(string_literal82);

                    char_literal83=(Token)match(input,111,FOLLOW_111_in_statement1724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal83);

                    pushFollow(FOLLOW_expression_in_statement1728);
                    id=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(id.getTree());
                    char_literal84=(Token)match(input,113,FOLLOW_113_in_statement1730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal84);

                    pushFollow(FOLLOW_expression_in_statement1734);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal85=(Token)match(input,113,FOLLOW_113_in_statement1736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal85);

                    pushFollow(FOLLOW_expression_in_statement1740);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal86=(Token)match(input,112,FOLLOW_112_in_statement1742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal86);

                    char_literal87=(Token)match(input,118,FOLLOW_118_in_statement1744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal87);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_MOVE, "MAP_MOVE"), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    {
                    string_literal88=(Token)match(input,131,FOLLOW_131_in_statement1813); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_131.add(string_literal88);

                    char_literal89=(Token)match(input,111,FOLLOW_111_in_statement1815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal89);

                    pushFollow(FOLLOW_expression_in_statement1819);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal90=(Token)match(input,113,FOLLOW_113_in_statement1821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal90);

                    pushFollow(FOLLOW_expression_in_statement1825);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal91=(Token)match(input,112,FOLLOW_112_in_statement1827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal91);

                    char_literal92=(Token)match(input,118,FOLLOW_118_in_statement1829); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal92);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_MOVE_STEP, "MAP_MOVE_STEP"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    {
                    string_literal93=(Token)match(input,132,FOLLOW_132_in_statement1895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_132.add(string_literal93);

                    char_literal94=(Token)match(input,111,FOLLOW_111_in_statement1897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal94);

                    sname=(Token)match(input,STRING,FOLLOW_STRING_in_statement1901); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(sname);

                    char_literal95=(Token)match(input,112,FOLLOW_112_in_statement1903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal95);

                    char_literal96=(Token)match(input,118,FOLLOW_118_in_statement1905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal96);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_sname=new RewriteRuleTokenStream(adaptor,"token sname",sname);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEND_ACTION, "SEND_ACTION"), root_1);

                        adaptor.addChild(root_1, stream_sname.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    {
                    string_literal97=(Token)match(input,132,FOLLOW_132_in_statement1968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_132.add(string_literal97);

                    char_literal98=(Token)match(input,111,FOLLOW_111_in_statement1970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal98);

                    sname=(Token)match(input,STRING,FOLLOW_STRING_in_statement1974); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(sname);

                    char_literal99=(Token)match(input,113,FOLLOW_113_in_statement1976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal99);

                    sname2=(Token)match(input,STRING,FOLLOW_STRING_in_statement1980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(sname2);

                    char_literal100=(Token)match(input,112,FOLLOW_112_in_statement1982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal100);

                    char_literal101=(Token)match(input,118,FOLLOW_118_in_statement1984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal101);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_sname=new RewriteRuleTokenStream(adaptor,"token sname",sname);
                    RewriteRuleTokenStream stream_sname2=new RewriteRuleTokenStream(adaptor,"token sname2",sname2);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEND_ACTION2, "SEND_ACTION2"), root_1);

                        adaptor.addChild(root_1, stream_sname.nextNode());
                        adaptor.addChild(root_1, stream_sname2.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    {
                    string_literal102=(Token)match(input,133,FOLLOW_133_in_statement2051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_133.add(string_literal102);

                    char_literal103=(Token)match(input,111,FOLLOW_111_in_statement2053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal103);

                    pushFollow(FOLLOW_expression_in_statement2057);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal104=(Token)match(input,113,FOLLOW_113_in_statement2059); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal104);

                    pushFollow(FOLLOW_expression_in_statement2063);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal105=(Token)match(input,113,FOLLOW_113_in_statement2065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal105);

                    pushFollow(FOLLOW_expression_in_statement2069);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(btn.getTree());
                    char_literal106=(Token)match(input,113,FOLLOW_113_in_statement2071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal106);

                    pushFollow(FOLLOW_expression_in_statement2075);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal107=(Token)match(input,112,FOLLOW_112_in_statement2077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal107);

                    char_literal108=(Token)match(input,118,FOLLOW_118_in_statement2079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal108);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_btn=new RewriteRuleSubtreeStream(adaptor,"rule btn",btn!=null?btn.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_CLICK, "MAP_CLICK"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_btn.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    {
                    string_literal109=(Token)match(input,134,FOLLOW_134_in_statement2151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_134.add(string_literal109);

                    char_literal110=(Token)match(input,111,FOLLOW_111_in_statement2153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal110);

                    pushFollow(FOLLOW_expression_in_statement2157);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal111=(Token)match(input,113,FOLLOW_113_in_statement2159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal111);

                    pushFollow(FOLLOW_expression_in_statement2163);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal112=(Token)match(input,113,FOLLOW_113_in_statement2165); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal112);

                    pushFollow(FOLLOW_expression_in_statement2169);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal113=(Token)match(input,112,FOLLOW_112_in_statement2171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal113);

                    char_literal114=(Token)match(input,118,FOLLOW_118_in_statement2173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal114);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_INTERACT_CLICK, "MAP_INTERACT_CLICK"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    {
                    string_literal115=(Token)match(input,135,FOLLOW_135_in_statement2242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_135.add(string_literal115);

                    char_literal116=(Token)match(input,111,FOLLOW_111_in_statement2244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal116);

                    pushFollow(FOLLOW_expression_in_statement2248);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal117=(Token)match(input,113,FOLLOW_113_in_statement2250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal117);

                    pushFollow(FOLLOW_expression_in_statement2254);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal118=(Token)match(input,113,FOLLOW_113_in_statement2256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal118);

                    pushFollow(FOLLOW_expression_in_statement2260);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal119=(Token)match(input,112,FOLLOW_112_in_statement2262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal119);

                    char_literal120=(Token)match(input,118,FOLLOW_118_in_statement2264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal120);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_ABS_INTERACT_CLICK, "MAP_ABS_INTERACT_CLICK"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    {
                    string_literal121=(Token)match(input,134,FOLLOW_134_in_statement2333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_134.add(string_literal121);

                    char_literal122=(Token)match(input,111,FOLLOW_111_in_statement2335); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal122);

                    pushFollow(FOLLOW_expression_in_statement2339);
                    id=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(id.getTree());
                    char_literal123=(Token)match(input,113,FOLLOW_113_in_statement2341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal123);

                    pushFollow(FOLLOW_expression_in_statement2345);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal124=(Token)match(input,112,FOLLOW_112_in_statement2347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal124);

                    char_literal125=(Token)match(input,118,FOLLOW_118_in_statement2349); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal125);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_INTERACT_CLICK2, "MAP_INTERACT_CLICK2"), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    {
                    string_literal126=(Token)match(input,136,FOLLOW_136_in_statement2415); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_136.add(string_literal126);

                    char_literal127=(Token)match(input,111,FOLLOW_111_in_statement2417); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal127);

                    pushFollow(FOLLOW_expression_in_statement2421);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal128=(Token)match(input,112,FOLLOW_112_in_statement2423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal128);

                    char_literal129=(Token)match(input,118,FOLLOW_118_in_statement2425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal129);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP, "DROP"), root_1);

                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    {
                    string_literal130=(Token)match(input,137,FOLLOW_137_in_statement2491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_137.add(string_literal130);

                    char_literal131=(Token)match(input,111,FOLLOW_111_in_statement2493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal131);

                    char_literal132=(Token)match(input,112,FOLLOW_112_in_statement2495); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal132);

                    char_literal133=(Token)match(input,118,FOLLOW_118_in_statement2497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal133);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RESET_INVENTORY, "RESET_INVENTORY"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    {
                    string_literal134=(Token)match(input,138,FOLLOW_138_in_statement2557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_138.add(string_literal134);

                    char_literal135=(Token)match(input,111,FOLLOW_111_in_statement2559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal135);

                    pushFollow(FOLLOW_expression_in_statement2563);
                    index=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(index.getTree());
                    char_literal136=(Token)match(input,112,FOLLOW_112_in_statement2565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal136);

                    char_literal137=(Token)match(input,118,FOLLOW_118_in_statement2567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal137);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_index=new RewriteRuleSubtreeStream(adaptor,"rule index",index!=null?index.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_ITEM_INDEX, "SET_ITEM_INDEX"), root_1);

                        adaptor.addChild(root_1, stream_index.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    {
                    string_literal138=(Token)match(input,139,FOLLOW_139_in_statement2630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_139.add(string_literal138);

                    char_literal139=(Token)match(input,111,FOLLOW_111_in_statement2632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal139);

                    char_literal140=(Token)match(input,112,FOLLOW_112_in_statement2634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal140);

                    char_literal141=(Token)match(input,118,FOLLOW_118_in_statement2636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal141);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_ITEM_DRAG, "SET_ITEM_DRAG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    {
                    string_literal142=(Token)match(input,140,FOLLOW_140_in_statement2705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_140.add(string_literal142);

                    char_literal143=(Token)match(input,111,FOLLOW_111_in_statement2707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal143);

                    action=(Token)match(input,STRING,FOLLOW_STRING_in_statement2711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(action);

                    char_literal144=(Token)match(input,112,FOLLOW_112_in_statement2713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal144);

                    char_literal145=(Token)match(input,118,FOLLOW_118_in_statement2715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal145);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_action=new RewriteRuleTokenStream(adaptor,"token action",action);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_CLICK, "ITEM_CLICK"), root_1);

                        adaptor.addChild(root_1, stream_action.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 32 :
                    {
                    string_literal146=(Token)match(input,140,FOLLOW_140_in_statement2778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_140.add(string_literal146);

                    char_literal147=(Token)match(input,111,FOLLOW_111_in_statement2780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal147);

                    action=(Token)match(input,STRING,FOLLOW_STRING_in_statement2784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(action);

                    char_literal148=(Token)match(input,113,FOLLOW_113_in_statement2786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal148);

                    pushFollow(FOLLOW_expression_in_statement2790);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal149=(Token)match(input,112,FOLLOW_112_in_statement2792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal149);

                    char_literal150=(Token)match(input,118,FOLLOW_118_in_statement2794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal150);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_action=new RewriteRuleTokenStream(adaptor,"token action",action);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_CLICK2, "ITEM_CLICK2"), root_1);

                        adaptor.addChild(root_1, stream_action.nextNode());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 33 :
                    {
                    string_literal151=(Token)match(input,141,FOLLOW_141_in_statement2860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_141.add(string_literal151);

                    char_literal152=(Token)match(input,111,FOLLOW_111_in_statement2862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal152);

                    pushFollow(FOLLOW_expression_in_statement2866);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal153=(Token)match(input,113,FOLLOW_113_in_statement2868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal153);

                    pushFollow(FOLLOW_expression_in_statement2872);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal154=(Token)match(input,112,FOLLOW_112_in_statement2874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal154);

                    char_literal155=(Token)match(input,118,FOLLOW_118_in_statement2876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal155);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_DROP, "ITEM_DROP"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 34 :
                    {
                    string_literal156=(Token)match(input,142,FOLLOW_142_in_statement2942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_142.add(string_literal156);

                    char_literal157=(Token)match(input,111,FOLLOW_111_in_statement2944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal157);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_statement2948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal158=(Token)match(input,113,FOLLOW_113_in_statement2950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal158);

                    pushFollow(FOLLOW_expression_in_statement2954);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal159=(Token)match(input,113,FOLLOW_113_in_statement2956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal159);

                    pushFollow(FOLLOW_expression_in_statement2960);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal160=(Token)match(input,112,FOLLOW_112_in_statement2962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal160);

                    char_literal161=(Token)match(input,118,FOLLOW_118_in_statement2964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal161);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_DROP_TO_INVENTORY, "ITEM_DROP_TO_INVENTORY"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());
                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 35 :
                    {
                    string_literal162=(Token)match(input,143,FOLLOW_143_in_statement3033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_143.add(string_literal162);

                    char_literal163=(Token)match(input,111,FOLLOW_111_in_statement3035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal163);

                    pushFollow(FOLLOW_expression_in_statement3039);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(a.getTree());
                    char_literal164=(Token)match(input,112,FOLLOW_112_in_statement3041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal164);

                    char_literal165=(Token)match(input,118,FOLLOW_118_in_statement3043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal165);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CRAFT, "CRAFT"), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 36 :
                    {
                    string_literal166=(Token)match(input,144,FOLLOW_144_in_statement3110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_144.add(string_literal166);

                    char_literal167=(Token)match(input,111,FOLLOW_111_in_statement3112); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal167);

                    pushFollow(FOLLOW_expression_in_statement3116);
                    slot=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(slot.getTree());
                    char_literal168=(Token)match(input,113,FOLLOW_113_in_statement3118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal168);

                    act=(Token)match(input,STRING,FOLLOW_STRING_in_statement3122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(act);

                    char_literal169=(Token)match(input,112,FOLLOW_112_in_statement3124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal169);

                    char_literal170=(Token)match(input,118,FOLLOW_118_in_statement3126); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal170);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_act=new RewriteRuleTokenStream(adaptor,"token act",act);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_slot=new RewriteRuleSubtreeStream(adaptor,"rule slot",slot!=null?slot.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EQUIP, "EQUIP"), root_1);

                        adaptor.addChild(root_1, stream_slot.nextTree());
                        adaptor.addChild(root_1, stream_act.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 37 :
                    {
                    string_literal171=(Token)match(input,145,FOLLOW_145_in_statement3192); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_145.add(string_literal171);

                    char_literal172=(Token)match(input,111,FOLLOW_111_in_statement3194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal172);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_statement3198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal173=(Token)match(input,113,FOLLOW_113_in_statement3200); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal173);

                    pushFollow(FOLLOW_expression_in_statement3204);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal174=(Token)match(input,113,FOLLOW_113_in_statement3206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal174);

                    pushFollow(FOLLOW_expression_in_statement3210);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal175=(Token)match(input,113,FOLLOW_113_in_statement3212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal175);

                    act=(Token)match(input,STRING,FOLLOW_STRING_in_statement3216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(act);

                    char_literal176=(Token)match(input,112,FOLLOW_112_in_statement3218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal176);

                    char_literal177=(Token)match(input,118,FOLLOW_118_in_statement3220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal177);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleTokenStream stream_act=new RewriteRuleTokenStream(adaptor,"token act",act);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVENTORY, "INVENTORY"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());
                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_act.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 38 :
                    {
                    string_literal178=(Token)match(input,145,FOLLOW_145_in_statement3292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_145.add(string_literal178);

                    char_literal179=(Token)match(input,111,FOLLOW_111_in_statement3294); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal179);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_statement3298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal180=(Token)match(input,113,FOLLOW_113_in_statement3300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal180);

                    pushFollow(FOLLOW_expression_in_statement3304);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal181=(Token)match(input,113,FOLLOW_113_in_statement3306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal181);

                    pushFollow(FOLLOW_expression_in_statement3310);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal182=(Token)match(input,113,FOLLOW_113_in_statement3312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal182);

                    act=(Token)match(input,STRING,FOLLOW_STRING_in_statement3316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(act);

                    char_literal183=(Token)match(input,113,FOLLOW_113_in_statement3318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal183);

                    pushFollow(FOLLOW_expression_in_statement3322);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal184=(Token)match(input,112,FOLLOW_112_in_statement3324); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal184);

                    char_literal185=(Token)match(input,118,FOLLOW_118_in_statement3326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal185);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleTokenStream stream_act=new RewriteRuleTokenStream(adaptor,"token act",act);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVENTORY, "INVENTORY"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());
                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_act.nextNode());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 39 :
                    {
                    string_literal186=(Token)match(input,146,FOLLOW_146_in_statement3401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_146.add(string_literal186);

                    char_literal187=(Token)match(input,111,FOLLOW_111_in_statement3403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal187);

                    pushFollow(FOLLOW_expression_in_statement3407);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal188=(Token)match(input,113,FOLLOW_113_in_statement3409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal188);

                    pushFollow(FOLLOW_expression_in_statement3413);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal189=(Token)match(input,113,FOLLOW_113_in_statement3415); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal189);

                    pushFollow(FOLLOW_expression_in_statement3419);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(btn.getTree());
                    char_literal190=(Token)match(input,113,FOLLOW_113_in_statement3421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal190);

                    pushFollow(FOLLOW_expression_in_statement3425);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal191=(Token)match(input,112,FOLLOW_112_in_statement3427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal191);

                    char_literal192=(Token)match(input,118,FOLLOW_118_in_statement3429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal192);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_btn=new RewriteRuleSubtreeStream(adaptor,"rule btn",btn!=null?btn.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_ABS_CLICK, "MAP_ABS_CLICK"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_btn.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 40 :
                    {
                    string_literal193=(Token)match(input,147,FOLLOW_147_in_statement3501); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_147.add(string_literal193);

                    char_literal194=(Token)match(input,111,FOLLOW_111_in_statement3503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal194);

                    wnd=(Token)match(input,STRING,FOLLOW_STRING_in_statement3507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(wnd);

                    char_literal195=(Token)match(input,112,FOLLOW_112_in_statement3509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal195);

                    char_literal196=(Token)match(input,118,FOLLOW_118_in_statement3511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal196);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_wnd=new RewriteRuleTokenStream(adaptor,"token wnd",wnd);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WAIT_CRAFT, "WAIT_CRAFT"), root_1);

                        adaptor.addChild(root_1, stream_wnd.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 41 :
                    {
                    string_literal197=(Token)match(input,148,FOLLOW_148_in_statement3574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_148.add(string_literal197);

                    char_literal198=(Token)match(input,111,FOLLOW_111_in_statement3576); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal198);

                    char_literal199=(Token)match(input,112,FOLLOW_112_in_statement3578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal199);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_INVENTORY, "OPEN_INVENTORY"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 42 :
                    {
                    string_literal200=(Token)match(input,149,FOLLOW_149_in_statement3605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_149.add(string_literal200);

                    char_literal201=(Token)match(input,111,FOLLOW_111_in_statement3607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal201);

                    s=(Token)match(input,STRING,FOLLOW_STRING_in_statement3611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(s);

                    char_literal202=(Token)match(input,112,FOLLOW_112_in_statement3613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal202);

                    char_literal203=(Token)match(input,118,FOLLOW_118_in_statement3615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal203);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_SHOW_VAR, "SET_SHOW_VAR"), root_1);

                        adaptor.addChild(root_1, stream_s.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 43 :
                    {
                    string_literal204=(Token)match(input,150,FOLLOW_150_in_statement3634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_150.add(string_literal204);

                    char_literal205=(Token)match(input,111,FOLLOW_111_in_statement3636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal205);

                    pushFollow(FOLLOW_expression_in_statement3640);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal206=(Token)match(input,112,FOLLOW_112_in_statement3642); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal206);

                    char_literal207=(Token)match(input,118,FOLLOW_118_in_statement3644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal207);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RENDER_MODE, "RENDER_MODE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 44 :
                    {
                    string_literal208=(Token)match(input,151,FOLLOW_151_in_statement3708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_151.add(string_literal208);

                    char_literal209=(Token)match(input,111,FOLLOW_111_in_statement3710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal209);

                    char_literal210=(Token)match(input,112,FOLLOW_112_in_statement3712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal210);

                    char_literal211=(Token)match(input,118,FOLLOW_118_in_statement3714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal211);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RESET_BUFF, "RESET_BUFF"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 45 :
                    {
                    string_literal212=(Token)match(input,152,FOLLOW_152_in_statement3741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_152.add(string_literal212);

                    char_literal213=(Token)match(input,111,FOLLOW_111_in_statement3743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal213);

                    pushFollow(FOLLOW_expression_in_statement3747);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal214=(Token)match(input,113,FOLLOW_113_in_statement3749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal214);

                    pushFollow(FOLLOW_expression_in_statement3753);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal215=(Token)match(input,113,FOLLOW_113_in_statement3755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal215);

                    pushFollow(FOLLOW_expression_in_statement3759);
                    btn=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(btn.getTree());
                    char_literal216=(Token)match(input,113,FOLLOW_113_in_statement3761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal216);

                    pushFollow(FOLLOW_expression_in_statement3765);
                    mod=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(mod.getTree());
                    char_literal217=(Token)match(input,112,FOLLOW_112_in_statement3767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal217);

                    char_literal218=(Token)match(input,118,FOLLOW_118_in_statement3769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal218);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_btn=new RewriteRuleSubtreeStream(adaptor,"rule btn",btn!=null?btn.tree:null);
                    RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod",mod!=null?mod.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_PLACE, "MAP_PLACE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_btn.nextTree());
                        adaptor.addChild(root_1, stream_mod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 46 :
                    {
                    string_literal219=(Token)match(input,153,FOLLOW_153_in_statement3841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_153.add(string_literal219);

                    char_literal220=(Token)match(input,111,FOLLOW_111_in_statement3843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal220);

                    char_literal221=(Token)match(input,112,FOLLOW_112_in_statement3845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal221);

                    char_literal222=(Token)match(input,118,FOLLOW_118_in_statement3847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal222);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BUILD_CLICK, "BUILD_CLICK"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 47 :
                    {
                    string_literal223=(Token)match(input,154,FOLLOW_154_in_statement3873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_154.add(string_literal223);

                    char_literal224=(Token)match(input,111,FOLLOW_111_in_statement3875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal224);

                    pushFollow(FOLLOW_expression_in_statement3879);
                    i=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(i.getTree());
                    char_literal225=(Token)match(input,112,FOLLOW_112_in_statement3881); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal225);

                    char_literal226=(Token)match(input,118,FOLLOW_118_in_statement3883); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal226);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_ITEM_EQUIP, "SET_ITEM_EQUIP"), root_1);

                        adaptor.addChild(root_1, stream_i.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 48 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement3951);
                    block227=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block227.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class for_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.for_statement_return for_statement() throws RecognitionException {
        hhlParser.for_statement_return retval = new hhlParser.for_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token t=null;
        Token name=null;
        Token string_literal228=null;
        Token char_literal229=null;
        Token char_literal230=null;
        Token char_literal231=null;
        Token char_literal232=null;
        Token string_literal234=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        Token char_literal239=null;
        hhlParser.expression_return ini = null;

        hhlParser.expression_return tes = null;

        hhlParser.expression_return inc = null;

        hhlParser.statement_return statement233 = null;

        hhlParser.statement_return statement240 = null;


        CommonTree t_tree=null;
        CommonTree name_tree=null;
        CommonTree string_literal228_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree char_literal230_tree=null;
        CommonTree char_literal231_tree=null;
        CommonTree char_literal232_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal239_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==155) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==111) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==TYPE) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==IDENT||LA9_2==INT||LA9_2==111||LA9_2==170||(LA9_2>=174 && LA9_2<=201)) ) {
                        alt9=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    {
                    string_literal228=(Token)match(input,155,FOLLOW_155_in_for_statement3976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_155.add(string_literal228);

                    char_literal229=(Token)match(input,111,FOLLOW_111_in_for_statement3978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal229);

                    pushFollow(FOLLOW_expression_in_for_statement3982);
                    ini=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ini.getTree());
                    char_literal230=(Token)match(input,118,FOLLOW_118_in_for_statement3984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal230);

                    pushFollow(FOLLOW_expression_in_for_statement3988);
                    tes=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(tes.getTree());
                    char_literal231=(Token)match(input,118,FOLLOW_118_in_for_statement3990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal231);

                    pushFollow(FOLLOW_expression_in_for_statement3994);
                    inc=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(inc.getTree());
                    char_literal232=(Token)match(input,112,FOLLOW_112_in_for_statement3996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal232);

                    pushFollow(FOLLOW_statement_in_for_statement3998);
                    statement233=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement233.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_inc=new RewriteRuleSubtreeStream(adaptor,"rule inc",inc!=null?inc.tree:null);
                    RewriteRuleSubtreeStream stream_tes=new RewriteRuleSubtreeStream(adaptor,"rule tes",tes!=null?tes.tree:null);
                    RewriteRuleSubtreeStream stream_ini=new RewriteRuleSubtreeStream(adaptor,"rule ini",ini!=null?ini.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, stream_ini.nextTree());
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_tes.nextTree());
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                        adaptor.addChild(root_2, stream_statement.nextTree());
                        adaptor.addChild(root_2, stream_inc.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    string_literal234=(Token)match(input,155,FOLLOW_155_in_for_statement4074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_155.add(string_literal234);

                    char_literal235=(Token)match(input,111,FOLLOW_111_in_for_statement4076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal235);

                    t=(Token)match(input,TYPE,FOLLOW_TYPE_in_for_statement4080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_TYPE.add(t);

                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_for_statement4084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(name);

                    char_literal236=(Token)match(input,119,FOLLOW_119_in_for_statement4086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_119.add(char_literal236);

                    pushFollow(FOLLOW_expression_in_for_statement4090);
                    ini=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ini.getTree());
                    char_literal237=(Token)match(input,118,FOLLOW_118_in_for_statement4092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal237);

                    pushFollow(FOLLOW_expression_in_for_statement4096);
                    tes=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(tes.getTree());
                    char_literal238=(Token)match(input,118,FOLLOW_118_in_for_statement4098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal238);

                    pushFollow(FOLLOW_expression_in_for_statement4102);
                    inc=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(inc.getTree());
                    char_literal239=(Token)match(input,112,FOLLOW_112_in_for_statement4104); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal239);

                    pushFollow(FOLLOW_statement_in_for_statement4106);
                    statement240=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement240.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_inc=new RewriteRuleSubtreeStream(adaptor,"rule inc",inc!=null?inc.tree:null);
                    RewriteRuleSubtreeStream stream_tes=new RewriteRuleSubtreeStream(adaptor,"rule tes",tes!=null?tes.tree:null);
                    RewriteRuleSubtreeStream stream_ini=new RewriteRuleSubtreeStream(adaptor,"rule ini",ini!=null?ini.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_t.nextNode());
                        adaptor.addChild(root_1, stream_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());
                        adaptor.addChild(root_1, stream_ini.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_tes.nextTree());
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                        adaptor.addChild(root_2, stream_statement.nextTree());
                        adaptor.addChild(root_2, stream_inc.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class if_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.if_statement_return if_statement() throws RecognitionException {
        hhlParser.if_statement_return retval = new hhlParser.if_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal241=null;
        Token char_literal242=null;
        Token char_literal244=null;
        Token string_literal245=null;
        Token string_literal246=null;
        Token char_literal247=null;
        Token char_literal249=null;
        hhlParser.statement_return a1 = null;

        hhlParser.statement_return a2 = null;

        hhlParser.expression_return expression243 = null;

        hhlParser.expression_return expression248 = null;


        CommonTree string_literal241_tree=null;
        CommonTree char_literal242_tree=null;
        CommonTree char_literal244_tree=null;
        CommonTree string_literal245_tree=null;
        CommonTree string_literal246_tree=null;
        CommonTree char_literal247_tree=null;
        CommonTree char_literal249_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==156) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred48_hhl()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    {
                    string_literal241=(Token)match(input,156,FOLLOW_156_in_if_statement4227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_156.add(string_literal241);

                    char_literal242=(Token)match(input,111,FOLLOW_111_in_if_statement4229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal242);

                    pushFollow(FOLLOW_expression_in_if_statement4231);
                    expression243=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression243.getTree());
                    char_literal244=(Token)match(input,112,FOLLOW_112_in_if_statement4233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal244);

                    pushFollow(FOLLOW_statement_in_if_statement4237);
                    a1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(a1.getTree());
                    string_literal245=(Token)match(input,157,FOLLOW_157_in_if_statement4239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_157.add(string_literal245);

                    pushFollow(FOLLOW_statement_in_if_statement4243);
                    a2=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(a2.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);
                    RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_a1.nextTree());
                        adaptor.addChild(root_1, stream_a2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    string_literal246=(Token)match(input,156,FOLLOW_156_in_if_statement4271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_156.add(string_literal246);

                    char_literal247=(Token)match(input,111,FOLLOW_111_in_if_statement4273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal247);

                    pushFollow(FOLLOW_expression_in_if_statement4275);
                    expression248=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression248.getTree());
                    char_literal249=(Token)match(input,112,FOLLOW_112_in_if_statement4277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal249);

                    pushFollow(FOLLOW_statement_in_if_statement4281);
                    a1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(a1.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_a1.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NOP, "NOP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.while_statement_return while_statement() throws RecognitionException {
        hhlParser.while_statement_return retval = new hhlParser.while_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal250=null;
        Token char_literal251=null;
        Token char_literal253=null;
        Token string_literal255=null;
        Token string_literal256=null;
        Token char_literal257=null;
        Token char_literal258=null;
        Token char_literal259=null;
        hhlParser.statement_return st = null;

        hhlParser.expression_return e = null;

        hhlParser.expression_return expression252 = null;

        hhlParser.statement_return statement254 = null;


        CommonTree string_literal250_tree=null;
        CommonTree char_literal251_tree=null;
        CommonTree char_literal253_tree=null;
        CommonTree string_literal255_tree=null;
        CommonTree string_literal256_tree=null;
        CommonTree char_literal257_tree=null;
        CommonTree char_literal258_tree=null;
        CommonTree char_literal259_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==158) ) {
                alt11=1;
            }
            else if ( (LA11_0==159) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    {
                    string_literal250=(Token)match(input,158,FOLLOW_158_in_while_statement4323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_158.add(string_literal250);

                    char_literal251=(Token)match(input,111,FOLLOW_111_in_while_statement4325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal251);

                    pushFollow(FOLLOW_expression_in_while_statement4327);
                    expression252=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression252.getTree());
                    char_literal253=(Token)match(input,112,FOLLOW_112_in_while_statement4329); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal253);

                    pushFollow(FOLLOW_statement_in_while_statement4331);
                    statement254=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement254.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    string_literal255=(Token)match(input,159,FOLLOW_159_in_while_statement4351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_159.add(string_literal255);

                    pushFollow(FOLLOW_statement_in_while_statement4355);
                    st=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st.getTree());
                    string_literal256=(Token)match(input,158,FOLLOW_158_in_while_statement4357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_158.add(string_literal256);

                    char_literal257=(Token)match(input,111,FOLLOW_111_in_while_statement4359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal257);

                    pushFollow(FOLLOW_expression_in_while_statement4363);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(e.getTree());
                    char_literal258=(Token)match(input,112,FOLLOW_112_in_while_statement4365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal258);

                    char_literal259=(Token)match(input,118,FOLLOW_118_in_while_statement4367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal259);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
                    RewriteRuleSubtreeStream stream_st=new RewriteRuleSubtreeStream(adaptor,"rule st",st!=null?st.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, stream_st.nextTree());
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_e.nextTree());
                        adaptor.addChild(root_1, stream_st.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class varList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.varList_return varList() throws RecognitionException {
        hhlParser.varList_return retval = new hhlParser.varList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hhlParser.varDeclaration_return varDeclaration260 = null;



        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TYPE) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==IDENT) ) {
                        int LA12_2 = input.LA(3);

                        if ( (LA12_2==114||(LA12_2>=118 && LA12_2<=119)) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
             case 1 :
                 {
                 pushFollow(FOLLOW_varDeclaration_in_varList4406);
                 varDeclaration260=varDeclaration();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration260.getTree());

                 }
                 break;

             default :
                 break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class varDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.varDeclaration_return varDeclaration() throws RecognitionException {
        hhlParser.varDeclaration_return retval = new hhlParser.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE261=null;
        Token IDENT262=null;
        Token char_literal263=null;
        Token TYPE264=null;
        Token IDENT265=null;
        Token char_literal266=null;
        Token char_literal268=null;
        Token TYPE269=null;
        Token IDENT270=null;
        Token char_literal271=null;
        Token INT272=null;
        Token char_literal273=null;
        Token char_literal274=null;
        hhlParser.expression_return expression267 = null;


        CommonTree TYPE261_tree=null;
        CommonTree IDENT262_tree=null;
        CommonTree char_literal263_tree=null;
        CommonTree TYPE264_tree=null;
        CommonTree IDENT265_tree=null;
        CommonTree char_literal266_tree=null;
        CommonTree char_literal268_tree=null;
        CommonTree TYPE269_tree=null;
        CommonTree IDENT270_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree INT272_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree char_literal274_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==TYPE) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==IDENT) ) {
                    switch ( input.LA(3) ) {
                    case 118:
                        {
                        alt13=1;
                        }
                        break;
                    case 119:
                        {
                        alt13=2;
                        }
                        break;
                    case 114:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    {
                    TYPE261=(Token)match(input,TYPE,FOLLOW_TYPE_in_varDeclaration4430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE261);

                    IDENT262=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclaration4432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT262);

                    char_literal263=(Token)match(input,118,FOLLOW_118_in_varDeclaration4434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal263);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    TYPE264=(Token)match(input,TYPE,FOLLOW_TYPE_in_varDeclaration4475); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE264);

                    IDENT265=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclaration4477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT265);

                    char_literal266=(Token)match(input,119,FOLLOW_119_in_varDeclaration4479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_119.add(char_literal266);

                    pushFollow(FOLLOW_expression_in_varDeclaration4481);
                    expression267=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression267.getTree());
                    char_literal268=(Token)match(input,118,FOLLOW_118_in_varDeclaration4483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal268);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    {
                    TYPE269=(Token)match(input,TYPE,FOLLOW_TYPE_in_varDeclaration4517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE269);

                    IDENT270=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclaration4519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT270);

                    char_literal271=(Token)match(input,114,FOLLOW_114_in_varDeclaration4521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_114.add(char_literal271);

                    INT272=(Token)match(input,INT,FOLLOW_INT_in_varDeclaration4523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_INT.add(INT272);

                    char_literal273=(Token)match(input,115,FOLLOW_115_in_varDeclaration4525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_115.add(char_literal273);

                    char_literal274=(Token)match(input,118,FOLLOW_118_in_varDeclaration4527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_118.add(char_literal274);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYDECL, "ARRAYDECL"), root_1);

                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.expressionList_return expressionList() throws RecognitionException {
        hhlParser.expressionList_return retval = new hhlParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal275=null;
        Token char_literal276=null;
        Token char_literal277=null;
        Token char_literal279=null;
        Token char_literal281=null;
        hhlParser.expression_return expression278 = null;

        hhlParser.expression_return expression280 = null;


        CommonTree char_literal275_tree=null;
        CommonTree char_literal276_tree=null;
        CommonTree char_literal277_tree=null;
        CommonTree char_literal279_tree=null;
        CommonTree char_literal281_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==111) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==112) ) {
                    alt15=1;
                }
                else if ( (LA15_1==IDENT||LA15_1==INT||LA15_1==111||LA15_1==170||(LA15_1>=174 && LA15_1<=201)) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    {
                    char_literal275=(Token)match(input,111,FOLLOW_111_in_expressionList4574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal275);

                    char_literal276=(Token)match(input,112,FOLLOW_112_in_expressionList4576); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal276);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRLIST, "EXPRLIST"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    char_literal277=(Token)match(input,111,FOLLOW_111_in_expressionList4620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal277);

                    pushFollow(FOLLOW_expression_in_expressionList4622);
                    expression278=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression278.getTree());
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==113) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                     case 1 :
                         {
                         char_literal279=(Token)match(input,113,FOLLOW_113_in_expressionList4625); if (state.failed) return retval;
                         if ( state.backtracking==0 ) stream_113.add(char_literal279);

                         pushFollow(FOLLOW_expression_in_expressionList4627);
                         expression280=expression();

                         state._fsp--;
                         if (state.failed) return retval;
                         if ( state.backtracking==0 ) stream_expression.add(expression280.getTree());

                         }
                         break;

                     default :
                         break loop14;
                        }
                    } while (true);

                    char_literal281=(Token)match(input,112,FOLLOW_112_in_expressionList4631); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal281);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRLIST, "EXPRLIST"), root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.expression_return expression() throws RecognitionException {
        hhlParser.expression_return retval = new hhlParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT282=null;
        Token char_literal283=null;
        Token char_literal286=null;
        hhlParser.expression_return expression284 = null;

        hhlParser.arrayIndex_return arrayIndex285 = null;

        hhlParser.expression_return expression287 = null;

        hhlParser.orExpression_return orExpression288 = null;


        CommonTree IDENT282_tree=null;
        CommonTree char_literal283_tree=null;
        CommonTree char_literal286_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arrayIndex=new RewriteRuleSubtreeStream(adaptor,"rule arrayIndex");
        try {
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    {
                    IDENT282=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT282);

                    char_literal283=(Token)match(input,119,FOLLOW_119_in_expression4682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_119.add(char_literal283);

                    pushFollow(FOLLOW_expression_in_expression4684);
                    expression284=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression284.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    pushFollow(FOLLOW_arrayIndex_in_expression4719);
                    arrayIndex285=arrayIndex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayIndex.add(arrayIndex285.getTree());
                    char_literal286=(Token)match(input,119,FOLLOW_119_in_expression4721); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_119.add(char_literal286);

                    pushFollow(FOLLOW_expression_in_expression4723);
                    expression287=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression287.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_arrayIndex.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_orExpression_in_expression4753);
                    orExpression288=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpression288.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class orExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.orExpression_return orExpression() throws RecognitionException {
        hhlParser.orExpression_return retval = new hhlParser.orExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set290=null;
        hhlParser.andExpression_return andExpression289 = null;

        hhlParser.andExpression_return andExpression291 = null;


        CommonTree set290_tree=null;

        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression4776);
            andExpression289=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression289.getTree());
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=160 && LA17_0<=161)) ) {
                    alt17=1;
                }


                switch (alt17) {
             case 1 :
                 {
                 set290=(Token)input.LT(1);
                 set290=(Token)input.LT(1);
                 if ( (input.LA(1)>=160 && input.LA(1)<=161) ) {
                     input.consume();
                     if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set290), root_0);
                     state.errorRecovery=false;state.failed=false;
                 }
                 else {
                     if (state.backtracking>0) {state.failed=true; return retval;}
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }

                 pushFollow(FOLLOW_andExpression_in_orExpression4789);
                 andExpression291=andExpression();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression291.getTree());

                 }
                 break;

             default :
                 break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class andExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.andExpression_return andExpression() throws RecognitionException {
        hhlParser.andExpression_return retval = new hhlParser.andExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set293=null;
        hhlParser.equalExpression_return equalExpression292 = null;

        hhlParser.equalExpression_return equalExpression294 = null;


        CommonTree set293_tree=null;

        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalExpression_in_andExpression4814);
            equalExpression292=equalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalExpression292.getTree());
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=162 && LA18_0<=163)) ) {
                    alt18=1;
                }


                switch (alt18) {
             case 1 :
                 {
                 set293=(Token)input.LT(1);
                 set293=(Token)input.LT(1);
                 if ( (input.LA(1)>=162 && input.LA(1)<=163) ) {
                     input.consume();
                     if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set293), root_0);
                     state.errorRecovery=false;state.failed=false;
                 }
                 else {
                     if (state.backtracking>0) {state.failed=true; return retval;}
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }

                 pushFollow(FOLLOW_equalExpression_in_andExpression4827);
                 equalExpression294=equalExpression();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, equalExpression294.getTree());

                 }
                 break;

             default :
                 break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class equalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.equalExpression_return equalExpression() throws RecognitionException {
        hhlParser.equalExpression_return retval = new hhlParser.equalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set296=null;
        hhlParser.comparsionExpression_return comparsionExpression295 = null;

        hhlParser.comparsionExpression_return comparsionExpression297 = null;


        CommonTree set296_tree=null;

        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_comparsionExpression_in_equalExpression4852);
            comparsionExpression295=comparsionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, comparsionExpression295.getTree());
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=164 && LA19_0<=166)) ) {
                    alt19=1;
                }


                switch (alt19) {
             case 1 :
                 {
                 set296=(Token)input.LT(1);
                 set296=(Token)input.LT(1);
                 if ( (input.LA(1)>=164 && input.LA(1)<=166) ) {
                     input.consume();
                     if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set296), root_0);
                     state.errorRecovery=false;state.failed=false;
                 }
                 else {
                     if (state.backtracking>0) {state.failed=true; return retval;}
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }

                 pushFollow(FOLLOW_comparsionExpression_in_equalExpression4869);
                 comparsionExpression297=comparsionExpression();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, comparsionExpression297.getTree());

                 }
                 break;

             default :
                 break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class comparsionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.comparsionExpression_return comparsionExpression() throws RecognitionException {
        hhlParser.comparsionExpression_return retval = new hhlParser.comparsionExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set299=null;
        hhlParser.addExpression_return addExpression298 = null;

        hhlParser.addExpression_return addExpression300 = null;


        CommonTree set299_tree=null;

        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_addExpression_in_comparsionExpression4894);
            addExpression298=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpression298.getTree());
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=109 && LA20_0<=110)||(LA20_0>=167 && LA20_0<=168)) ) {
                    alt20=1;
                }


                switch (alt20) {
             case 1 :
                 {
                 set299=(Token)input.LT(1);
                 set299=(Token)input.LT(1);
                 if ( (input.LA(1)>=109 && input.LA(1)<=110)||(input.LA(1)>=167 && input.LA(1)<=168) ) {
                     input.consume();
                     if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set299), root_0);
                     state.errorRecovery=false;state.failed=false;
                 }
                 else {
                     if (state.backtracking>0) {state.failed=true; return retval;}
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }

                 pushFollow(FOLLOW_addExpression_in_comparsionExpression4915);
                 addExpression300=addExpression();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpression300.getTree());

                 }
                 break;

             default :
                 break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class addExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.addExpression_return addExpression() throws RecognitionException {
        hhlParser.addExpression_return retval = new hhlParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set302=null;
        hhlParser.multExpression_return multExpression301 = null;

        hhlParser.multExpression_return multExpression303 = null;


        CommonTree set302_tree=null;

        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multExpression_in_addExpression4936);
            multExpression301=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpression301.getTree());
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=169 && LA21_0<=170)) ) {
                    alt21=1;
                }


                switch (alt21) {
             case 1 :
                 {
                 set302=(Token)input.LT(1);
                 set302=(Token)input.LT(1);
                 if ( (input.LA(1)>=169 && input.LA(1)<=170) ) {
                     input.consume();
                     if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set302), root_0);
                     state.errorRecovery=false;state.failed=false;
                 }
                 else {
                     if (state.backtracking>0) {state.failed=true; return retval;}
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }

                 pushFollow(FOLLOW_multExpression_in_addExpression4949);
                 multExpression303=multExpression();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpression303.getTree());

                 }
                 break;

             default :
                 break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class multExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.multExpression_return multExpression() throws RecognitionException {
        hhlParser.multExpression_return retval = new hhlParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set305=null;
        hhlParser.notExpression_return notExpression304 = null;

        hhlParser.notExpression_return notExpression306 = null;


        CommonTree set305_tree=null;

        try {
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_multExpression4970);
            notExpression304=notExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression304.getTree());
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=171 && LA22_0<=173)) ) {
                    alt22=1;
                }


                switch (alt22) {
             case 1 :
                 {
                 set305=(Token)input.LT(1);
                 set305=(Token)input.LT(1);
                 if ( (input.LA(1)>=171 && input.LA(1)<=173) ) {
                     input.consume();
                     if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set305), root_0);
                     state.errorRecovery=false;state.failed=false;
                 }
                 else {
                     if (state.backtracking>0) {state.failed=true; return retval;}
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }

                 pushFollow(FOLLOW_notExpression_in_multExpression4987);
                 notExpression306=notExpression();

                 state._fsp--;
                 if (state.failed) return retval;
                 if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression306.getTree());

                 }
                 break;

             default :
                 break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class notExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.notExpression_return notExpression() throws RecognitionException {
        hhlParser.notExpression_return retval = new hhlParser.notExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        Token string_literal307=null;
        hhlParser.negationExpression_return negationExpression308 = null;


        CommonTree op_tree=null;
        CommonTree string_literal307_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_negationExpression=new RewriteRuleSubtreeStream(adaptor,"rule negationExpression");
        try {
            {
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==174) ) {
                alt23=1;
            }
            else if ( (LA23_0==175) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    {
                    op=(Token)match(input,174,FOLLOW_174_in_notExpression5015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_174.add(op);


                    }
                    break;
                case 2 :
                    {
                    string_literal307=(Token)match(input,175,FOLLOW_175_in_notExpression5017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_175.add(string_literal307);


                    }
                    break;

            }

            pushFollow(FOLLOW_negationExpression_in_notExpression5021);
            negationExpression308=negationExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_negationExpression.add(negationExpression308.getTree());


            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            if (op != null) {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT, "NOT"), root_1);

                adaptor.addChild(root_1, stream_negationExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else 
            {
                adaptor.addChild(root_0, stream_negationExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class negationExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.negationExpression_return negationExpression() throws RecognitionException {
        hhlParser.negationExpression_return retval = new hhlParser.negationExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        hhlParser.primary_return primary309 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try {
            {
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==170) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    {
                    op=(Token)match(input,170,FOLLOW_170_in_negationExpression5106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_170.add(op);


                    }
                    break;

            }

            pushFollow(FOLLOW_primary_in_negationExpression5110);
            primary309=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary309.getTree());


            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            if (op != null) {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEGATE, "NEGATE"), root_1);

                adaptor.addChild(root_1, stream_primary.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else 
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.primary_return primary() throws RecognitionException {
        hhlParser.primary_return retval = new hhlParser.primary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal311=null;
        Token char_literal313=null;
        hhlParser.atom_return atom310 = null;

        hhlParser.expression_return expression312 = null;


        CommonTree char_literal311_tree=null;
        CommonTree char_literal313_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT||LA25_0==INT||(LA25_0>=176 && LA25_0<=201)) ) {
                alt25=1;
            }
            else if ( (LA25_0==111) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_primary5209);
                    atom310=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom310.getTree());

                    }
                    break;
                case 2 :
                    {
                    char_literal311=(Token)match(input,111,FOLLOW_111_in_primary5219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal311);

                    pushFollow(FOLLOW_expression_in_primary5221);
                    expression312=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression312.getTree());
                    char_literal313=(Token)match(input,112,FOLLOW_112_in_primary5223); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal313);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.atom_return atom() throws RecognitionException {
        hhlParser.atom_return retval = new hhlParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token cur=null;
        Token msg=null;
        Token name=null;
        Token n=null;
        Token wnd=null;
        Token IDENT314=null;
        Token string_literal315=null;
        Token IDENT316=null;
        Token string_literal317=null;
        Token string_literal318=null;
        Token IDENT319=null;
        Token string_literal320=null;
        Token IDENT321=null;
        Token IDENT322=null;
        Token INT323=null;
        Token IDENT324=null;
        Token string_literal326=null;
        Token char_literal327=null;
        Token char_literal328=null;
        Token string_literal330=null;
        Token char_literal331=null;
        Token char_literal332=null;
        Token string_literal333=null;
        Token char_literal334=null;
        Token char_literal335=null;
        Token string_literal336=null;
        Token char_literal337=null;
        Token char_literal338=null;
        Token string_literal339=null;
        Token char_literal340=null;
        Token char_literal341=null;
        Token string_literal342=null;
        Token char_literal343=null;
        Token char_literal344=null;
        Token string_literal345=null;
        Token char_literal346=null;
        Token char_literal347=null;
        Token string_literal348=null;
        Token char_literal349=null;
        Token char_literal350=null;
        Token string_literal351=null;
        Token char_literal352=null;
        Token char_literal353=null;
        Token string_literal354=null;
        Token char_literal355=null;
        Token char_literal356=null;
        Token string_literal357=null;
        Token char_literal358=null;
        Token char_literal359=null;
        Token string_literal360=null;
        Token char_literal361=null;
        Token char_literal362=null;
        Token string_literal363=null;
        Token char_literal364=null;
        Token char_literal365=null;
        Token string_literal366=null;
        Token char_literal367=null;
        Token char_literal368=null;
        Token char_literal369=null;
        Token string_literal370=null;
        Token char_literal371=null;
        Token char_literal372=null;
        Token char_literal373=null;
        Token string_literal374=null;
        Token char_literal375=null;
        Token char_literal376=null;
        Token char_literal377=null;
        Token char_literal378=null;
        Token char_literal379=null;
        Token string_literal380=null;
        Token char_literal381=null;
        Token char_literal382=null;
        Token string_literal383=null;
        Token char_literal384=null;
        Token char_literal385=null;
        Token string_literal386=null;
        Token char_literal387=null;
        Token char_literal388=null;
        Token string_literal389=null;
        Token char_literal390=null;
        Token char_literal391=null;
        Token char_literal392=null;
        Token string_literal393=null;
        Token char_literal394=null;
        Token char_literal395=null;
        Token string_literal396=null;
        Token char_literal397=null;
        Token char_literal398=null;
        Token string_literal399=null;
        Token char_literal400=null;
        Token char_literal401=null;
        Token string_literal402=null;
        Token char_literal403=null;
        Token char_literal404=null;
        hhlParser.expression_return r = null;

        hhlParser.expression_return x = null;

        hhlParser.expression_return y = null;

        hhlParser.expression_return id = null;

        hhlParser.expression_return ind = null;

        hhlParser.expressionList_return expressionList325 = null;

        hhlParser.arrayIndex_return arrayIndex329 = null;


        CommonTree cur_tree=null;
        CommonTree msg_tree=null;
        CommonTree name_tree=null;
        CommonTree n_tree=null;
        CommonTree wnd_tree=null;
        CommonTree IDENT314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree IDENT316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        CommonTree IDENT319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree IDENT321_tree=null;
        CommonTree IDENT322_tree=null;
        CommonTree INT323_tree=null;
        CommonTree IDENT324_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree char_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree char_literal331_tree=null;
        CommonTree char_literal332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree char_literal334_tree=null;
        CommonTree char_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree char_literal337_tree=null;
        CommonTree char_literal338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree char_literal340_tree=null;
        CommonTree char_literal341_tree=null;
        CommonTree string_literal342_tree=null;
        CommonTree char_literal343_tree=null;
        CommonTree char_literal344_tree=null;
        CommonTree string_literal345_tree=null;
        CommonTree char_literal346_tree=null;
        CommonTree char_literal347_tree=null;
        CommonTree string_literal348_tree=null;
        CommonTree char_literal349_tree=null;
        CommonTree char_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree char_literal353_tree=null;
        CommonTree string_literal354_tree=null;
        CommonTree char_literal355_tree=null;
        CommonTree char_literal356_tree=null;
        CommonTree string_literal357_tree=null;
        CommonTree char_literal358_tree=null;
        CommonTree char_literal359_tree=null;
        CommonTree string_literal360_tree=null;
        CommonTree char_literal361_tree=null;
        CommonTree char_literal362_tree=null;
        CommonTree string_literal363_tree=null;
        CommonTree char_literal364_tree=null;
        CommonTree char_literal365_tree=null;
        CommonTree string_literal366_tree=null;
        CommonTree char_literal367_tree=null;
        CommonTree char_literal368_tree=null;
        CommonTree char_literal369_tree=null;
        CommonTree string_literal370_tree=null;
        CommonTree char_literal371_tree=null;
        CommonTree char_literal372_tree=null;
        CommonTree char_literal373_tree=null;
        CommonTree string_literal374_tree=null;
        CommonTree char_literal375_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree char_literal377_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree char_literal379_tree=null;
        CommonTree string_literal380_tree=null;
        CommonTree char_literal381_tree=null;
        CommonTree char_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        CommonTree char_literal384_tree=null;
        CommonTree char_literal385_tree=null;
        CommonTree string_literal386_tree=null;
        CommonTree char_literal387_tree=null;
        CommonTree char_literal388_tree=null;
        CommonTree string_literal389_tree=null;
        CommonTree char_literal390_tree=null;
        CommonTree char_literal391_tree=null;
        CommonTree char_literal392_tree=null;
        CommonTree string_literal393_tree=null;
        CommonTree char_literal394_tree=null;
        CommonTree char_literal395_tree=null;
        CommonTree string_literal396_tree=null;
        CommonTree char_literal397_tree=null;
        CommonTree char_literal398_tree=null;
        CommonTree string_literal399_tree=null;
        CommonTree char_literal400_tree=null;
        CommonTree char_literal401_tree=null;
        CommonTree string_literal402_tree=null;
        CommonTree char_literal403_tree=null;
        CommonTree char_literal404_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            int alt26=32;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    {
                    IDENT314=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom5267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT314);

                    string_literal315=(Token)match(input,176,FOLLOW_176_in_atom5269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_176.add(string_literal315);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSTFIX, "POSTFIX"), root_1);

                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_2);

                        adaptor.addChild(root_2, stream_IDENT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUM, "NUM"), root_2);

                        adaptor.addChild(root_2, adaptor.create(INT,"1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    {
                    IDENT316=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom5298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT316);

                    string_literal317=(Token)match(input,177,FOLLOW_177_in_atom5300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_177.add(string_literal317);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSTFIX, "POSTFIX"), root_1);

                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_2);

                        adaptor.addChild(root_2, stream_IDENT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUM, "NUM"), root_2);

                        adaptor.addChild(root_2, adaptor.create(INT,"-1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    {
                    string_literal318=(Token)match(input,176,FOLLOW_176_in_atom5328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_176.add(string_literal318);

                    IDENT319=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom5330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT319);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREFIX, "PREFIX"), root_1);

                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_2);

                        adaptor.addChild(root_2, stream_IDENT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUM, "NUM"), root_2);

                        adaptor.addChild(root_2, adaptor.create(INT,"1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    {
                    string_literal320=(Token)match(input,177,FOLLOW_177_in_atom5358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_177.add(string_literal320);

                    IDENT321=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom5360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT321);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREFIX, "PREFIX"), root_1);

                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_2);

                        adaptor.addChild(root_2, stream_IDENT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUM, "NUM"), root_2);

                        adaptor.addChild(root_2, adaptor.create(INT,"-1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    {
                    IDENT322=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom5392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT322);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    {
                    INT323=(Token)match(input,INT,FOLLOW_INT_in_atom5444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_INT.add(INT323);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUM, "NUM"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    {
                    IDENT324=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom5498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT324);

                    pushFollow(FOLLOW_expressionList_in_atom5500);
                    expressionList325=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList325.getTree());


                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    {
                    string_literal326=(Token)match(input,178,FOLLOW_178_in_atom5539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_178.add(string_literal326);

                    char_literal327=(Token)match(input,111,FOLLOW_111_in_atom5541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal327);

                    cur=(Token)match(input,STRING,FOLLOW_STRING_in_atom5545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(cur);

                    char_literal328=(Token)match(input,112,FOLLOW_112_in_atom5547); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal328);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_cur=new RewriteRuleTokenStream(adaptor,"token cur",cur);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IS_CURSOR, "IS_CURSOR"), root_1);

                        adaptor.addChild(root_1, stream_cur.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayIndex_in_atom5575);
                    arrayIndex329=arrayIndex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayIndex329.getTree());

                    }
                    break;
                case 10 :
                    {
                    string_literal330=(Token)match(input,179,FOLLOW_179_in_atom5585); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_179.add(string_literal330);

                    char_literal331=(Token)match(input,111,FOLLOW_111_in_atom5587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal331);

                    msg=(Token)match(input,STRING,FOLLOW_STRING_in_atom5591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(msg);

                    char_literal332=(Token)match(input,112,FOLLOW_112_in_atom5593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal332);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_msg=new RewriteRuleTokenStream(adaptor,"token msg",msg);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INPUT_GET_OBJECT, "INPUT_GET_OBJECT"), root_1);

                        adaptor.addChild(root_1, stream_msg.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    {
                    string_literal333=(Token)match(input,180,FOLLOW_180_in_atom5614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_180.add(string_literal333);

                    char_literal334=(Token)match(input,111,FOLLOW_111_in_atom5616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal334);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_atom5620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(name);

                    char_literal335=(Token)match(input,112,FOLLOW_112_in_atom5622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal335);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HAVE_INVENTORY, "HAVE_INVENTORY"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    {
                    string_literal336=(Token)match(input,181,FOLLOW_181_in_atom5644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_181.add(string_literal336);

                    char_literal337=(Token)match(input,111,FOLLOW_111_in_atom5646); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal337);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_atom5650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(name);

                    char_literal338=(Token)match(input,112,FOLLOW_112_in_atom5652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal338);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_INVENTORY, "SET_INVENTORY"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    {
                    string_literal339=(Token)match(input,182,FOLLOW_182_in_atom5724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_182.add(string_literal339);

                    char_literal340=(Token)match(input,111,FOLLOW_111_in_atom5726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal340);

                    char_literal341=(Token)match(input,112,FOLLOW_112_in_atom5728); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal341);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEXT_ITEM, "NEXT_ITEM"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    {
                    string_literal342=(Token)match(input,183,FOLLOW_183_in_atom5764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_183.add(string_literal342);

                    char_literal343=(Token)match(input,111,FOLLOW_111_in_atom5766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal343);

                    char_literal344=(Token)match(input,112,FOLLOW_112_in_atom5768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal344);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GET_ITEMS_COUNT, "GET_ITEMS_COUNT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    {
                    string_literal345=(Token)match(input,184,FOLLOW_184_in_atom5798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_184.add(string_literal345);

                    char_literal346=(Token)match(input,111,FOLLOW_111_in_atom5800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal346);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_atom5804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(name);

                    char_literal347=(Token)match(input,112,FOLLOW_112_in_atom5806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal347);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IS_ITEM_NAME, "IS_ITEM_NAME"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    {
                    string_literal348=(Token)match(input,185,FOLLOW_185_in_atom5830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_185.add(string_literal348);

                    char_literal349=(Token)match(input,111,FOLLOW_111_in_atom5832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal349);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_atom5836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(name);

                    char_literal350=(Token)match(input,112,FOLLOW_112_in_atom5838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal350);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IS_ITEM_TOOLTIP, "IS_ITEM_TOOLTIP"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    {
                    string_literal351=(Token)match(input,186,FOLLOW_186_in_atom5859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_186.add(string_literal351);

                    char_literal352=(Token)match(input,111,FOLLOW_111_in_atom5861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal352);

                    char_literal353=(Token)match(input,112,FOLLOW_112_in_atom5863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal353);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_QUALITY, "ITEM_QUALITY"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    {
                    string_literal354=(Token)match(input,187,FOLLOW_187_in_atom5896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_187.add(string_literal354);

                    char_literal355=(Token)match(input,111,FOLLOW_111_in_atom5898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal355);

                    char_literal356=(Token)match(input,112,FOLLOW_112_in_atom5900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal356);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_COORD_X, "ITEM_COORD_X"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    {
                    string_literal357=(Token)match(input,188,FOLLOW_188_in_atom5933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_188.add(string_literal357);

                    char_literal358=(Token)match(input,111,FOLLOW_111_in_atom5935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal358);

                    char_literal359=(Token)match(input,112,FOLLOW_112_in_atom5937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal359);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_COORD_Y, "ITEM_COORD_Y"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    {
                    string_literal360=(Token)match(input,189,FOLLOW_189_in_atom5970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_189.add(string_literal360);

                    char_literal361=(Token)match(input,111,FOLLOW_111_in_atom5972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal361);

                    char_literal362=(Token)match(input,112,FOLLOW_112_in_atom5974); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal362);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_NUM, "ITEM_NUM"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    {
                    string_literal363=(Token)match(input,190,FOLLOW_190_in_atom6011); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_190.add(string_literal363);

                    char_literal364=(Token)match(input,111,FOLLOW_111_in_atom6013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal364);

                    char_literal365=(Token)match(input,112,FOLLOW_112_in_atom6015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal365);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM_METER, "ITEM_METER"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    {
                    string_literal366=(Token)match(input,191,FOLLOW_191_in_atom6050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_191.add(string_literal366);

                    char_literal367=(Token)match(input,111,FOLLOW_111_in_atom6052); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal367);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_atom6056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal368=(Token)match(input,113,FOLLOW_113_in_atom6058); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal368);

                    pushFollow(FOLLOW_expression_in_atom6062);
                    r=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(r.getTree());
                    char_literal369=(Token)match(input,112,FOLLOW_112_in_atom6064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal369);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIND_OBJECT_BY_NAME, "FIND_OBJECT_BY_NAME"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    {
                    string_literal370=(Token)match(input,192,FOLLOW_192_in_atom6086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_192.add(string_literal370);

                    char_literal371=(Token)match(input,111,FOLLOW_111_in_atom6088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal371);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_atom6092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal372=(Token)match(input,113,FOLLOW_113_in_atom6094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal372);

                    pushFollow(FOLLOW_expression_in_atom6098);
                    r=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(r.getTree());
                    char_literal373=(Token)match(input,112,FOLLOW_112_in_atom6100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal373);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIND_OBJECT_BY_TYPE, "FIND_OBJECT_BY_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    {
                    string_literal374=(Token)match(input,193,FOLLOW_193_in_atom6122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_193.add(string_literal374);

                    char_literal375=(Token)match(input,111,FOLLOW_111_in_atom6124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal375);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_atom6128); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal376=(Token)match(input,113,FOLLOW_113_in_atom6130); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal376);

                    pushFollow(FOLLOW_expression_in_atom6134);
                    r=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(r.getTree());
                    char_literal377=(Token)match(input,113,FOLLOW_113_in_atom6136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal377);

                    pushFollow(FOLLOW_expression_in_atom6140);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(x.getTree());
                    char_literal378=(Token)match(input,113,FOLLOW_113_in_atom6142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal378);

                    pushFollow(FOLLOW_expression_in_atom6146);
                    y=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(y.getTree());
                    char_literal379=(Token)match(input,112,FOLLOW_112_in_atom6148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal379);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIND_MAP_OBJECT, "FIND_MAP_OBJECT"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());
                        adaptor.addChild(root_1, stream_r.nextTree());
                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    {
                    string_literal380=(Token)match(input,194,FOLLOW_194_in_atom6176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_194.add(string_literal380);

                    char_literal381=(Token)match(input,111,FOLLOW_111_in_atom6178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal381);

                    char_literal382=(Token)match(input,112,FOLLOW_112_in_atom6180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal382);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MY_COORD_X, "MY_COORD_X"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    {
                    string_literal383=(Token)match(input,195,FOLLOW_195_in_atom6215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_195.add(string_literal383);

                    char_literal384=(Token)match(input,111,FOLLOW_111_in_atom6217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal384);

                    char_literal385=(Token)match(input,112,FOLLOW_112_in_atom6219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal385);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MY_COORD_Y, "MY_COORD_Y"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    {
                    string_literal386=(Token)match(input,196,FOLLOW_196_in_atom6254); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_196.add(string_literal386);

                    char_literal387=(Token)match(input,111,FOLLOW_111_in_atom6256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal387);

                    wnd=(Token)match(input,STRING,FOLLOW_STRING_in_atom6260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(wnd);

                    char_literal388=(Token)match(input,112,FOLLOW_112_in_atom6262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal388);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_wnd=new RewriteRuleTokenStream(adaptor,"token wnd",wnd);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHECK_CRAFT, "CHECK_CRAFT"), root_1);

                        adaptor.addChild(root_1, stream_wnd.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    {
                    string_literal389=(Token)match(input,197,FOLLOW_197_in_atom6288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_197.add(string_literal389);

                    char_literal390=(Token)match(input,111,FOLLOW_111_in_atom6290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal390);

                    pushFollow(FOLLOW_expression_in_atom6294);
                    id=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(id.getTree());
                    char_literal391=(Token)match(input,113,FOLLOW_113_in_atom6296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_113.add(char_literal391);

                    pushFollow(FOLLOW_expression_in_atom6300);
                    ind=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ind.getTree());
                    char_literal392=(Token)match(input,112,FOLLOW_112_in_atom6302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal392);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ind=new RewriteRuleSubtreeStream(adaptor,"rule ind",ind!=null?ind.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GET_OBJECT_BLOB, "GET_OBJECT_BLOB"), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_ind.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    {
                    string_literal393=(Token)match(input,198,FOLLOW_198_in_atom6324); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_198.add(string_literal393);

                    char_literal394=(Token)match(input,111,FOLLOW_111_in_atom6326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal394);

                    char_literal395=(Token)match(input,112,FOLLOW_112_in_atom6328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal395);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEXT_BUFF, "NEXT_BUFF"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    {
                    string_literal396=(Token)match(input,199,FOLLOW_199_in_atom6364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_199.add(string_literal396);

                    char_literal397=(Token)match(input,111,FOLLOW_111_in_atom6366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal397);

                    char_literal398=(Token)match(input,112,FOLLOW_112_in_atom6368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal398);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BUFF_METER, "BUFF_METER"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    {
                    string_literal399=(Token)match(input,200,FOLLOW_200_in_atom6403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_200.add(string_literal399);

                    char_literal400=(Token)match(input,111,FOLLOW_111_in_atom6405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal400);

                    char_literal401=(Token)match(input,112,FOLLOW_112_in_atom6407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal401);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BUFF_TIME_METER, "BUFF_TIME_METER"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 32 :
                    {
                    string_literal402=(Token)match(input,201,FOLLOW_201_in_atom6438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_201.add(string_literal402);

                    char_literal403=(Token)match(input,111,FOLLOW_111_in_atom6440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_111.add(char_literal403);

                    n=(Token)match(input,STRING,FOLLOW_STRING_in_atom6444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_STRING.add(n);

                    char_literal404=(Token)match(input,112,FOLLOW_112_in_atom6446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_112.add(char_literal404);



                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    {
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IS_BUFF_NAME, "IS_BUFF_NAME"), root_1);

                        adaptor.addChild(root_1, stream_n.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public static class arrayIndex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    public final hhlParser.arrayIndex_return arrayIndex() throws RecognitionException {
        hhlParser.arrayIndex_return retval = new hhlParser.arrayIndex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token s=null;
        Token char_literal405=null;
        Token char_literal407=null;
        hhlParser.expression_return expression406 = null;


        CommonTree s_tree=null;
        CommonTree char_literal405_tree=null;
        CommonTree char_literal407_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            {
            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_arrayIndex6490); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_IDENT.add(s);

            char_literal405=(Token)match(input,114,FOLLOW_114_in_arrayIndex6492); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_114.add(char_literal405);

            pushFollow(FOLLOW_expression_in_arrayIndex6494);
            expression406=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression406.getTree());
            char_literal407=(Token)match(input,115,FOLLOW_115_in_arrayIndex6496); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_115.add(char_literal407);



            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            {
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
     retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }

    public final void synpred3_hhl_fragment() throws RecognitionException {
        {
        pushFollow(FOLLOW_expression_in_synpred3_hhl1123);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred3_hhl1125); if (state.failed) return ;

        }
    }

    public final void synpred4_hhl_fragment() throws RecognitionException {
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred4_hhl1160); if (state.failed) return ;
        match(input,119,FOLLOW_119_in_synpred4_hhl1162); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred4_hhl1164);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred4_hhl1166); if (state.failed) return ;

        }
    }

    public final void synpred12_hhl_fragment() throws RecognitionException {
        {
        match(input,124,FOLLOW_124_in_synpred12_hhl1369); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred12_hhl1371); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred12_hhl1373);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred12_hhl1375); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred12_hhl1377); if (state.failed) return ;

        }
    }

    public final void synpred13_hhl_fragment() throws RecognitionException {
        Token s=null;

        {
        match(input,124,FOLLOW_124_in_synpred13_hhl1400); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred13_hhl1402); if (state.failed) return ;
        s=(Token)match(input,STRING,FOLLOW_STRING_in_synpred13_hhl1406); if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred13_hhl1408); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred13_hhl1410); if (state.failed) return ;

        }
    }

    public final void synpred21_hhl_fragment() throws RecognitionException {
        Token sname=null;

        {
        match(input,132,FOLLOW_132_in_synpred21_hhl1895); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred21_hhl1897); if (state.failed) return ;
        sname=(Token)match(input,STRING,FOLLOW_STRING_in_synpred21_hhl1901); if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred21_hhl1903); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred21_hhl1905); if (state.failed) return ;

        }
    }

    public final void synpred22_hhl_fragment() throws RecognitionException {
        Token sname=null;
        Token sname2=null;

        {
        match(input,132,FOLLOW_132_in_synpred22_hhl1968); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred22_hhl1970); if (state.failed) return ;
        sname=(Token)match(input,STRING,FOLLOW_STRING_in_synpred22_hhl1974); if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred22_hhl1976); if (state.failed) return ;
        sname2=(Token)match(input,STRING,FOLLOW_STRING_in_synpred22_hhl1980); if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred22_hhl1982); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred22_hhl1984); if (state.failed) return ;

        }
    }

    public final void synpred24_hhl_fragment() throws RecognitionException {
        hhlParser.expression_return x = null;

        hhlParser.expression_return y = null;

        hhlParser.expression_return mod = null;


        {
        match(input,134,FOLLOW_134_in_synpred24_hhl2151); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred24_hhl2153); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred24_hhl2157);
        x=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred24_hhl2159); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred24_hhl2163);
        y=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred24_hhl2165); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred24_hhl2169);
        mod=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred24_hhl2171); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred24_hhl2173); if (state.failed) return ;

        }
    }

    public final void synpred26_hhl_fragment() throws RecognitionException {
        hhlParser.expression_return id = null;

        hhlParser.expression_return mod = null;


        {
        match(input,134,FOLLOW_134_in_synpred26_hhl2333); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred26_hhl2335); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred26_hhl2339);
        id=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred26_hhl2341); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred26_hhl2345);
        mod=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred26_hhl2347); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred26_hhl2349); if (state.failed) return ;

        }
    }

    public final void synpred31_hhl_fragment() throws RecognitionException {
        Token action=null;

        {
        match(input,140,FOLLOW_140_in_synpred31_hhl2705); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred31_hhl2707); if (state.failed) return ;
        action=(Token)match(input,STRING,FOLLOW_STRING_in_synpred31_hhl2711); if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred31_hhl2713); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred31_hhl2715); if (state.failed) return ;

        }
    }

    public final void synpred32_hhl_fragment() throws RecognitionException {
        Token action=null;
        hhlParser.expression_return mod = null;


        {
        match(input,140,FOLLOW_140_in_synpred32_hhl2778); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred32_hhl2780); if (state.failed) return ;
        action=(Token)match(input,STRING,FOLLOW_STRING_in_synpred32_hhl2784); if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred32_hhl2786); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred32_hhl2790);
        mod=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred32_hhl2792); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred32_hhl2794); if (state.failed) return ;

        }
    }

    public final void synpred37_hhl_fragment() throws RecognitionException {
        Token n=null;
        Token act=null;
        hhlParser.expression_return x = null;

        hhlParser.expression_return y = null;


        {
        match(input,145,FOLLOW_145_in_synpred37_hhl3192); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred37_hhl3194); if (state.failed) return ;
        n=(Token)match(input,STRING,FOLLOW_STRING_in_synpred37_hhl3198); if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred37_hhl3200); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred37_hhl3204);
        x=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred37_hhl3206); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred37_hhl3210);
        y=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred37_hhl3212); if (state.failed) return ;
        act=(Token)match(input,STRING,FOLLOW_STRING_in_synpred37_hhl3216); if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred37_hhl3218); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred37_hhl3220); if (state.failed) return ;

        }
    }

    public final void synpred38_hhl_fragment() throws RecognitionException {
        Token n=null;
        Token act=null;
        hhlParser.expression_return x = null;

        hhlParser.expression_return y = null;

        hhlParser.expression_return mod = null;


        {
        match(input,145,FOLLOW_145_in_synpred38_hhl3292); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred38_hhl3294); if (state.failed) return ;
        n=(Token)match(input,STRING,FOLLOW_STRING_in_synpred38_hhl3298); if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred38_hhl3300); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred38_hhl3304);
        x=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred38_hhl3306); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred38_hhl3310);
        y=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred38_hhl3312); if (state.failed) return ;
        act=(Token)match(input,STRING,FOLLOW_STRING_in_synpred38_hhl3316); if (state.failed) return ;
        match(input,113,FOLLOW_113_in_synpred38_hhl3318); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred38_hhl3322);
        mod=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred38_hhl3324); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred38_hhl3326); if (state.failed) return ;

        }
    }

    public final void synpred48_hhl_fragment() throws RecognitionException {
        hhlParser.statement_return a1 = null;

        hhlParser.statement_return a2 = null;


        {
        match(input,156,FOLLOW_156_in_synpred48_hhl4227); if (state.failed) return ;
        match(input,111,FOLLOW_111_in_synpred48_hhl4229); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred48_hhl4231);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred48_hhl4233); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred48_hhl4237);
        a1=statement();

        state._fsp--;
        if (state.failed) return ;
        match(input,157,FOLLOW_157_in_synpred48_hhl4239); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred48_hhl4243);
        a2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }

    public final void synpred49_hhl_fragment() throws RecognitionException {
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred49_hhl4680); if (state.failed) return ;
        match(input,119,FOLLOW_119_in_synpred49_hhl4682); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred49_hhl4684);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }

    public final void synpred50_hhl_fragment() throws RecognitionException {
        {
        pushFollow(FOLLOW_arrayIndex_in_synpred50_hhl4719);
        arrayIndex();

        state._fsp--;
        if (state.failed) return ;
        match(input,119,FOLLOW_119_in_synpred50_hhl4721); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred50_hhl4723);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }


    public final boolean synpred4_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_hhl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_hhl_fragment(); 
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA8_eotS =
        "\126\uffff";
    static final String DFA8_eofS =
        "\126\uffff";
    static final String DFA8_minS =
        "\1\142\2\uffff\1\0\47\uffff\1\0\7\uffff\1\0\1\uffff\1\0\5\uffff"+
        "\1\0\4\uffff\1\0\25\uffff";
    static final String DFA8_maxS =
        "\1\u00c9\2\uffff\1\0\47\uffff\1\0\7\uffff\1\0\1\uffff\1\0\5\uffff"+
        "\1\0\4\uffff\1\0\25\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\36\uffff\1\5\1\6\1\uffff\1\7\1\10"+
        "\1\11\1\12\1\13\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff"+
        "\1\27\1\uffff\1\31\1\33\1\34\1\35\1\36\1\uffff\1\41\1\42\1\43\1"+
        "\44\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1"+
        "\4\1\14\1\15\1\25\1\26\1\30\1\32\1\37\1\40\1\45\1\46";
    static final String DFA8_specialS =
        "\3\uffff\1\0\47\uffff\1\1\7\uffff\1\2\1\uffff\1\3\5\uffff\1\4\4"+
        "\uffff\1\5\25\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\2\1\uffff\1\4\11\uffff\1\4\4\uffff\1\112\1\uffff\1\1"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1"+
            "\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
            "\1\110\1\111\1\46\1\43\1\uffff\2\44\12\uffff\1\4\3\uffff\34"+
            "\4",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
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
            return "76:1: statement options {backtrack=true; } : ( ';' -> NOP | varDeclaration | expression ';' -> expression | IDENT '=' expression ';' -> ^( ASSIGN IDENT expression ) | if_statement | while_statement | for_statement | 'return' expression ';' -> ^( RETURN expression ) | 'break' ';' -> BREAK | 'continue' ';' -> CONTINUE | 'sleep' '(' expression ')' ';' -> ^( SLEEP expression ) | 'print' '(' expression ')' ';' -> ^( PRINT expression ) | 'print' '(' s= STRING ')' ';' -> ^( PRINT_STRING $s) | 'exit' ';' -> ^( EXIT ) | 'logout' ';' -> ^( LOGOUT ) | 'say' '(' s= STRING ')' ';' -> ^( SAY $s) | 'do_click' '(' obj= expression ',' btn= expression ',' mod= expression ')' ';' -> ^( DO_CLICK $obj $btn $mod) | 'select_context_menu' '(' sname= STRING ')' ';' -> ^( SELECT_CONTEXT_MENU $sname) | 'map_move' '(' id= expression ',' x= expression ',' y= expression ')' ';' -> ^( MAP_MOVE $id $x $y) | 'map_move_step' '(' x= expression ',' y= expression ')' ';' -> ^( MAP_MOVE_STEP $x $y) | 'send_action' '(' sname= STRING ')' ';' -> ^( SEND_ACTION $sname) | 'send_action' '(' sname= STRING ',' sname2= STRING ')' ';' -> ^( SEND_ACTION2 $sname $sname2) | 'map_click' '(' x= expression ',' y= expression ',' btn= expression ',' mod= expression ')' ';' -> ^( MAP_CLICK $x $y $btn $mod) | 'map_interact_click' '(' x= expression ',' y= expression ',' mod= expression ')' ';' -> ^( MAP_INTERACT_CLICK $x $y $mod) | 'map_abs_interact_click' '(' x= expression ',' y= expression ',' mod= expression ')' ';' -> ^( MAP_ABS_INTERACT_CLICK $x $y $mod) | 'map_interact_click' '(' id= expression ',' mod= expression ')' ';' -> ^( MAP_INTERACT_CLICK2 $id $mod) | 'drop' '(' mod= expression ')' ';' -> ^( DROP $mod) | 'reset_inventory' '(' ')' ';' -> ^( RESET_INVENTORY ) | 'set_item_index' '(' index= expression ')' ';' -> ^( SET_ITEM_INDEX $index) | 'set_item_drag' '(' ')' ';' -> ^( SET_ITEM_DRAG ) | 'item_click' '(' action= STRING ')' ';' -> ^( ITEM_CLICK $action) | 'item_click' '(' action= STRING ',' mod= expression ')' ';' -> ^( ITEM_CLICK2 $action $mod) | 'item_drop' '(' x= expression ',' y= expression ')' ';' -> ^( ITEM_DROP $x $y) | 'item_drop_to_inventory' '(' n= STRING ',' x= expression ',' y= expression ')' ';' -> ^( ITEM_DROP_TO_INVENTORY $n $x $y) | 'craft' '(' a= expression ')' ';' -> ^( CRAFT $a) | 'equip' '(' slot= expression ',' act= STRING ')' ';' -> ^( EQUIP $slot $act) | 'inventory' '(' n= STRING ',' x= expression ',' y= expression ',' act= STRING ')' ';' -> ^( INVENTORY $n $x $y $act) | 'inventory' '(' n= STRING ',' x= expression ',' y= expression ',' act= STRING ',' mod= expression ')' ';' -> ^( INVENTORY $n $x $y $act $mod) | 'map_abs_click' '(' x= expression ',' y= expression ',' btn= expression ',' mod= expression ')' ';' -> ^( MAP_ABS_CLICK $x $y $btn $mod) | 'wait_craft' '(' wnd= STRING ')' ';' -> ^( WAIT_CRAFT $wnd) | 'open_inventory' '(' ')' -> ^( OPEN_INVENTORY ) | 'set_show_var' '(' s= STRING ')' ';' -> ^( SET_SHOW_VAR $s) | 'render_mode' '(' x= expression ')' ';' -> ^( RENDER_MODE $x) | 'reset_buff' '(' ')' ';' -> ^( RESET_BUFF ) | 'map_place' '(' x= expression ',' y= expression ',' btn= expression ',' mod= expression ')' ';' -> ^( MAP_PLACE $x $y $btn $mod) | 'build_click' '(' ')' ';' -> ^( BUILD_CLICK ) | 'set_item_equip' '(' i= expression ')' ';' -> ^( SET_ITEM_EQUIP $i) | block );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
         int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA8_3 = input.LA(1);


                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_hhl()) ) {s = 4;}

                        else if ( (synpred4_hhl()) ) {s = 75;}


                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA8_43 = input.LA(1);


                        int index8_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_hhl()) ) {s = 76;}

                        else if ( (synpred13_hhl()) ) {s = 77;}


                        input.seek(index8_43);
                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA8_51 = input.LA(1);


                        int index8_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_hhl()) ) {s = 78;}

                        else if ( (synpred22_hhl()) ) {s = 79;}


                        input.seek(index8_51);
                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA8_53 = input.LA(1);


                        int index8_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_hhl()) ) {s = 80;}

                        else if ( (synpred26_hhl()) ) {s = 81;}


                        input.seek(index8_53);
                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA8_59 = input.LA(1);


                        int index8_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_hhl()) ) {s = 82;}

                        else if ( (synpred32_hhl()) ) {s = 83;}


                        input.seek(index8_59);
                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA8_64 = input.LA(1);


                        int index8_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_hhl()) ) {s = 84;}

                        else if ( (synpred38_hhl()) ) {s = 85;}


                        input.seek(index8_64);
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
    static final String DFA16_eotS =
        "\43\uffff";
    static final String DFA16_eofS =
        "\43\uffff";
    static final String DFA16_minS =
        "\1\142\1\0\41\uffff";
    static final String DFA16_maxS =
        "\1\u00c9\1\0\41\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\36\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\1\uffff\1\0\41\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\2\uffff\1\2\11\uffff\1\2\72\uffff\1\2\3\uffff\34\2",
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
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "189:1: expression options {backtrack=true; } : ( IDENT '=' expression -> ^( ASSIGN IDENT expression ) | arrayIndex '=' expression -> ^( ASSIGN arrayIndex expression ) | orExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
         int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA16_1 = input.LA(1);


                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_hhl()) ) {s = 33;}

                        else if ( (synpred50_hhl()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}


                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\42\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\41\40\uffff";
    static final String DFA26_minS =
        "\1\142\1\155\40\uffff";
    static final String DFA26_maxS =
        "\1\u00c9\1\u00b1\40\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\3\1\4\1\6\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
        "\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
        "\1\36\1\37\1\40\1\1\1\2\1\11\1\7\1\5";
    static final String DFA26_specialS =
        "\42\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\2\uffff\1\4\112\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\26\1\27\1\30\1\31\1\32\1\33\1\34",
            "\2\41\1\40\2\41\1\37\1\41\2\uffff\1\41\51\uffff\16\41\2\uffff"+
            "\1\35\1\36",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "235:1: atom : ( IDENT '++' -> ^( POSTFIX ^( VAR IDENT ) ^( NUM ) ) | IDENT '--' -> ^( POSTFIX ^( VAR IDENT ) ^( NUM ) ) | '++' IDENT -> ^( PREFIX ^( VAR IDENT ) ^( NUM ) ) | '--' IDENT -> ^( PREFIX ^( VAR IDENT ) ^( NUM ) ) | IDENT -> ^( VAR IDENT ) | INT -> ^( NUM INT ) | IDENT expressionList -> ^( CALL IDENT expressionList ) | 'is_cursor' '(' cur= STRING ')' -> ^( IS_CURSOR $cur) | arrayIndex | 'input_get_object' '(' msg= STRING ')' -> ^( INPUT_GET_OBJECT $msg) | 'have_inventory' '(' name= STRING ')' -> ^( HAVE_INVENTORY $name) | 'set_inventory' '(' name= STRING ')' -> ^( SET_INVENTORY $name) | 'next_item' '(' ')' -> ^( NEXT_ITEM ) | 'get_items_count' '(' ')' -> ^( GET_ITEMS_COUNT ) | 'is_item_name' '(' name= STRING ')' -> ^( IS_ITEM_NAME $name) | 'is_item_tooltip' '(' name= STRING ')' -> ^( IS_ITEM_TOOLTIP $name) | 'item_quality' '(' ')' -> ^( ITEM_QUALITY ) | 'item_coord_x' '(' ')' -> ^( ITEM_COORD_X ) | 'item_coord_y' '(' ')' -> ^( ITEM_COORD_Y ) | 'item_num' '(' ')' -> ^( ITEM_NUM ) | 'item_meter' '(' ')' -> ^( ITEM_METER ) | 'find_object_by_name' '(' n= STRING ',' r= expression ')' -> ^( FIND_OBJECT_BY_NAME $n $r) | 'find_object_by_type' '(' n= STRING ',' r= expression ')' -> ^( FIND_OBJECT_BY_TYPE $n $r) | 'find_map_object' '(' n= STRING ',' r= expression ',' x= expression ',' y= expression ')' -> ^( FIND_MAP_OBJECT $n $r $x $y) | 'my_coord_x' '(' ')' -> ^( MY_COORD_X ) | 'my_coord_y' '(' ')' -> ^( MY_COORD_Y ) | 'check_craft' '(' wnd= STRING ')' -> ^( CHECK_CRAFT $wnd) | 'get_object_blob' '(' id= expression ',' ind= expression ')' -> ^( GET_OBJECT_BLOB $id $ind) | 'next_buff' '(' ')' -> ^( NEXT_BUFF ) | 'buff_meter' '(' ')' -> ^( BUFF_METER ) | 'buff_time_meter' '(' ')' -> ^( BUFF_TIME_METER ) | 'is_buff_name' '(' n= STRING ')' -> ^( IS_BUFF_NAME $n) );";
        }
    }


    public static final BitSet FOLLOW_includeList_in_start381 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_program_in_start383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varList_in_program484 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_functionList_in_program486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_includeList624 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_include649 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_include651 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_include653 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_include655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_functionList696 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration716 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_functionDeclaration718 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDeclaration720 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_block_in_functionDeclaration724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_paramList767 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_paramList769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_paramList811 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_paramDecl_in_paramList813 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_paramList816 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_paramDecl_in_paramList818 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_paramList822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_paramDecl855 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_paramDecl857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_paramDecl902 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_paramDecl904 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_paramDecl906 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_paramDecl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_block958 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_block960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_block1006 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_block1008 = new BitSet(new long[]{0x0000000000000000L,0xFF70802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_117_in_block1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_statement1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement1123 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_statement1160 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_statement1162 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1164 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_statement1227 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1229 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_statement1261 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_statement1301 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_statement1338 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1340 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1342 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1344 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_statement1369 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1371 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1373 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1375 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_statement1400 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1402 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement1406 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1408 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_statement1436 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_statement1479 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_statement1520 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1522 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement1526 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1528 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_statement1558 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1560 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1564 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement1566 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1570 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement1572 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1576 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1578 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_statement1649 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1651 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement1655 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1657 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_statement1722 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1724 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1728 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement1730 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1734 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement1736 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1740 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1742 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_statement1813 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1815 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1819 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement1821 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement1825 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1827 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_statement1895 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1897 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement1901 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1903 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_statement1968 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement1970 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement1974 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement1976 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement1980 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement1982 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_statement2051 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2053 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2057 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2059 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2063 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2065 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2069 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2071 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2075 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2077 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_statement2151 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2153 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2157 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2159 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2163 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2165 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2169 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2171 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_statement2242 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2244 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2248 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2250 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2254 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2256 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2260 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2262 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_statement2333 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2335 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2339 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2341 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2345 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2347 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_statement2415 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2417 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2421 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2423 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_statement2491 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2493 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2495 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_statement2557 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2559 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2563 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2565 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_statement2630 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2632 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2634 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_statement2705 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2707 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement2711 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2713 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_statement2778 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2780 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement2784 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2786 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2790 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2792 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_statement2860 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2862 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2866 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2868 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2872 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2874 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_statement2942 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement2944 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement2948 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2950 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2954 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement2956 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement2960 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement2962 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_statement3033 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3035 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3039 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3041 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_statement3110 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3112 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3116 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3118 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3122 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3124 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_statement3192 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3194 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3198 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3200 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3204 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3206 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3210 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3212 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3216 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3218 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_statement3292 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3294 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3298 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3300 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3304 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3306 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3310 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3312 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3316 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3318 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3322 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3324 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_statement3401 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3403 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3407 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3409 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3413 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3415 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3419 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3421 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3425 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3427 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_statement3501 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3503 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3507 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3509 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_statement3574 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3576 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_statement3605 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3607 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_statement3611 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3613 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_statement3634 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3636 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3640 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3642 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_statement3708 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3710 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3712 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_statement3741 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3743 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3747 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3749 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3753 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3755 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3759 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_statement3761 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3765 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3767 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_statement3841 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3843 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3845 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_statement3873 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_statement3875 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_statement3879 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3881 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_statement3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_for_statement3976 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_for_statement3978 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_for_statement3982 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_for_statement3984 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_for_statement3988 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_for_statement3990 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_for_statement3994 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_for_statement3996 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_for_statement3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_for_statement4074 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_for_statement4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TYPE_in_for_statement4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_for_statement4084 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_for_statement4086 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_for_statement4090 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_for_statement4092 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_for_statement4096 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_for_statement4098 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_for_statement4102 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_for_statement4104 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_for_statement4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_if_statement4227 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_if_statement4229 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_if_statement4231 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_if_statement4233 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_if_statement4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_if_statement4239 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_if_statement4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_if_statement4271 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_if_statement4273 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_if_statement4275 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_if_statement4277 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_if_statement4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_while_statement4323 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_while_statement4325 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_while_statement4327 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_while_statement4329 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_while_statement4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_while_statement4351 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_while_statement4355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_while_statement4357 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_while_statement4359 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_while_statement4363 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_while_statement4365 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_while_statement4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_varList4406 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_TYPE_in_varDeclaration4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclaration4432 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_varDeclaration4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_varDeclaration4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclaration4477 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_varDeclaration4479 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_varDeclaration4481 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_varDeclaration4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_varDeclaration4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclaration4519 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_varDeclaration4521 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_varDeclaration4523 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_varDeclaration4525 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_varDeclaration4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_expressionList4574 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_expressionList4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_expressionList4620 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_expressionList4622 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_expressionList4625 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_expressionList4627 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_expressionList4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expression4680 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_expression4682 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_expression4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayIndex_in_expression4719 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_expression4721 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_expression4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression4776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_set_in_orExpression4780 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_andExpression_in_orExpression4789 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_equalExpression_in_andExpression4814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_set_in_andExpression4818 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_equalExpression_in_andExpression4827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_comparsionExpression_in_equalExpression4852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_set_in_equalExpression4856 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_comparsionExpression_in_equalExpression4869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_addExpression_in_comparsionExpression4894 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_set_in_comparsionExpression4898 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_addExpression_in_comparsionExpression4915 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_multExpression_in_addExpression4936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_set_in_addExpression4940 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_multExpression_in_addExpression4949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_notExpression_in_multExpression4970 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000380000000000L});
    public static final BitSet FOLLOW_set_in_multExpression4974 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_notExpression_in_multExpression4987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000380000000000L});
    public static final BitSet FOLLOW_174_in_notExpression5015 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_175_in_notExpression5017 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_negationExpression_in_notExpression5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_negationExpression5106 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_primary_in_negationExpression5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_primary5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_primary5219 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_primary5221 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_primary5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom5267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_atom5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom5298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_177_in_atom5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_atom5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_atom5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_atom5358 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_atom5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom5498 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_expressionList_in_atom5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_atom5539 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5541 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom5545 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayIndex_in_atom5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_atom5585 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5587 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom5591 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_atom5614 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5616 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom5620 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_atom5644 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5646 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom5650 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_atom5724 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5726 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_atom5764 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5766 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_atom5798 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5800 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom5804 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_atom5830 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5832 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom5836 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_atom5859 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5861 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_atom5896 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5898 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_atom5933 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5935 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_atom5970 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom5972 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_atom6011 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6013 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_atom6050 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6052 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom6056 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom6058 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6062 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_atom6086 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6088 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom6092 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom6094 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6098 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_atom6122 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6124 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom6128 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom6130 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6134 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom6136 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6140 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom6142 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6146 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_atom6176 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6178 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_atom6215 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6217 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_atom6254 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6256 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom6260 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_atom6288 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6290 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6294 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom6296 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_atom6300 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_atom6324 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6326 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_atom6364 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6366 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_atom6403 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6405 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_atom6438 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_atom6440 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_atom6444 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atom6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_arrayIndex6490 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_arrayIndex6492 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_arrayIndex6494 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_arrayIndex6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred3_hhl1123 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred3_hhl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred4_hhl1160 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_synpred4_hhl1162 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred4_hhl1164 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred4_hhl1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_synpred12_hhl1369 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred12_hhl1371 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred12_hhl1373 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred12_hhl1375 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred12_hhl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_synpred13_hhl1400 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred13_hhl1402 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred13_hhl1406 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred13_hhl1408 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred13_hhl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_synpred21_hhl1895 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred21_hhl1897 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred21_hhl1901 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred21_hhl1903 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred21_hhl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_synpred22_hhl1968 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred22_hhl1970 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred22_hhl1974 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred22_hhl1976 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred22_hhl1980 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred22_hhl1982 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred22_hhl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_synpred24_hhl2151 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred24_hhl2153 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred24_hhl2157 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred24_hhl2159 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred24_hhl2163 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred24_hhl2165 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred24_hhl2169 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred24_hhl2171 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred24_hhl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_synpred26_hhl2333 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred26_hhl2335 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred26_hhl2339 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred26_hhl2341 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred26_hhl2345 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred26_hhl2347 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred26_hhl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_synpred31_hhl2705 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred31_hhl2707 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred31_hhl2711 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred31_hhl2713 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred31_hhl2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_synpred32_hhl2778 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred32_hhl2780 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred32_hhl2784 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred32_hhl2786 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred32_hhl2790 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred32_hhl2792 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred32_hhl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_synpred37_hhl3192 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred37_hhl3194 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred37_hhl3198 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred37_hhl3200 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred37_hhl3204 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred37_hhl3206 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred37_hhl3210 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred37_hhl3212 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred37_hhl3216 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred37_hhl3218 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred37_hhl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_synpred38_hhl3292 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred38_hhl3294 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred38_hhl3298 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred38_hhl3300 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred38_hhl3304 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred38_hhl3306 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred38_hhl3310 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred38_hhl3312 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STRING_in_synpred38_hhl3316 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_synpred38_hhl3318 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred38_hhl3322 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred38_hhl3324 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred38_hhl3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_synpred48_hhl4227 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred48_hhl4229 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred48_hhl4231 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred48_hhl4233 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_synpred48_hhl4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_synpred48_hhl4239 = new BitSet(new long[]{0x0000000000000000L,0xFF50802C00000000L,0xFFFFC400DFFFFFFFL,0x00000000000003FFL});
    public static final BitSet FOLLOW_statement_in_synpred48_hhl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred49_hhl4680 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_synpred49_hhl4682 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred49_hhl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayIndex_in_synpred50_hhl4719 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_synpred50_hhl4721 = new BitSet(new long[]{0x0000000000000000L,0x0000802400000000L,0xFFFFC40000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_expression_in_synpred50_hhl4723 = new BitSet(new long[]{0x0000000000000002L});

}
