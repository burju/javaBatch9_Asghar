package class14;

public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        String name="Marta";
        String name2=" MARTA";
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name2.equalsIgnoreCase(name));

    }

}
