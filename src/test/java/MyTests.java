import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testReverse() {
        assertEquals("[5, 4, 3, 2, 1]", Arrays.toString(MyMain.reverse(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] when reversed should be: " + "[5, 4, 3, 2, 1]");
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(MyMain.reverse(new int[] {5, 4, 3, 2, 1})), "The array [5, 4, 3, 2, 1] when reversed should be: " + "[1, 2, 3, 4, 5]");
        assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(MyMain.reverse(new int[] {1, 1 ,1, 1, 1})), "The array [1, 1 ,1, 1, 1] when reversed should be: " + "[1, 1, 1, 1, 1]");
        assertEquals("[-1, 3, 5, -3, 7]", Arrays.toString(MyMain.reverse(new int[] {7, -3, 5, 3, -1})), "The array [7, -3, 5, 3, -1] when reversed should be: " + "[-1, 3, 5, -3, 7]");
    }

    @Test
    public void testSecondLargest() {
        assertEquals(4, MyMain.secondLargest(new int[] {1, 2, 3, 4, 5}), "The second largest value in the array [1, 2, 3, 4, 5] should be: " + 4);
        assertEquals(23, MyMain.secondLargest(new int[] {11, 23, 5, 97, 6, 18}), "The second largest value in the array [11, 23, 5, 97, 6, 18] should be: " + 23);
        assertEquals(27, MyMain.secondLargest(new int[] {27, 12, 18, 28, 24, 22}), "The second largest value in the array [27, 12, 18, 28, 24, 22] should be: " + 27);
        assertEquals(-18, MyMain.secondLargest(new int[] {-27, -12, -18, -28, -24, -22}), "The second largest value in the array [-27, -12, -18, -28, -24, -22] should be: " + -18);
        assertEquals(8, MyMain.secondLargest(new int[] {12, 2, 3, 4, 5, 7, 8}), "The second largest value in the array [12, 2, 3, 4, 5, 7, 8] should be: " + 8);    }

    @Test
    public void testIsGeometric() {
        assertEquals(true, MyMain.isGeometric(new int[] {1, 2, 4, 8, 16, 32}), "The output of whether the series [1, 2, 4, 8, 16, 32] is geometric should be: " + true);
        assertEquals(false, MyMain.isGeometric(new int[] {1, 2, 4, 7, 14, 28}), "The output of whether the series [1, 2, 4, 7, 14, 28] is geometric should be: " + false);
        assertEquals(false, MyMain.isGeometric(new int[] {1, 2, 4, 8, 16, 33}), "The output of whether the series [1, 2, 4, 8, 16, 33] is geometric should be: " + false);
        assertEquals(true, MyMain.isGeometric(new int[] {1, 3, 9, 27, 81, 243, 729}), "The output of whether the series [1, 3, 9, 27, 81, 243, 729] is geometric should be: " + true);
        assertEquals(false, MyMain.isGeometric(new int[] {1, 3, 9, 27, 81, 244, 729}), "The output of whether the series [1, 3, 9, 27, 81, 244, 729] is geometric should be: " + false);
        assertEquals(true, MyMain.isGeometric(new int[] {1, -4, 16, -64, 256}), "The output of whether the series [1, -4, 16, -64, 256] is geometric should be: " + true);

        assertEquals(true, MyMain.isGeometric(new int[] {32, 16, 8, 4, 2, 1}), "The output of whether the series [32, 16, 8, 4, 2, 1] is geometric should be: " + true);
        assertEquals(true, MyMain.isGeometric(new int[] {256, 64, 16, 4, 1}), "The output of whether the series [256, 64, 16, 4, 1] is geometric should be: " + true);
    }
}
