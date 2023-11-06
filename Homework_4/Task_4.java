package Homework_4;

import java.awt.print.Book;
import java.util.List;

public class Task_4 {
    // Класс BookService
    public static class BookService {
        private BookRepository bookRepository;

        public BookService(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        public List<Book> getAllBooks() {
            return bookRepository.getAllBooks();
        }

        public Book getBookById(int bookId) {
            return bookRepository.getBookById(bookId);
        }

        public void addBook(Book book) {
            bookRepository.addBook(book);
        }

        public void updateBook(Book book) {
            bookRepository.updateBook(book);
        }

        public void deleteBook(int bookId) {
            bookRepository.deleteBook(bookId);
        }
    }

    // Интерфейс BookRepository
    public interface BookRepository {
        List<Book> getAllBooks();
        Book getBookById(int bookId);
        void addBook(Book book);
        void updateBook(Book book);
        void deleteBook(int bookId);
    }
}
