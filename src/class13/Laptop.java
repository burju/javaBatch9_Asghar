package class14;

public class Laptop {

    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String CPU;

    void playMovies(){
        System.out.println("Playing movies");
    }
    void browseInternet(){
        System.out.println("making video calls");
    }
    public String getModel(){return model; }

    void makeVideoCall(String contact){
        System.out.println("Video calling"+ contact);
    }
    int upgradeRAMCapacity(){return RAMCapacity*2;}
}
