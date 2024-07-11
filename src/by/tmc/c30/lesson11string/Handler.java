package by.tmc.c30.lesson11string;

public class Handler {
    public static void main(String[] args) {
// task 1.6
        System.out.println("task 1.6");
        boolean logicalValue = true;
        System.out.println(logicalValue ? "Yes" : "No");
        String toStringFromBoolean = Boolean.toString(logicalValue);
        System.out.println(toStringFromBoolean);
        System.out.println();
// task 2
        System.out.println("task 2");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append("xxxx");
        String toStringFromStringBuilder22 = stringBuilder.toString();
        System.out.println("2.2 " + toStringFromStringBuilder22);
        String toStringFromStringBuilder23 = String.valueOf(stringBuilder.insert(5, 'y'));
        System.out.println("2.2 " + toStringFromStringBuilder23);
        StringBuilder stringBuilder24 = new StringBuilder();
        String toStringFromStringBuilder24 = String.valueOf(stringBuilder24.append(toStringFromStringBuilder23).delete(2,5));
        System.out.println("2.4 " + toStringFromStringBuilder24);
        StringBuilder stringBuilder25 = new StringBuilder();
        stringBuilder25.append(toStringFromStringBuilder24);
        String toStringFromStringBuilder25 = String.valueOf(stringBuilder25.reverse());
        System.out.println("2.5 " + toStringFromStringBuilder25);



    }
}
