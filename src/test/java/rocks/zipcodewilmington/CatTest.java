package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest() {

        Cat cat= new Cat(null, null, null);
        String givenName = "Kitty";
        cat.setName(givenName);
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    // TODO - Create tests for `speak`

    @Test
    public void speakTest(){
        Cat cat=new Cat(null, null, null);
        String given="meow!";
        String expected= cat.speak();
        Assert.assertEquals(given,expected );
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {

        Cat cat= new Cat(null, null, null);
        Date givenBirthDate = new Date();
        cat.setBirthDate(givenBirthDate);
        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(catBirthDate, givenBirthDate);
    }



    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatFoodTest(){
        Cat cat = new Cat(null, null, null);
        Integer given=0;
        Integer expected= cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, given);
    }


    // TODO - Create tests for `Integer getId()`

    @Test
    public void gedIdTest(){
        Integer given=0;
        Cat cat = new Cat(null, null, given);
        Integer expected = cat.getId();
        Assert.assertEquals(expected, given);


    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void keyWordTest(){
        Cat cat =new Cat(null,null,null);
        Assert.assertTrue(cat instanceof Animal);

    }




    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void keyWordsTest(){
        Cat cat =new Cat(null,null,null);
        Assert.assertTrue(cat instanceof Mammal);

    }



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

}
