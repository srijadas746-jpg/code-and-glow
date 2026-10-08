class Solution {
    int m, n, total;
    Random random = new Random();
    HashMap<Integer, Integer> map = new HashMap<>();

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        total = m * n;
    }

    public int[] flip() {
        int r = random.nextInt(total);

        int index = map.getOrDefault(r, r);

        total--;

        map.put(r, map.getOrDefault(total, total));

        return new int[]{index / n, index % n};
    }

    public void reset() {
        total = m * n;
        map.clear();
    }
}