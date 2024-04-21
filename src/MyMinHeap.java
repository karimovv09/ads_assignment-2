public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> list;

    public MyMinHeap(MyList<T> list) {
        this.list = list;
        heapify();
    }

    public void add(T item) {
        list.add(item);
        siftUp(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return list.get(0);
    }

    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = list.get(0);
        T last = list.getLast();
        list.set(0, last);
        list.removeLast();
        siftDown(0);
        return min;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    private void heapify() {
        for (int i = parent(list.size() - 1); i >= 0; i--) {
            siftDown(i);
        }
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = parent(index);
            if (list.get(parentIndex).compareTo(list.get(index)) <= 0) {
                break;
            }
            swap(parentIndex, index);
            index = parentIndex;
        }
    }

    private void siftDown(int index) {
        while (leftChild(index) < list.size()) {
            int left = leftChild(index);
            int right = rightChild(index);
            int smallest = left;
            if (right < list.size() && list.get(right).compareTo(list.get(left)) < 0) {
                smallest = right;
            }
            if (list.get(index).compareTo(list.get(smallest)) <= 0) {
                break;
            }
            swap(index, smallest);
            index = smallest;
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
