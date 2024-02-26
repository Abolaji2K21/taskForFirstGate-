package User_Diary_App;

import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    void testThatICanCreateADiary(){
        String username = "Bee jay";
        String password = "password";

        Diary myDiary = new Diary(username, password);

        assertEquals(username, myDiary.getUsername());
        assertEquals(password, myDiary.getPassword());

    }

    @Test
    void testThatICantCreatADiaryWithOutAUsername(){
        String username = null;
        String password = "password";


        assertThrows(IllegalArgumentException.class, () -> new Diary(null, password));

    }

    @Test
    void testThatICantCreatADiaryWithOutAPassword(){
        String username = "Bee jay";
        String password = null;


        assertThrows(IllegalArgumentException.class, () -> new Diary(username, null));

    }


    @Test
    void thatThatTheDiaryIsLocked(){
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
    }
    @Test
    void testThatTheUnlockFeaturesWorksOnMyDiary_WithACorrectPasskey(){
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password@");
        assertFalse(myDiary.isLocked());
    }

    @Test
    void testThatTheUnlockFeatureWorksOnMyDiary_WithAnInCorrectPasskey(){
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        assertThrows(InvalidPinException.class, () -> myDiary.unlockDiary("password"));
    }

    @Test
    void testThatCreatEntryFeatureWorks(){
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password@");
        assertFalse(myDiary.isLocked());

        int id       = 1;
        String title = "How To Start Thinking";
        String body = "Hello and how you doing today ? i am documenting my findings because i need to start thinking ";

        myDiary.createEntry(id,title,body);
        assertEquals(1, myDiary.getNumberOfEntry());
        int id1       = 2;
        String title1 = "How To Stop Thinking";
        String body1 = "Hello and how you doing today ? i am documenting my findings because i need to stop thinking ";

        myDiary.createEntry(id1,title1,body1);
        assertEquals(2, myDiary.getNumberOfEntry());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());

    }

    @Test
    void testFindEntryByIdFeature() {
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password@");
        assertFalse(myDiary.isLocked());

        int id1 = 1;
        String title1 = "How To Start Thinking";
        String body1 = "Hello and how you doing today? I am documenting my findings because I need to start thinking.";

        myDiary.createEntry(id1, title1, body1);
        assertEquals(1, myDiary.getNumberOfEntry());

        int id2 = 2;
        String title2 = "How To Stop Thinking";
        String body2 = "Hello and how you doing today? I am documenting my findings because I need to stop thinking.";

        myDiary.createEntry(id2, title2, body2);
        assertEquals(2, myDiary.getNumberOfEntry());


        Entry foundEntry1 = myDiary.findEntryById(1);
        assertNotNull(foundEntry1);
        assertEquals(1, foundEntry1.getId());

        Entry foundEntry2 = myDiary.findEntryById(2);
        assertNotNull(foundEntry2);
        assertEquals(2, foundEntry2.getId());
    }


    @Test
    void thatThatRemoveEntryByIdFeatureWorks(){
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password@");
        assertFalse(myDiary.isLocked());

        int id       = 1;
        String title = "How To Start Thinking";
        String body = "Hello and how you doing today ? i am documenting my findings because i need to start thinking ";

        myDiary.createEntry(id,title,body);
        assertEquals(1, myDiary.getNumberOfEntry());
        int id1       = 2;
        String title1 = "How To Stop Thinking";
        String body1 = "Hello and how you doing today ? i am documenting my findings because i need to stop thinking ";

        myDiary.createEntry(id1,title1,body1);
        assertEquals(2, myDiary.getNumberOfEntry());
        Entry foundEntry = myDiary.findEntryById(2);
        assertEquals(2, foundEntry.getId());
        assertNotNull(myDiary.findEntryById(2));
        Entry foundEntry1 = myDiary.findEntryById(1);
        assertEquals(1, foundEntry1.getId());
        assertNotNull(myDiary.findEntryById(1));
        myDiary.deleteEntry(2);
        assertEquals(1, myDiary.getNumberOfEntry());
        myDiary.deleteEntry(1);
        assertEquals(0, myDiary.getNumberOfEntry());

    }

    @Test
    void thatThatUpdateEntryByIdFeatureWorks() {
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password@");
        assertFalse(myDiary.isLocked());

        int id = 1;
        String title = "How To Start Thinking";
        String body = "Hello and how you doing today ? i am documenting my findings because i need to start thinking ";

        myDiary.createEntry(id, title, body);
        assertEquals(1, myDiary.getNumberOfEntry());
        int id1 = 2;
        String title1 = "How To Stop Thinking";
        String body1 = "Hello and how you doing today ? i am documenting my findings because i need to stop thinking ";

        myDiary.createEntry(id1, title1, body1);
        assertEquals(2, myDiary.getNumberOfEntry());
        Entry foundEntry = myDiary.findEntryById(2);
        assertEquals(2, foundEntry.getId());
        assertNotNull(myDiary.findEntryById(2));
        Entry foundEntry1 = myDiary.findEntryById(1);
        assertEquals(1, foundEntry1.getId());
        assertNotNull(myDiary.findEntryById(1));

        String newTitle = "NewTitle";
        String newBody = "NewBody";
        myDiary.updateEntry(1,newTitle,newBody);

        Entry updatedEntry = myDiary.findEntryById(1);
        assertEquals(newTitle, updatedEntry.getTitle());
        assertEquals(newBody, updatedEntry.getBody());

        String updatedTitle = "NewTitle";
        String updatedBody = "NewBody";
        myDiary.updateEntry(2,updatedTitle,updatedBody);

        Entry myDiaryEntryByIdEntry = myDiary.findEntryById(2);
        assertEquals(updatedTitle, myDiaryEntryByIdEntry.getTitle());
        assertEquals(updatedBody, myDiaryEntryByIdEntry.getBody());



    }

    @Test
    void thatThatUpdateEntryByIdFeatureWorksAndICantUpdateANonExistingEntry() {
        String username = "Bee jay";
        String password = "password@";

        Diary myDiary = new Diary(username, password);
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password@");
        assertFalse(myDiary.isLocked());

        int id = 1;
        String title = "How To Start Thinking";
        String body = "Hello and how you doing today ? i am documenting my findings because i need to start thinking ";

        myDiary.createEntry(id, title, body);
        assertEquals(1, myDiary.getNumberOfEntry());
        int id1 = 2;
        String title1 = "How To Stop Thinking";
        String body1 = "Hello and how you doing today ? i am documenting my findings because i need to stop thinking ";

        myDiary.createEntry(id1, title1, body1);
        assertEquals(2, myDiary.getNumberOfEntry());
        Entry foundEntry = myDiary.findEntryById(2);
        assertEquals(2, foundEntry.getId());
        assertNotNull(myDiary.findEntryById(2));
        Entry foundEntry1 = myDiary.findEntryById(1);
        assertEquals(1, foundEntry1.getId());
        assertNotNull(myDiary.findEntryById(1));

        String newTitle = "NewTitle";
        String newBody = "NewBody";
        myDiary.updateEntry(1,newTitle,newBody);

        Entry updatedEntry = myDiary.findEntryById(1);
        assertEquals(newTitle, updatedEntry.getTitle());
        assertEquals(newBody, updatedEntry.getBody());

        String updatedTitle = "NewTitle";
        String updatedBody = "NewBody";
        myDiary.updateEntry(2,updatedTitle,updatedBody);

        Entry myDiaryEntryByIdEntry = myDiary.findEntryById(2);
        assertEquals(updatedTitle, myDiaryEntryByIdEntry.getTitle());
        assertEquals(updatedBody, myDiaryEntryByIdEntry.getBody());

        String fakeTitle = "NewTitle";
        String fakeBody = "NewBody";
        assertThrows(NullPointerException.class, () -> myDiary.updateEntry(3, fakeTitle, fakeBody));

    }

}