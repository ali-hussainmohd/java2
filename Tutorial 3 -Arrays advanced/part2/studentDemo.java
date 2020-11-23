package problems.part2;
import java.util.Scanner;
public class studentDemo {
    public static void main(String[] args) {
        //Create an array of type Student named students of size 5.
        // Ask the user to enter name, id,
        // gender and gpa for the 5 students. Create objects of
        //Student class type and set its data members’
        // values using the input data. And put each
        //in the array students.
        Student students [] = new Student[5];

        Scanner read = new Scanner(System.in);
 /*
fff 2001 m 2.5
ddd 2000 f 2.6
ggg 1999 m 3.5
ttt 2010 f 4.0
rrr 1990 m 4.0 */
        System.out.println("enter name, id, gender and gpa 5:");
        for(int i=0; i < students.length ; i++){

            //public Student(String name, int id, char gender, double gpa)
            students[i]=new Student(read.next(),read.nextInt(),
                    read.next().charAt(0),read.nextDouble());
        }//for

        //Student.print(students);
       // Student.sortStudents(students);
        //System.out.println("after sort = ");
        //Student.print(students);
        System.out.println("length = "+
                Student.countOfProbation(students,3.0));

        if(Student.countOfProbation(students,3.0) !=0) {
            Student probation[] = Student.listOfProbation(students, 3.0);
            Student.print(probation);
            //Student.print(   Student.listOfProbation(students,3.0)  );
        }//if
    }//main
}//class
