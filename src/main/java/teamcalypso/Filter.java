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
        E[] newStorage = new E [data.length];
        for (int i = 0; i < data.length; i++) {
            if ((data[i].getType().charAt(0) > 'a') && (data[i].getType().charAt(0) < 'z')){
                 newStorage[index] = data[i];
                 index++;
            }
        }
        return newStorage;
    }
}
