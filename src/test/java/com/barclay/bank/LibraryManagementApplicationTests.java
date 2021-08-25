package com.barclay.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.barclay.bank.entity.Book;
import com.barclay.bank.service.BookService;

@SpringBootTest
class LibraryManagementApplicationTests {

		@Mock
		private BookService service;

		@Test
		public void testdoCalculation() {
			Book book = new Book();
			book.setName("Book1");
			Mockito.when(service.findBookByName(Mockito.anyString())).thenReturn(book);
			Book bookRes = service.findBookByName("Book1");
			assertEquals("Book1",bookRes.getName());
			
		}
}
