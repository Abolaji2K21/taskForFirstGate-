package chapterThree;

import java.util.*;
import java.util.ArrayList;

public class CheckOut {

    private static long phoneNum;
    private static String fullName;
    private static String cashierName;
    private static double discount;
    private static double amountPaid;
    private static ArrayList<String> itemList = new ArrayList<>();
    private static ArrayList<Integer> quantityList = new ArrayList<>();
    private static ArrayList<Double> priceList = new ArrayList<>();
    private static ArrayList<Double> totalList = new ArrayList<>();

    private static Scanner input = new Scanner(System.in);

    public static void main(String... bj) {
        try {
            System.out.print("What Is The Customer's Name: ");
            fullName = input.nextLine();
            System.out.println();

            System.out.print("Welcome " + getFullName(fullName) + ". Kindly Enter Your Phone Number: ");
            phoneNum = input.nextLong();
            System.out.println();

            getItemList();
            getQuantity();
            getPrice();

            while (true) {
                System.out.println("Add More Items? (yes/no)");
                String addMore = input.next();
                System.out.println();
                if (addMore.equalsIgnoreCase("no")) {
                    break;
                }
                getItemList();
                getQuantity();
                getPrice();
            }

            System.out.print("Enter Cashier's Name: ");
            System.out.println();
            cashierName = input.next();
            System.out.println();

            System.out.print("How Much Discount Will He Get: ");
            System.out.println();
            discount = input.nextInt();
            System.out.println();

            for (int index = 0; index < itemList.size(); index++) {
                totalList.add(quantityList.get(index) * priceList.get(index));
            }

            getDisplayAll();
            getDisplayAllWithPayment();

            System.out.print("How Much Did The Customer Give To You: ");
            System.out.println();
            amountPaid = input.nextDouble();
            System.out.println();

            while (amountPaid < getBillTotal()) {
                System.out.println("Amount paid is less than the bill total. Please enter a valid amount.");
                System.out.print("How Much Did The Customer Give To You: ");
                System.out.println();
                amountPaid = input.nextDouble();
                System.out.println();
            }
            getDisplayAll();
            getDisplayForAfterPayment_s();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }

    public static void getDisplayAll() {
        try {
            System.out.println();
            System.out.println("SEMI-COLON STORES");
            System.out.println();
            System.out.println("MAIN BRANCH");
            System.out.println();
            System.out.println("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.");
            System.out.println();
            System.out.println("TEL: " + phoneNum);
            System.out.println();
            System.out.println("DATE: " + getCurrentDateTime());
            System.out.println();
            System.out.println("Customer Name: " + getFullName(fullName));
            System.out.println();
            System.out.println("Cashier's Name: " + getCashierName(cashierName));
            System.out.println();
            System.out.println("===============================================================");
            System.out.println();

            System.out.printf("%-10s%-10s%-15s%-15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
            System.out.println();

            System.out.println("--------------------------------------------------------------");

            for (int count = 0; count < itemList.size(); count++) {
                System.out.printf("%-10s%-10s%-15s%-15s", itemList.get(count), quantityList.get(count),
                        priceList.get(count), quantityList.get(count) * priceList.get(count));

                System.out.println();
            }

            System.out.println("--------------------------------------------------------------");
            System.out.printf("%45s%.2f%n", "SubTotal:", getSubTotal());
            System.out.printf("%45s%.2f%n", "Discount:", getDiscount());
            System.out.printf("%45s%.2f%n", "VAT @ 7.50%:", getVAT());

            System.out.println("===============================================================");
            System.out.println();

            System.out.printf("%45s%.2f%n", "Bill Total:", getBillTotal());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }

    public static void getDisplayAllWithPayment() {
        try {
            System.out.println("===============================================================");
            System.out.println();

            System.out.printf("%-20s%.2f%n", "THIS IS NOT A RECEIPT KINDLY PAY", getBillTotal());
            System.out.println("===============================================================");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }

    public static String getFullName(String fullName) {
        return fullName;
    }

    private static String getCurrentDateTime() {
        Date date = new Date();
        return date.toString();
    }

    private static String getCashierName(String cashierName) {
        return cashierName;
    }

    private static void getItemList() {
        try {
            System.out.println("What Did The User Buy?");
            System.out.println();
            String item = input.next();
            System.out.println();

            itemList.add(item);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }

    private static void getQuantity() {
        try {
            System.out.println("How Many Pieces?");
            System.out.println();
            int quantity = input.nextInt();
            System.out.println();

            quantityList.add(quantity);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }

    private static void getPrice() {
        try {
            System.out.println("How Much Per Unit?");
            System.out.println();
            double price = input.nextDouble();
            System.out.println();

            priceList.add(price);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }

    private static double getSubTotal() {
        double subTotal = 0;
        for (int counter = 0; counter < totalList.size(); counter++) {
            subTotal += totalList.get(counter);
        }
        return subTotal;
    }

    private static double getDiscount() {
        return (getSubTotal() * (discount / 100));
    }

    private static double getVAT() {
        return (getSubTotal() * (7.50 / 100));
    }

    private static double getBillTotal() {
        return (getSubTotal() - getDiscount() + getVAT());
    }

    private static double getBalance() {
        return (amountPaid - getBillTotal());
    }

    public static void getDisplayForAfterPayment_s() {
        try {
            System.out.println("===============================================================");
            System.out.println();

            System.out.printf("%-45s%.2f%n", "Bill Total:", getBillTotal());
            System.out.printf("%-45s%.2f%n", "Amount Paid:", amountPaid);
            System.out.printf("%-45s%.2f%n", "Balance:", getBalance());

            System.out.println("===============================================================");
            System.out.println("Thank You For Your Patronage");
            System.out.println("===============================================================");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
