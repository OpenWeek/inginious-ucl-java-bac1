/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre, Antoine Habran, Maxime Mawait, William Visée.
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

public class M05Q06Corr
{
    public static int[] sum (int[] tab)
    {
        if(tab==null)
			return null;

		if(tab.length==0)
			return new int[0];

		int[] res = new int[tab.length];
		res[0] = tab[0];

		for(int i = 1;i<tab.length;i++)
		{
				res[i] = res[i-1]+tab[i];
		}
		return res;
    }
}
