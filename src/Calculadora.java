
public class Calculadora {
	public float calcular(float a, float b, char operacao) {
		float resultado = 0;

		// Correção realizada:
		// Faltando inserir os breaks em cada case.
		switch (operacao) {
		case '+': 
			resultado = a + b;
			break;
		case '-': 
			resultado = a - b;
			break;
		case '/': 
			resultado = a / b;
			break;
		case '*': 
			resultado = a * b;
		}

		return resultado;
	}
}