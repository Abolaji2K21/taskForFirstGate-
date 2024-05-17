package Chapter16;

import Chapter15Task.Transaction;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example20 {
    public static void main(String[] args) {
        Comparator<Transactions> comparator = (previousTransaction, nextTransaction)->{
            return nextTransaction.getAmount().compareTo(previousTransaction.getAmount());
        };
        Set<Transactions> transaction = new TreeSet<>(comparator);

        transaction.add(new Transactions());
        transaction.add(new Transactions());
        transaction.add(new Transactions());


    }
}
