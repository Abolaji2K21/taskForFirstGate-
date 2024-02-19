package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneAppTest {

    @Test
    void getGeoPoliticalZone() {
        String userSearch = "Lagos";
        String expected = "SOUTH_WEST";
        String actual = String.valueOf(GeoPoliticalZoneApp.getGeoPoliticalZone(userSearch));
        assertEquals(expected, actual);

    }

    @Test
    void getGeoPoliticalZoneWithAllCapitalLetter() {
        String userSearch = "EDO";
        String expected = "SOUTH_SOUTH";
        String actual = String.valueOf(GeoPoliticalZoneApp.getGeoPoliticalZone(userSearch));
        assertEquals(expected, actual);

    }

    @Test
    void getGeoPoliticalZoneWithAllSmallLetter() {

        String userSearch = "imo";
        String expected = "SOUTH_EAST";
        String actual = String.valueOf(GeoPoliticalZoneApp.getGeoPoliticalZone(userSearch));
        assertEquals(expected, actual);
    }

    @Test
    void getGeoPoliticalZoneUsingNorth_West() {

        String userSearch = "kebbi";
        String expected = "NORTH_WEST";
        String actual = String.valueOf(GeoPoliticalZoneApp.getGeoPoliticalZone(userSearch));
        assertEquals(expected, actual);
    }



}