package arrayofobject;
import java.util.Scanner;
public class Booksexample {
    public static void main(String[] args) {
        Book books[] = new Book[2];// array of object
       Scanner s = new Scanner(System.in);
        for(int i=0;i<books.length;i++) {
            Book b1 = new Book();
            System.out.println(" enter the name of the book:");
           b1.name = s.next();
            b1.price=s.nextInt();
            books[i]=b1;

        }
        for(Book bk: books){
            System.out.println(bk);
        }


//        b1.name="richandpoordad";
//        b1.price=890;
//        books[0]=b1;
//        System.out.println("THE  details of the book is :"+books[0]);
    }
}
class Book{
    String name;
    int price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
