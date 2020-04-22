import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    	JFrame Frame = new JFrame();
    	Model model = new Model();
    	View view = new View(model,Frame);
    	Controller controller = new Controller(model, view);
    }
}