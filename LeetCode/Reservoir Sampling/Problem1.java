class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();

    public Solution(ListNode head) {
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}