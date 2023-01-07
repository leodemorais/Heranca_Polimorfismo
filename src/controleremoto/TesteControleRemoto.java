package controleremoto;

public class TesteControleRemoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ControleRemoto controleRemoto = new ControleRemoto();
		
		System.out.println("Chamando o carro: " + controleRemoto.mover("carro"));
		System.out.println("Chamando o avião: " + controleRemoto.mover("avião", true));
		System.out.println("Chamando o barco: " + controleRemoto.mover("barco", true, true));

	}

}
