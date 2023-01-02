public class Main {

  public static void main(String[] args) {
    int[] array = {10, 5, 2, 4, 1, 33, 24, 6};
    outputArray(array);
  }

  public static void outputArray(int[] arr){
    MergeSort.mergeSort(arr);
    for (int num :
            arr) {
      System.out.print(num + " ");
    }
  }

  //git workss

}