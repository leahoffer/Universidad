package clientWindows;

import businessDelegate.BusinessDelegate;
import dto.DireccionVO;
import dto.ProfesorVO;

public class AgregarProfesorRawTest {

	public static void main(String[] args) {
		ProfesorVO pvo;
		DireccionVO dvo;
		dvo = new DireccionVO("LMCampos", 552, "1708", "Morón", 0, "-");
		pvo = new ProfesorVO();
		pvo.setDireccion(dvo);
		pvo.setNombre("Leandro");
		pvo.setNumeroLegajo(111111);
		
		try
		{
			BusinessDelegate.getInstance().agregarProfesor(pvo);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
