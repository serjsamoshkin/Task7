package sub06.Model;

public class DirectorImpl implements Director {
    public void solveProblem(Problem problem) {
        System.out.println("Директор решил проблему: " + problem);
    }
}
