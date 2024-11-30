import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Temp {
    public static void main(String[] args)
    {
        String str="kafkaf";
        char[] charArr=str.toCharArray();
        Character map=str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(map==null?"Not Found":map);
        //////////////////////////////////////////////////////
        List<Employee> employees = new ArrayList<>();

        // Add employees to the list
        employees.add(new Employee("Nikhil", 29, "Developer", 20000, "Pune"));
        employees.add(new Employee("Priya", 32, "Manager", 50000, "Mumbai"));
        employees.add(new Employee("Rahul", 25, "Tester", 18000, "Bangalore"));
        employees.add(new Employee("Sneha", 28, "Developer", 25000, "Chennai"));
        employees.add(new Employee("Amit", 30, "Architect", 70000, "Hyderabad"));

        List<Employee> emp=employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                .toList();

        emp.forEach(e->System.out.println(e.getName()+" "+e.getAge()));

    }
}

class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    private String location;

    // Constructor
    public Employee(String name, int age, String designation, double salary, String location) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    // Getters and toString() for display
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}