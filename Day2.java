//Score of a String
package Day2;
class Day2 {
    public int scoreOfString(String s) {
        int score = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }
//}

//Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
        
        int[] ans = new int[2*n];

        for(int i=0;i<n;i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
//}

//Contains Duplicate
//class Day2 {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(set.contains(num))
            return true;

            set.add(num);
        }

        return false;
    }

}
}
