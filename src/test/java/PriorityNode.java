import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tadessey on 5/26/17.
 */
public class PriorityNode {
    CustomPriorityQueue customPriorityQueue = new CustomPriorityQueue();

    @Test

    public void shouldReturnNullToEmptyQueue() throws Exception {
        Node node = new Node();
        Assert.assertEquals(null, node.head);
    }
    @Test
    public void shouldReturnTheFirstElementWhileHadOnlyOne(){
        Node node =new Node();
        node.element = 1;
        customPriorityQueue.enQueue(node);
        Assert.assertEquals(1,  customPriorityQueue.getElements());

    }

    @Test

    public void shouldReturnAllElements() throws Exception {
        List<Node> nodeList = new ArrayList<Node>();
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            Node node = new Node();
            node.element = random.nextInt();
            nodeList.add(node);
        }
        for(Node node: nodeList){
            customPriorityQueue.enQueue(node);
        }
        Assert.assertEquals(nodeList.size(), customPriorityQueue.size());
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test

    public void shouldReturnZeroForEmptyQueue() throws Exception {
        Node node = new Node();
        Assert.assertEquals(0, customPriorityQueue.size());
    }

    public class CustomPriorityQueue{
        Node node = new Node();
        Node current;

        void enQueue(Node element) {

            if(node.head == null) {
                node.head = element;
                node.element =element.element;
                current = node.head;
            } else{
                while (node.next != null){
                    node.head = node.next;
                }
                node.head.next = element;
                node.head.element = element.element;
                element.previous = node.head;
            }

        }

        public int getElements() {
            return node.element;
        }
        int size() {
            if( current == null) return 0;

            int counter = 0;
            while (current == null){
                current = current.next;
                counter ++;
            }
            return counter;
        }
    }

    class Node {
        int element;
        Node next = null , previous = null, head = null;
    }
}
