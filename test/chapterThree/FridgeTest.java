package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FridgeTest {
    private Fridge myFridge;

    @BeforeEach
    void setUp() {
        myFridge = new Fridge();
    }

    @AfterEach
    void tearDown() {
        myFridge.setOffFridge(true);
        myFridge.getItemListInFridge().clear();
    }


    @Test
    void testThatTheOnFuctionalityWorks(){
        myFridge.setOnFridge(true);
        boolean expected = myFridge.isOnFridge();
        assertTrue(expected);

    }



}