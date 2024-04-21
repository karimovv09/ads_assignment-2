public class TestMyLinkedList {
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
        // Additional tests
        testIndexOf();
        testLastIndexOf();
        testExists();
        testToArray();
        testClear();
    }

    private static void testAdd() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testAdd: " + list.size());
    }

    private static void testGet() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testGet: " + list.get(1)); // Expected: 20
    }

    private static void testSet() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 25);
        System.out.println("testSet: " + list.get(1)); // Expected: 25
    }

    private static void testAddAtIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(30);
        list.add(1, 20);
        System.out.println("testAddAtIndex: " + list.size()); // Expected: 3
    }

    private static void testAddFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        System.out.println("testAddFirst: " + list.get(0)); // Expected: 5
    }

    private static void testAddLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.addLast(30);
        System.out.println("testAddLast: " + list.get(list.size() - 1)); // Expected: 30
    }

    private static void testRemove() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println("testRemove: " + list.size()); // Expected: 2
    }

    private static void testRemoveFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeFirst();
        System.out.println("testRemoveFirst: " + list.size()); // Expected: 2
    }

    private static void testRemoveLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeLast();
        System.out.println("testRemoveLast: " + list.size()); // Expected: 2
    }

    private static void testIndexOf() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testIndexOf: " + list.indexOf(20)); // Expected: 1
    }

    private static void testLastIndexOf() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        System.out.println("testLastIndexOf: " + list.lastIndexOf(20)); // Expected: 2
    }

    private static void testExists() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("testExists: " + list.exists(20)); // Expected: true
    }

    private static void testToArray() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Object[] array = list.toArray();
        System.out.println("testToArray: " + array.length); // Expected: 3
    }

    private static void testClear() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.clear();
        System.out.println("testClear: " + list.size()); // Expected: 0
    }
}
