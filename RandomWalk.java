public class RandomWalk {
    public static void main(String[] args) throws Exception {
        double distance = 7.0;
        int steps = 0;
        double avg = 1.0;
        int greatestAmount = 0;
        for(int i = 1; i <= 50; i = i + 1 ){
            double place = 3.5;
            while(place >= 0.0 && place <= 7.0){
                if( Math.random() < .5){
                    place =  place - 1.0;
                }
                else{
                    place = place + 1.0;
                }
                steps = steps + 1;
            }
            avg = steps + avg;
            if(greatestAmount < steps){
                greatestAmount = steps;
            }
            place = 3.5;
            steps = 0;
        }
        avg = avg / 50;
        System.out.println("The average amount of steps is " + (int)avg);
        System.out.println("The greatest amount of steps is " + greatestAmount);

    }
}
