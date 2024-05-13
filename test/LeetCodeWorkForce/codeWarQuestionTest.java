package LeetCodeWorkForce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class codeWarQuestionTest {

    @Test
    public void testToReturnAbsMin(){
        int[] array = {1,3,5,4,8,2,4,3,6,5};
        int x = 3;
        int y = 2;
        int result = 2;

        Assertions.assertEquals(result, codeWarQuestion.returnMinimumAbsValue(array,x,y));
    }
}
