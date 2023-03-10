import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class BajrangCRUD extends JFrame {
    
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newItem, openItem, saveItem, exitItem;
    private File file;
    private String fileName = "Bajrang.txt";
    
    public BajrangCRUD() {
        // Set up the menu bar and items
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        file = new File(fileName);
        
        // Add the menu items to the menu bar
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        
        // Register event listeners for the menu items
        newItem.addActionListener(e -> {
            // Implement code for creating a new item
            // ...
        });
        
        openItem.addActionListener(e -> {
            // Implement code for opening an existing item
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    // Display each line in a dialog box
                    JOptionPane.showMessageDialog(this, line);
                }
                reader.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage());
            }
        });
        
        saveItem.addActionListener(e -> {
            // Implement code for saving the current item
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                // Write the data to the file
                writer.write("Name: Bajrang Gour");
                // Close the writer
                writer.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
            }
        });
        
        exitItem.addActionListener(e -> {
            // Implement code for exiting the application
            System.exit(0);
        });
        
        // Set up the main window
        setTitle("Bajrang CRUD Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new BajrangCRUD();
    }
}
