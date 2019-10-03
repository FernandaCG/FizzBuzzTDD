import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testNumber(){

        int number=1;
        String resultFizzBUzz = fizzBuzz.getNumber(number);
        Assert.assertEquals("1", resultFizzBUzz);

    }

    @Test
    public void testFizz(){
        int number = 3;
        String resultFizzBUzz = fizzBuzz.getNumber(number);
        Assert.assertEquals("Fizz", resultFizzBUzz);

    }

    @Test
    public void testFizzDivisibleByThree(){
        int number = 6;
        String resultFizzBUzz = fizzBuzz.getNumber(number);
        Assert.assertEquals("Fizz", resultFizzBUzz);

    }

    @Test
    public void testBUzz(){
        int number = 5;
        String resultFizzBUzz = fizzBuzz.getNumber(number);
        Assert.assertEquals("Buzz", resultFizzBUzz);

    }

    @Test
    public void testBUzzDivisibleBy5(){
        int number = 10;
        String resultFizzBUzz = fizzBuzz.getNumber(number);
        Assert.assertEquals("Buzz", resultFizzBUzz);

    }

    @Test
    public void testFizzBuzz(){
        int number = 15;
        String resultFizzBUzz = fizzBuzz.getNumber(number);
        Assert.assertEquals("FizzBuzz", resultFizzBUzz);

    }
}
