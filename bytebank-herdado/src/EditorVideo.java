//EditorVideo é um Funcionario, EditorVideo herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de vídeo");
		return 150;
	}
	

}
