package Assignment2;

/**
 * enum contains numbers from (1-100) as words instead of digits
 * and a method for converting from digits to words
 */
public enum Number {

    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),

    ELEVEN(11), TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19),

    TWENTY(20), THIRTY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70), EIGHTY(80), NINETY(90), ONE_HUNDRED(100);

    public final int number;

    Number(int number) {
        this.number = number;
    }

    public static String getNumberAsWord(int number) {
        int absNumber = Math.abs(number);

        //because enum deals with numbers from 0 - 100. When it's bigger than 100 return number in digits
        if (absNumber > 100) {
            return number + "";
        }

        if (number == 0) {
            return "ZERO";
        }

        // ddealing with composed numbers
        String numberAsWord = "";

        if ((absNumber > 0 && absNumber < 20) || absNumber % 10 == 0) {

            numberAsWord = getNumber(absNumber) + "";

        } else {
            Number tensPart = getNumber(Integer.parseInt(absNumber / 10 + "0"));
            Number singlePart = getNumber(absNumber % 10);

            numberAsWord = tensPart + "-" + singlePart;
        }

        if (number < 0) {
            numberAsWord = "MINUS " + numberAsWord;
        }

        return numberAsWord;
    }


    private static Number getNumber(int number) {

        for (Number temp : Number.values()) {
            if (temp.number == number) {
                return temp;
            }
        }

        return null;
    }

}
