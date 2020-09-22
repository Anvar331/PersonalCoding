package teamcalypso;

import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void firstSorterTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),
                new Storage(2, "float", 4),

        };
        Sorter firstSorter = new Sorter(data);
        Storage[] array = firstSorter.sort();
        assertEquals(array[0].getId(),2);
        assertEquals(array[1].getId(),1);
    }

    @Test
    public void secondSorterTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),
                new Storage(1, "float", 4),

        };
        Sorter firstSorter = new Sorter(data);
        Storage[] array = firstSorter.sort();
        assertEquals(array[0].getType(),"float");
        assertEquals(array[1].getType(),"int");
    }

    @Test
    public void thirdSorterTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),

        };
        Sorter firstSorter = new Sorter(data);
        Storage[] array = firstSorter.sort();
        assertEquals(array[0].getType(),"int");
    }

    @Test
    public void fourthSorterTest() {
        Storage[] data = new Storage[0];
        Sorter firstSorter = new Sorter(data);
        Storage[] array = firstSorter.sort();
        assertEquals(array.length,0);
    }

}