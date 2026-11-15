package TREN_v21_RadoslavRadoslavovAtanasov_Threads;

/** La tasca que executa cadascun dels fils compradors. */
public class FilCompraBitlletTrajecte implements Runnable {

	@Override
	public void run() {
		CompanyiaFerroviaria.compraBitlletTrajecte();
	}
}
