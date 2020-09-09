public class TestObserver {
    public static void main(String[] args){
        BabyData babyData = new BabyData();
        SimpleMonitor monitor = new SimpleMonitor(babyData);

        babyData.setData(false, 0);
        babyData.setData(true, 0);
        babyData.setData(false, 0);

        BabyData complexOne = new BabyData();
        BabyData complexTwo = new BabyData();
        ComplexMonitor newMonitor = new ComplexMonitor(complexOne, complexTwo);

        complexOne.setData(false, 0);
        complexOne.setData(true, 2);
        complexTwo.setData(true, 1);
        complexTwo.setData(false, 0);
    }
}