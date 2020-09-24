package teamcalypso;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilterTest {

    @Test
    public void firstFilterTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),
                new Storage(4, "String", 12),
        };
        Filter firstFilter = new Filter(data);
        Storage[] array = firstFilter.applyFilter();
        assertEquals(array.length,1);
        assertEquals(array[0].getType(),"int");
    }

    @Test
    public void secondFilterTest() {
        Storage[] data = new Storage[]{
                new Storage(8, "Double", 15),
                new Storage(4, "String", 12),
        };
        Filter firstFilter = new Filter(data);
        Storage[] array = firstFilter.applyFilter();
        assertEquals(array.length,0);
    }

}