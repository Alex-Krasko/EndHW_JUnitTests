package HW;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AverageListGenTest {

    @Test
    void averageListGen() {
        int colLength = 5;
        int boundNums = 100;
        ArrayList<Integer> list = AverageListGen.AverageListGen(colLength, boundNums);
        assertThat(list).isNotNull();

    }
}