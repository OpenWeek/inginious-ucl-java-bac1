package student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class M11Q23Stu {

    public class SList {
        public SNode first;

        public SList() {
            this.first = null; // empty list
        }

        public void removeDuplicates() {
            SNode current = this.first;
            if (current != null) {
                int val = current.value;
                SNode beforeNode = current;
                current = current.next;
                while(current != null) {
                    if (current.value != val) {
                        beforeNode.next = current;
                        beforeNode = current;
                        val = current.value;
                    }
                    current = current.next;
                }
                beforeNode.next = current;
            }
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
