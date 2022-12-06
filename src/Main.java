public class Main {

  public static void main(String[] args) {
    int[] array = {1, 9, 3, 4, 5, 8, 7, 8};
    outputBubbleSortedArray(array);
  }

  public static void outputBubbleSortedArray (int[] array){
    BubbleSort.bubbleSort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}