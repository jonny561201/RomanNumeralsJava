import junit.framework.Assert;
import org.junit.Test;

public class RomanNumeralTests {

    @Test
    public void convertGivenOneShouldReturnI() {
        RomanNumeral romanNumeral = new RomanNumeral();

        String actual = romanNumeral.convert(1);

        Assert.assertEquals("I", actual);
    }

    @Test
    public void convertGivenTwoShouldReturnII() {
        RomanNumeral romanNumeral = new RomanNumeral();

        String actual = romanNumeral.convert(2);

        Assert.assertEquals("II", actual);
    }
}
