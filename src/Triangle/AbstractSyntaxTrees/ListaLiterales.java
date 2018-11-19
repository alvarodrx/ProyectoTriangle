/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hp i5 septima
 */
public class ListaLiterales {
	int nivel;
	ArrayList<ArrayList<Terminal>> LTer;
	ArrayList<TypeDenoter> LTipo;
	
	public ListaLiterales() {
		nivel = -1;
		LTer = new ArrayList<>();
		LTipo = new ArrayList<>();
	}
	
	public void subirNivel(TypeDenoter t){
		LTipo.add(t);
		LTer.add(new ArrayList<>());
		nivel++;
	}
	
	public boolean buscar(ArrayList<Terminal> lt, Terminal t){
		boolean encontrado = false;
		Iterator<Terminal> i = lt.iterator();
		while(i.hasNext() && !encontrado){
			Terminal nt = i.next();
			if(nt.spelling.equals(t.spelling)){				
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	public int ingresaLiteral(Terminal t, TypeDenoter eType){
		if(!eType.equals(LTipo.get(nivel)) ){
			return 1; // Es diferente tipo
		}
		else if(buscar(LTer.get(nivel),t)) { //Problema de comparacion
			return 2;//Ya esta en la lista
		}
		else{
			LTer.get(nivel).add(t); 
			return 0;//Ingresado correcto
		}
	}
	
	public void bajarNiel(){
		LTipo.remove(nivel);
		LTer.remove(nivel);
		nivel--;
	}
	
}
