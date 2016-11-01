import junit.framework.Assert;
import org.junit.Test;

public class RomanNumeralTests {
    private RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    public void convertGivenOneShouldReturnI() {
        String actual = romanNumeral.convert(1);
        Assert.assertEquals("I", actual);
    }

    @Test
    public void convertGivenTwoShouldReturnII() {
        String actual = romanNumeral.convert(2);
        Assert.assertEquals("II", actual);
    }

    @Test
    public void convertGivenThreeShouldReturnIII() {
        String actual = romanNumeral.convert(3);
        Assert.assertEquals("III", actual);
    }

    @Test
    public void convertGivenFourShouldReturnIV() {
        String actual = romanNumeral.convert(4);
        Assert.assertEquals("IV", actual);
    }

    @Test
    public void convertGivenFiveShouldReturnV() {
        String actual = romanNumeral.convert(5);
        Assert.assertEquals("V", actual);
    }

    @Test
    public void convertGivenSixShouldReturnVI() {
        String actual = romanNumeral.convert(6);
        Assert.assertEquals("VI", actual);
    }
}
