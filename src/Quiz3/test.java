package Quiz3;

public class test {
    public static void main(String[] args) {
        String s1=" java";
        String s2= "Java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.contains("ava"));
        System.out.println(s1.length());

        String c = "Hello i love java";
        boolean var;
        var = c.startsWith("hello");
        System.out.println(var);
        c.toLowerCase();

//        String obj = "I LIKE JAVA";
//        System.out.println(obj.charAt(3));
//
//        String str = "0123456789";
//        System.out.println(str.substring(4));
//
//        String word =" abrakadabra ";
//
//        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");
//
//        System.out.println(replace);
//        System.out.println(word.trim());
//
//        String str_Sample = "RockStar";
//        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
    }
}
