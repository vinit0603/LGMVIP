package CurrencyConverter;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.util.ResourceBundle;

public class AbWin extends JFrame {
	private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation"); //$NON-NLS-1$
	private JPanel contentPane;
	private static AbWin windowInstance = null;

	
	private AbWin() {
		setTitle(BUNDLE.getString("AboutWindow.this.title")); //$NON-NLS-1$
		setBounds(100, 100, 347, 260);
		setLocationRelativeTo(null);
		setResizable( false );

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		contentPane.setLayout(null);

		
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setBounds(65, 12, 219, 33);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
		contentPane.add(lblTitle);

		JLabel lblVersion = new JLabel("Version 1.0");
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setBounds(65, 45, 219, 33);
		contentPane.add(lblVersion);
		

		
	}
    public static AbWin getInstance() {
		if (windowInstance == null) {
			windowInstance = new AbWin();
		}
		 return windowInstance;
	}
}