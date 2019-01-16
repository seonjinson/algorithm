public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {37,12,48,50,7,43,20,2,15};
        quickSort(arr, 0, arr.length-1);
        System.out.println("result of Sort");

        for(int i:arr){
            System.out.print(i+", ");
        }
    }

    public static void quickSort(int arr[], int start, int end){
        if(start < end) {
            int pivotNewIndex = partition(arr, start, end);
            quickSort(arr, start, pivotNewIndex -1);
            quickSort(arr, pivotNewIndex +1, end);
        }
    }

    public static int partition(int arr[], int start, int end){
        int pivot = arr[(start+end)/2];

        while(start < end){
            while((arr[start] < pivot) && (start < end)) start++;
            while((arr[end] > pivot) && (start < end )) end--;

            if(start < end) {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        return start;
    }
}
