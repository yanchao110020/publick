package lambda;


import java.util.List;

public class LambddaOne {
    public static void main(String[] args) {
        function1();
    }


    private static void function1(){
        List<Person> personList = Person.getPersonList();
        personList.forEach(s-> System.out.println(s.toString()) );

    }
}
