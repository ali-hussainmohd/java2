package test2.Arrayofclass7_2;

import java.util.Scanner;

public class demoWorkout {
    public static void main(String[] args) {
        Workout list[]= new Workout[3];
        Scanner read = new Scanner(System.in);
        for(int i =0; i < list.length ; i++){
            list[i]= new Workout();
            System.out.println("Enter name reps ,set and times");
            list[i].setWorkout(read.next(),read.nextInt(),read.nextInt(),read.nextInt());
        }//for
        Workout.findEffort(list);


    }//main
}//class
