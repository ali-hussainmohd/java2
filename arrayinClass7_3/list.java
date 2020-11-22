package test2.arrayinClass7_3;

public class list {
    private int mylist[];// int my list = new int[];
    private int currentSize;

    public list(){
       currentSize =0;
       mylist= new int[100];
    }

    public void insert(int x){
        if(currentSize != mylist.length && !(contains(x)))
        mylist[currentSize++]=x;


    }

    public boolean contains(int x){
        for(int i =0 ; i < currentSize; i++){
            if(mylist[i] == x)
                return true;
        }
        return false;
    }

    public void insertX(int x){
        for(int i =0 ; i < currentSize; i++) {
            if ((mylist[i] == x))
                return;
        }
        if(currentSize != mylist.length )
            mylist[currentSize++]=x;
    }

    public void print(){
        for(int i =0 ; i < currentSize; i++) {
            System.out.print(mylist[i] + "\t");
        }
    }

    public int getCurrentSize() {
        return currentSize;
    }
}//class
