package idatcom.TuristaMIcroServicioIIIE.service;

import java.util.List;

import idatcom.TuristaMIcroServicioIIIE.dto.TuristaDTO;

public interface TuristaService {
	
	List<TuristaDTO> listar();
	void guardar(TuristaDTO turista);

}
