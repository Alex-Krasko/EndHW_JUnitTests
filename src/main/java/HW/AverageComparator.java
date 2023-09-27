package HW;

import java.util.ArrayList;

public class AverageComparator {
    public static Integer AverageComparator (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int averageNum1 = MathAverage.MathAverage(list1);
        int averageNum2 = MathAverage.MathAverage(list2);
        if(averageNum1 > averageNum2) { return 1 ;}
        else if (averageNum1 == averageNum2) { return 3; }
        else { return 2; }
    }
}
