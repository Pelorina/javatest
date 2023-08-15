import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(lengthK(new int[]{7, 4, 6, 3, 9, 1},3));
        System.out.println(lengthK(new int[]{7, 4, 6, 3, 9, 1},4));
        System.out.println("number 2");
        smallestArray(new int[]{2, 3, 4, 5, 3, 7, 8, 9});
    }
    public static String lengthK(int[] arary,int k){
        Arrays.sort(arary);
        return "k' th smallest arrary element is  " + arary[k-1];
    }


    public static void smallestArray(int[] small) {
        int min = small[0];

        for (int i = 0; i < small.length; i++) {
            if (small[i] < min) {
                min = small[i];
            }
        }

        System.out.println("minimum is equal to" + " " + min);
        int length = String.valueOf(min).length();
        System.out.println("Length of minimum number is: " + length);
    }
}
