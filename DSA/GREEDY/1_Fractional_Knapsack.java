class Pair {
    public int first ;
    public int second ; 
    public double third ; 
    public Pair(int first, int second , double third) {
        this.first = first ;      // val 
        this.second = second ;    // weight 
        this.third = third ;      // val/weight
    } 
}
class Result
{
    static double fractionalKnapsack(int val[], int weight[], int n, int capacity) { 
        Pair [] arr = new Pair[n] ;
        for(int i = 0 ; i < n ; i++ ) {
            arr[i] = new Pair(val[i],weight[i],  (double) val[i]/weight[i]) ; 
        }
        Arrays.sort(arr,Comparator.comparingDouble((Pair a)->a.third)) ; // ascending order
        
        double profit = 0 ;
        int i = n-1 ;
        while(capacity != 0 && i>= 0) {
            if(arr[i].second > capacity) {
                double temp = capacity * arr[i].third ; 
                profit += temp ; 
                capacity = 0 ;
            }
            else{
                capacity -= arr[i].second ; 
                profit += arr[i].first ; 
            }
            i--  ; 
        }
        return profit ; 
    }
}