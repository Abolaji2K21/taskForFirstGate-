package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Person {

    private ArrayList<Problem> problems = new ArrayList<>();

    public void add(Problem problem){
        problems.add(problem);
    }

    public void solve(Problem problem){
        problem.setSolved(true);
    }

    public int recount() {
        int solvedCount = 0;

        for (Problem problem : problems) {
            if (problem.isSolved()) {
                solvedCount++;
            }
        }
        return solvedCount;
    }

//    public boolean isSolved(Problem problem) {
//        return problem.isSolved();
//    }
//
//    public int getProblemCountByType(Type type) {
//        int count = 0;
//        for (Problem problem : problems) {
//            if (problem.getType() == type) {
//                count++;
//            }
//        }
//        return count;
//    }

}
