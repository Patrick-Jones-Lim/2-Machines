package Arcade;

public class person {
    public int coins;

    public person(int coins){
        this.coins = coins;
    }
    public void insertCoin(pisonet coinable, int i)
    {

        System.out.println("total: " + coins);
        System.out.println("Coin inserted: " + i);
        System.out.println();
        coins = coins - 5 ;
        if(!coinable.insertCoin()){
            coins++;
            System.out.println("Coin count: " + coins);
        }

    }
}

