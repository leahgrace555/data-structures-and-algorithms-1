package challenge401;

public class Library { // this is our object + and a class is just a blueprint to create new libs
    public boolean someLibraryMethod() {

        return true;
    }
    public int BinarySearch(int[] arr, int key, int low, int high){ // this is a method that returns index
        int index = -1;

        while(low <= high){
            int mid = (low+high) / 2;
            if (arr[mid] < key){
                low = mid + 1;
            }else if (arr[mid] > key){
                high = mid -1;
            }else if (arr[mid] == key){
                index = mid;
                break;
            }
        }
        return index;
    }
}
