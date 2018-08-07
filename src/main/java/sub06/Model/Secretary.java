package sub06.Model;

public class Secretary implements Director {
    public void solveProblem(Problem problem) {
        switch (problem){
            case FELL_ILL:
                System.out.println("Сотрудник отправлен к менеджеру-куратору");
                break;
            case NEW_MOUSE:
                System.out.println("Сотрудник отправлен на склад");
                break;
            case GIVE_DOCUMENTS:
                System.out.println("Сотрудник отправлен в бухгалтерию");
                break;
            case SIGN_DOCUMENTS:
                new DirectorImpl().solveProblem(problem);
                break;
                default:
                    new DirectorImpl().solveProblem(problem);
        }
    }
}
