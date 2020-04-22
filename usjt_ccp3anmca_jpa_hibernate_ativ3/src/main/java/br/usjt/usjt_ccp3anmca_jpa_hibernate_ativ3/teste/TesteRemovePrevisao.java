package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.model.Previsao;

public class TesteRemovePrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao u = manager.find(Previsao.class, 1L);
		manager.remove(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}