package Chapter16;

import java.util.List;

public class Account {
    public static List<? extends CharSequence> getBalance(){
        return List.of(new StringBuilder("3.0"), "5.0");
    }
}
