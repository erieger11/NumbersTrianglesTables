package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder rows = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
           rows.append(getRow(i)+"\n");
        }
        return rows.toString();
    }
    public static String getRow(int numberOfStars) {
        StringBuilder stars = new StringBuilder();
        for (int i = 1; i <= numberOfStars; i++) {
            stars.append("*" );}
        return stars.toString();
    }
    public static String getSmallTriangle() {
       return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
