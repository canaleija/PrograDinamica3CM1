/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author Roberto Cruz Leija
 */
public class NReinasBT {
    
    private int n;
    private int solucion[];

    public NReinasBT() {
        this.n=0;
        this.solucion = null;
    }
    
    public boolean ejecutar(int n){
     // agregar -1`s al arreglo 
     this.solucion = new int[n];
     this. n = n;
     for(int x=0; x < n;x++)
         this.solucion[x]=-1;
     
     return  buscar(solucion, 1);
     
    
    }
    
    private boolean buscar(int[] solucion, int etapa){
    
        // caso base
        if (etapa-1>this.n)return false;
                
        boolean exito = false;
        solucion[etapa-1]=0;
        
        do{
            solucion[etapa-1]+=1;
            if (validar(solucion,etapa)){
               if(etapa<n){
                     // caso recursivo 
                 exito=buscar(solucion,etapa+1);
               }else{
                 exito=true;
               }
            }
        }
        while(solucion[etapa-1]!=n&&!exito);
         
        
    return false;
    }

    private boolean validar(int[] solucion, int etapa) {
        for(int i=0; i<etapa-1;i++){
            if(solucion[i]==solucion[etapa-1]||Math.abs(solucion[i]-solucion[etapa-1])==Math.abs(i-etapa))
                return false;
        }
        
        return true;
    }
 
    
    
}
