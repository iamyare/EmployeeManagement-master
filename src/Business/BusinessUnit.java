package Business;

import Employee.Supervisor;

public abstract class BusinessUnit {

    private String name;
    private Supervisor supervisor;

    public BusinessUnit(String name, Supervisor supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supervisor getSupervisor() {
        return this.supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public abstract void MainActivities();


}
