import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class RoverTest {

    @Test
    public void land() {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area,5, 5, "E");
        Postion location = rover.getPosition();
        assertThat(location.toString()).isEqualTo("55E");
    }

    @Test
    public void getPosition() {

    }

    @Test
    public void move() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5, 5, "E");
        rover.move();
        Postion location = rover.getPosition();
        assertThat(location.toString()).isEqualTo("56E");

    }


}