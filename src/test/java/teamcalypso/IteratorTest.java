package teamcalypso;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class IteratorTest {

    @Test
    public void firstIteratorTest() {
        Iterator iterator = new Iterator(new Storage[0]);
        boolean result = iterator.hasNext();
        assertEquals(result,false);
    }

    @Test
    public void secondIteratorTest() {
        Iterator iterator = new Iterator(new Storage[2]);
        boolean result = iterator.hasNext();
        assertEquals(result,true);
    }

    @Test
    public void thirdIteratorTest() {
        Storage[] data = new Storage[]{
                new Storage(1, "int", 10),
                new Storage(2, "float", 4),

        };
        Iterator iterator = new Iterator(data);
        Storage result = iterator.next();
        assertEquals(result.getId(),1);
        assertEquals(result.getType(),"int");
        assertEquals(result.getSize(),10);
    }

    //If method Next cannot return next data
    //if the method cannot provide any data it should throw mistake
    @Test(expected = NoSuchElementException.class)
    public void fourthIteratorTest() {
        Storage[] data = new Storage[0];
        Iterator iterator = new Iterator(data);
        iterator.next();
    }
}