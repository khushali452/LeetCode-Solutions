/* 
1971. Find if Path Exists in Graph

There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

 

Example 1:


Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
Output: true
Explanation: There are two paths from vertex 0 to vertex 2:
- 0 → 1 → 2
- 0 → 2
Example 2:


Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
Output: false
Explanation: There is no path from vertex 0 to vertex 5.
 

Constraints:

1 <= n <= 2 * 105
0 <= edges.length <= 2 * 105
edges[i].length == 2
0 <= ui, vi <= n - 1
ui != vi
0 <= source, destination <= n - 1
There are no duplicate edges.
There are no self edges.
*/
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        final boolean[] visited=new boolean[n];
        
        //BFS  APPROACH
        final Queue<Integer> bfs=new LinkedList<Integer>();
        //start bfs from the source given
        bfs.add(source);
        visited[source]=true;
        while(!bfs.isEmpty()){
            final int currentVertex=bfs.poll();
            //if the destination is present in the bfs of the
            //source vertex then there exists a path to destination
            if(currentVertex==destination){
                return true;
            }
            final Set<Integer> neighbours= findNeighbours(edges,n,currentVertex);
            for(final int neighbour:neighbours){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    bfs.add(neighbour);
                }
            }
            
        }
        return false;
    }
    
    //function to find neighbouring vertex of the current traversing vertex
    //from the edges list given
    private static Set<Integer>findNeighbours(int[][] edges,int n ,int v){
        final Set<Integer> neighbours=new HashSet<Integer>();
        
        //if one of the edge in nested list is being cuurently traversed
        //then add the remaining other vertex from the nested list edge as its neighbour
        for(int[] edge:edges){
            if(edge[0]==v){
                neighbours.add(edge[1]);
            }else if(edge[1]==v){
                neighbours.add(edge[0]);
            }
        }
        return neighbours;
    }
}