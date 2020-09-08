package com.iplacex;

import java.io.Serializable;
import java.util.ArrayList;

public class ListarPersona implements Serializable{
	private static ArrayList<Persona> listaPersona;
	public ListarPersona() {
		listaPersona = new ArrayList<Persona>();
	}
	
	public ArrayList<Persona> getListaPersona(){
        return listaPersona;
    }

}
