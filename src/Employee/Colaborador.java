package Employee;

import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Employee {

    private List<String> programmingLanguages;

    public Colaborador(String id, String name, String lastname, int age) {
        super(id, name, lastname, age);

        programmingLanguages = new ArrayList<String>();
    }

    public void AddNewLanguage(String language){
        this.programmingLanguages.add(language);
    }

    public void PrintMyLanguages(){

        System.out.println( super.getId() + " knows the follow languages: " );

        for(String languages : this.programmingLanguages){
            System.out.println(languages);
        }
    }

    public String getSalaryInfo(){
        String respuesta = "Salario Malo";
        if( super.salary >= 2000 ){
            respuesta = "Salario bueno";
        }
        return respuesta;
    }

}
