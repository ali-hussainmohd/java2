package test2.Arrayofclass7_2;

public class flat {
    private int noOfRoom;
    private double area;
    private boolean seaView;

    public flat() {
        noOfRoom = 3;
        area = 200;
        seaView= true;
    }

    public void setFlat(int noOfRoom, double area, boolean seaView) {
        this.noOfRoom = noOfRoom;
        this.area = area;
        this.seaView = seaView;
    }

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }


    public static int findFlats(flat[] list){
        int count=0;
        for(int i=0; i < list.length; i++){
            if(list[i].getNoOfRoom() >= 3 && list[i].isSeaView()){
                count++;
            }//if


        }//for
       return count;
    }
}
