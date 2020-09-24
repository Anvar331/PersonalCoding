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

    @Test
    public void thirdFilterTest() {
        Storage[] data = new Storage[]{
                new Storage(3, "double", 6),
                new Storage(4, "String", 12),
                new Storage(5, "BigDecimal", 13),
                new Storage(6, "Integer", 12),
                new Storage(7, "Double", 15),
                new Storage(8, "Object", 4),
        };
        Filter firstFilter = new Filter(data);
        Storage[] array = firstFilter.applyFilter();
        assertEquals(array.length,1);
        assertEquals(array[0].getType(),"double");
    }

    @Test
    public void fourthFilterTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),
                new Storage(2, "float", 4),
                new Storage(3, "double", 6),
                new Storage(4, "String", 12),
        };
        Filter firstFilter = new Filter(data);
        Storage[] array = firstFilter.applyFilter();
        assertEquals(array.length,3);
        assertEquals(array[0].getType(),"int");
        assertEquals(array[1].getType(),"float");
        assertEquals(array[2].getType(),"double");
    }

    @Test
    public void fifthFilterTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),
                new Storage(2, "float", 4),
                new Storage(3, "double", 6),
        };
        Filter firstFilter = new Filter(data);
        Storage[] array = firstFilter.applyFilter();
        assertEquals(array.length,3);
        assertEquals(array[0].getType(),"int");
        assertEquals(array[1].getType(),"float");
        assertEquals(array[2].getType(),"double");
    }
}