package HW;

import java.util.Random;
import java.util.ArrayList;

public class AverageListGen {
    private static final Random random = new Random();
    public static ArrayList<Integer> AverageListGen(int col, int bound){
        ArrayList<Integer> averageNums = new ArrayList<Integer>();
        for(int i = 0; i < col; i++){
            averageNums.add(random.nextInt(bound));
        }
        return averageNums;
    }



}
