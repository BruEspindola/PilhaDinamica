package Controller;

public class PilhaDinamica {
	
		public No inicio;

		public PilhaDinamica() { // inicia a pilha Dinamica
			inicio = null;
		}

		public boolean vazia() { // verifica se esta vazia

			return inicio == null;
		}

		public void empilha(int e) { //empilha itens

			No novo = new No(e);
			novo.prox = inicio;
			inicio = novo;
		}

		public int desempilha() { //desempilha itens

			int i = -1;

			if (vazia()) {
				System.out.println("ERRO! Lista vázia");
			} else {
				i = inicio.Dado;
				inicio = inicio.prox;
			}

			return i;

		}

		public String percorre() { //percorre a pilha

			String r = "";

			if (vazia()) {
				System.out.println("Erro! Lista vazia");
			} else {

				No aux = inicio;

				while (aux != null) {
					r += " " + aux.Dado;
					aux = aux.prox;
				}
			}

			return r;
		}

	}

