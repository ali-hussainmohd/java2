package assigment;

import java.io.File;
import java.io.PrintWriter;

public class demoBook {
    public static void main(String[] args) {
        Book newyear[] = Book.checkBook(new File("Books.txt"));
        //b.	Create a new file named “Result.txt”.
        // Write in this file the list of the books with year greater to 2010.
        // Each line should contain, the title and the year.

        try {
            PrintWriter fout = new PrintWriter("Result.txt");
           // for(int i =0; i< newYear.length;i++)

            for(int i =0; i< Book.getCount();i++)
            {

                if(newyear[i].getYear() > 2010)
                    fout.println(newyear[i].getTitle()+","+newyear[i].getYear());
            }
            fout.close();
        }catch (Exception e){
            System.out.println("catch");
            System.out.println(e.getMessage());
        }
    }//main
}//class
