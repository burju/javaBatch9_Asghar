package class14;

public class Laptop_Test {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.make = "Mac";
        laptop1.model= "pro 16";
        laptop1.storage=1;
        laptop1.RAMCapacity= 16;
        laptop1.color= "pink";
        laptop1.processor="core i7";
        laptop1.playMovies();
        laptop1.browseInternet();
        laptop1.makeVideoCall("Ayse");
        String model= laptop1.getModel();
        System.out.println(model);
        System.out.println(laptop1.upgradeRAMCapacity());
    }

}