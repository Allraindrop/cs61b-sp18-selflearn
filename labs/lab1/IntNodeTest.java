public class IntNodeTest {
    public static void main(String[] args) {
        IntNode first = new IntNode(5, null);
        IntNode second = new IntNode(10, null);

        first.next = second;

        System.out.println(first.item);
        System.out.println(first.next.item);
    }
}