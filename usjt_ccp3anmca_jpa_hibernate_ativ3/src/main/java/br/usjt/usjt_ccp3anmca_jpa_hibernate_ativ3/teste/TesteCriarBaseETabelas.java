package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ3.teste;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}
}