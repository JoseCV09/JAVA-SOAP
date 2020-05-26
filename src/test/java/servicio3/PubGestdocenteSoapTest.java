package servicio3;
import java.util.List;
import org.junit.Test;
import uasi.ws_gestdocente.PubGestdocente;
public class PubGestdocenteSoapTest {
	uasi.ws_gestdocente.PubGestdocente serv = new PubGestdocente();
	uasi.ws_gestdocente.PubGestdocenteSoap port = serv.getPubGestdocenteSoap();

	@Test
	public void testWsasidepto() {
		List<uasi.ws_gestdocente.ClaseAsiDepto> datos = port.wsasidepto("C", "2011-12", "B140", "").getClaseAsiDepto();
		System.out.println("\n\n***DEPARTAMENTOS UNIVERSIDAD***\n");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i).getCodasi());
			System.out.println(datos.get(i).getNomasi());
			System.out.println(datos.get(i).getEnlaceasi());
			System.out.println(datos.get(i).getCodest());
			System.out.println(datos.get(i).getNomest());
		}
	}

	@Test
	public void testWstitulosuni() {
		List<uasi.ws_gestdocente.ClaseTitulosUni> datos = port.wstitulosuni("C", "2010-14").getClaseTitulosUni();
		System.out.println("\n\n***TITULOS UNIVERSIDAD***\n");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i).getCodigo());
			System.out.println(datos.get(i).getNombre());
			System.out.println(datos.get(i).getTipo());
			System.out.println(datos.get(i).getArea());
			System.out.println(datos.get(i).getUrl());
		}
	}
	
	@Test
	public void testWscalificaciones() {
		List<uasi.ws_gestdocente.ClaseCalificaciones> datos = port.wscalificaciones("C","9244").getClaseCalificaciones();
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i).getCod());
			System.out.println(datos.get(i).getDescripcion());
		}
	}
	
	@Test
	public void testWshorarios() {
		List<uasi.ws_gestdocente.ClaseHorarios> datos = port.wshorarios("C","2010-11","9244","T").getClaseHorarios();
		System.out.println("\n\n***HORARIOS****\n");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i).getTeopra());
			System.out.println(datos.get(i).getCodgrp());
			System.out.println(datos.get(i).getFechainicio());
			System.out.println(datos.get(i).getFechafin());
			System.out.println(datos.get(i).getDia());
			System.out.println(datos.get(i).getDiasemana());
			System.out.println(datos.get(i).getHoraini());
			System.out.println(datos.get(i).getHorafin());
			System.out.println(datos.get(i).getAula());
			System.out.println(datos.get(i).getAulasig());
			System.out.println(datos.get(i).getClaseActiv());
			System.out.println(datos.get(i).getDescactiv());
			System.out.println(datos.get(i).getDescgrupo());
		}
	}
	@Test
	public void testWsdatostoasig() {
		List<uasi.ws_gestdocente.ClaseDatosAsig> datos = port.wsdatosasig("C", "2010-11", "9244").getClaseDatosAsig();
		System.out.println("\n\n***DATOS ASIG****\n");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i).getNomasi());
			System.out.println(datos.get(i).getNomasicorto());
			System.out.println(datos.get(i).getCrdtsteo());
			System.out.println(datos.get(i).getCrdtspra());
			System.out.println(datos.get(i).getCrdtects());
			System.out.println(datos.get(i).getDuracion());
		}
	}
	
}
