package hbcu.stay.ready;


import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CatHouseTest {

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test

    //test for adding a cat
    public void addCatTest(){
        Cat animal = AnimalFactory.createCat("Sparkles", new Date());
        CatHouse.clear(); //empties list to 0, essentially starts over
        CatHouse.add(animal); //Cathouse list + 1
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
   // test for removing a cat
   @Test
   public void removeCatTest(){
        Cat animal = AnimalFactory.createCat("Spartan", new Date());
        CatHouse.add(animal);
        CatHouse.remove(animal);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
   }
   // get number of cats test
@Test
    public void getNumberOfCats(){
        String name = "Puffles";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(animal);
        CatHouse.getNumberOfCats();

    }
    @Test
    public void removeIDTest(){
        String name = "Puffles";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.remove(animal.getId());
        }

        @Test
    public void getCatID(){
            String name = "Puffles";
            Date birthDate = new Date();
            Cat animal = AnimalFactory.createCat(name, birthDate);
            CatHouse.getCatById(animal.getId());
        }


}
