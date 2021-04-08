package Employee;

import Business.BusinessUnit;

import javax.lang.model.type.NullType;

public class Employee {

    private String id;
    private String name;
    private String lastname;
    private int age;
    private Supervisor mi_supervisor;
    protected float salary;
    private BusinessUnit bu;


    public Employee(String id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.setAge(age);
        this.salary = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age <= 1 || age >= 100 ){
            age = 1;
            System.out.println("WARNING: EL valor enviado no se encuentra de los rangos espesificados [1,99], POR LO TANTO EL VALOR FUE SET CON 1");
        }
        this.age = age;
    }

    public Supervisor getMi_supervisor() {
        return this.mi_supervisor;
    }

    public void setMi_supervisor(Supervisor mi_supervisor) {
        this.mi_supervisor = mi_supervisor;
    }

    public String Presentation(){
        return this.id + " - " + this.name + " " + this.lastname;
    }

    public BusinessUnit getBu() {
        return this.bu;
    }

    public void setBu(BusinessUnit bu) {
        this.bu = bu;
    }
}
