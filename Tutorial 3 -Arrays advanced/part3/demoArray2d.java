package problems.part3;

public class demoArray2d {
    public static void main(String[] args) {
        int list [][] = new int[3][4];

        //array2d obj =new  array2d(list);
        /*
1 2 3 4
5 6 7 8
2 5 6 9
         */
        //obj.print(list);
        //System.out.println("swap");
        //obj.swap(list);

        /*
2 3 4 6
9 8 6 2
6 8 7 6
5 2 3 4
         */
        int list2 [][] = new int[4][4];
        //array2d obj2 =new  array2d(list2);
        //obj2.diagonal(list2);
   //University of Success has four departments.
   // Each department receives five packages of books.
        int list3 [][] = new int[4][5];
        //array2d obj3 =new  array2d(list3);
        //        //obj3.Weight(list3);

     /*
2 3 2 1 2
5 8 2 9 3
7 2 4 1 2
3 4 6 8 1
      */
        int list4 [][] = new int[3][3];
        array2d obj4 =new  array2d(list4);
        obj4.magicSquare(list4);
        /*
4 3 8
9 5 1
2 7 6
         */


    }//main
}//class
