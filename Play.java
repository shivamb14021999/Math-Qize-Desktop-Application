import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Play extends JPanel implements ActionListener
{
	ImageIcon img1;
	Image dp1;
  JButton b1,b2,b3,b4,b5,b6,b7,b8;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,m,s;
  JComboBox cb1,cb2;
  int min=12,sec=0;
  int a=1,r1,r2,k1,k2,k3,k4,k5,b=1,ans,c=0,d=1,e1=1;
  boolean start=false;
  String s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="";
  Play (FDemo d)
  {
  Font f=new Font("",Font.BOLD,20);
  setLayout(null);
   img1=new ImageIcon("R:\\javac\\back333.gif");
   dp1=img1.getImage();
  
  cb1=new JComboBox();
  cb1.addItem("Easy(0 to 10)");
  cb1.addItem("Medium(10 to 15)");
  cb1.addItem("Hard(15 to 20)");
  cb1.setBounds(0,80,170,40);
  cb1.setBackground(Color.blue);
  cb1.setForeground(Color.red);
  cb1.getSelectedItem();
  Font f1=new Font("Algerian",Font.BOLD,17);
  cb1.setFont(f1);
  add(cb1);
  
  cb2=new JComboBox();
  cb2.addItem("Add(+)");
  cb2.addItem("Sub(-)");
  cb2.addItem("Mod(%)");
  cb2.addItem("Multi(*)");
  cb2.addItem("Div(/)");
  cb2.addItem("* & /(random)");
  cb2.addItem("+ & -(random)");
  cb2.setBounds(400,80,100,40);
  cb2.setBackground(Color.blue);
  cb2.setForeground(Color.red);
  Font f2=new Font("Algerian",Font.BOLD,17);
  cb2.setFont(f2);
  add(cb2);
  
  
  
  b1=new JButton("Home");
  b1.setBounds(0,0,150,50);
  b1.setBackground(Color.green);
  add(b1);
  
  b2=new JButton("Start");
  b2.setBounds(150,0,150,50);
  b2.setBackground(Color.blue);
  b2.setForeground(Color.white);
  add(b2);
   
  b3=new JButton("Stop");
  b3.setBounds(300,0,150,50);
  b3.setBackground(Color.red);
  add(b3);
  
  b4=new JButton("Instruction");
  b4.setBounds(450,0,150,50);
  b4.setBackground(Color.orange);		
  b4.setForeground(Color.blue);
  add(b4);
  
  b5=new JButton("A");
  b5.setBounds(0,330,150,50);
  b5.setBackground(Color.black);		
  b5.setForeground(Color.white);		
  add(b5);
  
  b6=new JButton("B");
  b6.setBounds(150,330,150,50);
  b6.setBackground(Color.black);		
  b6.setForeground(Color.white);
  add(b6);
   
  b7=new JButton("C");
  b7.setBounds(300,330,150,50);
  b7.setBackground(Color.black);		
  b7.setForeground(Color.white);
  add(b7);
  
  b8=new JButton("D");
  b8.setBounds(450,330,150,50);
  b8.setBackground(Color.black);		
  b8.setForeground(Color.white);	
  add(b8);
   Font f3=new Font("Algerian",Font.BOLD,25);
  l1=new JLabel();
  l1.setBounds(20,180,100,25);
  l1.setForeground(Color.red);
  l1.setFont(f3);
  add(l1);
  
  l2=new JLabel();
  l2.setBounds(300,190,100,25);
  l2.setForeground(Color.red);
  l2.setFont(f3);
  add(l2);
  
  l3=new JLabel();
  l3.setBounds(300,250,100,25);
  l3.setForeground(Color.red);
  l3.setFont(f3);
  add(l3);
  
  l4=new JLabel();
  l4.setBounds(240,250,100,25);
  l4.setForeground(Color.red);
  l4.setFont(f3);
  add(l4);
  
  l5=new JLabel("Name      :");
  l5.setBounds(50,400,180,40);
  l5.setForeground(Color.red);
  l5.setFont(f);
  add(l5);
  l6=new JLabel("Correct    :0");
  l6.setBounds(50,450,140,40);
  l6.setForeground(Color.red);
  l6.setFont(f);
  add(l6);
  l7=new JLabel("InCorrect :0");
  l7.setBounds(50,500,140,40);
  l7.setForeground(Color.red);
  l7.setFont(f); 
  add(l7);
  l8=new JLabel("Accuracy  :0%");
  l8.setBounds(50,550,160,40);
  l8.setForeground(Color.red);
  l8.setFont(f); 
  add(l8);
  l9=new JLabel("Choose Medium");
  l9.setBounds(0,50,200,30);
  l9.setForeground(Color.cyan);
  l9.setFont(f);
  add(l9);		
  l10=new JLabel("Choose Function");
  l10.setBounds(400,50,200,30);
  l10.setForeground(Color.cyan);
  l10.setFont(f);
  add(l10);		
  
  b1.addActionListener(d);
   b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  // b4.addActionListener(this); 
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  }
  public void paintComponent(Graphics g)
  {
	super.paintComponent(g);
	   //g.setColor(Color.white);
	   g.drawImage(dp1,0,0,this);
	   //g.drawLine(0,320,700,320);
  }

  public void actionPerformed(ActionEvent e)
  {
	if(e.getSource()==b3 && (b3.getText()).equals("Stop") && start)
	{
		s3=l1.getText();	
	    s4=l2.getText();
	    s5=l3.getText();
		s6=l4.getText();
		s7=b5.getText();
	    s8=b6.getText();
	    s9=b7.getText();
	    s10=b8.getText();
		l1.setText("");	
	    l2.setText("");
	    l3.setText("");
		l4.setText("");
		b5.setText("A");
	    b6.setText("B");
	    b7.setText("C");
	    b8.setText("D");
		b3.setText("Resume");
		start=false;
	}
	else if(e.getSource()==b3 && (b3.getText()).equals("Resume"))
	{
		l1.setText(""+s3);	
	    l2.setText(s4);
	    l3.setText(s5);
		l4.setText(s6);
		b5.setText(s7);
	    b6.setText(s8);
	    b7.setText(s9);
	    b8.setText(s10);
		start=true;
		b3.setText("Stop");
	}
    else
	{		
   	  if(start && (b3.getText()).equals("Stop"))
	  {
	  if((e.getSource()==b5 ||e.getSource()==b6 ||e.getSource()==b7 ||e.getSource()==b8) && c!=0)
	   {
		   e1++;
	   }
	  if(e.getSource()==b5 && k2==ans && c!=0)
	  {
		  d++;
	  }
	  if(e.getSource()==b6 && k3==ans && c!=0)
	  {
		  d++;
	  }
	  if(e.getSource()==b7 && k4==ans && c!=0)
	  {
		  d++;
	  }
	  if(e.getSource()==b8 && k5==ans && c!=0)
	  {
		 d++;
	  }
	  
	  }
	  String s1=""+cb1.getItemAt(cb1.getSelectedIndex());
      String s2=""+cb2.getItemAt(cb2.getSelectedIndex());
	  if(e.getSource()==b2 && (b3.getText()).equals("Stop"))
	  {
         l2.setText(""+r1);
		 l3.setText(""+r2);
         randomkey();
		 start=true;
		 b2.setText("Next");		
	  }
	  if(s1.equals("Easy(0 to 10)"))
	  {
	  randomeasy();  
	  }
	  if(s1.equals("Medium(10 to 15)"))
	  {
	  randommedium();		  
	  }
	  if(s1.equals("Hard(15 to 20)"))
	  {
	  randomhard();
	  }
	  if(start && (b3.getText()).equals("Stop"))
	  {
	  if(s2.equals("Add(+)"))
	  {
		  l4.setText("+");
		  ans=r1+r2;
		  randomkey();
	  }
	  if(s2.equals("Sub(-)"))
	  {
		  l4.setText("-");
		  ans=r1-r2;
		  randomkey();
	  }
	  if(s2.equals("Mod(%)"))
	  {
		  l4.setText("%");
		  ans=r1%r2;
		  randomkey();
	  }
	  if(s2.equals("Multi(*)"))
	  {
		  l4.setText("*");
		  ans=r1*r2;
		  randomkey();
	  }
	  if(s2.equals("Div(/)"))
	  {
		  l4.setText("/");
		  ans=r1/r2;
		  randomkey();
	  }
	  if(s2.equals("* & /(random)"))
	  {
		  b++;
      if(b%2==1)
	  {
		  l4.setText("*");
	      ans=r1*r2;
		  randomkey();
	  }
	  if(b%2==0)
	  {
		  l4.setText("/");
	      ans=r1/r2;
		  randomkey();
	  }
	  }
	  if(s2.equals("+ & -(random)"))
	  {
		  a++;
	  if(a%2==1)
	  {
		  l4.setText("+");
		  ans=r1+r2;
		  randomkey();
	  }
	  if(a%2==0)
	  {
		  l4.setText("-");
		  ans=r1-r2;
		  randomkey();
	  }
	  }
	  k2=ans-k2;
	  k3=ans-k3;
	  k4=ans-k4;
	  k5=ans-k5;
	  
	  switch(k1)
	  {
		  case 1:
		  k2=ans;
		  b5.setText("A."+k2);
		  break;
		  case 2:
		  k3=ans;
		  b6.setText("B."+k3);
		  break;
		  case 3:
		  k4=ans;
		  b7.setText("C."+k4);
		  break;
		  case 4:
		  k5=ans;
		  b8.setText("D."+k5);
		  break;
	  }
	  b5.setText("A."+k2);
	  b6.setText("B."+k3);
	  b7.setText("C."+k4);
	  b8.setText("D."+k5);
	  l2.setText(""+r1);
	  l3.setText(""+r2);
	  l8.setText("Accuracy:"+(((d)*100)/(e1))+"%");
	  l6.setText("Correct    :"+(d-1));
	  l7.setText("InCorrect :"+(e1-d));
	  l1.setText("Que."+(++c));
	}
	}	
	
  }
  void randomkey()
  {
	  k1=(int)Math.round(Math.random()*3+1);
	  k2=(int)Math.round(Math.random()*10+1);
	  k3=(int)Math.round(Math.random()*10+1);
	  k4=(int)Math.round(Math.random()*10+1);
	  k5=(int)Math.round(Math.random()*10+1);
	  if(ans==k2 ||ans==k3 ||ans==k4||ans==k5)
	  {
		  randomkey();
	  }
  }
  void randomeasy()
  {
	  r1=(int)Math.round(Math.random()*9+1);
	  r2=(int)Math.round(Math.random()*9+1);
  }
  void randommedium()
  {
	  r1=(int)Math.round(Math.random()*5+10);
	  r2=(int)Math.round(Math.random()*5+10);
  }
  void randomhard()
  {
	  r1=(int)Math.round(Math.random()*5+15);
	  r2=(int)Math.round(Math.random()*5+15);
  }
}