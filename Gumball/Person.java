package Gumball;

public class Person {
    public int coins;

    public Person(int coins){
        this.coins = coins;
    }
    public void insertCoin(Coinable coinable, int i)
    {
        System.out.println("Coin inserted: $" + i);
        coins = coins - 2 ;
        System.out.println("change : $" + coins);
       if(!coinable.insertCoin()){
           coins++;
           System.out.println("Coin count: " + coins);
       }
        }
    }

