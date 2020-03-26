public class Utility {
    public static <T extends Number> double getMidpoint(T[] arr) {
        if (arr.length % 2 == 0) {
            return (arr[arr.length/2].doubleValue() + arr[arr.length/2-1].doubleValue())/2;
        } else {
            return arr[arr.length/2].doubleValue();
        }
    }

    public static <T> T getMidpoint(T[] arr) {
        if (arr.length % 2 == 0) {
            return (arr[arr.length/2]);
        } else {
            return arr[arr.length/2];
        }
    }

    public static <T> T getLast(T[] arr) {
        return arr[arr.length - 1];
    }

    public static <T extends Number> double getAverage(T[] arr) {
        double sum = 0;
        for (T x : arr) {
            sum += x.doubleValue();
        }
        return sum / arr.length;
    }
}