package problems.part2;
public class Student {
        //name, id, gender and gpa
    private  String name;
    private  int id;
    private  char gender;
    private  double gpa;

    public Student(String name, int id, char gender, double gpa) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //[sorting] Write a static method named sortStudents
    // that takes as parameter an array of
    //students. The method sorts the array based on student
    // id in ascending order using selection
    //sort algorithm.
    //7.4
    public static void sortStudents(Student [] students){
        //general search /////////////////////////////
        for(int i=0; i < students.length ; i++){
            int min =i;
            boolean check=false;
        /////////////////////find the smallest id //////////////////////////
            for(int j=i+1; j < students.length ; j++) {
                if (students[min].getId() > students[j].getId()) {
                    min = j;
                    check=true;
                }//

            }//for j
            ///////////////////interchange////////////////////
            if(check){
                int temp= students[i].getId();
                students[i].setId(  students[min].getId()  );
                students[min].setId(  temp  );
            }

        }//for i

    }


    //[array as parameter of a method]
    // Write a static method named countOfProbation that
    //takes as parameter an array of students.
    // The method returns an integer representing the
    //number of students under probation
    // (that is students with gpa less than MINIMUM_GPA).
    public static int countOfProbation(Student [] students,
                                       //       fix number
                                       final double MINIMUM_GPA){
        int countProbation=0;

        for(int i=0; i < students.length ; i++) {
            if(students[i].getGpa() < MINIMUM_GPA)
                countProbation++;
        }//for
        return countProbation;
    }

    //[array returned by a method] Write a static method named listOfProbation
    // that takes as
    //parameter an array of students.
    // The method returns an array of students which are
    //students under probation only
    // (you may need to use the method countOfProbation in this
    //method).
    //             return array of Student[] Class
    public static  Student[] listOfProbation(Student [] students,
                                           //       fix number
                                           final double MINIMUM_GPA){

        Student[] listOfProbation=
                // call countOfProbation() in size
                new Student[   countOfProbation(students,MINIMUM_GPA)   ];

        for(int i=0,indexProbation=0 ; i < students.length ; i++,indexProbation++) {
            if(students[i].getGpa() < MINIMUM_GPA)
                listOfProbation[  indexProbation ] = students[i];

        }//for
    // return array of type Student Class
        return listOfProbation;
    }
    ///extra method for print the element
    public static void print(Student [] students){
        for(int i=0; i < students.length ; i++) {
            System.out.println(students[i].getId() + "\t"+ students[i].getName()+"\t"
                    +students[i].getGender()+"\t"+students[i].getGpa());
            //System.out.println("------------------------------------------------");
        }//for
    }
}//class
