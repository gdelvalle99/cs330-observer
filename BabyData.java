import java.util.ArrayList;

public class BabyData implements Subject{
    private boolean crying;
    private int levelOfCrying;
    private ArrayList<Observer> observers;

    BabyData(){
        observers = new ArrayList<Observer>();
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update(crying, levelOfCrying);
        }
    }

    public void setData(boolean crying, int levelOfCrying){
        this.crying = crying;
        this.levelOfCrying = levelOfCrying;
        notifyObservers();
    }

    public boolean getCrying(){
        return this.crying;
    }

    public int getLevelOfCrying(){
        return this.levelOfCrying;
    }
}