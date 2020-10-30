import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class FDemo extends JFrame implements ActionListener
{
String name=null;
Home hm;
Play py;
Scorecard sc;
Container cn = getContentPane();
CardLayout Card;


FDemo()
{
    
    
     Font F=new Font("",Font.BOLD,50);
     setFont(F);
        	
    Card=new CardLayout();
    setLayout(Card);
   
    hm=new Home(this);
    py=new Play(this);
   sc=new Scorecard(this);
	
    cn.add("Home",hm);
    cn.add("Play",py);
   cn.add("Scorecard",sc);
	 	
} 
public void actionPerformed(ActionEvent e)
{
    
    if(e.getSource()==hm.b3)
    {
    Card.show(cn,"Scorecard");
    }
    
    if(e.getSource()==sc.ba)
    {
    Card.show(cn,"Home");
    }
    
    if(e.getSource()==sc.b)
    {
 try
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/game";
       String name="root";
       String pass="root";
       Connection con=DriverManager.getConnection(url,name,pass);
       Statement st=con.createStatement();
       String q="select * from users1";
       ResultSet rs=st.executeQuery(q);
   
     int j=0;
          while(rs.next())
          {
                
                for(int i=1;i<=3;i++)
                {
                    sc.data[i][j]=rs.getString(i);
                }
                j++;
            }
          
          con.close();
    
    }
    catch(Exception e1)
    {
        System.out.println(e1);
    }
    }
    
    if(e.getSource()==hm.b2)
    {
        
    String s1= JOptionPane.showInputDialog(hm.b1,"Enter Name !!!");
    
    
     try
	 {
             if(s1.equals(""))
             {
                 JOptionPane.showMessageDialog(hm.b2,"Enter Name....");
                 s1= JOptionPane.showInputDialog(hm.b1,"Enter Name !!!");
             }
             else
             {
	//2.Load and register the driver	 
  Class.forName("com.mysql.cj.jdbc.Driver");
  //3.opening database connection to mysql server
  String db_url="jdbc:mysql://localhost:3306/game";
  String db_uname="root";
  String db_upass="root";
  
 Connection con= DriverManager.getConnection(db_url,db_uname,db_upass);
 //4.getting statment object to execute query
 Statement st=con.createStatement();
 
 //5. executing query
 String q="insert into users1 values('"+s1+"','0','0')";
 st.executeUpdate(q);
 JOptionPane.showMessageDialog(hm.b2,"YOU ARE REGISTERD....");
 
 con.close();
             }
  }
  catch(Exception e1)
  {
   System.out.println(e1);
   }
    
    }
if(e.getSource()==hm.b1)
{
String s1= JOptionPane.showInputDialog(hm.b1,"Enter Name !!!");

try
{
  Class.forName("com.mysql.cj.jdbc.Driver");
  String db_url="jdbc:mysql://localhost:3306/game";
  String db_uname="root";
  String db_upass="root";
  
 Connection con= DriverManager.getConnection(db_url,db_uname,db_upass);
 //4.getting statment object to execute query
 Statement st=con.createStatement();
 
 //5. executing query
 String q="select * from users1 where name='"+s1+"'";
 ResultSet rs=st.executeQuery(q);
 if(rs.next())
 {
    name=s1;
    Card.show(cn,"Play");
    py.l5.setText("Name     :"  +s1);

 }
 else
   {
	   JOptionPane.showMessageDialog(this,"Register First!!!");
   }
 con.close();
   }
  catch(Exception e1)
   {
   System.out.println(e1);
   }
}


if(e.getSource()==py.b1)
{
int s1=py.d;
int s2=py.e1-s1;
int s3 = (s1*100)/s2;

            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/game";
            String name="root";
            String pass="root";
            Connection con=DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();
            String q="UPDATE users1 SET score='"+s1+"',accu='"+s3+"' WHERE name='"+name+"';";
            st.executeUpdate(q);
            con.close();
            
            
            py.l1.setText("");	
	    py.l2.setText("");
	    py.l3.setText("");
		py.l4.setText("");
		py.b5.setText("A");
	    py.b6.setText("B");
	    py.b7.setText("C");
	    py.b8.setText("D");
		py.a=1;
		py.b=1;
		py.c=0;
		py.d=1;
		py.e1=1;
		py.l7.setText("Name        :0");
	    py.l8.setText("Accuracy:0%");
	    py.l6.setText("Correct     :0");
	    py.l7.setText("InCorrect :0");
        }
        catch(Exception ee)
        {
            System.out.println(ee);
        }

Card.show(cn,"Home");
}
}
}
class Demo
{
public static void main (String[] shiv)
{
FDemo f=new FDemo();

f.setVisible(true);
f.setBounds(10,10,618,640);
f.setTitle("MATHS QUIZ");
}
}