import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;

    @Before
    public void before(){
        commit = new Commit("Initial Commit", CommitType.FEATURE, 172);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Initial Commit", commit.getDescription());
    }

    @Test
    public void canGetType(){
        assertEquals("FEATURE", commit.getType());
    }

    @Test
    public void canGetUniqueID(){
        assertEquals(172, commit.getUniqueID());
    }


}
