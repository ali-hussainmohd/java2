package test2.Arrayofclass7_2;

public class Workout {
    private String name;
    private int sets,
                reps,
                time;

    public Workout() {
        this.name = "none";
        this.sets = 0;
        this.reps = 0;
        this.time = 0;
    }
    public void setWorkout(String name, int sets, int reps, int time) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public int getTime() {
        return time;
    }
    public static void findEffort(Workout list[]){
        for(int i =0; i < list.length ; i++){
            if( list[i].getReps()*
                list[i].getSets()*
                list[i].getTime() > 2000 )

                System.out.println(list[i].name);

        }//for
    }
}//class
