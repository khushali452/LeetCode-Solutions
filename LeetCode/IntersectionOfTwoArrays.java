import java.util.*;
class Solution{
    
    public static int[] intersect(int[] nums1, int[] nums2)
    {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer>  m= new HashMap<Integer,Integer>();
        for(int val:nums1){
            m.put(val,m.getOrDefault(val,0)+1);
        }
        int k=0;
        for(int val:nums2){
            if(m.getOrDefault(val,0)>0){
                nums1[k++]=val;
                m.put(val,m.get(val)-1);
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=nums1[i];
        }
        return ans;
    }
    
  public static void main(String args[])
    {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
    int[] ans=intersect(nums1,nums2);
        for(int x:ans)
            System.out.print(x+" ");
    }
}
