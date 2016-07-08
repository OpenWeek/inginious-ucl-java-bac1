package student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class M11Q21Stu {

    public class SList {
        public SNode first;

        public SList() {
            this.first = null; // empty list
        }

        public SList sortedMerge(SList sl1, SList sl2) {
            SList sl = new SList();
            SNode sln = sl1.first;
            while (sln != null) {
                SNode slnCpy = new SNode(sln.value);
                sl.insert(slnCpy);
                sln = sln.next;
            }
            sln = sl2.first;
            while (sln != null) {
                SNode slnCpy = new SNode(sln.value);
                sl.insert(slnCpy);
                sln = sln.next;
            }
            return sl;
        }

        public void insert(SNode sn) {

            SNode current = this.first;
            Boolean isInserted = false;

            /* case 1: empty list */
            if (current == null) {
                this.first = sn;
                isInserted = true;
            }

            /* case 2: insert as former than current first */
            else if (sn.value < current.value) {
                sn.next = current;
                this.first = sn;
                isInserted = true;
            }

            /* case 3: insert in the middle of the list (rest, including before and after original tail node) */
            else {
                /* case 3a: middle except before and after original tail node */
                while((current.next != null) && !isInserted) {
                    if (sn.value < current.next.value) {
                        SNode beforeSn = current;
                        SNode afterSn = current.next;
                        beforeSn.next = sn;
                        sn.next = afterSn;
                        isInserted = true;
                    }
                    current = current.next;
                }
                /* case3b: after original tail node */
                if (!isInserted) {
                    // note: 'current' points original tail node
                    current.next = sn;
                    isInserted = true;
                }
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
