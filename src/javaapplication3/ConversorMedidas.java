
package javaapplication3;



import javax.swing.JOptionPane;

public class ConversorMedidas extends Menu {

	public boolean ValidarNumero(String input) {
		if ( input.matches("^-?[0-9]+([.][0-9]+)?$") ){
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "Ingresa solo valor numerico.");
			return false;
		} 
	}
	
	
	public float ConversorMedidas(float MedidasInput) {
		String tipoConversion = ( JOptionPane.showInputDialog(null, "Elija la escala a la que desea convertir su medida","Medidas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						 "De Centimetros a Pulgadas",
						  "De Pulgadas a Centimetros",
						  
			},"De Centimetros a Pulgadas")).toString();
		
		
		switch (tipoConversion) {
		
		case "De Centimetros a Pulgadas":
			MedidasInput =  MedidasInput / 2.54f ;
			break;
		case "De Pulgadas a Centimetros":
			MedidasInput =  MedidasInput * 2.54f  ;
			break;
				
		

		default:
			break;
		}
		return MedidasInput;
		}
}
		