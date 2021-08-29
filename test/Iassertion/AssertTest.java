package Iassertion;

public class AssertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculaSalario3(1000);
		diasDaSemana(9);
	}

	// versao muito poluida
	// imagina fazer isto em varios metodos...
	private static void calculaSalario1(float salario) {
		if (salario > 0) {
			System.out.println("Calcula salario");
		} else {
			System.out.println("Msg de erro");
			// pode lancar uma excessao tbm...
		}
	}

	// abordagem mais adequada usando if
	private static void calculaSalario2(float salario) {
		if (salario < 0) {
			throw new IllegalArgumentException("Parametro invalido");
		}
		System.out.println("Calcula salario");
	}

	// o assert eh uma alternativa ao if...
	// Boa pratica: sempre ser usada somente em metodos privados pq nem todo
	// programador conhece seu funcionamento e pode causar confusao
	// Para ser usado a JVM deve ser habilitada (-ea)
	private static void calculaSalario3(float salario) {
		assert salario > 0 : "Parametro invalido";
		System.out.println("Calcula salario");
	}

	// unico cenario onde assert pode ser usado em metodos publicos eh quando temos
	// um switch e queremos gerar um erro caso entre no default
	// Perceba: Assert é um Error
	public static void diasDaSemana(int dia) {
		switch (dia) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			assert false : "Dia invalido";
		}
	}

}
