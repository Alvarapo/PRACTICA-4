/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Dado {
    private int valor;
    
    public int getValorCara(){
        return this.valor;
    }
    
    public void setValorCara(int valorCara){
        this.valor = valorCara;
    }
    
    public void tirarDatos(){
        Random rnd = new Random();
        this.setValorCara(rnd.nextInt(11)+2);
    }
}
