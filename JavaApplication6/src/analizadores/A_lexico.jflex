package analizadores;
import java_cup.runtime.*;


%%



//directrices


%public 
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode


letra  = [a-zA-Z]
id     = {letra}+


%%

<YYINITIAL>"System"   {
                   
                    return new Symbol(Simbolos.pr_system, yycolumn, yyline, yytext());
                  }

<YYINITIAL>"out"   {
                   
                    return new Symbol(Simbolos.pr_out, yycolumn, yyline, yytext());
                  }

<YYINITIAL>"println"   {
                   
                    return new Symbol(Simbolos.pr_println, yycolumn, yyline, yytext());
                  }
<YYINITIAL>"("   {
                    return new Symbol(Simbolos.s_par_a, yycolumn, yyline, yytext());
                  }

<YYINITIAL>")"   {
                    return new Symbol(Simbolos.s_par_c, yycolumn, yyline, yytext());
                  }


<YYINITIAL>"."   {
                    return new Symbol(Simbolos.s_punto, yycolumn, yyline, yytext());
                  }
<YYINITIAL>";"   {
                    return new Symbol(Simbolos.s_puntoComa, yycolumn, yyline, yytext());
                  }

<YYINITIAL>{id}  {
                    return new Symbol(Simbolos.id, yycolumn, yyline, yytext()); 
                    }


[ \t\r\n\f]         {  /*este es un comentario en java, omitirlos*/ }


.                   {
                        System.out.println("Error Lexico : "+yytext()+
"Linea"+(yyline+1)+" Columna "+yycolumn);    

}


/*java -jar jflex-full-1.7.0.jar A_lexico.jflex*/