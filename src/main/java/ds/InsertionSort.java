package ds;

public class InsertionSort {

  public static int[] insertionSort(int[] input) {
    int j = 0, temp = 0, key = 0;
    for (int i = 1; i < input.length; i++) {
      j = i - 1;
      key = input[i];

      while (j >= 0 && input[j] > key) {
        temp = input[j];
        input[j] = input[j + 1];
        input[j + 1] = temp;
        j--;
      }

    }
    return input;
  }

  public static void main(String[] args) {
    int[] input = {2, 5, 3, 19, 10, 1};
    int[] result = insertionSort(input);
    System.out.println(result);

  }

}
