import java.awt.*;
import java.awt.event.*;
public class ListProject extends Frame implements ActionListener{
    
    Button b1= new Button("Add to Reading");
    Button b2= new Button("Add to Finished");
    Button b3= new Button(">>");
    Button b4= new Button("<<");
    Button b5=new Button("Clear Reading");
    Button b6=new Button("Clear Finished");
    
    TextField t=new TextField();
    
    Label l1=new Label("Reading");
    Label l2=new Label("Finished");
    Label l3=new Label(" ");
    
    List L1=new List(5,false);
    List L2=new List(5,false);
    
    
    ListProject()
    {
       b1.setBounds(100,125,150,50);
       b2.setBounds(350,125,150,50);
       b3.setBounds(275,300,50,50);
       b4.setBounds(275,400,50,50);
       b5.setBounds(100,500,150,50);
       b6.setBounds(350,500,150,50);
       
       
       t.setBounds(250,50,100,50);
       
       l1.setBounds(150,250,50,50);
       l2.setBounds(400,250,50,50);
       l3.setBounds(350,500,50,50);
       l3.setVisible(true);
       
       L1.setBounds(100,300,150,200);
       L1.add("A Song of Ice and Fire");
       L1.add("American Gods");
       L1.add("Killing Floor");
       
       L2.setBounds(350,300,150,200);
       L2.add("The GodFather");
       L2.add("The Silent Patient");
       L2.add("Beneath a Scarlet Sky");
       
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(b6);
       
       add(t);
       
       add(l1);
       add(l2);
       
       
       add(L1);
       add(L2);
       
       add(l3);
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       
          
       
       setSize(700,700);
       setTitle("Books");
       setVisible(true);
       
       
       
        
       
       
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            String str=t.getText();
            L1.add(str);
        }
        else if(e.getSource()==b2)
        {
            String str=t.getText();
            L2.add(str);
        }
        else if(e.getSource()==b3)
        {
            int pos=L1.getSelectedIndex();
            L2.add(L1.getItem(pos));
            L1.remove(pos);
            
        }
        else if(e.getSource()==b4)
        {
            int pos=L2.getSelectedIndex();
            L1.add(L2.getItem(pos));
            L2.remove(pos);
        }
        else if(e.getSource()==b5)
        {
            L1.removeAll();
        }
        else if(e.getSource()==b6)
        {
            L2.removeAll();
        }
           
           
    }
    public static void main(String[] args) {
        new ListProject();
    }
}
