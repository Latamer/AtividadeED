package view;

import controller.HistoricoController;
import br.com.leandrocolevati.pilhastring;
import javax.swing.JOptionPane;


public class Principal {

public Principal() {
Pilha pilha = new Pilha();
		
		HistoricoSim historico = new HistoricoController();
		
		String[] actionButtons = { "Adicionar histórico", "Consultar último item", "Deletar último item", "Cancelar" };
		
		int opcao = 0;

		do {
			opcao = JOptionPane.showOptionDialog(null, "Qual será a ação?", "Confirmation",
					JOptionPane.INFORMATION_MESSAGE, 0, null, actionButtons, actionButtons[0]);
			
			switch (opcao) {
				case 0:
					String url = JOptionPane.showInputDialog(null, "Insira uma Url válida");
					historico.insereHistorico(pilha, url);
					break;
				case 1:
					historico.consultaHistorico(pilha);
					break;
				case 2:
					historico.removeHistorico(pilha);
					break;
			}

		} while (opcao != 3);

	}


	}




