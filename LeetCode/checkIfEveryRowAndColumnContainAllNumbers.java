/* 
2133. Check if Every Row and Column Contains All Numbers

An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

 

Example 1:


Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.
Example 2:


Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 100
1 <= matrix[i][j] <= n
*/
class Solution {
    public boolean checkValid(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=matrix.length; i++){
            list.add(i);
        }
        
        for(int i=0; i<matrix.length; i++){
            List<Integer> temp = new ArrayList<Integer>();
            temp.addAll(list);
            for(int j=0; j<matrix.length; j++){
                if(temp.contains(matrix[i][j])){
                    temp.remove(new Integer(matrix[i][j]));
                }
            }
            if(temp.size() > 0){
                return false;
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            List<Integer> temp = new ArrayList<Integer>();
            temp.addAll(list);
            for(int j=0; j<matrix.length; j++){
                if(temp.contains(matrix[j][i])){
                    temp.remove(new Integer(matrix[j][i]));
                }
            }
            if(temp.size() > 0){
                return false;
            }
        }
        return true;
    }
}