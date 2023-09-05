class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxL = 0;
        int j = 0;

        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxL = Math.max(maxL, i - j + 1);
            }

            else{
                while(s.charAt(j) != s.charAt(i)){
                    //Remove instance of substring
                    set.remove(s.charAt(j));
                    j++;
                }
                set.remove(s.charAt(j));
                j++;
                //Start new instance of substring
                set.add(s.charAt(i));
            }
        }

        return maxL;
    }
}