package test2.Arrayofclass7_2;
import java.util.Scanner;
public class flatdemo {
    public static void main(String[] args) {
        //create array of class size 3
        flat list[] = new flat[3];
        Scanner read = new Scanner(System.in);
        for(int i=0;i < list.length;i++ ){
            //create for each obj a constructor
            list[i]=new flat();
            System.out.println("Enter noOfRoom, area and seaView : ");
            list[i].setFlat(read.nextInt(),read.nextDouble(),read.nextBoolean());

        }//for

        System.out.println("find flats = "+ flat.findFlats(list));


    }//main
}//class
