package Alumnos;
import java.io.*;
public class Nota {
	private float[] notas;

	public Nota(float[] notas) {
		super();
		this.notas= notas;
	}
	
	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public void agregarNotas(float notaAlumno){
		float notas[]= new float[12];
		for(int i=0;i<notas.length;i++)
		{
			notas[i]=0;
		}
		if (notaAlumno>=1.0){
			for (int i=0;i>notas.length;i++)
			{
				notas[i]=notaAlumno;
			}
		}
	}

	public void mostrarNotas()
	{
		for(int i=0;i< notas.length; i++)
		{
			System.out.println(+ notas[i] );
		}
	}
	public float promedioNotas()
	{
		float promedio=0,suma=0;
		int contador=0;
		for(int i=0;i<notas.length;i++)
		{
			if(notas[i]>0)
			{
				suma+=notas[i];
				contador++;
			}
		}
		if(suma>0)
		promedio=suma/contador;
		
		return promedio;
	}
	public void eliminarTodasLasNotas()
	{
		for(int i=0;i<notas.length;i++)
		{
			notas[i]=0;
		}
	}
	public boolean eliminarNota (int posicion ){
		if(posicion<=12){
			if(notas[posicion-1]>0)
			{
				notas[posicion-1]=0;
				return true;
			}
		}
		return false;
	}
}
