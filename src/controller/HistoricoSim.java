package controller;
import  javax.swing.JOptionPane;
import br.com.leandrocolevati.pilhastring;

import java.util.Arrays;
import java .util.List;

public class HistoricoSim {

	
	public HistoricoSim() {

		}
	
	public void entradaHistorico (Pilha pilha, String url) {
		if (validaUrl(url)) {
			pilha.push(url);
			JOptionPane.showMessageDialog(null, "Site " + url + " inserido");
		} else {
			JOptionPane.showMessageDialog(null, "Site " + url + " inválido. A url deve seguir o exemplo: https://www.example.com");
		}
	}
	
	
	public void vistaHistorico (Pilha pilha) {
		try {
			JOptionPane.showMessageDialog(null, pilha.top());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Histórico vazio");
		}
	}
	
	
	public void excluiHistorico (Pilha pilha) {
		try {
			String item = pilha.pop();
			JOptionPane.showMessageDialog(null, "Site " + item + " removido");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Histórico vazio");
	}
	
 public static boolean testeurl (String Url) {
	 String[] dominios = new String[]{ ".com", ".co", ".uk", ".br", ".org", ".tk", ".info", ".net", ".it" };
		
		if (url.contains("http://") && url.contains("www.")) {
			int dominioCont = 0;
			
			for (int i = 0; i < dominios.length; i ++) {
				if (url.contains(dominios[i])) {
					dominioCont++;
				}
			}
			
			if (dominioCont == 0) {
				return false;
			}
			
		} else {
			return false;
		}
		
		return true;;
	 
 
 }


}
