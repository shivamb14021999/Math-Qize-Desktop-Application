import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Scorecard extends JPanel implements ActionListener
{
   // JButton h;
      ImageIcon i;
       JTable j;
    JButton b,ba;
    String column[]={"Name", "Score", "Accuracy"};
    String data[][]=new String[100][5];
Scorecard(FDemo d)
{
    b=new JButton("Show all Players");
        b.setForeground(Color.red);
        b.setBounds(200,40,200,30);
        b.setFont(new Font("Calibri",Font.BOLD,30));
        add(b);
b.addActionListener(d);  
         j=new JTable(data,column);
   j.setBounds(80,80,500,500);
    add(new JScrollPane(j));
    ba=new JButton("Home");
    add("East",ba);
    ba.addActionListener(d);    

}
public void actionPerformed(ActionEvent e)
{

}


}