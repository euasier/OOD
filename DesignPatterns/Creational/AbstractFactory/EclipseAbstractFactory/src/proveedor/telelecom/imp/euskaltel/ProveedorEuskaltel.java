package proveedor.telelecom.imp.euskaltel;

import proveedor.telecom.Internet;
import proveedor.telecom.Musica;
import proveedor.telecom.ProveedorTelecom;
import proveedor.telecom.Television;

public class ProveedorEuskaltel implements ProveedorTelecom {

	@Override
	public Television contrataTelevision() {
		// TODO Auto-generated method stub
		return new TelevisionEuskaltel();
	}

	@Override
	public Internet contrataInternet() {
		// TODO Auto-generated method stub
		return new InternetEuskaltel();
	}

	@Override
	public Musica contrataMusica() {
		// TODO Auto-generated method stub
		return new MusicaEuskaltel();
	}

}
