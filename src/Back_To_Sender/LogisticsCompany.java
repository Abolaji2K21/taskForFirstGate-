package Back_To_Sender;

import Exceptions.InvalidDeliveriesException;

public class LogisticsCompany {

    private static int commission = 0;
//    private static final int packagesPerRider = 100;
    private static int baseSalary = 5000;
    private static int amountPerParcel = 0;


    public static int calculateWage(int successfulDeliveries) {

        validateDeliveries(successfulDeliveries);

        commission = successfulDeliveries * amountPerParcel + baseSalary;
        return commission;
    }

    private static void validateDeliveries(int successfulDeliveries) {
        if (successfulDeliveries < 0) {
            throw new InvalidDeliveriesException("Delivery count can not be negative");
        }
        if (successfulDeliveries < 50) {
            amountPerParcel = 160;
        } else if (successfulDeliveries < 60) {
            amountPerParcel = 200;
        } else if (successfulDeliveries < 70) {
            amountPerParcel = 250;
        } else {
            amountPerParcel = 500;
        }
    }


}
