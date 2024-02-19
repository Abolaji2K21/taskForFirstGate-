package chapterThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {

    @Test
    public void testSolvingFinancialProblem() {
        Person person = new Person();
        Problem financialProblem = new Problem("Financial issue", Type.FINANCIAL);
        person.add(financialProblem);
        person.solve(financialProblem);
        assertTrue(financialProblem.isSolved());
    }

    @Test
    public void testEducationalProblemSolvingCount() {
        Person person = new Person();
        Problem educationalProblem = new Problem("Math homework", Type.EDUCATIONAL);
        person.add(educationalProblem);
        person.solve(educationalProblem);
        assertEquals(1, person.recount());
    }

    @Test
    public void testTechnicalProblemsWithOutSolving() {
        Person person = new Person();
        Problem technicalProblem1 = new Problem("Coding challenge", Type.TECHNICAL);
        Problem technicalProblem2 = new Problem("Debugging task", Type.TECHNICAL);
        person.add(technicalProblem1);
        person.add(technicalProblem2);
        assertEquals(0, person.recount());
    }

    @Test
    public void testSolvingTechnicalProblems() {
        Person person = new Person();
        Problem technicalProblem1 = new Problem("Coding challenge", Type.TECHNICAL);
        Problem technicalProblem2 = new Problem("Debugging task", Type.TECHNICAL);
        person.add(technicalProblem1);
        person.add(technicalProblem2);
        person.solve(technicalProblem1);
        assertEquals(1, person.recount());
    }

    @Test
    public void testSolvingBusinessProblems() {
        Person person = new Person();
        Problem businessProblem1 = new Problem("SalaryIncrement", Type.BUSINESS);
        Problem businessProblem2 = new Problem("Sweet Fine Office ladies", Type.BUSINESS);
        person.add(businessProblem1);
        person.add(businessProblem2);
        person.solve(businessProblem1);
        assertEquals(1, person.recount());
    }

    @Test
    public void testSolvingProblemsOfDifferentTypes() {
        Person person = new Person();
        Problem financialProblem = new Problem("Food Money", Type.FINANCIAL);
        Problem educationalProblem = new Problem("Industrial Design assignment", Type.EDUCATIONAL);
        Problem spiritualProblem = new Problem("Mr Chi After My LIFE", Type.SPIRITUAL);
        person.add(financialProblem);
        person.add(educationalProblem);
        person.add(spiritualProblem);
        person.solve(financialProblem);
        person.solve(educationalProblem);
        assertEquals(2, person.recount());
    }

}
