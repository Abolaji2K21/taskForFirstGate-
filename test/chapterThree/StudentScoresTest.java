//package chapterThree;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//public class StudentScoresTest {
//
//    @Test
//    public void testDisplayFirstSummary() {
//        String expectedSummary = "==============================================================\n" +
//                "STUDENT   SUB1      SUB2      TOT       AVE       POS       \n" +
//                "==============================================================\n" +
//                "Student1  90.0      85.0      175.0     87.5      1         \n" +
//                "Student2  75.0      80.0      155.0     77.5      2         \n" +
//                "Student3  60.0      70.0      130.0     65.0      3         \n" +
//                "Student4  85.0      90.0      175.0     87.5      1         \n" +
//                "==============================================================\n";
//        String actualSummary = StudentScores.displayFirstSummary();
//        assertEquals(expectedSummary, actualSummary);
//    }
//
//    @Test
//    public void testDisplaySecondSummary() {
//        String expectedSummary = "SUBJECT SUMMARY\n\n" +
//                "Subject1\n" +
//                "Highest Scoring Student Is: Student 4 scoring 85.0\n" +
//                "Lowest Scoring Student Is: Student 3 scoring 60.0\n" +
//                "Total Score is : 310.0\n" +
//                "Average Score is : 77.5\n" +
//                "Number Of Passes : 3\n" +
//                "Number Of Fails : 1\n\n" +
//                "Subject2\n" +
//                "Highest Scoring Student Is: Student 4 scoring 90.0\n" +
//                "Lowest Scoring Student Is: Student 3 scoring 70.0\n" +
//                "Total Score is : 315.0\n" +
//                "Average Score is : 78.75\n" +
//                "Number Of Passes : 4\n" +
//                "Number Of Fails : 0\n\n";
//        String actualSummary = StudentScores.displaySecondSummary();
//        assertEquals(expectedSummary, actualSummary);
//    }
//
//    @Test
//    public void testDisplayThirdSummary() {
//        String expectedSummary = "===========================================\n" +
//                "The hardest subject is Subject 1 with 1 failures\n" +
//                "The easiest subject is Subject 2 with 4 passes\n" +
//                "The overall Highest score is scored by Student 4 in subject 2 scoring 90.0\n" +
//                "The overall Lowest score is scored by Student 3 in subject 1 scoring 60.0\n\n" +
//                "===========================================\n" +
//                "CLASS SUMMARY\n" +
//                "===========================================\n\n" +
//                "===========================================\n" +
//                "Best Graduating Student is: Student 4 scoring 175.0\n" +
//                "===========================================\n\n" +
//                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" +
//                "Worst Graduating Student is: Student 3 scoring 130.0\n" +
//                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n" +
//                "===========================================\n\n" +
//                "Class total score is: 625.0\n" +
//                "Class Average score is: 78.12\n" +
//                "===========================================\n";
//        String actualSummary = StudentScores.displayThirdSummary();
//        assertEquals(expectedSummary, actualSummary);
//    }
//}
