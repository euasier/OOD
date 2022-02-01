package proveedor.telecom.imp.vodafone;

import proveedor.telecom.Television;
import proveedor.telecom.imp.vodafone.tv.CanalTVVodafone;
import proveedor.telecom.tv.CanalTVProveedor;

public class TelevisionVodafone implements Television {

	@Override
	public long getLimiteCanales() {
		// TODO Auto-generated method stub
		return 1;
	}

	public CanalTVProveedor getCanalProveedor() {
		return new CanalTVVodafone();
	}
}
