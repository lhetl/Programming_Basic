package class_Practice_Thursday.class5_18.Practice1;
import java.util.Scanner;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    public BookDomain valueSet(int id,String title, String author){
        BookDomain bookDomain = new BookDomain();
        bookDomain.setId(Long.valueOf(id));
        bookDomain.setTitle(title);
        bookDomain.setAuthor(author);
        return bookDomain;
    }
    public static void main(String[] args){
        int id;
        String title,author;
        Scanner sc = new Scanner(System.in);
        id=sc.nextInt();
        title=sc.nextLine();
        author=sc.nextLine();
//        bookService.make(valueSet(id,title,author));
    }
}
