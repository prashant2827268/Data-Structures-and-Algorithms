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

//*  Better Solution */

    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ar = new ArrayList<>();
        int n = arr.length;
        int [] array = new int[n+1];  // Take another array of size n+1;
        int repeating = -1;
        int missing = -1;
        for(int i = 0; i < n; i++){       
            if(array[arr[i]] == 0){      // Check if the new array consists of zeroes,if yes
                array[arr[i]] = 1;        // Fill the space with 1
            }else if(array[arr[i]] == 1){  // If the new array consist 1 at any place that means this element is repeating
                repeating = arr[i];
            }
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] == 0){           // In a new array move from 1 to n-1, if at any element zero is found, that means 
                missing = i;             // the element is missing
            }
        }
        ar.add(repeating);
        ar.add(missing);
        return ar; 
    }
}

