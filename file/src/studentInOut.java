package fileInOut;

import java.io.PrintWriter;
import java.util.Scanner;

public class studentInOut {
    public static void main(String[] args) {
        //Write a Java program that asks the user to enter the ID and name of 30 students.
        // The program should write the students’
        // data (ID and name) into a file named “Student.txt”
        // as comma separated lines. However, the file should not
        // include redundant IDs, i.e. if the user enters an ID that is
        // already in the file, then the ID should not be added again.
        //Hint: you may use an array to store students’ IDs.
        // Before adding any new ID,
        // you should check first if it already exists in the array or not.

        /*
20161234 Ahmed
20169874 Mohammed
20161234 Khalid
20166541 Eman
20186547 Ali
20199987 Mohd
         */
        try {
            PrintWriter fout = new PrintWriter("student2.txt");
            Scanner read = new Scanner(System.in);
            int arrId []= new int[3];
            for(int i = 0; i < arrId.length; i++){
                System.out.print("Enter St ID and Name:");
                int id= read.nextInt();
                String name = read.next();
                boolean check= true;
                if(i ==0 )
                    arrId[i]=id;
                else{
                    for(int j=0 ; j < i; j++)
                    {
                        if(arrId[j]==id)
                        {
                            System.out.println("Sorry, ID Already Exist");
                            i--;
                            check =false;
                            continue;
                        }//if
                        else {
                            arrId[i]=id;

                        }
                    }//for j

                }//else
                if(check)
                fout.println(id+","+name);

            }//for i
            fout.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//main
}//class
