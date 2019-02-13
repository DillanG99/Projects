public class ZooTest {
	
	public void constructorTest() throws AssertException {
		Zoo zoo = new Zoo(5);
		
		Assert.assertEquals(5, zoo.getCapacity());
		zoo.addAnimal(new Animal("test", "testing", 1.0, 1.0));
		Animal[] ref = zoo.getAnimals();
		Assert.assertEquals(zoo.getAnimals(), ref);
	}
	public void methodTests() throws AssertException {
		Zoo zoo = new Zoo(2);
		
		zoo.addAnimal(new Animal("test", "testing", 1.0, 1.0));
		Assert.assertEquals(1.0, zoo.getTotalHeight(), 0.01);
		zoo.addAnimal(new Animal("testing", "test", 1.0, 1.0));
		Assert.assertEquals(1, zoo.getAverageWeight());
		zoo.addAnimal(new Animal("expand", "expansion", 1.0, 1.0));
		Assert.assertEquals(4, zoo.getCapacity());
		Assert.assertEquals(1, zoo.getAverageWeight("test"));
	}
}