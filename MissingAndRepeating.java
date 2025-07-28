class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        int repeat = 0;
        int missing = 0;
        for(int i = 0; i < arr.length; i++){
            int n = Math.abs(arr[i])-1;
            if(arr[n] < 0){
                repeat = Math.abs(arr[i]);
            } else {
                arr[n] = -arr[n];
            }
        }
        
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                missing = i+1;
            } 
        }
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(repeat);
        a.add(missing);
        return a;
        
    }
}
