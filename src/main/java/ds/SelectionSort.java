package ds;

public class SelectionSort {

  public static int[] selectionSort(int[] input) {
    int temp, minindex, minvalue = 0;
    for (int i = 0; i < input.length; i++) {
      minindex = i;
      minvalue = input[i];
      for (int j = i; j < input.length; j++) {
        if (input[j] < minvalue) {
          minvalue = input[j];
          minindex = j;
        }
      }
      if (minvalue < input[i]) {
        temp = input[i];
        input[i] = input[minindex];
        input[minindex] = temp;
      }
    }
    return input;
  }

  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 1, 3, 11, 9, 19, 13};
    int[] res = selectionSort(arr);
    System.out.println(res);
  }

}
