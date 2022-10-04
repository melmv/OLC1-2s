

%{

    //here variables , JS
    var flag=0;
%}


%lex

%%


//simbolos o palabras reservadas

","      {
                console.log("Reconocio un simbolo reservado, coma. Con lexema: "+ yytext);
        return 'coma';
       
}

"inicio" {return 'inicio'}
"fin"    {return 'fin'}

[ \r\t]+     { /*estos caracteres se omiten*/  }
\n          { /*estos caracteres se omiten*/  }


[a-zA-ZñÑáéíóú]+               {
            console.log("Reconocio un palabra, con el lexema : "+ yytext);
            return 'palabra';
}


<<EOF>>      return 'EOF'; 


.          {console.log("Este es un error lexico "+yytext)}

/lex


%start INICIAR



%%


//gramaticas


INICIAR :  inicio BLOQUE fin EOF  {console.log("TERMINE DE ANALIZAR EL PROYECTO C:");}
        | error EOF   {console.log("Error sintactico"+ $0)}
;



BLOQUE : BLOQUE coma palabra
        | palabra
 


;



