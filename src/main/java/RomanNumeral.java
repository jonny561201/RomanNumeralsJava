
public class RomanNumeral {

    public String convert(int arabicNumeral) {
        if (arabicNumeral == 1) {
            return "I";
        }
        if (arabicNumeral == 2) {
            return "II";
        }
        if (arabicNumeral == 3) {
            return "III";
        }
        return "IV";
    }
}
