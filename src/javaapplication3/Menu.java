package javaapplication3;

    import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) {
	
		
		ConversorMoneda cm = new ConversorMoneda();
		ConversorTemperatura ct = new ConversorTemperatura();
		
		while(true) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
				     JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},          	
				     "Selecciona")).toString();
			
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: "); 
				if(cm.ValidarNumero(input) == true) {
					float MonedaInput = (float) Float.parseFloat(input);
					float total = (float) cm.ConversionMoneda(MonedaInput);
					JOptionPane.showMessageDialog(null, "Tenes $ " + Math.round(total * 100) / 100f);// para float
					
					float repuesta = JOptionPane.showConfirmDialog(null, ".Desea realizar otra conversion?");
					if(JOptionPane.OK_OPTION == repuesta) {
						System.out.println("Selecciona opcion afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Finalizado");
						break;
					}
				}
			}
			else if(opciones == "Conversor de Temperatura") {
				String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir: ");
				if(ct.ValidarNumero(input) == true) {
					float TemperaturaInput = (float)Float.parseFloat(input);
					float total = (float) ct.ConversionTemperatura(TemperaturaInput);
					JOptionPane.showMessageDialog(null, "Tenes " + Math.round(total * 100) / 100f + " grados ");
					
					float repuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
					if(JOptionPane.OK_OPTION == repuesta) {
						System.out.println("Selecciona opcion afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
						break;
					}
				}
			}
			 
		}
		
		
	}
	
}