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
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addCatTest(){
        Dog dog=new Dog();
        Integer expected=1;
        DogHouse.clear();
        DogHouse.add(dog);
        Integer actual=DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, expected);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        Dog dog=new Dog();
        Integer actual;
        Integer expected=2;
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.add(dog);
        actual=DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
        CatHouse.remove(0);
        expected=1;
        actual=DogHouse.getNumberOfDogs()
        Assert.assertEquals(actual, expected);


    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest(){

        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Integer actual;
        Integer expected=2;
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        actual=DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, expected);
        DogHouse.remove(dog1);
        expected=1;
        actual=CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetId(){
        Dog dog=new Dog();
        Dog expected=dog;
        DogHouse.clear();
        DogHouse.add(dog);
        Dog actual=DogHouse.getDogById(0);
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testNoOfCats() {
        Dog dog = new Dog();
        Integer expected = 1;
        DogHouse.clear();
        DogHouse.add(dog);
        Integer actual=DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
