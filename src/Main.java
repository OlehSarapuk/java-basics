public class Main {

  public static void main(String[] args) {
    int[] array = {5, 9, 3, 4, 1, 8, 7, 8};
    outputSortedArray(array);
  }

  public static void outputSortedArray (int[] array){
    InsertionSort.insertionSort(array);
    for (int arr : array) {
      System.out.print(arr + " ");
    }
  }
}