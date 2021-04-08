package Employee;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee{

    private List<Employee> employees;


    public Supervisor(String id, String name, String lastname, int age) {
        super(id, name, lastname, age);
        this.employees = new ArrayList<Employee>();
    }

    public void AssignNewEmployee(Employee e){
        this.employees.add(e);
    }

    public void PrintEmployees(){

        System.out.println("This supervisor(" + super.getName() + ") has as employees:");

        for( Employee e : this.employees ){
            System.out.println(e.Presentation());
        }
    }

    public void setEmployeeSalary(Employee e, float s){

        if( this.getId() == e.getMi_supervisor().getId() ){
            e.salary = s;
        }else{
            System.out.println("WARNING: SUPERVIDOR NO TIENE LOS ACCESOS PARA MODIFICAR LA INFORMACION DEL EMPLEADO ENVIADO");
        }


    }



}
