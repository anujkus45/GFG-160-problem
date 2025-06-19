// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    
    public static void reverse(int arr[], int start, int end){
       while(start<end){ 
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // add your code here
        int a= arr.length;
        d = d % a;
        reverse(arr, 0, d-1);
        reverse(arr, d, a-1);
        reverse(arr, 0, a-1);
    }
}