import proveedor.telecom.Internet;
import proveedor.telecom.Musica;
import proveedor.telecom.ProveedorTelecom;
import proveedor.telecom.Television;
import proveedor.telecom.tv.CanalTVProveedor;
import proveedor.telelecom.imp.euskaltel.ProveedorEuskaltel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProveedorTelecom prvTelecom = new ProveedorEuskaltel();
		Internet prvTelecomInet = prvTelecom.contrataInternet();
		Musica prvTelecomMusica = prvTelecom.contrataMusica();
		Television prvTelecomTv = prvTelecom.contrataTelevision();
		
		System.out.println("Limites contratacion inet musica tv: " + prvTelecomInet.getLimiteDatos() + " " + prvTelecomMusica.getLimiteCanciones() + " " + prvTelecomTv.getLimiteCanales());
		
		CanalTVProveedor prvTelecomTvCanal = prvTelecomTv.getCanalProveedor();
		
		System.out.println("Programacion Tv: "+ prvTelecomTvCanal.getProgramacion());
	}

}
