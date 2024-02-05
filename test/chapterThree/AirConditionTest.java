package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    private AirCondition myAircondition;

    @BeforeEach
    public void initializeAC() {
        myAircondition = new AirCondition();
    }



    @Test
    public void testCheckIfAcIsOn() {
        myAircondition.setAcOff(true);

        myAircondition.setAcOn(true);
        assertTrue(myAircondition.getAcOn());
    }


    @Test
    public void testCheckIfAcIsOff() {
        myAircondition.setAcOn(true);

        myAircondition.setAcOff(true);
        assertTrue(myAircondition.getAcOff());
    }

    @Test
    public void testSetTemperatureWithAcOn() {
        myAircondition.setAcOn(true);
        int initialTemperature = myAircondition.getTemperature();

        int newTemperature = 25;
        myAircondition.setTemperature(newTemperature);

        assertEquals(initialTemperature + newTemperature, myAircondition.getTemperature());
    }

    @Test
    public void testSetTemperatureWithAcOff(){
        myAircondition.setAcOn(false);
        int initialTemperature = myAircondition.getTemperature();

        int newTemperature = 25;
        myAircondition.setTemperature(newTemperature);
        assertEquals(initialTemperature , myAircondition.getTemperature());


    }
    @Test
    public void testSetTemperatureWithAcOn_above30(){
        myAircondition.setAcOn(true);

        int initialTemperature = myAircondition.getTemperature();

        int newTemperature = 35;
        myAircondition.setTemperature(newTemperature);
        assertEquals(initialTemperature , myAircondition.getTemperature());


    }

    @Test
    public void testSetTemperatureWithAcOn_below16(){
        myAircondition.setAcOn(true);

        int initialTemperature = myAircondition.getTemperature();

        int newTemperature = 14;
        myAircondition.setTemperature(newTemperature);
        assertEquals(initialTemperature , myAircondition.getTemperature());

    }
    @Test
    public void testSetTemperatureWithAcOff_below16(){
        myAircondition.setAcOn(false);

        int initialTemperature = myAircondition.getTemperature();

        int newTemperature = 14;
        myAircondition.setTemperature(newTemperature);
        assertEquals(initialTemperature , myAircondition.getTemperature());
        myAircondition.setAcOff(true);
        assertTrue(myAircondition.getAcOff());

    }

    @Test
    public void testSetTemperatureWithAcOff_above30(){
        myAircondition.setAcOn(false);

        int initialTemperature = myAircondition.getTemperature();

        int newTemperature = 32;
        myAircondition.setTemperature(newTemperature);
        assertEquals(initialTemperature , myAircondition.getTemperature());
        myAircondition.setAcOff(true);
        assertTrue(myAircondition.getAcOff());

    }


}
