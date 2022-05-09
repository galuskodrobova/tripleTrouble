import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TripleTroubleTest {

    @Test
    public void testTripleTrouble() {

        String actual = TripleTrouble.tripleTrouble("aa", "bb" , "cc");
        Assert.assertEquals( actual, "abcabc");

    }
}