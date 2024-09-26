import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import com.example.NotificationService;
import com.example.PasswordValidator;
public class PasswordValidatorTest {
    @Test
    public void testValidatorPasswordLengthAndUppercase() {
        // Arrange
        NotificationService myNotificationService = new NotificationService();
        PasswordValidator myPasswordValidator = new PasswordValidator(myNotificationService);
        
 
        // Act
        boolean result = myPasswordValidator.isValidPassword("Contrasena");
 
        // Assert
        assertTrue(result); // This test will fail initially
    }

    @Test
    public void testValidatorPasswordNotification() {
        /// Arrange: Create a mock of NotificationService
        NotificationService mockNotificationService = mock(NotificationService.class);
       
        //Act creating a password validator and introducing a password
        PasswordValidator myPasswordValidator = new PasswordValidator(mockNotificationService);
        boolean result = myPasswordValidator.isValidPassword("contrasena");
 
        // Assert
        verify(mockNotificationService).sendNotification("Your password is: contrasena");
    }
    

}
