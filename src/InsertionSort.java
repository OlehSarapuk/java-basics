public class InsertionSort {

  public static void insertionSort (int[] array){
    for (int i = 1; i < array.length; i++) {
      for (int arr : array) {
        System.out.print(arr + " ");
      }
      System.out.println();
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j - 1]){
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }
    }
  }

}
