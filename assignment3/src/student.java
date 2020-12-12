package assigment;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        //Suppose you are given a text file “students.txt”
        // that contains the data of students.
        // Every line in the file is composed by the first name,
        // the last name, the score of the test1,
        // the score of the test2 and the grade of the final.
        //Write a program that:
        //a. Read the file “student.txt”
        //b. Create a new file named “Result.txt”.
        // Write in this file the list of the admitted students
        // (total score >= 60). Each line should contain,
        // the first Name, Last Name,
        // the total score and the string “PASS”.
        //The total score is calculated as the following:
        // total= Test1*0.2+Test2*0.2+Final*0.6
        try{
        Scanner fin = new Scanner(new File("student.txt"));
        PrintWriter fout = new PrintWriter("Result.txt");
        fin.nextLine();
        while(fin.hasNext()){
            String line = fin.nextLine();

            String arr[]=line.split(" ");
            double test1 = Double.parseDouble(arr[2]),
                test2 = Double.parseDouble(arr[3]),
                finalTest = Double.parseDouble(arr[4]),
                    total = test1*0.2+test2*0.2+finalTest*0.6;
            //System.out.printf("%.2f \t %.2f \t %.2f\n",test1,test2,finalTest);
            if(total>= 60){
                fout.printf("%S,%s,%.1f,%S\n",arr[0],arr[1],total,"pass");
            }

        }

        fin.close();
        fout.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }//main
}//class
