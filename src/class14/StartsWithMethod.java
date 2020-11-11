package class14;

import javax.xml.transform.sax.SAXSource;

public class StartsWithMethod {
    public static void main(String[] args) {
        String var = "maybe you can give a real life " ;
        System.out.println(var.startsWith("real"));
        System.out.println(var.startsWith("naybe"));

    }

}
