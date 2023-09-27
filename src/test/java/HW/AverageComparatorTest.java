package HW;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AverageComparatorTest {

    @Test
    void averageComparator() {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            list1.add(200);
            list1.add(422);
            list1.add(740);
            list1.add(853);
            list1.add(950); // average = 633
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            list2.add(751);
            list2.add(623);
            list2.add(753);
            list2.add(458);
            list2.add(620); // average = 641
        }
        assertThat(AverageComparator.AverageComparator(list1, list2)).isEqualTo(2);
    }
}