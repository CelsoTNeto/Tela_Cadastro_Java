package view;

import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import view2.Janela;

public class Cadastro extends JFrame {
	
	
	JTextField txtresult = new JTextField("");
	
	JButton btnNome = new JButton("Nome ");
	JButton btnEndereço = new JButton("Endereço");
	JButton btnCidade = new JButton ("Cidade");
	JButton btnBairro = new JButton("Bairro");
    JButton btnTelefone = new JButton("telefone");
    JButton btnRG = new JButton("RG");
    JButton btnCep = new JButton("Cep");
    JButton btnEstado = new JButton("Estado");
    JButton btnCelular = new JButton("Celular");
    JButton btnCPF = new JButton("CPF");
    
    
    
	
	
   
	
	public Cadastro() {
		super ("Cadastro_Java");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		
		
		paine.add(txtresult);
		txtresult.setBounds(10 , 33 , 320, 45);
		
		
		paine.add(btnNome);
		btnNome.setBounds(10, 4, 100, 30);
		
		paine.add(btnEndereço);
		btnEndereço.setBounds(10, 20, 100, 80);
		
		
		paine.add(btnCidade);
		btnCidade.setBounds(10, 25, 100, 40);
		
		paine.add(btnBairro);
		btnBairro.setBounds(10, 4, 100, 30);
		
		paine.add(btnTelefone);
		btnTelefone.setBounds(10, 4, 100, 30);
		
		paine.add(btnRG);
		btnRG.setBounds(10, 4, 100, 30);
		
		paine.add(btnCep);
		btnCep.setBounds(10, 4, 100, 30);
		
		paine.add(btnEstado);
		btnEstado.setBounds(10, 4, 100, 30);
		
		
		paine.add(cmbEst);
		cmbEst.setBounds(400, 105, 70, 30);
		cmbEst.addItem("AC");		cmbEst.addItem("AL");
		cmbEst.addItem("AP");		cmbEst.addItem("AM");
		cmbEst.addItem("BA");		cmbEst.addItem("CE");
		cmbEst.addItem("DF");		cmbEst.addItem("ES");
		cmbEst.addItem("GO");		cmbEst.addItem("MA");
		cmbEst.addItem("MT");		cmbEst.addItem("MS");
		cmbEst.addItem("MG");		cmbEst.addItem("PA");
		cmbEst.addItem("PB");		cmbEst.addItem("PR");
		cmbEst.addItem("PE");		cmbEst.addItem("PI");
		cmbEst.addItem("RJ");		cmbEst.addItem("RN");
		cmbEst.addItem("RS");		cmbEst.addItem("RO");
		cmbEst.addItem("RR");		cmbEst.addItem("SC");
		cmbEst.addItem("SP");		cmbEst.addItem("SE");
		cmbEst.addItem("TO");		
		
		
		paine.add(btnCelular);
		btnCelular.setBounds(10, 4, 100, 30);
		
		paine.add(btnCPF);
		btnCPF.setBounds(10, 4, 100, 30);
		
		
		

		
		
		
		
		
		
		
		
		
		
	

	
	
	this.setSize(350,400); 
	this.setVisible(true); 
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	btnNome.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
		}

	});
	
	}
	
	
	
	public static void main(String[] args) {
		Cadastro calc = new Cadastro();

	
	}
}
