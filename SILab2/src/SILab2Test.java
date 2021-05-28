
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class SILab2Test {
    void function(){}
    private ArrayList<Time> createList(Time elems) {
        return new ArrayList<Time>(Arrays.asList(elems));
    }

    private ArrayList<Integer> returnList(Integer elems) {
        return new ArrayList<Integer>(Arrays.asList(elems));
    }

    @Test
    void multipleCondition() {
        RuntimeException ex;
        //Hours - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-5, 57, 30))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(28, 2, 31))));
        //Minutes - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, -52, 3))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 81, 30))));
        //Seconds - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, 109))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, -109))));
        //Time - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 2, 20))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(26, 10, 55))));

        assertEquals(returnList(36315), SILab2.function(createList(new Time(10, 5, 15))));

    }
}
