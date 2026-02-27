package jhol.dev.thread;

public class Ex1 {

	public static void main(String[] args) {

		/* 200 processos ou pessoas para serem atendidas */

		Runnable caixa1 = () -> {

			/* Geração de realtorio, verificação de pendencias, qualquer coisa */
			for (int i = 0; i < 50; i++) {
				System.out.println("Caixa 1 atendendo do cliente : " + i);
				dormir();
			}

		};

		Runnable caixa2 = () -> {

			/* Geração de realtorio, verificação de pendencias, qualquer coisa */
			for (int i = 0; i < 50; i++) {
				System.out.println("Caixa 2 atendendo do cliente : " + i);
				dormir();
			}

		};

		Runnable caixa3 = () -> {

			/* Geração de realtorio, verificação de pendencias, qualquer coisa */
			for (int i = 0; i < 50; i++) {
				System.out.println("Caixa 3 atendendo do cliente : " + i);
				dormir();
			}

		};

		Runnable caixa4 = () -> {

			/* Geração de realtorio, verificação de pendencias, qualquer coisa */
			for (int i = 0; i < 50; i++) {
				System.out.println("Caixa 4 atendendo do cliente : " + i);
				dormir();
			}

		};

		new Thread(caixa1).start();
		new Thread(caixa2).start();
		new Thread(caixa3).start();
		new Thread(caixa4).start();

		System.out.println("FIM");

	}

	public static void dormir() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
