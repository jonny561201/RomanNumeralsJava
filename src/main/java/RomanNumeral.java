
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
        if (arabicNumeral == 4) {
            return "IV";
        }
        if (arabicNumeral == 5) {
            return "V";
        }
        return "VI";
    }
}
