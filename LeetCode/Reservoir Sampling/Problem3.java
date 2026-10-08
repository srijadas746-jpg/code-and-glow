class Solution {
    int[][] rects;
    Random random = new Random();

    public Solution(int[][] rects) {
        this.rects = rects;
    }

    public int[] pick() {
        int total = 0;

        for (int[] r : rects) {
            total += (r[2] - r[0] + 1) * (r[3] - r[1] + 1);
        }

        int k = random.nextInt(total);

        for (int[] r : rects) {
            int points = (r[2] - r[0] + 1) * (r[3] - r[1] + 1);

            if (k < points) {
                int x = r[0] + random.nextInt(r[2] - r[0] + 1);
                int y = r[1] + random.nextInt(r[3] - r[1] + 1);
                return new int[]{x, y};
            }

            k -= points;
        }

        return new int[]{0, 0};
    }
}