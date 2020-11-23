package problems.part1;

public class array {

    //A method named sumEven that accepts as parameter an array of integers
    // named a1. The
    //method returns the sum of all even numbers in the array a1.
    public static int sumEven(int[] a1){
        int sum=0;
        for(int i=0 ; i< a1.length; i++){
            if(a1[i]%2==0)
                sum+=a1[i];
        }//for
        return sum;
    }//sumEven

    //A method named averageNegative that accepts as parameter an
    // array of doubles named
    //list. The method returns the average
    // of all negative numbers in the array list.

    public static double  averageNegative( double [] list){
        double sumNegitive=0;
        int countNegitive=0;
        for(int i=0 ; i< list.length; i++){
            if(list[i]< 0) {
                sumNegitive += list[i];
                countNegitive++;
            }
        }//for
        return sumNegitive/countNegitive;
    }

    //A method named countTens that accepts as parameter an array
    // of students’ scores, named
    //scores. The method returns the count of full mark scores
    // , where scores are out of 10.

    public static int countTens(double [] scores){
        int countFullMark=0;
        for(int i=0 ; i< scores.length; i++){
            if(scores[i]==10)
                countFullMark++;
        }
        return countFullMark;
    }

    //A method named countCharacter that accepts as parameter
    // an array of characters named list and a character named ch.
    // The method returns the count of elements that have the
    //value of ch in the array list.
    public static int countCharacter(char [] list, char ch){
        int countCh=0;
        for(int i=0 ; i< list.length; i++){
            if(list[i]==ch)
                countCh++;
        }//for

        return countCh;
    }

    //A method named maxOdd that accepts as parameter
    // an array of positive integers named
    //a1. The method returns the value of the maximum odd number in the array a1.
    // In case the
    //array contains no odd numbers the method should return -1.
    public static int maxOdd(int[] a1){
        int max=0;
        for(int i=0 ; i< a1.length; i++){
            //          max              odd
            if(a1[i] > a1[max] &&  a1[i]%2 ==1 )
                max=i;
            }
            if(a1[max]%2==0)
                return -1;
            else
                return a1[max];
    }

    //A method named minPositive that accepts as parameter an
    // array of doubles named list. The
    //method returns the index of the smallest positive number in the array list.
    // If the array
    //contains no positive numbers the method should return -1.

    public static int minPositive(double [] list) {
        int min = 0;

        for (int i = 0; i < list.length; i++) {
            //          positive             min
            if (list[i] > 0 && list[i] < list[min])
                min=i;
        }//for
        if(list[min]< 0)
            return -1;
        else
            //only min index
            return min;
    }//minPositive

    //A method named containNegative that accepts as
    // parameter an array of integers named
    //list. The method returns true if the array list contains negative values,
    // or it returns false,
    //otherwise.
    public static boolean containNegative(int [] list){
        int countNegitive=0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]< 0)
                countNegitive++;
        }//for

        return ! (countNegitive ==0);
    }

    //A method named allLessThan30 that accepts as parameter an
    // array of doubles named scores.
    // The method returns true if all the values saved in the array scores
    // are less than or equal to 30,
    // or it returns false, otherwise.

    public static boolean allLessThan30(double [] scores){
        int count30sorGraters=0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= 30)
                count30sorGraters++;
        }//for
        return count30sorGraters == scores.length;
    }

    //A method named containLessThan that accepts as
    // parameter an array of doubles named scores and a single score s.
    // The method returns true if the array scores have at least one
    //score which is less than the value of s, or it returns false, otherwise.

    public static boolean containLessThan(double [] scores , double score ){
        int countScoreLess=0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]< score)
                countScoreLess++;
        }//for

      return !(countScoreLess == 0);
    }

    //A method named containVowel that accepts as parameter an
    // array of characters named
    //list.
    // The method returns true if the array list contains at least one
    // (lower case or upper case)
    //vowel, or it returns false, otherwise.
    //Where vowels are ‘a’, ‘e’, ‘i’, ‘o’ and ‘u’.

    public static boolean containVowel(char [] list){
        int countVowels=0;
        for (int i = 0; i < list.length; i++) {
            switch (list[i]){
                //if(list[i] == 'a' || list[i] == 'A')
                case 'a':
                case 'A': countVowels++; break;
                case 'e':
                case 'E': countVowels++; break;
                case 'i':
                case 'I': countVowels++; break;
                case 'o':
                case 'O': countVowels++; break;
                case 'u':
                case 'U': countVowels++; break;

            }//switch
        }//for
        return countVowels != 0;
    }

}//class
