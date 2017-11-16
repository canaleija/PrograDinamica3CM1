/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochilaentera;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Item {
    private double valor;
    private int peso;

    public Item(double valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        String aux ="";
        aux+=this.peso+"-"+this.valor;
        return aux; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public static ArrayList<Item> geraraitems(int n, int v, int p){
        ArrayList<Item> items= new ArrayList<>();
        for(int i =0; i<n; i++){
             Random rndp = new Random();
             Random rndv = new Random();
             Item it= new Item(rndv.nextInt(v)+1,rndp.nextInt(p)+1);
             items.add(it);
        }
        return items;
    }
    
}
