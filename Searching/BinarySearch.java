package Searching;

public class BinarySearch {
    static int numList[] = {81, 74, 65, 65, 51, 24, 23, 15, 7};
    public static void main (String args[]){
        System.out.println(binarySearch(23));
    }
    public static int binarySearch(int lookup){
        int low = 0;
        int high = numList.length;
        int middle = (high-low)/2;

        while(numList[middle] != lookup){
            if(numList[middle] > lookup){
                high = middle;
            }
            if(numList[middle] < lookup){
                low = middle;
            }
            if(numList[middle] == lookup){
                return middle;
            }
            else{
                return-1;
            middle = (high-low)/2;
    }

}
return -1;
}
}