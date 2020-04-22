package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.model.Previsao;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.model.Semana;

public class TesteInserePrevisaoComSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana p = new Semana ();
		p.setDescricao("Segunda");
		manager.persist(p);
		Previsao u = new Previsao();
		u.setUmidade("77.4");
		u.setTempMin("45.9");
		u.setTempMax("90.3");
		u.setPerfil(p);
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}