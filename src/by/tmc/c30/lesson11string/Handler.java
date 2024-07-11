package by.tmc.c30.lesson11string;

public class Handler {
    public static void main(String[] args) {
// task 1.6
        boolean logicalValue = true;
        System.out.println(logicalValue ? "Yes" : "No");
        String toStringFromBoolean = Boolean.toString(logicalValue);
        System.out.println(toStringFromBoolean);
    }
}
