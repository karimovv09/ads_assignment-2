public class TestMyArrayList {
    public static void main(String[] args) {
        testAdd();
        testGet();
        testSet();
        testAddAtIndex();
        testAddFirst();
        testAddLast();
        testRemove();
        testRemoveFirst();
        testRemoveLast();
        testSort();
        testIndexOf();
        testLastIndexOf();
        testExists();
        testToArray();
        testClear();
    }

    private static void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testAdd: " + list.size());
    }

    private static void testGet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testGet: " + list.get(1)); // Expected: 20
    }

    private static void testSet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 25);
        System.out.println("testSet: " + list.get(1)); // Expected: 25
    }

    private static void testAddAtIndex() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(30);
        list.add(1, 20);
        System.out.println("testAddAtIndex: " + list.size()); // Expected: 3
    }

    private static void testAddFirst() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        System.out.println("testAddFirst: " + list.get(0)); // Expected: 5
    }

    private static void testAddLast() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.addLast(30);
        System.out.println("testAddLast: " + list.get(list.size() - 1)); // Expected: 30
    }

    private static void testRemove() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println("testRemove: " + list.size()); // Expected: 2
    }

    private static void testRemoveFirst() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeFirst();
        System.out.println("testRemoveFirst: " + list.size()); // Expected: 2
    }

    private static void testRemoveLast() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeLast();
        System.out.println("testRemoveLast: " + list.size()); // Expected: 2
    }

    private static void testSort() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.sort();
        System.out.println("testSort: " + list.get(0)); // Expected: 10
    }

    private static void testIndexOf() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testIndexOf: " + list.indexOf(20)); // Expected: 1
    }

    private static void testLastIndexOf() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        System.out.println("testLastIndexOf: " + list.lastIndexOf(20)); // Expected: 2
    }

    private static void testExists() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testExists: " + list.exists(20)); // Expected: true
    }

    private static void testToArray() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Object[] array = list.toArray();
        System.out.println("testToArray: " + array.length); // Expected: 3
    }

    private static void testClear() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.clear();
        System.out.println("testClear: " + list.size()); // Expected: 0
    }
}
