package problems.part3;
import java.util.Scanner;
public class array2d {

    public array2d(int [][] a){
        Scanner read = new Scanner(System.in);
        System.out.println("enter value for 2d array 3 * 4 =");
        for(int i=0; i< a.length; i++ ){
            for(int j=0; j< a[0].length; j++ ){
                a[i][j]=read.nextInt();
            }
        }//row

    }

    public void swap(int [][] a){
        int temp [] = new int [4];
        for(int i=0,k=a.length-1; i< a.length; i++ ,k--){
            for(int j=0; j< a[0].length; j++ ){
                if(i==0)
                temp[j]=a[i][j];
                if(i==2)
                a[i][j]=temp[j];
                else
                a[i][j]=a[k][j];
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }//row
    }


    //[2-Dimentional array] Write a Java code that prints the main
    // diagonal contents of a square twodimensional
    //array arr of integer elements
    public void diagonal(int [][] a) {
        System.out.print("the diagonal =  ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j)
                    System.out.print(a[i][j] + "\t");
            }

        }//for i
        System.out.println();
    }

    //Weight in Kg Charge in BD
    //Less or equal to 5 5
    //Greater than 5 and Less or equal to 10 8 plus 10% of weight
    //Greater than 10 and Less than or equal to 30 12 plus 15% of weight
    //Greater than 30 20 plus 25% of weight

    public void Weight(int [][] a){
        System.out.printf("Package     1     2     3     4    5   Total  charge \n");
        for (int i = 0; i < a.length; i++) {
            double sumWeight=0,e=0;
            System.out.printf("Department %d",i+1);
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%10d",a[i][j]);
                    sumWeight+=a[i][j];
            }//for j
            if(sumWeight > 0 && sumWeight <=5)
            e=5;
            else if (sumWeight > 5 && sumWeight <=10)
                e=8+(sumWeight*0.1);
            else if (sumWeight > 10 && sumWeight <=30)
                e=12+(sumWeight*0.15);
            else if(sumWeight > 30)
                e=25+(sumWeight*0.25);

            System.out.printf("%10.2f %5.2f \n",sumWeight,e);

        }//for i
    }//weight
//[2-Dimentional array] A magic square is an n by n array in which each element
// is an integer
//between 1 and n*n and all column sums, row sums and diagonal sums are equal.
//For example, the following is a 3 by 3
// magic square in which each row, each column, and each
//diagonal adds up to 15.

    public void magicSquare(int [][] a){
        int sumRow [] = new int[a.length],
            sumColumn[] = new int[a[0].length],
            sumdiagonal=0;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sumColumn[i]+=a[i][j];
                sumRow[i]+=a[j][i];
                if(i==j)
                    sumdiagonal+=a[i][j];
            }//for j
            System.out.println("row = "+sumRow[i]);
            System.out.println("column = "+sumColumn[i]);

        }//for i
        //////////////////////////////
        int magic=0;
        for (int i = 0+1; i < a.length; i++){
            if(sumRow[i-1] != sumRow[i])
                magic++;
            if(sumColumn[i-1] != sumColumn[i])
                magic++;
            if(sumRow[i-1]!=sumColumn[i-1])
                magic++;
            if(sumColumn[i-1] != sumdiagonal)
                magic++;
            if(sumRow[i-1]!= sumdiagonal)
                magic++;
        }
        System.out.println("diagonal ="+sumdiagonal);
        System.out.println("magic = "+ magic);
        if(magic == 0 )
            System.out.println( "magical squre");
            else
            System.out.println(" not magical squre");

    }


    public void print(int [][]a){
        for(int i=0; i< a.length; i++ ){
            for(int j=0; j< a[0].length; j++ ){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }//row
    }
}//class
