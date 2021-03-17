import static org.junit.Assert.*;

public class Test {

    private ScaleCuboidBox myBox = new ScaleCuboidBox(2,3,5);

    @org.junit.Test
    public void testSame() {
        assertEquals(2, myBox.getLength(), 1e-5);
        myBox.setLength(3);
        assertEquals(3, myBox.getLength(), 1e-5);
    }
}
