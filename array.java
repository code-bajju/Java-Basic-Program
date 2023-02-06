public class array {
    public static void main(String[] args) {

        int[] arr = { 29, 90, 89, 90, 8 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        for (int bajju : arr) {
            System.out.println(bajju);
        }
    }
}
