package teamcalypso;

public class Sorter<E extends Storage> {
    private final E[] data;
    //TODO implement logic for this class to sort items by count
    // descending and type ascending (in case some of items is with the same count)


    public Sorter(E[] data) {
        this.data = data;

    }

    public E[] sort() {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Storage first = data[j];
                Storage second = data[j+1];
                if (second.getSize() > first.getSize()) {
                    swapElements(j);
                } else if (second.getSize() == first.getSize()) {
                    if (second.getType().compareTo(first.getType()) < 0) {
                        swapElements(j);
                    }
                }
            }
        }
        return data;
    }

    private void swapElements(int j) {
        E tmp = data[j];
        data[j] = data[j + 1];
        data[j + 1] = tmp;
    }

}
