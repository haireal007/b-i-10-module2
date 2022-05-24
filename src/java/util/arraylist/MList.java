package java.util.arraylist;
import java.util.Arrays;
public class MList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }



}
