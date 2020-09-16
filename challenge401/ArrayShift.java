public class ArrayShift{
  public static void main(int[] arr, int val){
    int[]numbers = new int[]{2, 4, 6, 8};
    int newNumb = 5;
    for(int i = numbers.length -1; i > 0; i--){
      if(numbers[i] == 0) continue;
      numbers[i + 1] = numbers[i];
      if (numbers[i] <= val){
        numbers[i] = val;
        break;
      }
    }
    System.out.println(Arrays.toString(numbers));
  }
}