import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CarRegistrationTest2 {

    @Test
    public void testIsPreapproved() {
        // Test with a customer whose income can afford the car price
        CarRegistration customer1 = new CarRegistration(20000, 1, 3, "John", "Doe", "Male", 1985, "Teacher", 50000);
        assertTrue(customer1.isPreapproved());

        // Test with a customer whose income cannot afford the car price
        CarRegistration customer2 = new CarRegistration(20000, 1, 3, "Jane", "Doe", "Female", 1990, "Engineer", 30000);
        assertFalse(customer2.isPreapproved());
    }
    

    // Add more test cases for other methods if needed
}