/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.Dado;
import Data.Jugador;

/**
 *
 * @author usuario
 */
public class Juego {

    private int apuesta;
    
    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }
    
    public void jugar(Dado dadoJugador, Dado dadoBanca, Jugador player){
        dadoJugador.tirarDatos();
        dadoBanca.tirarDatos();
        
        if(dadoJugador.getValorCara() == 7 || dadoJugador.getValorCara() == 11){
            //Jugador dobla apuesta
            player.setSaldo(player.getSaldo()+2*this.apuesta);
        }else{
            if(dadoJugador.getValorCara() > dadoBanca.getValorCara()){
                //Gana lo mismo que apuesta
                player.setSaldo(player.getSaldo()+this.apuesta);
            }else{
                if(dadoJugador.getValorCara() != 12){
                    player.setSaldo(player.getSaldo() - this.apuesta);
                }
            }
        }
    }
}
