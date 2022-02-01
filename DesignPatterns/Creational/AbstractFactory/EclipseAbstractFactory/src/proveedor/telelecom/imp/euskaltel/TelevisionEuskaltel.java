package proveedor.telelecom.imp.euskaltel;

import proveedor.telecom.Television;
import proveedor.telecom.tv.CanalTVProveedor;
import proveedor.telelecom.imp.euskaltel.tv.CanalTVEuskaltel;

public class TelevisionEuskaltel implements Television {

	@Override
	public long getLimiteCanales() {
		// TODO Auto-generated method stub
		return 2;
	}
	public CanalTVProveedor getCanalProveedor() {
		return new CanalTVEuskaltel();
	}
}
