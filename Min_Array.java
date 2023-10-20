
public class Min_Array {
    public static void main(String[]args){
        int arr[] = {2,8,3,7,5,4};
        int Min = arr[0];
        for(int i =0; i<arr.length ;i++) {
         if(arr[i]<Min) {
            Min = arr[i];
    
         }
        } 
         System.out.println("the maximum element is"+Min);
        
    }
    }
    