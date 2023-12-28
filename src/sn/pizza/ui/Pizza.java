package sn.pizza.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;

public class Pizza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JTextArea txtAdresse;
	JTextField txtMobile;
	JList lstToppings;
	JComboBox cbBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pizza() {
		setTitle("Pizza Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 409);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(195, 195, 195));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelName = new JLabel("Nom");
		labelName.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelName.setBounds(61, 23, 46, 14);
		contentPane.add(labelName);
		
		JLabel labelMobile = new JLabel("Numéro Tel");
		labelMobile.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelMobile.setBounds(32, 137, 75, 14);
		contentPane.add(labelMobile);
		
		JLabel labelBase = new JLabel("Base");
		labelBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelBase.setBounds(46, 183, 46, 14);
		contentPane.add(labelBase);
		
		JLabel labelAdresse = new JLabel("Adresse");
		labelAdresse.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelAdresse.setBounds(50, 78, 57, 14);
		contentPane.add(labelAdresse);
		
		JLabel labelToppings = new JLabel("Ingrédients");
		labelToppings.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelToppings.setBounds(32, 261, 75, 14);
		contentPane.add(labelToppings);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setBounds(143, 20, 158, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAdresse = new JTextArea();
		txtAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAdresse.setBounds(145, 63, 156, 45);
		contentPane.add(txtAdresse);
		
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMobile.setBounds(143, 134, 158, 20);
		contentPane.add(txtMobile);
		txtMobile.setColumns(10);
		
		cbBase = new JComboBox();
		cbBase.setModel(new DefaultComboBoxModel(new String[] {"Margherita", "Quatre saisons", "Pizza végétarienne", "Calzone"}));
		cbBase.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbBase.setBounds(143, 179, 158, 22);
		contentPane.add(cbBase);
		
		JButton btnCommande = new JButton("Passer commande");
		btnCommande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCommande.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCommande.setBounds(80, 336, 141, 23);
		contentPane.add(btnCommande);
		
		JButton btnReset = new JButton("Réinitialiser");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(261, 336, 116, 23);
		contentPane.add(btnReset);
		
		lstToppings = new JList();
		lstToppings.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pepperoni", "oignons", "brocoli", "poivrons", "aubergines"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstToppings.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lstToppings.setBounds(143, 231, 158, 71);
		contentPane.add(lstToppings);
	}
}
