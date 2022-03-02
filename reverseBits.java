class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        // Swap 16 bits <--> 16 bits
        n = (n >>> 16) | (n << 16);
		
        // Swap 8 bits <--> 8 bits
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        
		// Swap 4 bits <--> 4 bits
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        
		// Swap 2 bits <--> 2 bits
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        
		// Swap 1 bits <--> 1 bits
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);

        return n;
    }
}