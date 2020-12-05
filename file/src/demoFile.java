package fileInOut;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class demoFile {
    public static void main(String[] args)  {
  //Write a java program to read from a file called “treeList.txt”.
        // The file includes tree height, and tree age for unknown number of trees.
        // The file use a comma separated file format, as the sample below.
        // The program should write old trees only
        // into an output file called “oldTrees.txt”.
        // A tree is considered old if its height is above 120
        // and its age is greater than 5 years. Finally print number of
        // old trees at the end of the output file and
        // format the output file to be similar to the given sample.
        try {
            Scanner Fin = new Scanner(new File("treeList.txt"));
            PrintWriter Fout = new PrintWriter("oldTrees.txt");
            Fout.printf("Tree Height   Age \n");
            int oldCount=0,count=1;
            while(Fin.hasNext()){
                String line = Fin.next(),
                        arr [] = line.split(",");
                double hight = Double.parseDouble(arr[0]);
                int age = Integer.parseInt(arr[1]);
                if(hight > 120 && age > 5){
                    oldCount++;
                Fout.printf("%s.   %.3f  %d \n",count++,hight,age);
                }
            }//while
            Fout.printf("Number of old trees = %d.",oldCount);
            Fin.close();
            Fout.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        } //main
}//class
