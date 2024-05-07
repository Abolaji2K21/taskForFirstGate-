package ChapterEight;

import java.util.Arrays;

public class HugeInteger {
    private  int[] digits;


    public HugeInteger(String number) {
        if (!number.matches("\\d{1,40}")) {
            throw new HugeIntegerMotherException("Invalid input");
        }
        if((number.length() > 40)){
            throw new HugeIntegerMotherException("Invalid Length size");
        }
        if (number.isEmpty()) {
            throw new HugeIntegerMotherException("Input cannot be empty");
        }
        myParse(number);

    }
    public void myParse(String number) {
        digits = new int[40];

        int index = 39;
        for (int count = number.length() - 1; count >= 0 && index >= 0; count--) {
            char character = number.charAt(count);
            if (Character.isDigit(character)) {
                digits[index--] = Character.getNumericValue(character);
            }
        }
    }
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger("");

        int carry = 0;
        for (int count = digits.length - 1; count >= 0; count--) {
            int sum = digits[count] + other.digits[count] + carry;
            result.digits[count] = sum % 10;
            carry = sum / 10;
        }

        if (carry != 0) {
            int[] newDigits = Arrays.copyOf(result.digits, digits.length + 1);
            newDigits[0] = carry;
            result.digits = newDigits;
        }

        return result;
    }

    public HugeInteger subtract(HugeInteger other){
        HugeInteger result = new HugeInteger("");
        int borrow = 0;
        for (int count = digits.length - 1; count >= 0; count--) {
            int diff = digits[count] - other.digits[count] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[count] = diff;
        }
        if (borrow != 0) {
            int[] newDigits = Arrays.copyOf(result.digits, digits.length + 1);
            newDigits[0] = borrow;
            result.digits = newDigits;
        }

        return result;
    }


}

