public class ComplexMonitor implements Observer{
    BabyData firstBaby;
    BabyData secondBaby;
    public void update(boolean crying, int level){
        firstBaby.setData(crying, level);
    }
    
    public void currentBabyDisplay(BabyData firstBaby){
        this.firstBaby = firstBaby;
        display();
    }

    public void display(){
        String message;
        if(this.firstBaby.getCrying()){
            if(this.firstBaby.getLevelOfCrying() == 0){
                message = "The first baby is crying and they are sobbing";
            }
            else if(this.firstBaby.getLevelOfCrying() == 1){
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

        if(this.secondBaby.getCrying()){
            if(this.secondBaby.getLevelOfCrying() == 0){
                message = "The second baby is crying and they are sobbing";
            }
            else if(this.secondBaby.getLevelOfCrying() == 1){
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