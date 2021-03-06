/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

Constraints:
n == height.length
0 <= n <= 3 * 104
0 <= height[i] <= 105
*/
//You can also use the concept of left array and right array, in which we can add left side maximum and right side maximum.
int trap(int *arr, int n)
{
    int i = 0, j = n - 1, lm = 0, rm = 0, cnt = 0;
    while (i < j)
    {
        if(arr[i] < arr[j])
        {
            if(arr[i] >= lm)
                   lm = arr[i];
            else
                cnt += lm - arr[i];
            i++;
        }
        else
        {
            if(arr[j] >= rm)
                rm = arr[j];
            else
                cnt += rm - arr[j];
            j--;
        }
    }
    return cnt;
}
