package class21_Nov_10.Moneer;

public class MoneerClass extends ParentClass {
    MoneerClass(int money) {
        super(money);
    }
    void marry() {
        super.marry();
        System.out.println("i will marry katrina ok go mary her her is the money " + super.money);
    }
    public static void main(String[] args) {
        MoneerClass moneerClass = new MoneerClass(1000);
        moneerClass.marry();
    }
}
