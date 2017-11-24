/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empatecadenas;

/**
 *
 * @author Roberto Cruz Leija
 */
public class RabinKarp {
    
    
    
    public static double calcularHash(char[] cadena){
      double hash=0;
      for(int x=0; x < cadena.length;x++)
          hash+=(cadena[x]*Math.pow(31,cadena.length-(x+1)));
      
      return hash;
    }
    
}
