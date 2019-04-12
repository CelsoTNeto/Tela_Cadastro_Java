package view;

import java.awt.Container;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


public class Cadastro extends JFrame {
	
	
	JTextField txtNome = new JTextField("");
	JLabel lblNome = new JLabel("Nome :") ;
	
	JTextField txtEnd = new JTextField("");
	JLabel lblEnd = new JLabel("Endereço :");
	
	JTextField txtCidade = new JTextField("");
	JLabel lblCidade = new JLabel("Cidade :");
	
	JTextField txtBairro = new JTextField("");
	JLabel lblBairro = new JLabel("Bairro :");
	
	JTextField txtTel = new JTextField("");
	JLabel lblTel = new JLabel("Telefone :");
	
	JTextField txtRg = new JTextField("");
	JLabel lblRg = new JLabel("RG :");
			
	
	JLabel lblSexo = new JLabel("Sexo :");

	JRadioButton[] rdbsexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();{
		
		rdbsexo[0] = new JRadioButton("Masculinho");
		rdbsexo[1] = new JRadioButton("Feminino");
	}
	
	
	
	JLabel lblCep = new JLabel("CEP : ");
	JTextField txtCep = new JTextField("");
	
	JLabel lblEstado = new JLabel ("ESTADO :");
	JComboBox <String> cmbEst = new JComboBox <String> ();
	
	
	JLabel lblCel = new JLabel ("Celular :");
	JTextField txtCel = new JTextField("");
	
	JLabel lblCPF = new JLabel ("CPF :");
	JTextField txtCpf = new JTextField("");
	
	JButton btnSalvar = new JButton("Salvar ");
	JButton btnImprimir = new JButton("Imprimir");
    
    
	MaskFormatter formatTel = null; //add mascara
	MaskFormatter formatCel = null;
	MaskFormatter formatCpf = null;
	MaskFormatter formatCep = null;
	MaskFormatter formatRg = null;
	
   
	
	public Cadastro() {
		super ("Cadastro_Java");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		
		
		
			
			Container paine1 = getContentPane(); 
			paine1.setLayout(null); 
			
			
			paine1.add(txtNome);
			txtNome.setBounds(90, 20, 240, 40); 
			paine1.add(lblNome);
			lblNome.setBounds(20, 30, 80, 20);
			
			paine1.add(txtEnd);
			txtEnd.setBounds(90, 70, 240, 40); 
			paine1.add(lblEnd);
			lblEnd.setBounds(20, 80, 80, 20);
			
			paine1.add(txtCidade);
			txtCidade.setBounds(90, 120, 240, 40);
			paine1.add(lblCidade);
			lblCidade.setBounds(20, 130, 80, 20);
			
			paine1.add(txtBairro);
			txtBairro.setBounds (90, 170, 240, 40); 
			paine1.add(lblBairro);
			lblBairro.setBounds(20, 180, 80, 20);
			
			try {
				formatTel = new MaskFormatter("(##)####-####"); //a mascara
				txtTel = new JFormattedTextField(formatTel);
			} catch (Exception ext) { //exibir o erro
				ext.printStackTrace();
			}
			paine1.add(txtTel);
			txtTel.setBounds(90, 220, 150, 40); 
			paine1.add(lblTel);
			lblTel.setBounds(20, 230, 80, 20);
			
			try {
				formatRg = new MaskFormatter("##.###.###-A"); //a mascara
				txtRg = new JFormattedTextField(formatRg);
			} catch (Exception exr) { //exibir o erro
				exr.printStackTrace();
			}
			paine1.add(txtRg);
			txtRg.setBounds(90, 270, 150, 40); 
			paine1.add(lblRg);
			lblRg.setBounds(20, 280 , 80, 20);
			
			paine1.add(lblSexo);
			lblSexo.setBounds(350, 20 ,  80 , 40);
			grupo.add(rdbsexo[0]);
			grupo.add(rdbsexo[1]);
			
			paine1.add(rdbsexo[0]);
			rdbsexo[0].setBounds(400, 20, 100, 40);
			paine1.add(rdbsexo[1]);
			rdbsexo[1].setBounds(500, 20, 100, 40);
			
			try { //add mascara antes de tudo!!!
				formatCep = new MaskFormatter("#####-###"); //a mascara
				txtCep = new JFormattedTextField(formatCep);
			} catch (Exception ex) { //exibir o erro
				ex.printStackTrace();
			}
			paine1.add(lblCep);
			lblCep.setBounds(350, 70, 80, 40);
			paine1.add(txtCep);
			txtCep.setBounds(400, 70, 150, 40);
			
			paine1.add(lblEstado);
			lblEstado.setBounds(350, 120, 80, 40);
			paine1.add(cmbEst);
			cmbEst.setBounds(420, 120, 80, 40);
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
			
			try {
				formatCel = new MaskFormatter("(##)####-####"); //a mascara
				txtCel = new JFormattedTextField(formatCel);
			} catch (Exception ext) { //exibir o erro
				ext.printStackTrace();
			}
			paine1.add(lblCel);
			lblCel.setBounds(350, 220 , 80, 40);
			paine1.add(txtCel);
			txtCel.setBounds(400, 220, 150, 40); 
			
			try {
				formatCpf = new MaskFormatter("###.###.###-##"); //a mascara
				txtCpf = new JFormattedTextField(formatCpf);
			} catch (Exception exf) { //exibir o erro
				exf.printStackTrace();
			}
			paine1.add(lblCPF);
			lblCPF.setBounds(350, 270,80 , 40);
			paine1.add(txtCpf);
			txtCpf.setBounds(400, 270, 150, 40);
			
			
			paine1.add(btnImprimir);
			btnImprimir.setBounds(370, 320, 120, 40);
		
			paine1.add(btnSalvar);
			btnSalvar.setBounds(240, 320, 120, 40);
			
		
		
		
		
		
		
		
		
	

	
	
	this.setSize(600,400); 
	this.setVisible(true); 
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		Cadastro calc = new Cadastro();

	
	}
}
