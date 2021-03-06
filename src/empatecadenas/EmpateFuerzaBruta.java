/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empatecadenas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Roberto Cruz Leija
 */
public class EmpateFuerzaBruta {
    private char[] secuencia;
    private char[] patron;

    public EmpateFuerzaBruta(int n,char[] patron ) {
      // generar secuencia aleatoria
      this.secuencia = new char[n];
      inicializarAleatoriamente(65,122);
      this.patron = patron;
    }

    
    public EmpateFuerzaBruta(char[] secuencia, char[] patron) {
        this.secuencia = secuencia;
        this.patron = patron;
    }
    public int buscar(){
        int con = 0;
        for(int x=0;x<this.secuencia.length;x++){
         if(busca(x))
             con++;
        }
    return con;
    }
    private void inicializarAleatoriamente(int i1,int i2) {
        Random ran = new Random();
        
        
        for(int x=0; x < this.secuencia.length;x++){
            this.secuencia[x]=(char)ThreadLocalRandom.current().nextInt(i1, i2);
            //System.out.println(this.secuencia[x]);
        }
    }

    private boolean busca(int x) {
        /// verificar que no exceda 
        int aux= 0;
        if(this.patron.length+x<=this.secuencia.length){
          // aplica fuerza bruta apartir de x
          for(int y=x; y < this.patron.length+x;y++){
            if(secuencia[y]!=patron[aux])
                 return false;
            
            aux++;
          }
          
          return true;
        }else {
        
        return false;}
        
       
    }
    
    
    
    
}
