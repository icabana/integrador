package com.example.integrador;

import com.example.integrador.model.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    public void win_when_lotery_number_is_equal_number_player(){
        // Arrange
        User usuario = Mockito.mock(User.class);
      /*  Mockito.when(loteria.random()).thenReturn(200);
        Player player = new Player(200,loteria);

        // Act
        boolean playerResult = player.play();

        // Assert
        assertEquals(true,playerResult);

       */
    }
    @Test
    public void lost_when_lotery_number_is_equal_number_player(){
        // Arrange
      /*  Loteria loteria = Mockito.mock(Loteria.class);
        Mockito.when(loteria.random()).thenReturn(200);
        Player player = new Player(200,loteria);

        // Act
        boolean playerResult = player.play();

        // Assert
        assertEquals(false,playerResult);

       */
    }
}