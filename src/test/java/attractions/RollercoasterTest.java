package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor, visitor1, visitor2, visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(10, 100, 10.00);
        visitor1 = new Visitor(10, 150, 20.00);
        visitor2 = new Visitor(20, 220, 30.00);
        visitor3 = new Visitor(15, 120, 30.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void tallPeoplePayDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void ableToRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }
}
