import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
        System.out.print(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int copy = m + n - 1;
        m = m - 1;
        n = n - 1;

        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[copy--] = nums1[m--];
            }

            else {
                nums1[copy--] = nums2[n--];
            }
        }
    }
}