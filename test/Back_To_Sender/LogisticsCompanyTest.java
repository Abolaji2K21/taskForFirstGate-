package Back_To_Sender;

import Exceptions.InvalidDeliveriesException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogisticsCompanyTest {

    @Test
    public void testNegativeDeliveries() {
        int successfulDeliveries = -10;
        assertThrows(InvalidDeliveriesException.class,() ->LogisticsCompany.calculateWage(successfulDeliveries));
    }

    @Test
    public void testZeroDeliveries() {
        int successfulDeliveries = 0;
        int expectedWage = (0 + 5000);
        assertEquals(expectedWage, LogisticsCompany.calculateWage(successfulDeliveries));
    }

    @Test
    public void testLessThanFiftyPercent() {
        int successfulDeliveries = 40;
        int expectedWage = 40 * 160 + 5000;
        assertEquals(expectedWage, LogisticsCompany.calculateWage(successfulDeliveries));
    }

    @Test
    public void testFiftyToFiftyNinePercent() {
        int successfulDeliveries = 55;
        int expectedWage = 55 * 200 + 5000;
        assertEquals(expectedWage, LogisticsCompany.calculateWage(successfulDeliveries));
    }

    @Test
    public void testSixtyToSixtyNinePercent() {
        int successfulDeliveries = 65;
        int expectedWage = 65 * 250 + 5000;
        assertEquals(expectedWage, LogisticsCompany.calculateWage(successfulDeliveries));
    }

    @Test
    public void testSeventyPercentAndAbove() {
        int successfulDeliveries = 80;
        int expectedWage = 80 * 500 + 5000;
        assertEquals(expectedWage, LogisticsCompany.calculateWage(successfulDeliveries));
    }


}