package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonStream {

    String name;
    String city;
    Integer age;
    String gender;

    public PersonStream(String name, String city, int age, String gender) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', city='" + city + "', age=" + age + ", gender='" + gender + "'}";
    }
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<PersonStream> list1=new ArrayList<>();
        list1.add(new PersonStream("John","Sangli",25,"MALE"));
        list1.add(new PersonStream("Alice","Sangli",18,"MALE"));
        list1.add(new PersonStream("Kalis","Mumbai",27,"MALE"));
        list1.add(new PersonStream("Cat","Mumbai",30,"FEMALE"));
        list1.add(new PersonStream("Maria","Mumbai",25,"FEMALE"));
        list1.add(new PersonStream("Bobie","Sangli",20,"FEMALE"));
        System.out.println(list1);
        /*
        1. Get names of people who lives in Mumbai
         */

        var names= list1.stream().filter(i ->"Mumbai".equalsIgnoreCase(i.getCity()))
                .map(PersonStream::getName)
                .collect(Collectors.toList());
        System.out.println(names);

         /*
        2. Get list of females whose age is greater than 22
         */

        var list2 = list1.stream().
                filter(i -> i.getGender().equalsIgnoreCase("FEMALE") && i.getAge() > 22).
                collect(Collectors.toList());
        System.out.println(list2.toString());
    }
}
