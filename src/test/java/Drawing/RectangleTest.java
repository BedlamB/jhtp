package Drawing;

import drawing.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest  {

    @Test
    public void testGoodRect(){
        Rectangle goodRect = new Rectangle(5,2);
        assertEquals(10.0,goodRect.getArea(),0);
        assertEquals(14,goodRect.getPerimeter(),0);
    }

    @Test
    public void testBadRect() {
        Rectangle badRect = new Rectangle(25,25);
        assertEquals(0.0,badRect.getArea(),0);
        assertEquals(0.0,badRect.getPerimeter(),0);
    }




}
