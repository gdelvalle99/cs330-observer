public class SimpleMonitor implements Observer {
    private BabyData baby;
    private boolean cry;

    public SimpleMonitor(BabyData babyData){
        this.baby = babyData;
        baby.registerObserver(this);
    }
    public void update(Subject baby, boolean crying, int level){
        this.cry = crying;
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