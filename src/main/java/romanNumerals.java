public enum romanNumerals {
    FIVE("V",5),
    ONE("I",1);

    public String roman;
    public int arabic;

    romanNumerals(String roman, int arabic) {

        this.roman = roman;
        this.arabic = arabic;
    }
}
