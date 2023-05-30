package IntroToOOPs;

public class Student {
    private String name;
    private int id;
    private int totalsolvedproblem;

    public void solvedProblems(int count)
    {
        this.totalsolvedproblem+=count;
        System.out.println(name + " solved "+totalsolvedproblem + " problems");
    }

    public Student(String name , int id)
    {
        this.name=name;
        this.id=id;
        this.totalsolvedproblem=0;
    }
}
