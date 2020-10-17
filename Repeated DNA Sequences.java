class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet(), repeated = new HashSet();
        for(int i = 0; i < s.length() - 9; i++) {
            String dna = s.substring(i, i + 10);
            if(set.contains(dna)) 
                repeated.add(dna);
            set.add(dna);
        }
        return new ArrayList(repeated);
    }
}