public class SimpleMonitor implements Observer {
    private BabyData baby;

    public SimpleMonitor(BabyData babyData){
        this.baby = babyData;
        baby.registerObserver(this);
    }
    public void update(boolean crying, int level){
        baby.setData(crying, level);
    }

    public void currentBabyDisplay(BabyData baby){
        this.baby = baby;
        display();
    }

    public void display(){
        if(this.baby.getCrying()){
            System.out.println("Baby is crying.");
        }
        else{
            System.out.println("Baby is not crying.");
        }
    }
}