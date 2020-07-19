package ds;

public class BubbleSort {

  private static int[] bubbleSort(int[] input) {
    int temp = 0;
    for (int i = 0; i < input.length - 1; i++) {
      for (int j = i; j < input.length - 1; j++) {
        if (input[i] > input[j]) {
          temp = input[i];
          input[i] = input[j];
          input[j] = temp;
        }
      }
    }
    return input;
  }

  public static void main(String[] args) {
    int[] input = {3, 1, 5, 4, 6};
    int[] res = bubbleSort(input);


  }

}
