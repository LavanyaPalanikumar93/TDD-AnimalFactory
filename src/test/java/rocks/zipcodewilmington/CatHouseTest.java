package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        Cat cat=new Cat();
        Integer expected=1;
        CatHouse.clear();
        CatHouse.add(cat);
        Integer actual=CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, expected);

    }


    // TODO - Create tests for `void remove(Integer id)`
   @Test
    public void removeIdTest(){
        Cat cat=new Cat();
        Integer actual;
        Integer expected=2;
        CatHouse.clear();
       CatHouse.add(cat);
       CatHouse.add(cat);
       actual=CatHouse.getNumberOfCats();
       Assert.assertEquals(expected,actual);
        CatHouse.remove(0);
        expected=1;
        actual=CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, expected);


    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeTest(){

        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Integer actual;
        Integer expected=2;
        CatHouse.clear();
        CatHouse.add(cat1);
        CatHouse.add(cat2);
      actual=CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, expected);
        CatHouse.remove(cat1);
        expected=1;
        actual=CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }



    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetId(){
        Cat cat=new Cat();
        Cat expected=cat;
        CatHouse.clear();
        CatHouse.add(cat);
        Cat actual=CatHouse.getCatById(0);
        Assert.assertEquals(expected,actual);
    }




    // TODO - Create tests for `Integer getNumberOfCats()`
   @Test
    public void testNoOfCats() {
       Cat cat = new Cat();
       Integer expected = 1;
       CatHouse.clear();
       CatHouse.add(cat);
       Integer actual=CatHouse.getNumberOfCats();
       Assert.assertEquals(expected,actual);
   }


    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }



}
