package SearializeDeserialiseTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SerializationTest {

    @Test
    public void Serialize() {
        final Serialization s = new Serialization();
        final String st  = "1#2";

        final TreeNode tree = s.deserialize(st);

        final String deS = s.serialize(tree);

        assertEquals(deS, st);
    }
}
