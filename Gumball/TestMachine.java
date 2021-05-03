package Gumball;

public class TestMachine {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine();
        Person person = new Person (10);
        System.out.println("1 gumball is $2");
        person.insertCoin(gumballMachine,2);
        person.insertCoin(gumballMachine,2);
    }
}
