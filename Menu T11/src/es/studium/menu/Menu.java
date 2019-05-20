package es.studium.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Menu extends JFrame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	
	AniadirPrincipio aniadirprincipio=new AniadirPrincipio();
	AniadirFinal aniadirfinal=new AniadirFinal();
	
	JMenuBar barraMenu=new JMenuBar();
	
	JMenu menuOpciones=new JMenu("Opciones");
	
	JMenu menuAniadir=new JMenu("Añadir");
	JMenuItem mniPrincipio=new JMenuItem("Al principio");
	JMenuItem mniFinal=new JMenuItem("Al final");
	JMenuItem mniOtra=new JMenuItem("Otra posición");
	JMenuItem mniVisualizar=new JMenuItem("Visualizar");
	JMenuItem mniSalir=new JMenuItem("Salir");
	
	ArrayList<Persona> Lista= new ArrayList<Persona>();
	
	public Menu() {
		setTitle("Menu");
		
		menuAniadir.add(mniPrincipio);
		menuAniadir.add(mniFinal);
		menuAniadir.add(mniOtra);
		
		menuOpciones.add(menuAniadir);
		menuOpciones.add(mniVisualizar);
		menuOpciones.add(mniSalir);
		
		barraMenu.add(menuOpciones);
		
		addWindowListener(this);
		setJMenuBar(barraMenu);
		setLocationRelativeTo(null);
		setLocation(480, 200);
		setSize(350,250);
		
		mniSalir.addActionListener((ActionListener) this);
		mniPrincipio.addActionListener((ActionListener) this);
		mniFinal.addActionListener((ActionListener) this);
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Menu();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a;
		a=e.getSource();
		if(a.equals(mniSalir))
		{
			System.exit(0);
		}else if(a.equals(mniPrincipio)) {
			aniadirprincipio.setVisible(true);
		}else if(a.equals(mniFinal)) {
			aniadirfinal.setVisible(true);
		}
		
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
