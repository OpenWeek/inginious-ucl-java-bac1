package student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class M11Q22Stu {

    public class List {
        public Node first;

        public List() {
            this.first = null; // empty list
        }

        public void reverse() {
            @@q1@@
        }

        public String toString() {
            String res = "";
            if (this.first == null)
                return "empty List";
            Node current = this.first;
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

    public class Node {
        public int value;
        public Node next;

        public Node(int v) {
            this.value = v;
            this.next = null;
        }
    }
}
