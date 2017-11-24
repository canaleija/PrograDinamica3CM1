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
         this.solucion[x]=0;
     
     return  buscar(solucion, 0);
     
    
    }
    
    private boolean buscar(int[] solucion, int etapa){
    if (etapa>=n){
            return false;
        }
        boolean exito = false;
        while(true){
            if(solucion[etapa]<n)
                solucion[etapa]+=1;
            
            if(validar(solucion,etapa)){
                if (etapa!=(n-1)){
                    exito=buscar(solucion,etapa+1);
                    if(exito==false)
                      solucion[etapa+1] = 0;
                }else{
                   
                    exito=true;
                }
            }
            if(solucion[etapa]==n||exito==true)
                break;
        }
        
        return exito;

    }

    private boolean validar(int[] solucion, int etapa) {
       
        for(int i=0;i<etapa;i++)
            if((solucion[etapa]==solucion[i])||(Math.abs(solucion[i]-solucion[etapa])==Math.abs(i-etapa)))
              return false;
        
        return true;

    }
 
    
    
}
