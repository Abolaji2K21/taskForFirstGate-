package Chapter14.example;

public class Example10 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(1);
        stringBuilder.append(2);
        stringBuilder.append(3);
        stringBuilder.append(5);

        System.out.println(stringBuilder); // 1234

        stringBuilder.delete(1, 3);
        String s1 = stringBuilder.toString();
        System.out.println(s1);
    }
}
