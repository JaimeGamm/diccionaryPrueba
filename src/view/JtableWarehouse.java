package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JtableWarehouse extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements;
	private JTable jtElements;
	private JScrollPane jsTable;
	public JtableWarehouse() {
		initComponents();
	}
	private void initComponents() {
		JPanel panel =new JPanel();
		panel.setBackground(Constants.BLACK);
	  	panel.setLayout(new BorderLayout());
		JLabel jlabel = new JLabel(Constants.MESSAGE_LIST_WAREHOUSE);
		Font font =new Font("Frankin Gothic Demi", Font.ITALIC,16);
		jlabel.setFont(font);
		jlabel.setForeground(Color.white);
		panel.add(jlabel, BorderLayout.CENTER);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.decode("#30373D"));
		String[] headrs = {"NOMBRE DEL ALMACEN", "DIRECCION"};
		dtmElements=new DefaultTableModel();
		dtmElements.setColumnIdentifiers(headrs);
		
		Font fontHeader =new Font("Frankin Gothic Demi", Font.ITALIC,14);
		
		jtElements = new JTable();
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Color.decode("#282E33"));
		jtElements.getTableHeader().setForeground(Color.white);
		jtElements.getTableHeader().setFont(fontHeader);
		jtElements.setRowHeight(35);
		
		jtElements.setFillsViewportHeight(true);
		jtElements.setBorder(null);
		
		jsTable = new JScrollPane(jtElements);
		jsTable.setForeground(Color.white);
		jsTable.setBorder(null);
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(panel,BorderLayout.NORTH);
		this.add(jsTable,BorderLayout.CENTER);
		setBorder(null);
	}
	
	public void addElementTOtable(Object[] vector) {
		dtmElements.addRow(vector);
		//dtmElements.setNumRows(0);
	}
	
}
