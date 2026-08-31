

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Get all the keys (numbers)
        List<Integer> keys = new ArrayList<>(map.keySet());

        // Step 3: Sort keys based on their frequency
        keys.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k keys
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        // Step 5: Return result
        return result;
    }
}