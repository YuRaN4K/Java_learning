import javax.swing.JOptionPane;

public class Error_Pane {
    public static void main(String[] args) {
        int Question = JOptionPane.showConfirmDialog(null, "Wanna code?", "Question", JOptionPane.YES_NO_CANCEL_OPTION);
        if(Question==1){
            JOptionPane.showMessageDialog(null, "GO TO WORK, NOW !!!", "Your Boss", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "OK", "Your Boss", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
