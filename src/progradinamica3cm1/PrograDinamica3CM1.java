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
        ArrayList<Item>  articulos = new ArrayList<>();
        articulos.add(new Item(200, 2));
        articulos.add(new Item(83, 4));
        articulos.add(new Item(1000, 14));
        articulos.add(new Item(110, 140));
        articulos.add(new Item(34, 23));
        articulos.add(new Item(56, 67));
        articulos.add(new Item(200, 2));
        articulos.add(new Item(5, 56));
        articulos.add(new Item(6, 140));
        
        MochilaEnteraDinamico md = new MochilaEnteraDinamico(articulos, 2);
        md.buscarSolucion();
//     MochilaEnteraBruta m = new MochilaEnteraBruta(19,articulos);
//     m.calcular();
     
    }
    
}
