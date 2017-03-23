package mschreiber2740Ex3h;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Font;

public class RainfallForm extends JFrame {

	private JPanel contentPane;
	private JList rainfallList;
	private JLabel lblTotalLabel;
	private JTextField inputMonthTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RainfallForm frame = new RainfallForm();
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
	public RainfallForm() {
		setTitle("MSchreiber 2740 Ex3H Rainfall");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonthlyRainfall = new JLabel("Monthly Rainfall");
		lblMonthlyRainfall.setBounds(10, 11, 105, 14);
		contentPane.add(lblMonthlyRainfall);
		
		JList monthList = new JList();
		monthList.setBackground(UIManager.getColor("Label.background"));
		monthList.setEnabled(false);
		monthList.setModel(new AbstractListModel() {
			String[] values = new String[] {"01 Jan", "02 Feb", "03 Mar", "04 Apr", "05 May", "06 June", "07 Jul", "08 Aug", "09 Sept", "10 Oct", "11 Nov", "12 Dec"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		monthList.setBounds(20, 39, 72, 200);
		contentPane.add(monthList);
		
		rainfallList = new JList();
		rainfallList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				//NEED CODE HERE
				
			}
		});		
		rainfallList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rainfallList.setBounds(77, 39, 72, 200);
		contentPane.add(rainfallList);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(177, 40, 46, 14);
		contentPane.add(lblTotal);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(177, 77, 83, 14);
		contentPane.add(lblAverage);
		
		JLabel lblMaximum = new JLabel("Maximum:");
		lblMaximum.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaximum.setBounds(177, 119, 83, 14);
		contentPane.add(lblMaximum);
		
		JLabel lblMinimum = new JLabel("Minimum:");
		lblMinimum.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMinimum.setBounds(177, 161, 83, 14);
		contentPane.add(lblMinimum);
		
		lblTotalLabel = new JLabel("0.0");
		lblTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblTotalLabel.setBounds(256, 35, 36, 25);
		contentPane.add(lblTotalLabel);
		
		JLabel lblAvg = new JLabel("0.0");
		lblAvg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAvg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAvg.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAvg.setBounds(256, 72, 36, 25);
		contentPane.add(lblAvg);
		
		JLabel lblMax = new JLabel("0.0");
		lblMax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMax.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblMax.setBounds(256, 114, 36, 25);
		contentPane.add(lblMax);
		
		JLabel lblMin = new JLabel("0.0");
		lblMin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblMin.setBounds(256, 156, 36, 25);
		contentPane.add(lblMin);
		
		inputMonthTextField = new JTextField();
		inputMonthTextField.setBounds(92, 250, 57, 20);
		contentPane.add(inputMonthTextField);
		inputMonthTextField.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//NEED CODE HERE
				
				
				
			}
		});		
		btnUpdate.setBounds(77, 281, 89, 23);
		contentPane.add(btnUpdate);
		
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//NEED CODE HERE
				
				
				
			}
		});		
		btnCalculate.setBounds(203, 203, 89, 23);
		contentPane.add(btnCalculate);
	}
}
