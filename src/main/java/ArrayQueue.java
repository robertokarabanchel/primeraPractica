import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T>
{

    private T[] queue;
    private int tail;
    private int front;
    private int size;

    public ArrayQueue(int sizeArray) {

        queue= (T[]) new Object[sizeArray];
        this.front =-1;
        this.tail=0;
        this.size=0;
    }

    public int size() {


        return  this.size;
    }

    public boolean isEmpty()
    {
       return  (this.size()==0)?true:false;
    }

    public T front() throws IllegalStateException {
        if (!isEmpty()){
        return this.queue[front];}
        else {
            throw  new IllegalStateException();
        }

    }

    public void enqueue(T generics) {
        if (this.size==this.queue.length){
            queue = Arrays.copyOf(queue, 2*queue.length);

        }

        queue[tail]=generics;
        size++;
        tail++;
        if (this.front == -1){
            this.front++;
        }

    }

    public T dequeue() throws IllegalStateException{
    if (this.isEmpty()){
        throw  new IllegalStateException();
        }

    T toReturn= queue[front];
    front++;
    size--;

    return toReturn;

    }
}
