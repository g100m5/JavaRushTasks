package com.javarush.task.task21.task2113;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    static Hippodrome game ;




    Hippodrome(List horses) {

        this.horses = horses;

    }

    public Hippodrome(Horse h1, Horse h2, Horse h3) {
    }

    public void move() {

        int horse_count = horses.size();

        for (int x = 0; x < horse_count; x++) {
            horses.get(x).move();
        }


    }
    public void print() {
        int horse_count = horses.size();

        for (int x = 0; x < horse_count; x++) {
            horses.get(x).print();
        }

        for (int u = 0; u < 10; u++) {

            System.out.println();

        }

    }


    public void run() throws InterruptedException {

        for(int x = 0; x < 100; x++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public Horse getWinner() {
        Horse winner = getHorses().get(0);

        for( int o = 1; o <= getHorses().size() - 1; o++) {

            if (getHorses().get(o).getDistance() > getHorses().get(o - 1).getDistance()) {

                winner = getHorses().get(o);

            }


        }



        return winner;

    }


    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }





    public static void main(String[] args) throws InterruptedException {

        Horse h1 = new Horse("One", 3 , 0);

        Horse h2 = new Horse("Two", 3 , 0);

        Horse h3 = new Horse("Three", 3 , 0);

        List horse1 = new ArrayList<Horse>();
        horse1.add(h1);
        horse1.add(h2);
        horse1.add(h3);
        game = new Hippodrome(horse1);

        game.run();

        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
