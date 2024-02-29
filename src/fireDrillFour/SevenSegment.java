package fireDrillFour;

public class SevenSegment {

    private static boolean isOn;

    public String displaySegment(String digits) {
        validate(digits);

        return switch (digits) {
            case "11111101" -> {
                yield """
                        # # # #
                        #     #
                        #     #
                        #     #
                        # # # #
                        """;
            }
            case "01100001" -> {
                yield  """
                               #
                               #
                               #
                               #
                               #
                       """;


            }
            case "11011011" -> {
                yield  """
                        # # # #
                              #
                        # # # #
                        #
                        # # # #
                       """;



            }
            case "11110011" -> {
                yield  """
                        # # # #
                              #
                        # # # #
                              #
                        # # # #
                       """;

            }

            case "01100111" -> {
                yield  """
                        #     #
                        #     #
                        # # # #
                              #
                              #
                       """;


            }
            case "10110111" ->{
                yield  """
                        # # # #
                        #
                        # # # #
                              #
                        # # # #
                       """;

            }
            case "10111111" -> {
                yield  """
                        # # # #
                        #
                        # # # #
                        #     #
                        # # # #
                       """;
            }
            case "11100001" -> {
                yield """
                      # # # #
                            #
                            #
                            #
                            #
                      """;
            }
            case "11111111" -> {
                yield  """
                        # # # #
                        #     #
                        # # # #
                        #     #
                        # # # #
                       """;
            }
            case "11110111" -> {
                yield  """
                        # # # #
                        #     #
                        # # # #
                              #
                        # # # #
                       """;

            }
            default -> "";
        };
    }



    private void validate(String numbers) {
            if (numbers.length() != 8) {
                throw new IllegalArgumentException("Number must be 8 digits long");
            }
            if (numbers.charAt(7) == '0') {
                isOn = false;
            } else if (numbers.charAt(7) == '1') {
                isOn = true;
            } else {
                throw new IllegalArgumentException("Invalid last digit. Should be '0' or '1'.");
            }
    }
    public boolean isOn() {
        return isOn;
    }
}