public class MergeSort {
    public static void mergeSort(int arr[], int l, int r){
        if(l<r){
            int m = (l+r)/2;
        
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr,l,m,r);
        }
    }

    public static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];


        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = arr[l+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = arr[m+1+i];
        }

        int i = 0 , j = 0 , k = l;
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }

    public static void printArray(int arr[]){
        System.out.println("Sorted Array : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {3,7,1,9,4,5,2};

        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
