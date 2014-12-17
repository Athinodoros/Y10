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
public class Y10Factory implements PlayerFactory<BattleshipsPlayer>{

    @Override
    public BattleshipsPlayer getNewInstance() {
        return new Y10AI();
    }

    @Override
    public String getID() {
        return "Cheater";
    }

    @Override
    public String getName() {
        return "MyName";
    }
    
}
