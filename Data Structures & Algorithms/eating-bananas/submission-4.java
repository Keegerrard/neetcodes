class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=1;
        int trees = piles.length;
        for(int i : piles)if(max<i)max=i;
        int l=1,r=max;
        int res =max;
        while(l<=r){
            int m = l+(r-l)/2;
            
            int time=0;
            for(int i =0;i<piles.length;i++){
                time += Math.ceil((double)piles[i]/m);
            }
            if(time >h){
                l=m+1;
                
            }
            else{
                res = m;
                r=m-1;
            }
        }
        return res;
    }
}
