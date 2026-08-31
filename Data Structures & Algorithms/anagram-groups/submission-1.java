
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String st : strs) {

            // Count frequency of each character
            int[] count = new int[26];

            for (char c : st.toCharArray()) {
                count[c - 'a']++;
            }

            // Convert count array into a String key
            String key = Arrays.toString(count);

            // If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add current string to its group
            map.get(key).add(st);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }
}