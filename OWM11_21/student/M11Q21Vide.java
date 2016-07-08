package student;

public class M11Q21Stu {

    public class SList {

        public SNode first;

        public SList() {
            this.first = null; // empty list
        }

        public String toString() {
            String res = "";
            if (this.first == null)
                return "empty SList";
            SNode current = this.first;
            while(current != null) {
                res += current.value;
                current = current.next;
                if (current != null) {
                    res += " -> ";
                }
            }
            return res;
        }

        @@q1@@
    }

    public class SNode {
        public int value;
        public SNode next;

        public SNode(int v) {
            this.value = v;
            this.next = null;
        }
    }
}
