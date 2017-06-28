package visao.professor;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VisaoProfessor extends JFrame {

	public JLabel lMensagem;
	public JButton	bCadastrarAuxiliar, 
					bCadastrarAssistente, 
					bCadastrarAdjunto, 
					bCadastrarAssociado, 
					bCadastrarTitular, 
					bSair;
	
	public VisaoProfessor() {
		setTitle("Cadastrar Professor");
		setSize(270, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Escolha uma opção de professor:");
		bCadastrarAuxiliar = new JButton("Cadastrar Auxiliar");
		bCadastrarAssistente = new JButton("Cadastrar Assistente");
		bCadastrarAdjunto = new JButton("Cadastrar Adjunto");
		bCadastrarAssociado = new JButton("Cadastrar Associado");
		bCadastrarTitular = new JButton("Cadastrar Titular");
		bSair = new JButton("Sair");

		setLayout(new GridLayout(7, 1));
		add(lMensagem);
		add(bCadastrarAuxiliar);
		add(bCadastrarAssistente);
		add(bCadastrarAdjunto);
		add(bCadastrarAssociado);
		add(bCadastrarTitular);
		add(bSair);

		setVisible(true);
	}

}