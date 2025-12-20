package day03_branching_pull_reques;

public class MyComputerTest {
    public static void main(String[] args) {
        MyComputer myComputer = new MyComputer("Apple MacBook", 2000.0);
        System.out.println(myComputer);

        MyComputer myPC = new MyComputer("HP", 955.0);
        System.out.println(myPC);
    }
}