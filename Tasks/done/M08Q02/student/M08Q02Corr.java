/**
 *  Copyright (c) 2017 Mawait Maxime
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
 // @author: Mawait Maxime

package student;

public class M08Q02Stu implements ChessPiece {
	public static final int temp=(int)(Math.random()*(1000000-1));
    
    public String couleur;
    public String nom;
    ChessAPI c = new ChessAPI();
    
    public M08Q02Stu(String couleur){
        this.couleur = couleur;
        this.nom = "pion";
    }
    
	public int seDeplacer(){
        return c.deplacerM08Q02();
    }

    public int estMangee(Object mangeur){
        return c.disparaitre(mangeur);
    }

    public int mangePiece (Object victime){
        return c.mangerM08Q02(victime);
    }

    public String couleurPiece(){
        return this.couleur;
    }

    public String nomPiece(){
        return "pion";
    }
	

}