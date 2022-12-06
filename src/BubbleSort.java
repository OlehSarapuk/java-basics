public class BubbleSort {

  public static void bubbleSort (int[] array){
    int count = 1;
    for (int i = 0; count != 0; i++) {
      count = 0;
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          count++;
        }
      }
    }
  }

}
