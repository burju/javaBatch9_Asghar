package class15.Methods;

public class charAt_indexOf {

    public static void main(String[] args) {
        String name= "Mohammad";
        System.out.println("length of name:"+ name.length());
        System.out.println("0th charachter of the name:"+ name.charAt(0));
        System.out.println("the first occurrance of m:"+ name.indexOf('m'));

        //TASK:Print all the occurance of Ms
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.indexOf('m'));
        }

    }
}
