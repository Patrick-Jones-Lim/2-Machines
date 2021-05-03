package Arcade;

public class pisonet implements InsertCoin, Time {
    int net = 0;
    public pisonet()
    {
        this.net = 0;
    }
    @Override
    public boolean insertCoin(){
        if (this.net <= 0 )
        {
            this.dispense();
            return true;
        }
        System.out.println("Return Coin");
        return false;

    }
    @Override
    public void dispense(){
        this.net = 0  ;
        System.out.println("Time added: " + (net+5));
    }
    @Override
    public void reload(int count)
    {
        this. net += count;
    }
}

