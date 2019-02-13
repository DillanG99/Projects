/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    public void fullConstructorTest() throws AssertException {
    	//use full constructor
    	Animal animal = new Animal("test", "testing", 1.0, 1.0);
    	
    	//The color should be "test", name "testing", height and weight 1.0
    	Assert.assertEquals("test", animal.getColor());
    	Assert.assertEquals("testing", animal.getName());
    	Assert.assertEquals(1.0, animal.getHeight(), 0.01);
    	Assert.assertEquals(1.0, animal.getWeight(), 0.01);
    }
    public void toStringTest() throws AssertException {
    	Animal animal = new Animal("test", "testing", 1.0, 1.0);
    	String info = animal.toString();
    	
    	Assert.assertEquals("testing, a test-colored animal. 1.0 pounds, 1.0 inches\n", info);
    }
}

