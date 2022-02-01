package proveedor.telecom.imp.vodafone;

import proveedor.telecom.Internet;
import proveedor.telecom.Musica;
import proveedor.telecom.ProveedorTelecom;
import proveedor.telecom.Television;

public class ProveedorVodafone implements ProveedorTelecom {

	@Override
	public Television contrataTelevision() {
		// TODO Auto-generated method stub
		return new TelevisionVodafone();
	}

	@Override
	public Internet contrataInternet() {
		// TODO Auto-generated method stub
		return new InternetVodafone();
	}

	@Override
	public Musica contrataMusica() {
		// TODO Auto-generated method stub
		return new MusicaVodafone();
	}

}
