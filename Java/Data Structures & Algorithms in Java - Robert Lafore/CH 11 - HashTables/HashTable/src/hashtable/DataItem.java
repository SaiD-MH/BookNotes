package hashtable;

public class DataItem {

    private int Data;

    public DataItem(int d) {
        Data = d;
    }

    public void display() {
        System.out.println("Data: " + Data);
    }
    
    public int getKey(){
        return this.Data;
    }
}
