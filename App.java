public class App {
    public static void main(String[] args) throws Exception {
        int num = 0;
        int repeatOne = 0;
        int avgNum = 0;
        int iNum = 0;
        int greatestNum = 0;
        for(int i = 1; i <= 200; i = i + 1 ){
            iNum = i;
            while(repeatOne < 2){
                if(iNum % 2 == 0){
                   iNum = iNum / 2 ;
                }
                else{
                    iNum = (iNum * 3) + 1;
                }

                if(iNum == 1){
                    repeatOne = repeatOne + 1;
                }
                num++;
            }
            if(avgNum < num){
                avgNum = num;
                greatestNum = i;
            }
            num = 0;
            repeatOne = 0;
        }
        System.out.println("the Max iterations is: " + avgNum);
        System.out.println("the number at the max is " + greatestNum);
    }
}
