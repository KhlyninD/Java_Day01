import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList{

    private Node first;

    private Node last;

    private int size;

    private static class Node {

        Transaction transaction;

        Node next;

        Node previous;

        public Node(Transaction transaction) {
            this.transaction =  transaction;
        }
    }

    public TransactionsLinkedList() {
        this.size = 0;
    }

    @Override
    public void addTransaction(Transaction transaction) {

        Node newNode = new Node(transaction);

        if (first == null) {
            newNode.next = null;
            first = newNode;
            last = newNode;
            newNode.previous = null;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last =newNode;
        }

        size++;
    }

    @Override
    public void deleteTransaction(UUID uuid) throws TransactionNotFoundException{

        Node node = first;

        if(node != null && node.transaction.getIdentifier() != uuid) {
            while (node != null) {
                if (node.transaction.getIdentifier() == uuid) {
                    break;
                }
                node = node.next;
            }
        }
        if (node == null) {
            throw new TransactionNotFoundException();
        } else {

            Node nodeCopy = node;

            if (node.next == null) {
                last = node.previous;
                last.next = null;
            }

            if (node.previous == null) {
                first = node.next;
                first.previous = null;
            }

            if (node.next != null && node.previous != null) {
                node.previous.next = node.next;
                node.next.previous = nodeCopy.previous;
            }

            size--;
        }
    }

    @Override
    public Transaction[] toArray() {

        if (size == 0) {
            return null;
        }

        Transaction[] array = new Transaction[size];

        Node temp = first;

        int i = 0;

        while (temp != null) {
            array[i] = temp.transaction;
            temp = temp.next;
            i++;
        }

        return array;
    }
}
