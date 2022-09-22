import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int array[]={1,2,3,4,3,5,8,9,4,5,6,8};
        System.out.println(max_of_subarrays(array,array.length,3));
    }
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> test=new ArrayList<>();
        int i,j,x;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                for(x=i;x<j;x++){
                    if(j==2){
                        test.add(arr[i]);
                        System.out.println(test);
                    }

                    else{
                        continue;
                    }
                    test.clear();
                }
            }
        }
        return test;
    }
}