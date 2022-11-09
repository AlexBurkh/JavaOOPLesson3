import java.util.Iterator;

public interface MyList<T> extends Iterable<T> {
    void add(T item);
    T get(int index);
}
