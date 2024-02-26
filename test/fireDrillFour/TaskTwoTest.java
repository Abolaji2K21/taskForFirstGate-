package fireDrillFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    private AgeCalculator myTask;
    @BeforeEach
    public void InitializingFireDrill() {
        myTask = new AgeCalculator();

    }

    @Test
    void getDateOfBirth() {
    }

    @Test
    void calculateCurrentAge() {
        String sampleInput = "12/12/2022";
        int sampleOutput = 1;
        assertEquals(sampleOutput, myTask.calculateAge(sampleInput));

    }

    @Test
    void calculateCurrentAge2() {
        String sampleInput = "01/12/2022";
        int sampleOutput = 2;
        assertEquals(sampleOutput, myTask.calculateAge2(sampleInput));

    }

}