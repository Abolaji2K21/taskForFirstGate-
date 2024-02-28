package ChapterNine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasePlusCommissionEmployeeTest {

    @Test
    void testThatICanGetEmployeeDetailsIncludingBaseCommission(){
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1,3000);
        assertEquals("Am", employee.getFirstName());
        assertEquals("Tired", employee.getLastName());
        assertEquals("123-45", employee.getSocialSecurityNumbers());
        assertEquals(5000.0, employee.getGrossSales());
        assertEquals(0.1, employee.getCommissionRate());
        assertEquals(3000, employee.getBaseSalary());

    }

    @Test
    void testThatBasePlusCommissionCantBeNegative(){
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1,3000);

        assertThrows(IllegalArgumentException.class, () -> employee.setBaseSalary(-200));
    }


    @Test
    void testTotalEarning(){
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Am", "Tired", "123-45", 5000.0, 0.1,3000);

        assertEquals(3500, employee.earnings());
    }



}