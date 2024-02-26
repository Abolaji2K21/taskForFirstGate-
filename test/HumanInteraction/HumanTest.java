package HumanInteraction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    private Human myHuman;

    @BeforeEach
    void setMyHuman(){
        myHuman = new Human("BEE_JAY", 30, 150.0);
    }

    @Test
    void doorIsOpenBeforeEnteringCar(){
        assertFalse(myHuman.isDoorOpen());
        assertTrue(myHuman.toggleDoor());
        assertTrue(myHuman.isDoorOpen());


    }

    @Test
    void enterCar() {

        assertTrue(myHuman.enterCar());
    }

    @Test
    void testThatDoorIsCloseAfterEnteringTheCar(){
        assertFalse(myHuman.isDoorOpen());
        myHuman.toggleDoor();
        assertTrue(myHuman.isDoorOpen());
        assertTrue(myHuman.enterCar());
        myHuman.toggleDoor();
        assertFalse(myHuman.isDoorOpen());
    }

    @Test
    void testThatYouHaveAValidDriverLicenseBeforeStartingTheEngine(){
        myHuman = new Human("BEE_JAY", 30, 150.0);
        myHuman.toggleDoor();
        myHuman.enterCar();
        myHuman.toggleDoor();

        assertTrue(myHuman.startEngine());

        assertTrue(myHuman.startEngine());
    }


}