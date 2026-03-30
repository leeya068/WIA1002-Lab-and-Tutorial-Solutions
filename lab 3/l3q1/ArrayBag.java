package lab1;

public class ArrayBag<T> implements BagInterface<T> {
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    
    // Default constructor
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    
    // Constructor with custom capacity
    @SuppressWarnings("unchecked")
    public ArrayBag(int capacity) {
        bag = (T[]) new Object[capacity];
        numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }
    
    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }
    
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    
    @Override
    public boolean add(T newEntry) {
        if (isFull()) {
            return false;
        }
        
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }
    
    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        
        T removedItem = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
        return removedItem;
    }
    
    @Override
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        
        if (index >= 0) {
            // Replace the item to be removed with the last item
            bag[index] = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
            return true;
        }
        
        return false;
    }
    
    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }
    
    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                frequency++;
            }
        }
        
        return frequency;
    }
    
    @Override
    public boolean contains(T anEntry) {
        return getIndexOf(anEntry) >= 0;
    }
    
    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];
        }
        
        return result;
    }
    
    // Helper method to find the index of an entry
    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                return i;
            }
        }
        return -1;
    }
}
