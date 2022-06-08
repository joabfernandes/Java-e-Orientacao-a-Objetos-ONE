//Designer é um Funcionario, Designer herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Designer");
		return 200;
	}

}
