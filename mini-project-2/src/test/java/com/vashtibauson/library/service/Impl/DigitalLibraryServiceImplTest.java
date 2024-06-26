package com.vashtibauson.library.service.Impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vashtibauson.library.Main;
import com.vashtibauson.library.model.EBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalLibraryServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(DigitalLibraryServiceImpl.class);
    // Instance of the class being tested
    private DigitalLibraryServiceImpl digitalLibraryService;

    // Setup model to initialize objects before each test
    @BeforeEach
    void setUp() {
        digitalLibraryService = new DigitalLibraryServiceImpl();
        logger.info("Setting completed.");
    }

    // Test model for adding an eBook
    @Test
    void addEBook() {
        // Create a new EBook object
        EBook eBook = new EBook("E-Book", "E-Book1", "George Orwell", 789012, 5.5, "PDF");

        // Add the eBook to the digital library
        digitalLibraryService.addEBook(eBook);
        logger.info("Added E-book: {}",eBook);

        // Verify that the eBook list size is now 1
        assertEquals(1, digitalLibraryService.eBookList.size());
        logger.info("E-Book List: {}",digitalLibraryService.eBookList.size());

        // Verify that the title of the first eBook in the list is "E-Book1"
        assertEquals("E-Book1", digitalLibraryService.eBookList.get(0).getTitle());
        logger.info("Checking E-book Title: {}",digitalLibraryService.eBookList.get(0).getTitle());
        
    }

    // Test model for deleting an eBook
    @Test
    void deleteEBook() {
        // Create a new EBook object
        EBook eBook = new EBook("E-Book", "Harry Potter: Goblet of Fire", "JK Rowling", 456789, 8, "TXT File");

        // Add the eBook to the digital library
        digitalLibraryService.addEBook(eBook);

        // Delete the eBook with the specified ISBN
        digitalLibraryService.deleteEBook(456789);

        // Verify that the eBook list size is now 0
        assertEquals(0, digitalLibraryService.eBookList.size());
    }

    // Test model for searching an eBook by title
    @Test
    void searchEBook() {
        // Create a new EBook object
        EBook eBook = new EBook("E-Book", "E-Book2", "Juan Dela Cruz", 345786, 5.5, "PDF");

        // Add the eBook to the digital library
        digitalLibraryService.addEBook(eBook);

        // Search for the eBook with the specified title
        digitalLibraryService.searchEBook("E-Book2");

        // Verify that the title of the first eBook in the list is "E-Book2"
        assertEquals("E-Book2", digitalLibraryService.eBookList.get(0).getTitle());
    }
}
