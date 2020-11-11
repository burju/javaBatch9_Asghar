package class15.Methods;

public class StringBuilderClasses {
    public static void main(String[] args) {
        // same as sentence classes but it's mutable

        StringBuilder stringBuilder= new StringBuilder("Hello");
        stringBuilder.append(" world");
        String sentence="Hello";
        String sentence2="Hello";
        sentence.concat("World");
        System.out.println(sentence);
        System.out.println(stringBuilder);

        // string vs String Buffer and String Builder

    }
}
