package practice.static2Ex;

public class MathArrayUtils {

    private MathArrayUtils(){
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int a : array){
            sum += a;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
//        double ave = 0;   내가썼던거 젠장
//        double sum = 0;
//        for (int a : array){
//            sum += a;
//        }
//        ave = sum/ array.length;
//        return ave;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
