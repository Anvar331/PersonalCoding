package teamcalypso;

public class Sorter<E extends Storage> {
    //TODO implement logic for this class to sort items by count
    // descending and type ascending (in case some of items is with the same count)


    public Sorter(E[] data) {
        //TODO implement method body
        //сначала сделаем сортировку по убыванию
        for (int i = 0; i < data.length - 1; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j+1]) {
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }

        }
    }

    public E[] sort() {
        //TODO implement method body
        return null;
    }
}
