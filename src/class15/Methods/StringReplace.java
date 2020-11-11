package class15.Methods;

public class StringReplace {
    public static void main(String[] args) {
        String word= new String("welcome");
        System.out.println(word.replace('e', 'a'));



        String mix= "kjwgadgfwaejojqhfwoetoiftewogvjrgeoy******=+-///^jj";
        System.out.println(mix.replaceAll("[A-za-z0-9]", ""));
        System.out.println(mix.replaceAll("[^A-Za-z0=9]", "")); //

        String name= "Burcu Maria Qasim";

        String[] array= name.split("[A-Za-z]");


    }
}
