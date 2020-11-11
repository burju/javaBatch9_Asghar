package class20_Nov_8;
/*

Write program as a Book class   that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */
public class Book {
    String title;
    String author;
    boolean isFiction= true;

    Book(){
        this.title= title;
        this.author= author;
        System.out.println("============================================================================================================");
    }

    Book(String title,String author, boolean isFiction ){
        this();
        this.isFiction=isFiction;

        System.out.print(title+ " is writtten by: "+ author + " and the book is " );
        if( isFiction){
            System.out.println("a fiction");
        }
        else {
            System.out.println("not a fiction");
        }

    }

    public static void main(String[] args) {
        System.out.println(" the first constructor created:");
        Book b1= new Book();

        System.out.println("the second constructor created");
        Book b2 = new Book("The Warrior", "Dogan Cuceloglu", false );
    }

}

