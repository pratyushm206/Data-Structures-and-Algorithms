public class WaterBottle {
    public static void main(String[] args) {
        int numBottles = 13;
        int numExchange = 6;

        int remaining = 0;
        int drinkTotal = numBottles;

        while(numBottles >= numExchange){
            remaining = numBottles - numExchange;
            numExchange += 1;
            drinkTotal+=1;
            numBottles = remaining + 1;
        }

        System.out.println(drinkTotal);
    }
}
