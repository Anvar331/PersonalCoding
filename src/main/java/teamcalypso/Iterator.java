package teamcalypso;

public class Iterator<E extends Storage> {
    private int position = -1;
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
        position++;
        return data[position];

        }
        //return null;
}
