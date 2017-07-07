/*   Copyright (c) 2017 Mawait Maxime
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class M11Q14Corr {
    public static class SList{
    
        public SNode first;

        public SList() {
            this.first = null; // empty list
        }

        public static SList sortedMerge(SList sl1, SList sl2){
            assert sl1 != null: "La liste 1 est nulle";
            assert sl2 != null: "La liste 2 est nulle";
            SList sl = new SList();
            SNode runner1 = sl1.first;
            SNode runner2 = sl2.first;
            if(runner1.value > runner2.value){
                sl.first = new SNode(runner2.value);
                runner2 = runner2.next;
            }
            else if(runner1.value < runner2.value){
                sl.first = new SNode(runner1.value);
                runner1 =runner1.next;
            }
            else{//(runner1.value == runner2.value)
                sl.first = new SNode(runner1.value);
                runner2 = runner2.next;
                runner1 = runner1.next;
            }
            SNode runner = sl.first;
            while(runner2 != null && runner1 != null){
                if(runner1.value > runner2.value){
                    runner.next = new SNode(runner2.value);
                    runner2 = runner2.next;
                }
                else if(runner1.value < runner2.value){
                    runner.next = new SNode(runner1.value);
                    runner1 = runner1.next;
                }
                else{//(runner1.value == runner2.value)
                    runner.next = new SNode(runner1.value);
                    runner2 = runner2.next;
                    runner1 = runner1.next;
                }
                runner = runner.next;
            }
            if(runner1 == null && runner2 == null){
                runner.next = null;
                return sl;
            }
            else if(runner1 == null){
                runner.next = runner2;
                return sl;
            }
            else {//(runner2 == null)
                runner.next = runner1;
                return sl;
            }
        }
        
        /*
        public static SList sortedMerge(SList sl1, SList sl2) {
        assert sl1 != null : "lol";
        assert sl2 != null : "lol";
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

    public void insert (SNode sn){
        SNode current = this.first;
        Boolean isInserted = false;

        /* case 1: empty list *//*
        if (current == null) {
            this.first = sn;
            isInserted = true;
        }

    /* case 2: insert as former than current first *//*
        else if (sn.value < current.value) {
            sn.next = current;
            this.first = sn;
            isInserted = true;
        }

    /* case 3: insert in the middle of the list (rest, including before and after original tail node) *//*
        else {
        /* case 3a: middle except before and after original tail node *//*
            while((current.next != null) && !isInserted) {
                if (sn.value < current.next.value) {
                    SNode beforeSn = current;
                    SNode afterSn = current.next;
                    beforeSn.next = sn;
                    sn.next = afterSn;
                    isInserted = true;
                }
                if (sn.value == current.next.value){
                    isInserted = true;
                }
                current = current.next;
            }
        /* case3b: after original tail node *//*
            if (!isInserted) {
                // note: 'current' points original tail node
                current.next = sn;
                isInserted = true;
            }
        }
    }
        
        */
    }
}
