//* Brute Force */
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ar = new ArrayList<>();
        int repeating = -1;
        int missing = -1;
        int n = arr.length;
        int count;
        for(int i =1 ; i <= n; i++){
            count = 0;
            for(int j = 0; j < n; j++){
                if(i == arr[j]){
                    count++;
                }
            }
            if(count == 0){
                missing = i;
            }else if(count == 2){
                repeating = i;
            }
            
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        
        ar.add(repeating);
        ar.add(missing);
        return ar;
        
    }
}
