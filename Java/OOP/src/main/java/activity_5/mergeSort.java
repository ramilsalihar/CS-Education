package activity_5;

public class mergeSort {
    private static void merge(int array[], int begin, int middle, int end){


        int n1 = middle - begin + 1;
        int n2 = end - middle;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for(int i=0; i<n1; ++i)
            LeftArray[i] = array[begin + i];
        for(int j=0; j<n2; ++j)
            RightArray[j] = array[middle + 1+ j];

        int i = 0, j = 0;
        int k = begin;

        while(i < n1 && j < n2){
            if(LeftArray[i] < RightArray[j]){
                array[k] = LeftArray[i];
                i++;
            } else {
                array[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            array[k] = LeftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = RightArray[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int array[], int begin, int end){
        if(begin < end){
            int middle = (begin + end)/2;

            mergeSort(array, begin, middle);
            mergeSort(array, middle + 1, end);

            merge(array, begin, middle, end);
        }
    }
}
