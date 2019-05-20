package es.studium.menu;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AniadirOtro extends JFrame implements WindowListener, ActionListener
{
private static final long serialVersionUID = 1L;
	
	
	JLabel lblNombre = new JLabel("Nombre:");
	JTextField txtNombre = new JTextField(10);
	JLabel lblTel = new JLabel("Teléfono:");
	JTextField txtTel= new JTextField(10);
	JLabel lblCorreo=new JLabel("Segundo apellido:");
	JTextField txtCorreo=new JTextField(10);
	JButton btnAcept = new JButton("Aceptar");
	JButton btnCancelar = new JButton("Cancelar");
	
	JPanel pnlSup =new JPanel();
	JPanel pnlInf =new JPanel();
	
	public AniadirOtro(){
		addWindowListener(this);
		setTitle ("Añadir Final");
		setSize(300,190);
		//setVisible(true);
		
		pnlSup.setLayout(new GridLayout(3,2));
		pnlSup.add(lblNombre);
		lblNombre.setHorizontalAlignment(0);
		JPanel pnlSupSup =new JPanel();
		pnlSupSup.add(txtNombre);
		pnlSup.add(pnlSupSup);
		
		pnlSup.add(lblTel);
		lblTel.setHorizontalAlignment(0);
		JPanel pnlCent2=new JPanel();
		pnlCent2.add(txtTel);
		pnlSup.add(pnlCent2);
		
		pnlSup.add(lblCorreo);
		lblCorreo.setHorizontalAlignment(0);
		JPanel pnlCent3=new JPanel();
		pnlCent3.add(txtCorreo);
		pnlSup.add(pnlCent3);
		
		pnlInf.setLayout(new FlowLayout());
		pnlInf.add(btnAcept);
		pnlInf.add(btnCancelar);
		
		add(pnlSup,"North");
		add(pnlInf,"South");
		
		setLocationRelativeTo(null);
		setLocation(480, 200);
		
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				txtNombre.setText("");
				txtTel.setText("");
				txtCorreo.setText("");
			}
		});
		btnAcept.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object a;
				a=e.getSource();
				if(a.equals(btnAcept)) {
					String nombre =txtNombre.getText();
					String Tel = txtTel.getText();
					String Correo = txtCorreo.getText();
					if (nombre.equals("")) {
						JOptionPane.showMessageDialog(null, "Introduzca un nombre válido");
					}else if(Tel.equals("")){
						JOptionPane.showMessageDialog(null, "Introduzca un teléfono válido");
					}else if(Correo.equals("")) {
						JOptionPane.showMessageDialog(null, "Introduzca un correo válido");
					}else {
						setVisible(false);
						JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
					}
				}
			}
		});
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
