public class MergeSort {
  public static void  mergeSort (int[] inputArray) {
    if(inputArray.length < 2){
      return;
    }
    int midIndex = inputArray.length / 2;
    int[] leftArray = new int[midIndex];
    int[] rightArray = new int[inputArray.length - midIndex];

    for (int i = 0; i < midIndex; i++) {
      leftArray[i] = inputArray[i];
    }
    for (int i = midIndex; i < inputArray.length; i++) {
      rightArray[i - midIndex] = inputArray[i];
    }

    mergeSort(leftArray);
    mergeSort(rightArray);

    merge(inputArray, leftArray, rightArray);
  }

  private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
    int leftArrayIndex = 0, rightArrayIndex = 0, inputArrayIndex = 0;

    while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length){
      if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]){
        inputArray[inputArrayIndex] = leftArray[leftArrayIndex];
        leftArrayIndex++;
      }
      else {
        inputArray[inputArrayIndex] = rightArray[rightArrayIndex];
        rightArrayIndex++;
      }
      inputArrayIndex++;
    }

    while (leftArrayIndex < leftArray.length){
      inputArray[inputArrayIndex] = leftArray[leftArrayIndex];
      inputArrayIndex++;
      leftArrayIndex++;
    }
    while (rightArrayIndex < rightArray.length){
      inputArray[inputArrayIndex] = rightArray[rightArrayIndex];
      inputArrayIndex++;
      rightArrayIndex++;
    }
  }
}
