package teamcalypso;

import java.util.NoSuchElementException;

public class Iterator<E extends Storage> {
    private int position = 0;
    private E[] data;

    public Iterator(E[] data) {
        this.data = data;
    }

    public boolean hasNext() {
        if (position < data.length) {
            return true;
        }
        return false;
    }

    public E next() {
        if (position >= data.length) {
            throw new NoSuchElementException();
        } else {
            E e = data[position];
            position++;
            return e;
        }
    }
}
