package problems.part3;

public class demoBill {
    public static void main(String[] args) {
        int [][] list = new int [2][4];
        System.out.println("int [][] list = new int [2][4]; ");
        System.out.println("list.length = "+list.length);
        System.out.println("list[0].length = "+list[0].length);
        bill obj = new bill(2010);
        obj.addItem("table1",200);
        obj.addItem("table2",250);
        obj.addItem("table3",240);
        obj.addItem("table4",210);
        obj.addItem("table5",230);

        obj.print();
        System.out.println("number of items ="+obj.getNumItems());
        System.out.println("total price ="+obj.getTotalBill());

    }//main
}//class
