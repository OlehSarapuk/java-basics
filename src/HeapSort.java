public class HeapSort {

  public static void heapSort(int[] array){
    for (int i = (array.length / 2) - 1; i >= 0; i--) {
      heapify(array, array.length, i);
    }

    for (int i = array.length - 1; i >= 0; i--) {
      int temp = array[0];
      array[0] = array[i];
      array[i] = temp;
      heapify(array, i, 0);
    }
  }

  public static void heapify(int [] array,int n, int i){
    int largest = i;
    int left = i*2 + 1;
    int right = i*2 + 2;
    if (left < n && array[left] > array[largest]){
      largest = left;
    }
    if (right < n && array[right] > array[largest]){
      largest = right;
    }
    if (largest != i){
      int temp = array[largest];
      array[largest] = array[i];
      array[i] = temp;
      heapify(array, n, largest);
    }
  }

}
