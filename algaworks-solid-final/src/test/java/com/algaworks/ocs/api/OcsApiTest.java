package com.algaworks.ocs.api;

import com.algaworks.ocs.cdr.CDRFileLocator;
import com.algaworks.ocs.cdr.CDRGeneratorFile;
import com.algaworks.ocs.log.ApiLogger;
import com.algaworks.ocs.repository.Clientes;
import com.algaworks.ocs.service.ClienteService;

public class OcsApiTest {

	public static void main(String[] args) {
		CDRFileLocator cdrFileLocator = new CDRGeneratorFile("/opt/file");
		Clientes clientes = new Clientes();
		
		ClienteService service = new ClienteService(clientes);
		
		ApiLogger logger = new ApiLogger(service, service);
		OcsApi api = new OcsApi(cdrFileLocator, clientes, logger, logger);
		
		Ligacao ligacao = api.autorizar("11111111");
	}
}
