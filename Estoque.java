package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Estoque {
	
	public static void main (String args [])
	{
		
		//Criando minha lista
		
		List<String> produtos = new ArrayList<String>();
		
		//Introduzindo produtos na minha lista
		
		produtos.add("Esmalte");
		produtos.add("Acetona");
		produtos.add("Algodão");
		produtos.add("Lixa");
		produtos.add("Palito");
		
		for(String minhaLista:produtos )
		{
			System.out.println(minhaLista);
		}
		
		//Removendo dados da lista
		
			System.out.println("\nRemovendo ítens da lista de produtos: ");
			System.out.println();
			produtos.remove("0");
		
		for(String minhaLista:produtos) 
		{
			System.out.println(minhaLista);
		}
		
			String primeiroProduto=produtos.get(0);
			System.out.println("\nPrimeiro produto da lista: "+primeiroProduto);
		
		for(int i=0;i<produtos.size();i++)
		{
			System.out.println("\nProduto:"+produtos.get(i));
		}
		
			Collections.sort(produtos);
			System.out.println("Em ordem alfabética:");
			System.out.println(produtos);
			System.out.println();
		
		Set<String> meuSet=HashSet<String>();
		
			meuSet.add(primeiroProduto);
			meuSet.add(segundoProduto);
			meuSet.add(teceiroProduto);
			meuSet.add(quartoProduto);
			meuSet.add(quintoProduto);
		
		Iterator<String> iMeuSet=meuSet.iterator();
		
		
			while(iMeuSet.next());
			{
				System.out.println(iMeuSet.next());
			}
	}
}
