package ChapterEight;

import java.util.Arrays;

import static java.lang.Long.sum;

public class HugeInteger {
    private  int[] digits;



    public HugeInteger(String number) {
        if (!number.matches("-?\\d+")) {
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
            newDigits[0] = -1;
            result.digits = newDigits;
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        boolean isNegative = digits[0] < 0;

        for (int digit : digits) {
            if (digit != 0) {
                leadingZero = false;
            }
            if (!leadingZero || isNegative) {
                sb.append(Math.abs(digit));
            }
        }

        if (sb.length() == 0) {
            sb.append(0);
        }

        if (isNegative) {
            sb.insert(0, '-');
        }

        return sb.toString();
    }



    public boolean isEqualTo(HugeInteger other) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != other.digits[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > other.digits[i]) {
                return true;
            } else if (digits[i] < other.digits[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        return !isGreaterThan(other) && !isEqualTo(other);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return isGreaterThan(other) || isEqualTo(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return isLessThan(other) || isEqualTo(other);
    }


}

