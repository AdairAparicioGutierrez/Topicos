
package g4s21p8aga;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "27 de abril","12","20","Freddy Mercuri","16 de septiembre"
    };
    
    String[] radioR = {
        "27 de abril,12 de octubre,131 de febrero,27 de mayo",
        "12,6 ,1 ,25 ",
        "20,21,41,12",
        "Freddy Mercuri,Freddie Mercury,Freddie Mercury,Freddie Mercury",
        "16 de septiembre,15 de abril,26 de septtiembre,4 de agosto"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
