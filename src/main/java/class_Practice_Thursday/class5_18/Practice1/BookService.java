package class_Practice_Thursday.class5_18.Practice1;

import java.awt.print.Book;
import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void make(BookDomain bookDomain) {
        validateDuplicateBookTitle(bookDomain);
        bookRepository.save(bookDomain);
    }

    //중복 가입 방지
    private void validateDuplicateBookTitle(BookDomain bookDomain) {
        bookRepository.findByBookTitle(bookDomain.getTitle())
                .ifPresent( m -> {
                    throw new IllegalStateException("이미 존재하는 제목입니다.");
                });
    }

    public BookDomain findBook(Long bookId) {
        return bookRepository.findbyId(bookId);
    }

    public List<BookDomain> findAllBook() {
        return bookRepository.findAll();
    }
}
