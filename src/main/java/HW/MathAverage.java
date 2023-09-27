package HW;

import java.util.ArrayList;

public class MathAverage {
    public static  Integer MathAverage (ArrayList<Integer> numsList) {
        int aveNum = 0;
        for (int n : numsList) {
            aveNum += n;
        }
        return aveNum / numsList.size();
    }
}
