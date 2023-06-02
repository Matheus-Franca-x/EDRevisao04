package view;

import matheus.ListaInt.ListaInt;

public class Main 
{
	public static void main(String[] args)
	{
		
		int[] numVet = new int[99];
		
		int tam = numVet.length;
		
		for (int i = 0; i < tam; i++)
		{
			numVet[i] = i;
		}
		
		ListaInt[] l = new ListaInt[10];
		
		for (int i = 0; i < 10; i++)
			l[i] = new ListaInt();
		
		for (int each : numVet)
		{
			try {
				if (l[hashCode(each)].isEmpty())
					l[hashCode(each)].addFirst(each);
				else
					l[hashCode(each)].addLast(each);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static int hashCode(int num)
	{
		int i = num / 10;
		return i;
	}
}
