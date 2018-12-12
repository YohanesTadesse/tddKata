package SearializeDeserialiseTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SerializationTest {

    @Test
    public void name() {
        final String s = "";
        System.out.println(s.substring(1));
    }

    @Test
    public void Serialze() {
        final Serialization s = new Serialization();
        final String st  = "1#2";
        final TreeNode tree = s.deserialize(st);
        final String deS = s.serialize(tree);
        assertEquals(deS, st);
    }
}