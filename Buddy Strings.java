class Solution {
     public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < A.length(); i++) {
                if (map.containsKey(A.charAt(i))) {
                    return true;
                }
                map.put(A.charAt(i), 1);
            }
            return false;
        }
        int diff = 0;
        Set<Character> set_A = new HashSet<Character>();
        Set<Character> set_B = new HashSet<Character>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff++;
                set_A.add(A.charAt(i));
                set_B.add(B.charAt(i));
                if (diff > 2) {
                    return false;
                }
            }
        }
        return diff == 2 && set_A.equals(set_B);
    }
}