package entidade;

public class ContaComercial extends Conta {

	private double limite;
	

	
	public ContaComercial(String nome, int numero, double saldo, double limite) {
	super(nome, numero, saldo);
	this.limite = limite;
	}

		@Override
	public String agua() {
		return toString() + " limite = " + limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
    }
	

