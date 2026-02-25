class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, "", used, set);
        return set.size();
    }

    private void backtrack(String tiles, String current, boolean[] used, Set<String> set) {
        if (!current.isEmpty()) {
            set.add(current);
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;

            used[i] = true;
            backtrack(tiles, current + tiles.charAt(i), used, set);
            used[i] = false;  // backtrack
        }
    }
}
