public class mergesort {
    int[] array;
    int[] temparray;
    int length;

    public static void main(String[] args) {
        int[] arrayToSort = {12, 223, 24343, 3454535, 3545435, 34235435, 1, 112, 13, 1242};
        mergesort arr = new mergesort();
        arr.sort(arrayToSort);

        for(int i : arrayToSort){
            System.out.print(" ");
            System.out.print(i);
        }
    }

    public void sort(int[] arrayToSort){
        this.array = arrayToSort;
        this.length = arrayToSort.length;
        this.temparray = new int[length];
        Merge_Sort(0, length - 1);
    }

    public void Merge_Sort(int low, int high){
        if (low < high){
            int mid = low + (high - low) / 2;
            Merge_Sort(low, mid);
            Merge_Sort(mid + 1, high );
            Merge(low, mid, high);
        }
    }

    public void Merge(int low, int mid, int high){
        for (int i = low; i <= high; i++){
            temparray[i] = array[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high){
            if (temparray[i] < temparray[j]){
                array[k] = temparray[i];
                i++;
            }
            else{
                array[k] = temparray[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            array[k] = temparray[i];
            i++;
            k++;

        }

    }

}
