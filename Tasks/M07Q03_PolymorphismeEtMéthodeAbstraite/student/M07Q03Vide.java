/**
 *  Copyright (c) 2016 Olivier Martin
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

public class M07Q03Stu {
	
	public abstract class Animal{
		private int faim; //Plus la faim est proche de 0, plus l'animal à faim.
        
        public void set_faim(int faim){
        	this.faim = faim;
        }
        
        public int get_faim(){
        	return this.faim;
        }
		
        /*
		 * L'animal mange de la nourriture (dépend de l'animal) et sa faim augmente (dépend de l'animal).
		 * Les Chevres mangent des carottes et une carotte agumente la faim de 15.
		 * Les Ours mangent des poulets et un poulet augmente la faim de 10. 
		 * Retourne false si la faim est <= 0
		 */
		public abstract boolean manger(PanierDeNourriture panier);
	}
	
@		@q1@@
	
@		@q2@@
	
	public class PanierDeNourriture{
		public PanierDeNourriture(int carottes, int poulets){
			this.nombre_carottes = carottes;
			this.nombre_poulets = poulets;
		}
		
		private int nombre_carottes;
		private int nombre_poulets;
		public int get_nombre_carottes(){
			return nombre_carottes;
		}
		public int get_nombre_poulets(){
			return nombre_poulets;
		}
		/*
		 * @post	Si il n'y a plus de carottes, retourne false.
		 * 			Si il reste des carottes, diminue le nombre de carottes de 1 et retourne true.
		 */
		public boolean manger_carotte(){
			if(nombre_carottes > 0){
				nombre_carottes--;
				return true;
			}
			return false;
		}
		/*
		 * @post	Si il n'y a plus de poulets, retourne false.
		 * 			Si il reste des poulets, diminue le nombre de poulets de 1 et retourne true.
		 */
		public boolean manger_poulet(){
			if(nombre_poulets > 0){
				nombre_poulets--;
				return true;
			}
			return false;
		}
	}
}