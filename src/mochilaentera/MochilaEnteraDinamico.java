/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochilaentera;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class MochilaEnteraDinamico {
    
    private ArrayList<Item> items;
    private ArrayList<Item> itemsSolucion;
    private double[][] mBeneficios;
    private int _W;
    private int maxBenefit;

    public MochilaEnteraDinamico(ArrayList<Item> items, int _W) {
        
        this.items = items;
        this._W = _W;
        construirMatrizBeneficios();

    }


    private void construirMatrizBeneficios() {
        // construimos la matriz de beneficios 
        this.mBeneficios = new double[this.items.size()+1][this._W+1];
        // agregar en la primer columna puros ceros
        for (int x=0;x <= this.items.size();x++)
            this.mBeneficios[x][0] = 0;
        // agregar en la primer fila puros ceros
        
        for (int x=0;x <= this._W;x++)
            this.mBeneficios[0][x] = 0;
        
    }
    
    
    public void buscarSolucion(){
        
               // calculamos la matriz de beneficios
       for (int i=1;i <= this.items.size();i++)
           for(int w=0; w<= this._W;w++){
           // verificamos si el item puede ser parte de la solucion
               if  (this.items.get(i-1).getPeso()<= w){
               
                   if ((this.items.get(i-1).getValor()+
                           this.mBeneficios[i-1][w-this.items.get(i-1).getPeso()])
                           >this.mBeneficios[i-1][w]){
                   
                       this.mBeneficios[i][w] = this.items.get(i-1).getValor()+
                               this.mBeneficios[i-1][w-this.items.get(i-1).getPeso()];
                       
                   }else{
                   
                        this.mBeneficios[i][w] = this.mBeneficios[i-1][w];
                   
                   }
               
               }else{
               this.mBeneficios[i][w] = this.mBeneficios[i-1][w];
               }
           
           }
       this.maxBenefit = (int)this.mBeneficios[items.size()][_W];
       this.itemsSolucion = new ArrayList<>();
       // calcular los elementos utilizados para _W
       
       int i = this.items.size();
       int j = this._W;

       while (i > 0 && j > 0){
           double val = this.mBeneficios[i][j];
          if( val != this.mBeneficios[i-1][j]){
              this.itemsSolucion.add(this.items.get(i-1));
              // imprimir el articulo
              String aux =this.items.get(i-1).toString();
              System.out.println(aux);
              i--;
              j = j - this.items.get(i).getPeso();
          } else {
            i--;
          }
                   
       }       
           
       System.out.println();
        }

   
    
}
