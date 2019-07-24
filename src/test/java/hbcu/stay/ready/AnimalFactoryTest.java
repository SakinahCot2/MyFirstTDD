package hbcu.stay.ready;


import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AnimalFactoryTest {
    //Test for `Animal createCat(String name, Date birthDate)`

    //Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String givenName = "jeff";
        Date givenBirthDate = new Date();
// uses animal factory object since create dog is a static
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);

        String expected = "jeff";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatTest(){
        String givenName = "Puffles";
        Date givenBirthDate = new Date();
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        String expected = "Puffles";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
}
