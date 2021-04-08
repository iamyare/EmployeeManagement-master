package Business;

import Employee.Supervisor;

public class Engineer extends BusinessUnit {


    public Engineer(String name, Supervisor supervisor) {
        super(name, supervisor);
    }

    @Override
    public void MainActivities() {
        System.out.println("----- ENGINEER ------");
        System.out.println();
        System.out.println("Analyze");
        System.out.println("Design");
        System.out.println("Develop");
        System.out.println("Test");
        System.out.println("Deployment");
        System.out.println();
    }
}
