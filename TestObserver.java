public class TestObserver {
    public static void main(String[] args){
        BabyData babyData = new BabyData();
        SimpleMonitor monitor = new SimpleMonitor(babyData);

        babyData.setData(false, 0);
        babyData.setData(true, 0);
        babyData.setData(false, 0);
    }
}