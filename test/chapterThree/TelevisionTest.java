package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    private Television myTelevision;

    @BeforeEach
    void setUp() {
        myTelevision = new Television();
    }

    @Test
    void testToggleTv_isTvOff() {
        assertFalse(myTelevision.isTurnOnTv());
        myTelevision.toggleTv();
        assertTrue(myTelevision.isTurnOnTv());
        myTelevision.toggleTv();
        assertFalse(myTelevision.isTurnOnTv());
    }

    @Test
    void testTurnOnTv_isTvOn() {
        myTelevision.setTurnOnTv(false);
        myTelevision.setTurnOnTv(true);
        assertTrue(myTelevision.isTurnOnTv());
    }

    @Test
    void testTurnOffTv_isTvOff() {
        myTelevision.setTurnOnTv(true);
        myTelevision.setTurnOnTv(false);
        assertFalse(myTelevision.isTurnOnTv());
    }

    @Test
    void testSetAndGetChannelWithinValidRange() {
        myTelevision.setTurnOnTv(true);
        int expectedChannel = 50;
        myTelevision.setChannel(expectedChannel);
        assertEquals(expectedChannel, myTelevision.getChannel());

    }

    @Test
    void testSetAndGetVolumeWithinValidRange() {
        myTelevision.setTurnOnTv(true);
        int expectedVolume = 50;
        myTelevision.setVolume(expectedVolume);
        assertEquals(expectedVolume, myTelevision.getVolume());
    }

    @Test
    void testSetChannelWhenTvIsOff() {
        int initialChannel = myTelevision.getChannel();
        myTelevision.setChannel(50);

        assertEquals(initialChannel, myTelevision.getChannel());
    }

    @Test
    void testSetVolumeWhenTvIsOff() {
        int initialVolume = myTelevision.getVolume();
        myTelevision.setVolume(50);

        assertEquals(initialVolume, myTelevision.getVolume());

    }

    @Test
    void testSetChannelOutOfRange() {
        myTelevision.setTurnOnTv(true);

        int initialChannel = myTelevision.getChannel();
        myTelevision.setChannel(-1);
        assertEquals(initialChannel, myTelevision.getChannel());
    }

    @Test
    void testSetVolumeOutOfRange() {
        myTelevision.setTurnOnTv(true);

        int initialVolume = myTelevision.getVolume();
        myTelevision.setVolume(150);

        assertEquals(initialVolume, myTelevision.getVolume());
    }

    @Test
    void testVolumeButtonIncrease() {
        myTelevision.setTurnOnTv(true);
        myTelevision.setVolume(30);
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();

        assertEquals(36, myTelevision.getVolume());
    }

    @Test
    void VolumeButtonDecrease(){
        myTelevision.setTurnOnTv(true);
        myTelevision.setVolume(30);
        myTelevision.decreaseVolume();
        myTelevision.decreaseVolume();
        myTelevision.decreaseVolume();

        assertEquals(24, myTelevision.getVolume());
    }

}
