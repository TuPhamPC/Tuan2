import java.util.Arrays;

public class Main {
    public static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];

        // Đếm số lần xuất hiện của từng phần tử
        for (int num : arr) {
            count[num]++;
        }

        // Tính prefix sum của mảng đếm
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[arr.length];

        // Sắp xếp các phần tử vào mảng kết quả dựa trên prefix sum
        for (int i = arr.length - 1; i >= 0; i--) {
            result[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Sao chép mảng kết quả vào mảng gốc
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
