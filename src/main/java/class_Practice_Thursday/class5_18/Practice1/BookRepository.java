package class_Practice_Thursday.class5_18.Practice1;

import java.awt.print.Book;
import java.util.*;

public class BookRepository {
    private static Map<Long, BookDomain> bookdata= new HashMap<>();
    private static Long idparameter=  0L;
//    @Override
    public BookDomain save(BookDomain bookdomain){
        bookdomain.setId(++idparameter);
        bookdata.put(bookdomain.getId(),bookdomain);
        return bookdomain;
    }
//    @Override
    public BookDomain findbyId(Long bookId){
        return bookdata.get(bookId);
    }
//    @Override
    public List<BookDomain> findAll(){
        return new ArrayList<>(bookdata.values());
    }
//    @Override
    public Optional<BookDomain> findByBookTitle(String BookTitle) {
        return bookdata.values().stream()
                .filter(BookDomain ->BookDomain.getTitle().equals(BookTitle))
                .findAny();
    }
}
