package HW;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MathAverageTest {

    @Test
    void mathAverage() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            list.add(200);
            list.add(422);
            list.add(740);
            list.add(853);
            list.add(950);
        }
        assertThat(MathAverage.MathAverage(list)).isEqualTo(633);
    }
}