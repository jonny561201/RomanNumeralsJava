public class RomanNumeral {

    public String convert(int arabicNumeral) {

        String romanResponse = "";
        for(romanNumerals numeral : romanNumerals.values()) {
            if (arabicNumeral >= numeral.arabic) {
                while (arabicNumeral >= numeral.arabic) {
                    arabicNumeral -= numeral.arabic;
                    romanResponse += numeral.roman;

                }
            }
        }
        return romanResponse;
    }
}

