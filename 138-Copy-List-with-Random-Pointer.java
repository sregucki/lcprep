/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node tail = head;
        
        while (tail != null) {
            Node cur = new Node(tail.val);
            if (!map.containsKey(cur)) {
                map.put(tail, cur);
            }
            tail = tail.next;
        }

        tail = head;
        Node newHead = new Node(0);
        Node newTail = newHead;

        while (tail != null) {
            Node cur = map.get(tail);
            cur.next = map.get(tail.next);
            cur.random = map.get(tail.random);

            newTail.next = cur;
            newTail = newTail.next;
            tail = tail.next;   
        }

        return newHead.next;
    }
}