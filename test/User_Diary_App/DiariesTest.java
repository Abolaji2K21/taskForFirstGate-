package User_Diary_App;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {


//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown(){
//
//    }

    @Test
    void testTheNumberOfDiariesInDiary() {
        Diaries myDiaries = new Diaries();

        assertEquals(0, myDiaries.getNumberOfDiaries());
    }

    @Test
    void testThatICanAddToMyDiary() {
        Diaries myDiaries = new Diaries();
        myDiaries.addToDiary("username", "password");
        myDiaries.addToDiary("username1", "password1");

        assertEquals(2, myDiaries.getNumberOfDiaries());
    }

    @Test
    void testThatICanFindDiary() {
        Diaries myDiaries = new Diaries();
        myDiaries.addToDiary("username", "password");
        Diary foundDiary = myDiaries.findByUsername("username");
        assertNotNull(foundDiary);
        assertEquals("username", foundDiary.getUsername());

        myDiaries.addToDiary("username1", "password1");
        Diary foundDiary1 = myDiaries.findByUsername("username1");
        assertNotNull(foundDiary1);
        assertEquals("username1", foundDiary1.getUsername());

        assertEquals(2, myDiaries.getNumberOfDiaries());
    }

    @Test
    void testThatICanDeleteDiary() {
        Diaries myDiaries = new Diaries();
        myDiaries.addToDiary("username", "password");
        myDiaries.addToDiary("username1", "password1");

        myDiaries.delete("username1", "password1");
        assertEquals(1, myDiaries.getNumberOfDiaries());

        myDiaries.delete("username", "password");
        assertEquals(0, myDiaries.getNumberOfDiaries());
    }
}
