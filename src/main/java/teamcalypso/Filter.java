package teamcalypso;

public class Filter<E extends Storage>  {

    private final E[] data;

    public Filter(E[] data) {
        this.data = data;
    }

    public E[] applyFilter() {
        E[] result = findStorageWithTypesWithCapitalLetters();

        return result;
    }

    private E[] findStorageWithTypesWithCapitalLetters() {
        int index = 0;
        Storage[] newStorage = new Storage[data.length];
        for (int i = 0; i < data.length; i++) {
            if (!(data[i].getType().charAt(0) > 'A') && (data[i].getType().charAt(0) < 'Z')){
                 newStorage[index] = data[i];
                 index++;
            }
        }
        return data;
    }
}
