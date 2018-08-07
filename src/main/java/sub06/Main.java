package sub06;

import sub06.Model.Director;
import sub06.Model.Problem;
import sub06.Model.Secretary;

public class Main {

    public static void main(String[] args) {

        Director director = new Secretary();

        director.solveProblem(Problem.FELL_ILL);
        director.solveProblem(Problem.SIGN_DOCUMENTS);
        director.solveProblem(Problem.GIVE_DOCUMENTS);
        director.solveProblem(Problem.NEW_MOUSE);

        director.solveProblem(Problem.TAX_AUDIT);

    }

}
