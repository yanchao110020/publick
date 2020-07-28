package lambda;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class Person {
    private String name;
    private int age;
    private String sex;

    public static List<Person> getPersonList(){
        Person p1 = new Person().setName("liu").setAge(22).setSex("male");
        Person p2 = new Person().setName("zhao").setAge(21).setSex("male");
        Person p3 = new Person().setName("li").setAge(18).setSex("female");
        Person p4 = new Person().setName("wang").setAge(21).setSex("female");
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        return list;
    }


}
