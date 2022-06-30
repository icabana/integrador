package com.example.integrador;

import com.example.integrador.repository.IBookRepository;
import com.example.integrador.repository.IUserRepository;
import com.example.integrador.service.ImpBookService;
import com.example.integrador.service.users.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class BookTest {

    @Test
    public void get_book_when_call_find_all(){

        ImpBookService impBookService;
        // Arrange
        IBookRepository iBookRepository = Mockito.mock(IBookRepository.class);
        impBookService = new ImpBookService(iBookRepository);

        // Act
        impBookService.findAllBook();

        // Assert
        verify(iBookRepository).findAll();

    }
    @Test
    public void get_book_x_id_when_call_find_id(){

        ImpBookService impBookService;
        // Arrange
        IBookRepository iBookRepository = Mockito.mock(IBookRepository.class);
        impBookService = new ImpBookService(iBookRepository);

        // Act
        impBookService.findByIdBook("1");

        // Assert
        verify(iBookRepository).findById("1");

    }

    @Test
    public void delete_user_when_call_delete(){
        ImpBookService impBookService;
        // Arrange
        IBookRepository iBookRepository = Mockito.mock(IBookRepository.class);
        impBookService = new ImpBookService(iBookRepository);

        // Act
        impBookService.findByIdBook("1");

        // Assert
        verify(iBookRepository).findById("1");


    }

}
