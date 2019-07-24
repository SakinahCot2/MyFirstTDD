package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;

import java.util.Date;


public class DogTest {
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    //Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest(){
      String givenName = "Milo";
      Date givenBirthDate = new Date();
      Integer givenId = 0;
      Dog dog = new Dog(givenName, givenBirthDate, givenId);

      String retrievedName = dog.getName();
      Date retrievedBirthDate = dog.getBirthDate();
      Integer retrievedId = dog.getId();

      Assert.assertEquals(givenName, retrievedName);
      Assert.assertEquals(givenBirthDate, retrievedBirthDate);
      Assert.assertEquals(givenId, retrievedId);
    }
//    Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Date expected = givenBirthDate;
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
// Create tests for `speak`
    @Test
    public void speakTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.eat(new Food());

        Integer expected = 1;
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
// Create tests for `Integer getId()`
    @Test
    public void idTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Integer expected = givenId;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);

    }
// testing if dog inherits animal
    @Test
    public void animalInheritTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertTrue(dog instanceof Animal);
    }
// testing if dog inherits mammal
    @Test
    public void mammalInheritTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertTrue(dog instanceof Mammal);
    }
}