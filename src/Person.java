import java.util.Scanner;

public class Person {
    private String name="";
    private String surname;
    private String otchestvo="";


    public Person(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                '}';
    }

    public String name(){
        String fio = surname;

        if(name!="")
            fio += (" "+name.substring(0,1) +".");


        if(otchestvo!="")
            fio += (" " + otchestvo.substring(0,1) +".");


        return fio;
    }

    public static void main(String []args){
        Person person = new Person("Вадим", "Кириллов", "Витальевич");
        System.out.println(person.toString());
        System.out.println(person.name());
    }

}