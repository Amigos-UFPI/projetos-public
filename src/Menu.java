

public class Menu {

	public static final int OPCAO_INSERIR = 1;
	public static final int OPCAO_ALTERAR = 2;
	public static final int OPCAO_EXCLUIR = 3;
	public static final int OPCAO_PROCURAR = 4;
	public static final int OPCAO_SAIR = 5;
	
	public int exibirOpcoes() throws FilmeException{
		System.out.println("--- MENU DE OPÇÕES ---");
		System.out.println("# 1) Inserir Filme");
		System.out.println("# 2) Alterar Filme");
		System.out.println("# 3) Excluir Filme");
		System.out.println("# 4) Procurar Filme");
		System.out.println("# 5) Sair");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		int opcao=Console.readInt();
		
	if (opcao>OPCAO_SAIR || opcao <OPCAO_INSERIR) {
		throw new FilmeException("Opção inválida. Digite um número entre 1 e 6");
		}

	return opcao;
	}
}
