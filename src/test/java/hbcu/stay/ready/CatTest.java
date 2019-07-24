package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;


public class CatTest {


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // test for void setName(string Name)
    @Test
    public void setNameTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName("Wutang");
        String expected = "Wutang";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
// test for speak
    @Test
    public void speakTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }
// test for birthdate
    @Test
    public void setBirthDateTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Date expected = givenBirthDate;
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);

    }
    // test for id
    @Test
    public void idTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer expected  = givenId;
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);

    }
// eat test
    @Test
    public void eatTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.eat(new Food());
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);

    }
// animal inheritance test
    @Test
    public void animalInheritTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Animal);
    }
    // mammal inheritance test
    @Test
    public void mammalInheritTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Mammal);
    }

}
