package IntroToOOPs;

public class Main {
    public static void main(String[] args)
    {
        //object 1
        Student chirag=new Student("Chirag",1);

        //object 2
        Student saching=new Student("Sachin",2);

        chirag.solvedProblems(1);
        saching.solvedProblems(2);

        chirag.solvedProblems(3);
        saching.solvedProblems(1);
    }
}
