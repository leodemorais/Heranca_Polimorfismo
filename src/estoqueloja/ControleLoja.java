package estoqueloja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
	
	public static void main(String[] args) {
		
		
		List<String> estoque = new ArrayList<String>();
		
		
		//adiciona itens na lista
		estoque.add("Camiseta");
		estoque.add("Boné");
		estoque.add("Bermuda");
		
		//mostra itens da lista antes de atualizar
		System.out.println("Listagem do estoque antes da atualização: " + estoque);
		
		//atualiza os itens da lista
		estoque.remove("Bermuda");
		estoque.add("Short");
		
		//mostra itens da lista depoos de atualizar
		System.out.println("Listagem do estoque depois da atualização: " + estoque);
		
		//remove um item da lista
		estoque.remove(1);
		
		//mostra itens com a lista atualizada depois de deletar um item
		System.out.println("Listagem do estoque depois da deleção de um item: " + estoque);
		
		
	}

}
