public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11};
        int find = 10;
        System.out.println(binarySearch(find,arr,0, arr.length-1));

    }

    public static int binarySearch(int num, int[] arr, int minIndex, int maxIndex) {

        int midIndex = minIndex + (maxIndex - minIndex) / 2;

        if (minIndex == maxIndex) {
            if (arr[minIndex] == num) {
                return minIndex;
            }
            else return -1;
        }

        if (num < arr[midIndex]) {
           return binarySearch(num, arr, minIndex, midIndex - 1);
        } else if (num > arr[midIndex]) {
           return binarySearch(num, arr, midIndex + 1, maxIndex);
        }
        return midIndex;
   }
}

