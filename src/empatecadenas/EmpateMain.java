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
public class EmpateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int x = 0, y=0;
     do {
     EmpateFuerzaBruta aux = new EmpateFuerzaBruta(5000, new char[]{'h','o','l','a'});
     x = aux.buscar();
     y++;
     } while(x==0);  
     
     System.out.println(x);
    }
    
}
