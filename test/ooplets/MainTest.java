package ooplets;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the Main class.
 *
 * @author marylene
 * @since 9 August 2018
 */
public class MainTest {
    @Test
    /**
     * This will test that different forms of the same object with appropriate methods 
     * are created.
     *
     * @covers ooplets.Main
     */
    public void testMain() {
        System.out.println("Main");

        Main.SquareShape sq = new Main.SquareShape(5);

        Main.RectangularShape rect = new Main.RectangularShape(5, 7);

        assertEquals("Rectangle", rect.getName());
        assertEquals("Square", sq.getName());
        assertEquals(25, sq.getArea());
        assertEquals(35, rect.getArea());
    }
}
