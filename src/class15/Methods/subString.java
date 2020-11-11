package class15.Methods;

public class subString {

    public static void main(String[] args) {
        String name="Can you write the second m too? " ;
        System.out.println(name.substring(5)); // will ignore everything before the index 5
        System.out.println(name.substring(5,10));//5'ten 10 a kadar olanlar(10 dahil basilacak.
        System.out.println(name.indexOf('s')+ "& " + name.indexOf('d'));
        System.out.println(name.substring(18,24));
    }
}
