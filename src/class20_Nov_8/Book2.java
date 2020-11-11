package class20_Nov_8;

public class Book2 {

    String author;
    String title;
    int numberOfPages;
    int copiesSold;

    Book2(String author, String title){
        this.author=author;
        this.title=title;
        }
        Book2(String author, String title, int numberOfPages){
        this(author, title);
        this.numberOfPages= numberOfPages;
        }
    Book2(String author, String title, int numberOfPages, int copiesSold){
        this(author, title, numberOfPages);
        this.copiesSold =copiesSold;
    }
    void print(){
        System.out.println(title + " By the author: "+ author + " has "+ numberOfPages + "pages & number of copies sold: "+ copiesSold);
    }

    public static void main(String[] args) {
        Book2 b1=new Book2("Marry Shelly", "Dracula", 333);
        Book2 b2= new Book2("Ayse Yilmaz", "Frankestein", 292, 22 );
        b1.print();
        b2.print();
    }

}


