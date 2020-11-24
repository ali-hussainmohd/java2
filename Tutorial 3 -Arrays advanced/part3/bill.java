package problems.part3;

public class bill {
    private  long  id;
    private double itemPrice[];
    //int array [] = new int[10];
    private  String itemName[];
    private int numItems;

    public bill(long id) {
        this.id = id;
        //create array to size 10
        itemPrice = new double[10];
        itemName = new String[10];
        numItems = 0;
    }

    public void addItem(String n,double p){
        if(numItems != 10) {
            itemName[numItems] = n;
            itemPrice[numItems++] = p;
        }//if
        else
        System.out.println("the array is full");
    }

    public double getTotalBill(){
        double sum=0;

        for(int i=0; i < itemPrice.length ; i++)
            sum +=itemPrice[i];// only this in loop

        return sum;
    }

    public void print(){
        for(int i=0; i < numItems ; i++)
        {
            System.out.println("name = "+ itemName[i] + "\t price ="+itemPrice[i]);
        }//for
    }

    public int getNumItems() {
        return numItems;
    }
}//class
