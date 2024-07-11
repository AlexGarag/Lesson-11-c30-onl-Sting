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
        StringBuilder stringBuilder23 = new StringBuilder();
        String toStringFromStringBuilder24 = String.valueOf(stringBuilder23.append(toStringFromStringBuilder23).delete(2,5));
        System.out.println("2.4 " + toStringFromStringBuilder24);



    }
}
