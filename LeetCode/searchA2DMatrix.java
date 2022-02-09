/*  
74. Search a 2D Matrix

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[0].length-1;
        
        //start checking from end of the row
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target)
                return true;
            
            //if current num is greater than target we will search 
            //it in previous columns on the left of the current traversead number
            else if(matrix[r][c]>target)
                c--;
            
            //else if target is greater than current num we will search 
            //further in next row
            else
                r++;
        }
        return false;
    }
}