import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedQueueTest {

    LinkedQueue<Integer> prueba= new LinkedQueue<Integer>();

    @After
    public void after(){
        prueba=null;
    }

    @Test
    public void size() throws Exception {

        assertTrue(prueba.size()==0);
        for (int i=1; i<10; i++ ){
            prueba.enqueue(i);
            assertTrue(prueba.size()==i);
        }

    }

    @Test
    public void isEmpty() throws Exception {
        assertTrue(prueba.isEmpty()==true);
        for (int i=1; i<10; i++ ){
            prueba.enqueue(i);
            assertTrue(prueba.isEmpty()==false);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void front() throws Exception {
        prueba.front();
        prueba.enqueue(1);
        assertTrue(prueba.front()==1);
        prueba.enqueue(2);
        prueba.enqueue(3);
        prueba.dequeue();
        assertTrue(prueba.front()==2);

    }

    @Test
    public void enqueue() throws Exception {
        prueba.enqueue(1);
        assertTrue(prueba.size()==1);
        prueba.enqueue(2);
        prueba.enqueue(3);
        assertTrue(prueba.size()==3);
        assertTrue(prueba.front()==1);
    }

    @Test(expected = IllegalStateException.class)
    public void dequeue() throws Exception {
        prueba.dequeue();
        prueba.enqueue(1);
        prueba.enqueue(2);
        prueba.enqueue(3);
        assertTrue(prueba.front()==1);
        prueba.dequeue();
        assertTrue(prueba.front()==2);
        assertTrue(prueba.size()==2);




    }

}