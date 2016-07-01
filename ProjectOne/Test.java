package ProjectOne;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Test extends MotorBike {

	protected Shell shell;
	private Text txtModel;
	private Text txtColor;
	private Text txtPrice;
	private Text txtYear;
	private Text txtHorsePower;
	private Text txtNumSpeeds;
	private Text txtType;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Test window = new Test();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(619, 397);
		shell.setText("SWT Application");
		
		Label lblMotorBikeInformation = new Label(shell, SWT.CENTER);
		lblMotorBikeInformation.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
		lblMotorBikeInformation.setBounds(138, 10, 233, 29);
		lblMotorBikeInformation.setText("Motor Bike Information");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNewLabel.setBounds(66, 62, 91, 28);
		lblNewLabel.setText("Model");
		
		Label lblColor = new Label(shell, SWT.NONE);
		lblColor.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblColor.setText("Color");
		lblColor.setBounds(66, 96, 91, 28);
		
		Label lblPrice = new Label(shell, SWT.NONE);
		lblPrice.setText("Price");
		lblPrice.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblPrice.setBounds(66, 130, 91, 28);
		
		Label lblYear = new Label(shell, SWT.NONE);
		lblYear.setText("Year");
		lblYear.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblYear.setBounds(66, 164, 91, 28);
		
		Label lblNumberOfSpeeds = new Label(shell, SWT.NONE);
		lblNumberOfSpeeds.setText("Number of speeds");
		lblNumberOfSpeeds.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNumberOfSpeeds.setBounds(66, 232, 136, 28);
		
		Label lblTyperegularMountain = new Label(shell, SWT.NONE);
		lblTyperegularMountain.setText("Type (Regular, Mountain, Racing.)");
		lblTyperegularMountain.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblTyperegularMountain.setBounds(66, 266, 248, 28);
		
		Label lblHorsePower = new Label(shell, SWT.NONE);
		lblHorsePower.setText("Horse Power");
		lblHorsePower.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblHorsePower.setBounds(66, 198, 91, 28);
		
		txtModel = new Text(shell, SWT.BORDER);
		txtModel.setBounds(143, 62, 136, 21);
		
		txtColor = new Text(shell, SWT.BORDER);
		txtColor.setBounds(143, 96, 136, 21);
		
		txtPrice = new Text(shell, SWT.BORDER);
		txtPrice.setBounds(143, 130, 136, 21);
		
		txtYear = new Text(shell, SWT.BORDER);
		txtYear.setBounds(143, 164, 136, 21);
		
		txtHorsePower = new Text(shell, SWT.BORDER);
		txtHorsePower.setBounds(178, 198, 136, 21);
		
		txtNumSpeeds = new Text(shell, SWT.BORDER);
		txtNumSpeeds.setBounds(207, 232, 136, 21);
		
		txtType = new Text(shell, SWT.BORDER);
		txtType.setBounds(309, 266, 136, 21);
		
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSubmit.setBounds(66, 300, 75, 25);
		btnSubmit.setText("Submit");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(373, 62, 205, 191);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(0, 0, 205, 191);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

	}
}
