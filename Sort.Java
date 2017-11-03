
public class Sort {

    
    public static class InsertionSort implements SortingAlg {

        @Override
        public void sort(int[] list) {
            for (int i = 0; i < list.length; i++) {
                int j;
                int num = list[i];

                for (j = i - 1; j >= 0 && list[j] > num; j--) {
                    list[j + 1] = list[j];
                }
                list[j + 1] = num;
            }
            ArrayTools.print(list);

        }
    }


    public static class bubblesort implements SortingAlg {

        @Override
        public void sort(int[] list) {

            for (int i = 0; i < list.length; i++) {
                int num = list[i];

                for (int j = i - 1; j >= 0; j--) {
                    int leftNumber = list[j];

                    if (num < leftNumber) {
                        list[j + 1] = leftNumber;
                        list[j] = num;

                    } else {
                        break;
                    }
                }
            }
            ArrayTools.print(list);
        }
    }
}






