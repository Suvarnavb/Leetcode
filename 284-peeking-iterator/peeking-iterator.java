
import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.nextElement = null;
    }

    public Integer peek() {
        if (nextElement == null) {
            nextElement = iterator.next();
        }
        return nextElement;
    }

    @Override
    public Integer next() {
        if (nextElement != null) {
            Integer result = nextElement;
            nextElement = null;
            return result;
        }

        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return nextElement != null || iterator.hasNext();
    }
}
