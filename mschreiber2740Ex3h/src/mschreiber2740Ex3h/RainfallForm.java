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
import java.text.DecimalFormat;

public class RainfallForm extends JFrame {

	private JPanel contentPane;
	private JList rainfallList;
	private JLabel lblTotalLabel;
	private JTextField inputMonthTextField;
	private String [] strRainfall = {
			 "1.2", "2.7", "2.2", "3.1", "2.9", "5.1",
			 "3.2", "2.7", "3.6", "1.8","2.2", "1.7"};
	private JButton btnUpdate;

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
		
		rainfallList = new JList(strRainfall);
		rainfallList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {

				btnUpdate.setEnabled(true);
				inputMonthTextField.setText((String) rainfallList.getSelectedValue());
				inputMonthTextField.requestFocus();
				inputMonthTextField.selectAll();
				
				
			}
		});		
		rainfallList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rainfallList.setBounds(91, 36, 36, 200);
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
		
		btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selectedIndex = rainfallList.getSelectedIndex();
				double r = Double.parseDouble(inputMonthTextField.getText());
				strRainfall[selectedIndex] = Double.toString(r);
				rainfallList.repaint();
				
				inputMonthTextField.setText("0.0");
				btnUpdate.setEnabled(false);
				lblTotalLabel.setText("");
				lblAvg.setText("");
				lblMin.setText("");
				lblMax.setText("");		
				
			}
		});		
		btnUpdate.setBounds(77, 281, 89, 23);
		contentPane.add(btnUpdate);
		
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//creates Rainfall object using strRainfall array
				Rainfall rainfall = new Rainfall(strRainfall);
				DecimalFormat fmt = new DecimalFormat("0.0");
				//sets the total label value on the form
				lblTotalLabel.setText(fmt.format(rainfall.getTotal()));
				
				//sets the average value on the form
				rainfall = new Rainfall(strRainfall);
				DecimalFormat fmt1 = new DecimalFormat("0.0");
				//sets the total label value on the form
				lblAvg.setText(fmt1.format(rainfall.getAverage()));
				
				//sets the min value on the form
				rainfall = new Rainfall(strRainfall);
				DecimalFormat fmt2 = new DecimalFormat("0.0");
				//sets the total label value on the form
				lblMin.setText(fmt2.format(rainfall.getLowest()));
				
				//sets the max value on the form
				rainfall = new Rainfall(strRainfall);
				DecimalFormat fmt3 = new DecimalFormat("0.0");
				//sets the total label value on the form
				lblMax.setText(fmt3.format(rainfall.getHighest()));
				
				
			}
		});		
		btnCalculate.setBounds(202, 281, 89, 23);
		contentPane.add(btnCalculate);
	}
}
