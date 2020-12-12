package assigment;

import java.io.File;
import java.util.Scanner;

public class Book {
    //Suppose you are given a text file “Books.txt”
    // that contains the data of a list of available books.
    // Every line in the file is composed by the Title, the author,
    // year of publication and the price of one book.
    //Create a class Book composed that contains the following attributes:
    //•	Title
    //•	Author
    //•	year
    //•	price
    private String Title,Author;
    private int year;
    private double price;
    private static int count=0;
    //Additionally, the class student contains:
    //1.	A constructor defined with 4 parameters to
    // initialize the attributes of an object of type book.

    public Book(String title, String author, int year, double price) {
        Title = title;
        Author = author;
        this.year = year;
        this.price = price;
    }

    //2.	4 accessors methods respectively, for each attribute.

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    //1-	Write a method that returns an array of type Book.
    // The method takes as parameter a name of a file,
    // fills an array of type Book and return it.
    public static Book[] checkBook(File file){

        //Book book[]=null ;
        Book book[] = new Book[100];
        try{
            //int arraySize=0;
        Scanner readFile = new Scanner(file);
            //while(readFile.hasNext()){arraySize++;}
            //book = new Book[arraySize];
        while(readFile.hasNext() && count < book.length){
            String line = readFile.nextLine();
            String arr[]=line.split(",");
            //public Book(String title, String author, int year, double price)
            book[count]=new Book(arr[0],arr[1],
                    Integer.parseInt(arr[2]) ,
                    Double.parseDouble(arr[3]));
            count++;
        }

        readFile.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return book;
    }
}//class
