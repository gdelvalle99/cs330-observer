public class ComplexMonitor implements Observer{
    private BabyData firstBaby;
    private BabyData secondBaby;
    private boolean firstCrying;
    private boolean secondCrying;
    private int firstLevel;
    private int secondLevel;

    ComplexMonitor(BabyData firstBaby, BabyData secondBaby){
        this.firstBaby = firstBaby;
        firstBaby.registerObserver(this);
        this.secondBaby = secondBaby;
        secondBaby.registerObserver(this);
    }

    public void update(Subject baby, boolean crying, int level){
        if(baby == firstBaby){
            firstUpdate(crying, level);
        }
        else{
            secondUpdate(crying, level);
        }
        display();
    }

    public void firstUpdate(boolean crying, int level){
        firstLevel = level;
        firstCrying = crying;
    }

    public void secondUpdate(boolean crying, int level){
        secondLevel = level;
        secondCrying = crying;
    }

    public void display(){
        String message;
        if(firstCrying){
            if(firstLevel == 0){
                message = "The first baby is crying and they are sobbing";
            }
            else if(firstLevel == 1){
                message = "The first baby is crying and they are crying";
            }
            else{
                message = "The first baby is crying and they are screaming";
            }
        }
        else{
            message = "The first baby is not crying";
        }

        System.out.println(message);

        if(secondCrying){
            if(secondLevel == 0){
                message = "The second baby is crying and they are sobbing";
            }
            else if(secondLevel == 1){
                message = "The second baby is crying and they are crying";
            }
            else{
                message = "The second baby is crying and they are screaming";
            }
        }
        else{
            message = "The second baby is not crying";
        }

        System.out.println(message);
    }
}