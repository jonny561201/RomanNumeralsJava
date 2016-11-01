public enum romanNumerals {
    FIVE("V",5),
    FOUR("IV",4),
    ONE("I",1);

    public String roman;
    public int arabic;

    romanNumerals(String roman, int arabic) {

        this.roman = roman;
        this.arabic = arabic;
    }
}
