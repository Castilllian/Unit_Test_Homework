package Homework_4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TestForTask_4 {

    @Mock
    private Task_4.BookRepository bookRepository;

    private Task_4.BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bookService = new Task_4.BookService(bookRepository);
    }

    @Test
    void testGetAllBooks() {
        // Arrange
        List<Book> expectedBooks = Arrays.asList(
                new Book());
        when(bookRepository.getAllBooks()).thenReturn(expectedBooks);

        // Act
        List<Book> actualBooks = bookService.getAllBooks();

        // Assert
        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    void testGetBookById() {
        // Arrange
        int bookId = 1;
        Book expectedBook = new Book();
        when(bookRepository.getBookById(bookId)).thenReturn(expectedBook);

        // Act
        Book actualBook = bookService.getBookById(bookId);

        // Assert
        assertEquals(expectedBook, actualBook);
    }

    @Test
    void testAddBook() {
        // Arrange
        Book book = new Book();

        // Act
        bookService.addBook(book);

        // Assert
        verify(bookRepository, times(1)).addBook(book);
    }

    @Test
    void testUpdateBook() {
        // Arrange
        Book book = new Book();

        // Act
        bookService.updateBook(book);

        // Assert
        verify(bookRepository, times(1)).updateBook(book);
    }

    @Test
    void testDeleteBook() {
        // Arrange
        int bookId = 1;

        // Act
        bookService.deleteBook(bookId);

        // Assert
        verify(bookRepository, times(1)).deleteBook(bookId);
    }
}


