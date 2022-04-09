class Solution {
    public double average(int[] salary) {
        double sum=0,avg=0;
        Arrays.sort(salary);
        for(int i=0;i<salary.length-2;i++){
            sum+=salary[i+1];
        }
        avg=sum/(salary.length-2);
        return avg;
    }
}