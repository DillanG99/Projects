public class EquipmentTest
{

    public void fullConstructorTest() throws AssertException {
    	//use full constructor
    	Equipment equip = new Equipment("test/1,1.0,1.0,testing");
    	
    	//The color should be "test", name "testing", height and weight 1.0
    	Assert.assertEquals("test", equip.getName());
    	Assert.assertEquals("testing", equip.getDescription());
    	Assert.assertEquals(1.0, equip.getTotalWeight(), 0.01);
    	Assert.assertEquals(1.0, equip.getTotalPrice(), 0.01);
    }
    public void toStringTest( ) throws AssertException {
    	Equipment equip = new Equipment("test/1,1.0,1.0,testing");
    	String info = equip.toString();
    	Assert.assertEquals("Name: test, Number: 1, Weight: 1.00 lbs, Price: $1.00 - testing", info);
    }
}