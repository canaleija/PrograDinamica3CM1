/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progradinamica3cm1;

import mochilaentera.MochilaEnteraBruta;
import fibonacci.Fibonaccis;
import java.util.ArrayList;
import mochilaentera.Item;
import mochilaentera.MochilaEnteraDinamico;

/**
 *
 * @author Roberto Cruz Leija
 */
public class PrograDinamica3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Item>  articulos = Item.geraraitems(10000, 1000, 100);
          
        
        MochilaEnteraDinamico md = new MochilaEnteraDinamico(articulos, 100);
        md.buscarSolucion();
//     MochilaEnteraBruta m = new MochilaEnteraBruta(19,articulos);
//     m.calcular();
     
    }
    
}
