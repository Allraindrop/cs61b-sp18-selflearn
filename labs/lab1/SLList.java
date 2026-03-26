public class SLList {
    private IntNode first;

    public SLList() {
        first = null;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public void printList() {
        IntNode p = first;
        while (p != null) {
            System.out.println(p.item);
            p = p.next;
        }
    }
}