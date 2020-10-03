/*

605. Can Place Flowers
Easy

504

279

Favorite

Share
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.

*/

class Solution {
    public boolean canPlaceFlowers(int[] bed, int k) {
        if(k == 0) return true;
        
        int n = bed.length;
        
        for(int i=0; i<n-1; i++) {
            if(k == 0) return true;
            
            if(bed[i] == 1) continue;
            
            if(i >0 && bed[i-1] == 1 && bed[i] == 0) continue;
            
            if(bed[i] == 0 && bed[i+1] == 0) {
                bed[i] = 1;
                k--;
            }
        }
        
        if( n > 2 && bed[n-1] == 0 && bed[n-2] == 0) {
            bed[n-1] = 1;
            k--;
        }
        
        if(n == 1 && bed[n-1] == 0) {
            bed[n-1] = 1;
            k--;
        }
        
        return k == 0 ? true : false;
    }
}
