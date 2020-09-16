package challenge401;

public class ArrayShift {
    public static int[] insertShiftArray (int[] arr, int value) {
        if (arr.length == 0){
            return new int[]{value};
        }
        int[] output = new int[arr.length + 1];
        int middle = arr.length / 2;
        if (arr.length % 2 == 1) {
            middle++;
        }
        int slow = 0;
        int fast = 0;
        while (fast < arr.length) {
            if (fast < middle) {
                arr[fast] = arr[slow];
            } else if (fast == middle) {
                arr[fast] = value;
                slow--;
            } else {
                arr[fast] = arr[slow];
            }
            slow++;
            fast++;
        }
        return output;
//        return new int[]{1,2,3,4,5};
    }
}