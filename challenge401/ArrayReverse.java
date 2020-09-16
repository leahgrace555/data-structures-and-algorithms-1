public class ArrayReverse {
  public static void main(String[] args){

  int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
  for(int i = 0; i < numbers.length; i++){
    System.out.println("Here are my numbers" + numbers[i]);
  }
    for(int i = 0; i < numbers.length/2; i++){
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length -i -1];
      numbers[numbers.length -i -1] = temp;
    }
      for(int i = 0; i < numbers.length; i++){
        System.out.println("Here are my numbers reversed" + numbers[i]);
    }
  }
}