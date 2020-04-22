package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.model.Previsao;

public class TesteInsereUmaPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao u = new Previsao ();
		u.setUmidade("86.8");
		u.setTempMin("20.8");
		u.setTempMax("29.2");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}