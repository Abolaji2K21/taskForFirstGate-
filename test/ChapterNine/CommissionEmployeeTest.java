package ChapterNine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    @Test
    void testThatICanGetEmployeeDetails() {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1);

        assertEquals("Am", commissionEmployee.getFirstName());
        assertEquals("Tired", commissionEmployee.getLastName());
        assertEquals("123-45", commissionEmployee.getSocialSecurityNumbers());
        assertEquals(5000.0, commissionEmployee.getGrossSales());
        assertEquals(0.1, commissionEmployee.getCommissionRate());


    }

    @Test
    void testNegativeGrossSales() {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1);

        assertThrows(IllegalArgumentException.class,() -> commissionEmployee.setGrossSales(-0.4));
    }

    @Test
    void testNegativeCommissionSales(){
        CommissionEmployee commissionEmployee = new CommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1);
        assertThrows(IllegalArgumentException.class,() -> commissionEmployee.setCommissionRate(-2000.0));

    }

    @Test
    void testEarning(){
        CommissionEmployee commissionEmployee = new CommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1);
        assertEquals(500, commissionEmployee.earnings());
    }
}