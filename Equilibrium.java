class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        if(n < 3)
        {
            return -1;
        }
        int i = 1;
        int left = arr[0];
        int right = 0;
        for(int j = 2; j < n; j++ ){
            right = right + arr[j];
        }
        
        while(i < n-1){
            if(left == right)
            {
                return i;
            }
            left += arr[i];
            right -= arr[i+1];
            i++;
        }
        
        return -1;
       
        
    }
}
