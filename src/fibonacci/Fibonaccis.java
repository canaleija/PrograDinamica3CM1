/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in- the editor.
 */
package fibonacci;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Fibonaccis {
    
    public static int l = 0;
    
    public static long fiboIterativo(long pos){
        long pen = 0;
        long ult = 1;
        long suma;
        for (int x=1; x<pos;x++){
          suma =  ult + pen;
          pen = ult;
          ult = suma;        
        }
        
        
       return ult;
 }
    
    public static long fiboRecursivo(long pos){
        l++;
        long retornado=0;
             if(pos==0 || pos==1) retornado=pos;
             else retornado=fiboRecursivo(pos-2)+fiboRecursivo(pos-1);
       return retornado;
    }
    
     public static long fiboIterativoDinamico(long pos){
        long fibos[] = new long[(int)pos+1];
        fibos[0] = 0;
        fibos[1] = 1;
        for (int x=2; x<=pos;x++){
         fibos[x] =  fibos[x-1] + fibos[x-2];
        }
     return fibos[(int)pos];
    }
     
     public static long fiboRecursivoDinamico(long pos){
        if(pos<=1){
         return pos;
        } else {
         long n [] = new long[(int)pos+1];
         n[0]= 0;
         n[1]= 1;
//       
         return lookUpFib(n,pos);
        }
            
    }

    private static long lookUpFib(long[] n, long pos) {
       l++;
        // caso base
       // if(n[(int)pos]!=-1)return n[(int)pos];
       //if(n[(int)pos]==0 || (n[(int)pos]==1 && pos ==2))return n[(int)pos];
        if((pos==0 || pos ==1) || (n[(int)pos]!=0 && pos!=0))return n[(int)pos];
        
        // si no se conoce entonces calcular
        n[(int)pos]=lookUpFib(n, pos-1)+lookUpFib(n, pos-2);
        
        return n[(int)pos];
    }
     
    
}
