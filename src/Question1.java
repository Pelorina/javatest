import java.util.HashSet;

public class Question1{

        public static void main(String[] args) {
            int[] nums1 = {8, 7, 2, 5, 3, 1};
            int target1 = 10;
            int[] result1 = findPairWithSum(nums1, target1);
            if (result1 != null) {
                System.out.println("Pair found: " + result1[0] + ", " + result1[1]);
            } else {
                System.out.println("Pair not found");
            }
            System.out.println("example two");

            int[] nums2 = {5, 2, 6, 8, 1, 9};
            int target2 = 12;
            int[] result2 = findPairWithSum(nums2, target2);
            if (result2 != null) {
                System.out.println("Pair found: " + result2[0] + ", " + result2[1]);
            } else {
                System.out.println("Pair not found");
            }
        }

        public static int[] findPairWithSum(int[] nums, int target) {
            HashSet<Integer> numSet = new HashSet<>();

            for (int num : nums) {
                int complement = target - num;

                if (numSet.contains(complement)) {
                    return new int[]{num, complement};
                } else {
                    numSet.add(num);
                }
            }

            return null;
        }
    }


