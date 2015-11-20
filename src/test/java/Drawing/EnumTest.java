package Drawing;

import drawing.TrafficLight;
import org.junit.Test;

public class EnumTest {

    @Test
    public void testTrafficLights() {
        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.println(trafficLight);
            System.out.println(trafficLight.getDuration());
        }
    }

}
