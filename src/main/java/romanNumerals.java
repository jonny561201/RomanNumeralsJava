public enum romanNumerals {
    ONETHOUSAND("M",1000),
    NINEHUNDRED("CM",900),
    ONEHUNDRED("C",100),
    NINETY("XC",90),
    FIFTY("L",50),
    FORTY("XL",40),
    TEN("X",10),
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
