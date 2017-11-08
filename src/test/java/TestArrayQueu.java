import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestArrayQueu {
    @Test
    public void testIsEmpty() {
        ArrayQueue<Integer> stack = new ArrayQueue<Integer>(5);
        assertTrue(stack.isEmpty());
        stack.enqueue(3);
        assertFalse(stack.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopException() {
        ArrayQueue<Integer> stack = new ArrayQueue<Integer>(5);
        stack.dequeue();
    }

    @Test
    public void testEnqeue (){
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertTrue(queue.front()==1);
        queue.dequeue();
        assertTrue(queue.front()==2);
        queue.dequeue();
        queue.dequeue();

    }

    @Test(expected = IllegalStateException.class)
    public void testFront (){
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.front();

    }
    @Test
    public void testDequeu (){
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        int salida=queue.dequeue();
        assertTrue(salida==1);
       int salida2= queue.dequeue();
        assertTrue(salida2==2);

    }
    @Test
    public void testSizeArray(){

        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertTrue(queue.size()==4);
        queue.dequeue();
        assertTrue(queue.size()==3);
    }

}
