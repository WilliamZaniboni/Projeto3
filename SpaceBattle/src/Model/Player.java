package Model;

public class Player {
    
    private int gold;
    
    public Player(){
    this.gold = Constants.GOLD_INIT;
    }

    public int getGold() {
        return gold;
    }

    public void setNewgold(int g) {
        this.gold = this.gold - g;
    }
    
    
}
