package User_Diary_App;

import Exceptions.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    private Diary myDiary;

    @BeforeEach
    void setUp() {
        myDiary = new Diary("Bee jay", "password");
    }

    @Test
    void testThatICanCreateADiary() {
        assertEquals("Bee jay", myDiary.getUsername());
        assertEquals("password", myDiary.getPassword());
    }

    @Test
    void testThatICantCreatADiaryWithOutAUsername() {
        assertThrows(IllegalArgumentException.class, () -> new Diary(null, "password"));
    }


    @Test
    void testThatICantCreatADiaryWithOutAPassword() {
        assertThrows(IllegalArgumentException.class, () -> new Diary("Bee jay", null));
    }

    @Test
    void thatThatTheDiaryIsInitiallyUnLocked() {
        assertTrue(myDiary.isLocked());
    }

    @Test
    void testThatTheUnlockFeaturesWorksOnMyDiary_WithACorrectPasskey() {
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());
    }

    @Test
    void testThatTheUnlockFeatureOnMyDiary_WithAnInCorrectPasskey() {
        assertThrows(InvalidPinException.class, () -> myDiary.unlockDiary("incorrect_password"));
        assertTrue(myDiary.isLocked());
    }

    @Test
    void testThatCreatEntryFeatureWorks() {
        myDiary.unlockDiary("password");
        assertEquals(0, myDiary.getNumberOfEntries());

        myDiary.createEntry(1, "How To Start Thinking", "Body 1");
        assertEquals(1, myDiary.getNumberOfEntries());

        myDiary.createEntry(2, "How To Stop Thinking", "Body 2");
        assertEquals(2, myDiary.getNumberOfEntries());

        myDiary.lockDiary("password");
        assertTrue(myDiary.isLocked());
    }

    @Test
    void testFindEntryByIdFeature() {
        myDiary.unlockDiary("password");

        myDiary.createEntry(1, "How To Start Thinking", "Body 1");
        myDiary.createEntry(2, "How To Stop Thinking", "Body 2");

        Entry foundEntry1 = myDiary.findEntryById(1);
        assertNotNull(foundEntry1);
        assertEquals(1, foundEntry1.getId());

        Entry foundEntry2 = myDiary.findEntryById(2);
        assertNotNull(foundEntry2);
        assertEquals(2, foundEntry2.getId());
    }

    @Test
    void thatThatRemoveEntryByIdFeatureWorks() {
        myDiary.unlockDiary("password");

        myDiary.createEntry(1, "How To Start Thinking", "Body 1");
        myDiary.createEntry(2, "How To Stop Thinking", "Body 2");

        assertEquals(2, myDiary.getNumberOfEntries());

        myDiary.deleteEntry(2);
        assertEquals(1, myDiary.getNumberOfEntries());

        myDiary.deleteEntry(1);
        assertEquals(0, myDiary.getNumberOfEntries());
    }

    @Test
    void thatThatUpdateEntryByIdFeatureWorks() {
        myDiary.unlockDiary("password");

        myDiary.createEntry(1, "How To Start Thinking", "Body 1");
        myDiary.createEntry(2, "How To Stop Thinking", "Body 2");

        myDiary.updateEntry(1, "New Title 1", "New Body 1");

        Entry updatedEntry1 = myDiary.findEntryById(1);
        assertEquals("New Title 1", updatedEntry1.getTitle());
        assertEquals("New Body 1", updatedEntry1.getBody());

        myDiary.updateEntry(2, "New Title 2", "New Body 2");

        Entry updatedEntry2 = myDiary.findEntryById(2);
        assertEquals("New Title 2", updatedEntry2.getTitle());
        assertEquals("New Body 2", updatedEntry2.getBody());
    }

    @Test
    void thatThatUpdateEntryByIdFeatureThrowsExceptionForNonExistingEntry() {
        myDiary.unlockDiary("password");

        myDiary.createEntry(1, "How To Start Thinking", "Body 1");

        assertThrows(IllegalArgumentException.class, () -> myDiary.updateEntry(2, "New Title", "New Body"));
    }
}
