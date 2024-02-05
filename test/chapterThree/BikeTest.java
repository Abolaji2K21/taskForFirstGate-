package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    public Bike myBike;

    @BeforeEach
    void setMyBike() {
        myBike = new Bike();
    }

    @Test
    void testThatMyBikeIsOn() {
        myBike.setBikeOff(true);
        myBike.setBikeOn(true);

        assertTrue(myBike.isBikeOn());

    }


    @Test
    void testThatMyBikeIsOff() {
        myBike.setBikeOn(true);
        myBike.setBikeOff(true);

        assertTrue(myBike.isBikeOff());

    }

    @Test
    void testThatMyBikeAccelerationFunctionWorks() {
        myBike.setBikeOn(true);
        myBike.setSpeed(0);
        myBike.accelerate();

        assertEquals(1.0, myBike.getSpeed());
    }

    @Test
    void testThatMyBikeDecelerationFunctionWorks() {
        myBike.setBikeOn(true);
        myBike.setSpeed(20);
        myBike.decelerate();

        assertEquals(19, myBike.getSpeed());
    }

    @Test
    void testThatWhenBikeGearOneWorks_AndIncrementStillOccurs() {
        myBike.setBikeOn(true);
        myBike.setSpeed(12);
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        assertEquals(19, myBike.getSpeed());
        assertEquals(1, myBike.getGear());

    }

    @Test
    void testThatWhenBikeGearOneWorks_AndDecrementStillOccurs() {
        myBike.setBikeOn(true);
        myBike.setSpeed(20);

        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        assertEquals(17, myBike.getSpeed());
        assertEquals(1, myBike.getGear());

    }

    @Test
    void testThatBikeGearTwoWorks_AndIncrementStillOccurs(){
        myBike.setBikeOn(true);
        myBike.setSpeed(24);
        myBike.accelerate();

        assertEquals(26, myBike.getSpeed());
        assertEquals(2, myBike.getGear());
    }

    @Test
    void testThatWhenBikeGearTwoWorks_AndDecrementStillOccurs() {
        myBike.setBikeOn(true);
        myBike.setSpeed(29);

        myBike.decelerate();
        myBike.decelerate();

        assertEquals(25, myBike.getSpeed());
        assertEquals(2, myBike.getGear());

    }

    @Test
    void testThatBikeGearThreeWorks_AndIncrementStillOccurs(){
        myBike.setBikeOn(true);
        myBike.setSpeed(32);
        myBike.accelerate();

        assertEquals(35, myBike.getSpeed());
        assertEquals(3, myBike.getGear());
    }

    @Test
    void testThatWhenBikeGearThreeWorks_AndDecrementStillOccurs() {
        myBike.setBikeOn(true);
        myBike.setSpeed(38);

        myBike.decelerate();
        myBike.decelerate();

        assertEquals(32, myBike.getSpeed());
        assertEquals(3, myBike.getGear());

    }

    @Test
    void testThatBikeGearFourWorks_AndIncrementStillOccurs(){
        myBike.setBikeOn(true);
        myBike.setSpeed(42);
        myBike.accelerate();
        myBike.accelerate();

        assertEquals(50, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
    }

    @Test
    void testThatWhenBikeGearFourWorks_AndDecrementStillOccurs() {
        myBike.setBikeOn(true);
        myBike.setSpeed(50);

        myBike.decelerate();
        myBike.decelerate();

        assertEquals(42, myBike.getSpeed());
        assertEquals(4, myBike.getGear());

    }


}