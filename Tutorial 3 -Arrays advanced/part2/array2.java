package problems.part2;

public class array2 {
    //3. [searching] Write a java static method named find that
    // accepts as parameter an array named list of
    //array named list of string elements and a string name.
    // The method returns the index of the first occurrence of name in
    //the array list.
    //7.4
    public static int find (String [] list, String name) {

        for(int i =0; i < list.length ; i++){
            if(list[i].equals(name)){
                return i;
            }
        }//for
       return -1;

    }//find
//[searching] Write a java static method named searchPrime
// that accepts as parameter an array
//named numbers of integer elements and
// return the index of the last prime number in the array numbers.
    public static int searchPrime(int [] numbers ){
        int prime=0;

            for(int i = 0; i < numbers.length ; i++) {
                int isPrime=0;
                for(int j =2; j <10 ; j++){
                if(numbers[i]!=j && numbers[i]%j==0)
                    isPrime++;
                }//for j
                if(isPrime == 0 &&  numbers[i] > prime)
                    prime=i;

            }//for i
    return numbers[prime];
    }//searchPrime

//[arrays with methods] Write a java static
// method named fun that accepts an array named art
//of double elements and produces and return another array named arc such that:
// arc[i] equals half the value of art[i], if art[i] is odd
// arc[i] equals twice the value of art[i], if art[i] is even
    public static double[] fun(double [] art){
        double arc[]= new double[art.length];
        for(int i=0; i < art.length; i++){
            //if art[i] is odd
            if(art[i]%2!=0)
                arc[i]=art[i]/2;
            else
                arc[i]=art[i]*2;
        }//for
        return arc;
    }

    public static void print(double [] list ){
        for(int i=0; i < list.length; i++){
            System.out.print(list[i] +"\t");
        }
        System.out.println();
    }//print

}//class
