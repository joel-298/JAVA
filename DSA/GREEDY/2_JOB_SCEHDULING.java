class X{
    public int first;
    public int second;
    
    public X(int f,int s){
        first = f;
        second = s;
    }
}
class Result {
    static int jobScheduling(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        X[] arr = new X[n];
        for(int i=0;i<n;i++){
            arr[i] = new X(deadlines[i],profits[i]);
        }
        // sort
        Arrays.sort(arr,Comparator.comparingInt((X ele)->ele.first));
      
        int i = 0;
        int profit = 0;
        while(i < n){
            int max = Integer.MIN_VALUE ; 
            int j = i ; // 2  
            int index = i ; // 2
            while(j < n && arr[j].first == arr[i].first) {
                if(max < arr[j].second) { 
                    max = arr[j].second ; // 10
                }
                j++ ; // 4
                index++; // 4
            }
            profit += max ; // 8+10 
            i = index - 1 ; // 3          
            i++; // 4
        }
        return profit ; 
    }
}