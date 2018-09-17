package dicerollingsimulator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jeffkim
 */

public class DiceRollingSimulator {
    /** DICE ROLLING SIMULATOR
     TAKE THE SIX SIDES OF A DICE
     USE PROBABILITY TO ROLL THE DICE
     ROLL THE DICE 1000 TIMES
     RECORD THE RESULTS IN A TABLE */

    int face_1_frequency = 0;
    int face_2_frequency = 0;
    int face_3_frequency = 0;
    int face_4_frequency = 0;
    int face_5_frequency = 0;
    int face_6_frequency = 0;

    public void roll(){

        for (int x = 0; x < 1000; x++) {
            System.out.println("This is round: " + x);

            int dots_face_1 = 3;
            int dots_face_2 = 6;
            int dots_face_3 = 4;
            int dots_face_4 = 5;
            int dots_face_5 = 1;
            int dots_face_6 = 2;

            double rand  = Math.random();

            if (rand >= 0 && rand < (1.0/6.0)){
                face_1_frequency += 1;
                System.out.println("This is face 1 and has "+dots_face_1+ " dots \nAnd has appeared " +face_1_frequency + " times\n" );
            }else if (rand >= (1.0/6.0) && rand < (2.0/6.0)){
                face_2_frequency += 1;
                System.out.println("This is face 2 and has "+dots_face_2+ " dots \nAnd has appeared " +face_2_frequency + " times\n" );
            }else if(rand >= (2.0/6.0) && rand < (3.0/6.0)){
                face_3_frequency += 1;
                System.out.println("This is face 3 and has "+dots_face_3+ " dots \nAnd has appeared " +face_3_frequency + " times\n" );
            }else if(rand >= (3.0/6.0) && rand < (4.0/6.0)){
                face_4_frequency += 1;
                System.out.println("This is face 4 and has "+dots_face_4+ " dots \nAnd has appeared " +face_4_frequency + " times\n" );
            }else if(rand >= (4.0/6.0) && rand < (5.0/6.0)){
                face_5_frequency += 1;
                System.out.println("This is face 5 and has "+dots_face_5+ " dots \nAnd has appeared " +face_5_frequency + " times\n" );
            }else if (rand >= (5.0/6.0) && rand < (6.0/6.0)){
                face_6_frequency += 1;
                System.out.println("This is face 6 and has "+dots_face_6+ " dots \nAnd has appeared " +face_6_frequency + " times\n" );
            }
        }
        display();
    }

    public void display(){
        double rounds = 1000;
        double percent = 100;

        double face_1_percentage =(face_1_frequency / rounds) * percent;
        double face_2_percentage = (face_2_frequency / rounds) * percent;
        double face_3_percentage =(face_3_frequency / rounds) * percent;
        double face_4_percentage =(face_4_frequency / rounds) * percent;
        double face_5_percentage =(face_5_frequency / rounds) * percent;
        double face_6_percentage =(face_6_frequency / rounds) * percent;

        int total_frequency = face_1_frequency + face_2_frequency + face_3_frequency + face_4_frequency + face_5_frequency + face_6_frequency;
        double total_percentage = face_1_percentage + face_2_percentage + face_3_percentage + face_4_percentage + face_5_percentage + face_6_percentage;

        System.out.println("The Resultant table shows face, frequency and percentage." +
                "\n\nFACE\tFREQUENCY\tPERCENTAGE"
                + "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        System.out.printf(" 1\t\t%d\t\t\t%.2f \n 2\t\t%d\t\t\t%.2f \n 3\t\t%d\t\t\t%.2f "
                        + "\n 4\t\t%d\t\t\t%.2f \n 5\t\t%d\t\t\t%.2f \n 6\t\t%d\t\t\t%.2f " ,
                face_1_frequency , face_1_percentage,
                face_2_frequency , face_2_percentage,
                face_3_frequency , face_3_percentage,
                face_4_frequency , face_4_percentage,
                face_5_frequency , face_5_percentage,
                face_6_frequency , face_6_percentage);
        System.out.printf("\n\nTotal Frequency\n%d \t \n\nTotal Percentage\n%.2f \n", total_frequency, total_percentage);
    }

    public static void main(String[] args) {
        DiceRollingSimulator my_dice = new DiceRollingSimulator();
        my_dice.roll();
    }

}
