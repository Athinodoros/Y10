/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y10;

import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;

/**
 *
 * @author Athinodwros
 */
public class Y10 {

    public static PlayerFactory<BattleshipsPlayer> getPlayerFactory(){
        // TODO code application logic here7
        return new  Y10Factory();        
    }    
    
    
}
