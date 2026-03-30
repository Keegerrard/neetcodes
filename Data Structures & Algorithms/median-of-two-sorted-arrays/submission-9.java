class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = 0,m=0,count=0;
        int[] res = new int[nums1.length+nums2.length];
        
        while(n<nums1.length&&m<nums2.length){
            if(nums1[n]<nums2[m]){
                res[count]=nums1[n];
                n++;count++;
            }
            else{
                res[count]=nums2[m];
                m++;count++;
            }
        }
        while(n<nums1.length){
            res[count]=nums1[n];
            n++;count++;
        }
        while(m<nums2.length){
            res[count]=nums2[m];
            m++;count++;
        }
        
        double out;
        if(res.length % 2 == 0){
            System.out.println(res.length);
            int len = (res.length)/2-1;
            System.out.println(len);
            int kedua = len +1;
            System.out.println(kedua);
            System.out.println(res[len]);
            System.out.println(res[kedua]);
            System.out.println(res[len]+res[kedua]);
            out = (res[len]+res[kedua])/2.0;
        }
        else{
            out = res[(res.length-1)/2];
            
        }
        return out;
    }
}
