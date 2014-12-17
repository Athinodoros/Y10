/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y10;

import battleship.interfaces.Position;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Athinodwros
 */
public class ShootingPatern1 implements ShootingStrategies {

    final int Code=1;
    public int x;
    public int Probability = 100;
    public int y;
    ArrayList<Position> list1 = new ArrayList<>();
    ArrayList<Position> list2 = new ArrayList<>();
    ArrayList<Position> list3 = new ArrayList<>();
    ArrayList<Position> list4 = new ArrayList<>();
    ArrayList<Position> list5 = new ArrayList<>();

    public ShootingPatern1() {
        //list1
        list1.add(new Position(0, 0));
        list1.add(new Position(0, 2));
        list1.add(new Position(0, 4));
        list1.add(new Position(0, 6));
        list1.add(new Position(0, 8));
        list1.add(new Position(1, 9));
        list1.add(new Position(2, 0));
        list1.add(new Position(3, 9));
        list1.add(new Position(4, 0));
        list1.add(new Position(5, 9));
        list1.add(new Position(6, 0));
        list1.add(new Position(7, 9));
        list1.add(new Position(8, 0));
        list1.add(new Position(9, 9));
        list1.add(new Position(9, 7));
        list1.add(new Position(9, 5));
        list1.add(new Position(9, 3));
        list1.add(new Position(9, 1));
        //list2
        list2.add(new Position(1, 1));
        list2.add(new Position(1, 4));
        list2.add(new Position(1, 7));
        list2.add(new Position(2, 2));
        list2.add(new Position(2, 5));
        list2.add(new Position(2, 8));
        list2.add(new Position(3, 3));
        list2.add(new Position(3, 6));
        list2.add(new Position(4, 1));
        list2.add(new Position(4, 4));
        list2.add(new Position(4, 7));
        list2.add(new Position(5, 2));
        list2.add(new Position(5, 5));
        list2.add(new Position(5, 8));
        list2.add(new Position(6, 3));
        list2.add(new Position(6, 6));
        list2.add(new Position(7, 1));
        list2.add(new Position(7, 4));
        list2.add(new Position(7, 7));
        list2.add(new Position(8, 2));
        list2.add(new Position(8, 5));
        list2.add(new Position(8, 8));
        //list3 
        list3.add(new Position(1, 3));
        list3.add(new Position(3, 1));
        list3.add(new Position(6, 8));
        list3.add(new Position(8, 6));
        //list4
        list4.add(new Position(1, 6));
        list4.add(new Position(2, 4));
        list4.add(new Position(2, 7));
        list4.add(new Position(3, 5));
        list4.add(new Position(3, 8));
        list4.add(new Position(4, 2));
        list4.add(new Position(4, 6));
        list4.add(new Position(5, 1));
        list4.add(new Position(5, 3));
        list4.add(new Position(5, 7));
        list4.add(new Position(6, 2));
        list4.add(new Position(6, 4));
        list4.add(new Position(7, 3));
        list4.add(new Position(7, 5));
        list4.add(new Position(8, 4));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                list5.add(new Position(i, j));
            }
        }
        for (Position list11 : list1) {
            list5.remove(list11);
        }
        for (Position list11 : list2) {
            list5.remove(list11);
        }
        for (Position list11 : list3) {
            list5.remove(list11);
        }
        for (Position list11 : list4) {
            list5.remove(list11);
        }
    }

    @Override
    public int getProbability() {
        return Probability;
    }

    @Override
    public void setProbability(int Probability) {
        this.Probability = Probability;
    }

    
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public Position getNextPosition() {
        Random r = new Random();
        Position temp ;
        if (!list1.isEmpty()) {
            int tempLiItem = r.nextInt(list1.size());
            temp = list1.remove(tempLiItem);
        } else if (!list2.isEmpty()) {
            int tempLiItem = r.nextInt(list2.size());
            temp = list2.remove(tempLiItem);
        } else if (!list3.isEmpty()) {
            int tempLiItem = r.nextInt(list3.size());
            temp = list3.remove(tempLiItem);
        } else if (!list4.isEmpty()) {
            int tempLiItem = r.nextInt(list4.size());
            temp = list4.remove(tempLiItem);
        } else {
            int tempLiItem = r.nextInt(list5.size());
            temp = list5.remove(tempLiItem);
        }
        return temp;
    }

    @Override
    public int getStrategiesCode() {
        return Code;
    }

    @Override
    public void resetLists() {
         //list1
        list1.add(new Position(0, 0));
        list1.add(new Position(0, 2));
        list1.add(new Position(0, 4));
        list1.add(new Position(0, 6));
        list1.add(new Position(0, 8));
        list1.add(new Position(1, 9));
        list1.add(new Position(2, 0));
        list1.add(new Position(3, 9));
        list1.add(new Position(4, 0));
        list1.add(new Position(5, 9));
        list1.add(new Position(6, 0));
        list1.add(new Position(7, 9));
        list1.add(new Position(8, 0));
        list1.add(new Position(9, 9));
        list1.add(new Position(9, 7));
        list1.add(new Position(9, 5));
        list1.add(new Position(9, 3));
        list1.add(new Position(9, 1));
        //list2
        list2.add(new Position(1, 1));
        list2.add(new Position(1, 4));
        list2.add(new Position(1, 7));
        list2.add(new Position(2, 2));
        list2.add(new Position(2, 5));
        list2.add(new Position(2, 8));
        list2.add(new Position(3, 3));
        list2.add(new Position(3, 6));
        list2.add(new Position(4, 1));
        list2.add(new Position(4, 4));
        list2.add(new Position(4, 7));
        list2.add(new Position(5, 2));
        list2.add(new Position(5, 5));
        list2.add(new Position(5, 8));
        list2.add(new Position(6, 3));
        list2.add(new Position(6, 6));
        list2.add(new Position(7, 1));
        list2.add(new Position(7, 4));
        list2.add(new Position(7, 7));
        list2.add(new Position(8, 2));
        list2.add(new Position(8, 5));
        list2.add(new Position(8, 8));
        //list3 
        list3.add(new Position(1, 3));
        list3.add(new Position(3, 1));
        list3.add(new Position(6, 8));
        list3.add(new Position(8, 6));
        //list4
        list4.add(new Position(1, 6));
        list4.add(new Position(2, 4));
        list4.add(new Position(2, 7));
        list4.add(new Position(3, 5));
        list4.add(new Position(3, 8));
        list4.add(new Position(4, 2));
        list4.add(new Position(4, 6));
        list4.add(new Position(5, 1));
        list4.add(new Position(5, 3));
        list4.add(new Position(5, 7));
        list4.add(new Position(6, 2));
        list4.add(new Position(6, 4));
        list4.add(new Position(7, 3));
        list4.add(new Position(7, 5));
        list4.add(new Position(8, 4));
    }
}
