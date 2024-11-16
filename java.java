public class java{
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args){
        int[] arr = {8, 2, 4, 1, 3, 6, 7, 9, 5};
        insertionSort(arr);
        System.out.print("Sorted Array:");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}