/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y10;

import battleship.interfaces.BattleshipsPlayer;
import battleship.interfaces.Board;
import battleship.interfaces.Fleet;
import battleship.interfaces.Position;
import battleship.interfaces.Ship;
import java.util.HashMap;

/**
 *
 * @author Athinodwros
 */
public class Y10AI implements BattleshipsPlayer {

    Position currentPosition;
    ShootingStrategies str = new ShootingPatern1();
    int dataTrackerIn = 0;
    int wins = 0;
    int loses = 0;
    HashMap<Integer, ShootingStrategies> myStrMap;

    int[][] enemyMostUsedBoard = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    int[][] enemyMostShootedArea = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    boolean[][] shotMatrix = {{false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false},
    {false, false, false, false, false, false, false, false, false, false}};
    int[] stratTracking;

    public Y10AI() {
//    myStrMap.put(1,new ShootingPatern1());
//    myStrMap.put(2,new ShootingPatern2());
//    myStrMap.put(3,new ShootingPatern3());
        shotMatrix = newMatrix();
    }

    public boolean[][] newMatrix() {
        boolean[][] newMatrix = {{false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false},
        {false, false, false, false, false, false, false, false, false, false}};
        return newMatrix;
    }

    @Override
    public void startMatch(int rounds) {
        str = new ShootingPatern1();
    }

    @Override
    public void startRound(int round) {
        shotMatrix = newMatrix();
        dataTrackerIn = 0;
        if (round < 40) {
            str = myStrMap.get(1);
        } else {
            str = myStrMap.get(chooseStrategy());//all my strategies stay alive in this map and i can swap without losing any info
        }
    }

    public int chooseStrategy() {
        //with the gothered info it sould 
        //1 calculate if the data are enough to choose an inteligent strategy
        //if yes which one of the pre excisting ones is the best 
        //else if it will reduse the factor and check again
        //else it will rundomize thought the list of standard shootingpaterns
        //always by checking the probabilities.
        //**************************************************************************************
        return 1;
    }

    @Override
    public void placeShips(Fleet fleet, Board board) {
        //
        //
        //          ships are placed
        //
        //

    }

    @Override
    public void incoming(Position pos) {
        do {
            enemyMostShootedArea[pos.x][pos.y]++;
        } while (dataTrackerIn < 30);
        dataTrackerIn++;
    }

    @Override
    public Position getFireCoordinates(Fleet enemyShips) {
        do {
            this.currentPosition = str.getNextPosition();
        } while (shotMatrix[currentPosition.x][currentPosition.y] = false);
        shotMatrix[currentPosition.x][currentPosition.y] = true;
        return currentPosition;
    }

    @Override
    public void hitFeedBack(boolean hit, Fleet enemyShips) {
        if (hit) {
            enemyMostUsedBoard[currentPosition.x][currentPosition.y]++;
            Position bullsEye = currentPosition;
            killWounded(bullsEye);
        }
    }

    public Position killWounded(Position bullsEye) {
        //find and kill the rest of the ship...
        //don't shoot more than needed
        //change the board that keeps track of my shooting
        //update the board with the enemies favorite spots
        return currentPosition;
    }

    @Override
    public void endRound(int round, int points, int enemyPoints) {
        str.resetLists();
        if (points > enemyPoints) {
            wins++;
            if (str.getProbability() < 100) {
                str.setProbability(str.getProbability() + 10);
                ShootingStrategies sec = myStrMap.get(str.getStrategiesCode());
                sec.setProbability(str.getProbability());
            }
        } else {
            loses++;
            if (str.getProbability() > 20) {
                str.setProbability(str.getProbability() - 10);
                myStrMap.get(str.getStrategiesCode()).setProbability(str.getProbability());

            }
        }
    }

    @Override
    public void endMatch(int won, int lost, int draw) {
        System.out.println("Won :  " + won + "\n Lost :  " + lost + " Draw :  " + draw);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(shotMatrix[i][j]+" , ");
            }
                System.out.println("");
        }
    }

}
