
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analizador_sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public Analizador_sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analizador_sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analizador_sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\005\012" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\004\004\006\001\002\000\004\002\000\001" +
    "\002\000\006\002\ufffd\004\ufffd\001\002\000\004\007\013" +
    "\001\002\000\006\002\ufffe\004\006\001\002\000\004\002" +
    "\011\001\002\000\004\002\001\001\002\000\004\002\uffff" +
    "\001\002\000\004\005\014\001\002\000\004\007\015\001" +
    "\002\000\004\006\016\001\002\000\004\011\017\001\002" +
    "\000\004\012\020\001\002\000\004\013\021\001\002\000" +
    "\006\002\ufffc\004\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\012\002\007\003\003\004\006\005\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\003\011\004\006\005\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analizador_sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analizador_sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Analizador_sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String codigoTraducido="";
     


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analizador_sintactico$actions {
  private final Analizador_sintactico parser;

  /** Constructor */
  CUP$Analizador_sintactico$actions(Analizador_sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analizador_sintactico$do_action_part00000000(
    int                        CUP$Analizador_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analizador_sintactico$parser,
    java.util.Stack            CUP$Analizador_sintactico$stack,
    int                        CUP$Analizador_sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analizador_sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Analizador_sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.elementAt(CUP$Analizador_sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.elementAt(CUP$Analizador_sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analizador_sintactico$stack.elementAt(CUP$Analizador_sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Analizador_sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.elementAt(CUP$Analizador_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analizador_sintactico$parser.done_parsing();
          return CUP$Analizador_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= L 
            {
              Object RESULT =null;
		System.out.println(codigoTraducido);  
              CUP$Analizador_sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // L ::= I L 
            {
              Object RESULT =null;

              CUP$Analizador_sintactico$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.elementAt(CUP$Analizador_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // L ::= I 
            {
              Object RESULT =null;

              CUP$Analizador_sintactico$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // I ::= PRINT 
            {
              Object RESULT =null;
		System.out.println("reconoci un print");  
              CUP$Analizador_sintactico$result = parser.getSymbolFactory().newSymbol("I",2, ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // PRINT ::= pr_system s_punto pr_out s_punto pr_println s_par_a s_par_c s_puntoComa 
            {
              Object RESULT =null;
		 
        
        codigoTraducido+="\nconsole.log()";

              CUP$Analizador_sintactico$result = parser.getSymbolFactory().newSymbol("PRINT",3, ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.elementAt(CUP$Analizador_sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Analizador_sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analizador_sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analizador_sintactico$do_action(
    int                        CUP$Analizador_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analizador_sintactico$parser,
    java.util.Stack            CUP$Analizador_sintactico$stack,
    int                        CUP$Analizador_sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Analizador_sintactico$do_action_part00000000(
                               CUP$Analizador_sintactico$act_num,
                               CUP$Analizador_sintactico$parser,
                               CUP$Analizador_sintactico$stack,
                               CUP$Analizador_sintactico$top);
    }
}

}
