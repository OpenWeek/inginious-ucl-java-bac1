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
            @@q1@@
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
