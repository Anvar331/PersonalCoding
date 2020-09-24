package teamcalypso;

public class Filter<E extends Storage>  {

    private final E[] data;

    public Filter(E[] data) {
        this.data = data;
    }

    public E[] applyFilter() {
        E[] result = findTypesWithSmallLetters();

        return result;
    }

    private int calculateLengthOfNewArray() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if ((data[i].getType().charAt(0) >= 'a') && (data[i].getType().charAt(0) <= 'z')) {
                count = count + 1;
            }
        }
        return count;
    }

    private E[] findTypesWithSmallLetters() {
        int index = 0;
        int lengthOfNewArray = calculateLengthOfNewArray();
        E[] newStorage = (E[]) new Storage[lengthOfNewArray];
        for (int i = 0; i < data.length; i++) {
            if ((data[i].getType().charAt(0) > 'a') && (data[i].getType().charAt(0) < 'z')){
                 newStorage[index] = data[i];
                 index++;
            }
        }
        return newStorage;
    }
}
