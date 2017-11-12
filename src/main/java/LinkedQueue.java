public class LinkedQueue<T> implements Queue<T>{


    private class Node<T>{

        private final T element;
        private final Node<T> next;

        public Node(T e, Node n) {
            element = e;
            next = n;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getNext() {
            return next;
        }

    }

    private Node<T> front;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return front ==null;
    }

    @Override
    public T front()  throws IllegalStateException {
    if (isEmpty()){
        throw new IllegalStateException();
    }
        return front.getElement();
    }

    @Override
    public void enqueue(T generics) {
        Node<T> n= new Node<T>(generics,null);
        tail=n;
        size++;
        if (isEmpty()) {
            front=n;
        }



    }

    @Override
    public T dequeue() throws IllegalStateException{
        if(isEmpty()){
            throw new IllegalStateException();
        }
        T toReturn;
        toReturn=front.getElement();
        front=front.getNext();
        size--;
        return toReturn;
    }
}
