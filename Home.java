import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Home extends JPanel implements ActionListener 
{
        JButton b1,b2,b3;
	ImageIcon img2,img1;
	Image back,b;
	JLabel l1;
	
    Home(FDemo d)
    {
        
          setLayout(null);
          //setBackground(new Color(247,247,247));
          img2 = new ImageIcon("R:\\javac\\back111.gif");
		  back = img2.getImage();
                  img2 = new ImageIcon("R:\\javac\\quiz3.png");
	           
	 Font F=new Font("Segoe Script",Font.BOLD,30);
         
          ImageIcon water = new ImageIcon("R:\\javac\\quize5.gif");
     b1 = new JButton(water);
	b1.setBounds(15,500,150,50);
    add(b1);
	b1.addActionListener(this);
		  
		  ImageIcon water1 = new ImageIcon("R:\\javac\\ezgif.com-add-text.jpg");
     b2 = new JButton(water1);
	b2.setBounds(200,500,150,50);
    add(b2);
	b2.addActionListener(this);
	
            ImageIcon water2 = new ImageIcon("R:\\javac\\ezgif.com-add-text.gif");
      b3 = new JButton(water2);
	b3.setBounds(385,500,150,50);
    add(b3);
	b3.addActionListener(this);
	
		 b1.addActionListener(d);
		 b2.addActionListener(d);
                 b3.addActionListener(d);
    }
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(back,0,0,this);	
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}

}

