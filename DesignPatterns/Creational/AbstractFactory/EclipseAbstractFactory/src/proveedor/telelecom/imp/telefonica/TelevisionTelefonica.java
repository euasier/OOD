package proveedor.telelecom.imp.telefonica;

import proveedor.telecom.Television;
import proveedor.telecom.tv.CanalTVProveedor;
import proveedor.telelecom.imp.telefonica.tv.CanalTVTelefonica;

public class TelevisionTelefonica implements Television {

	@Override
	public long getLimiteCanales() {
		// TODO Auto-generated method stub
		return 0;
	}

	public CanalTVProveedor getCanalProveedor() {
		return new CanalTVTelefonica();
	}
}
