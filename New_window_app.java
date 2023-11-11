import javax.swing.JOptionPane;

public class New_window_app {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        
        JOptionPane.showMessageDialog(null, "Hi "+name+"\nYou are: "+age+" y.o");


    }
}
