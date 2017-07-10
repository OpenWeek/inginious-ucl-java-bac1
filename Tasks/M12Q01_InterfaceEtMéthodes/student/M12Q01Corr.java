/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package student;

import java.util.*;
import java.io.*;

public class M12Q01Corr{
	/**
	 * @pre l.isEmpty() == false
	 * @post écrit dans le fichier de nom filename le nom et l'âge des personnes de la list l qui ont vu le film Star Wars et aiment raconter la fin des films, en séparant le nom et l'âge par un espace. Une seule personne est écrite par ligne.
	 */
	public static void antiSpoiler(ArrayList<Personne> l, String filename){
		Iterator<Personne> iterator = l.iterator();
		try{
			FileWriter fw = new FileWriter(filename);
			while(iterator.hasNext()){
				Personne p = iterator.next();
				if(p.hasSeenStarWars() && p.spoilerAlert())
					fw.write(p.getName()+" "+p.getAge()+"\n");
			}
			fw.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
