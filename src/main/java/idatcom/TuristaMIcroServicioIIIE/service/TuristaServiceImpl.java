package idatcom.TuristaMIcroServicioIIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idatcom.TuristaMIcroServicioIIIE.dto.TuristaDTO;
import idatcom.TuristaMIcroServicioIIIE.model.Turista;
import idatcom.TuristaMIcroServicioIIIE.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
		
		for(Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setDir(turista.getDireccion());
			dto.setCel(turista.getCelular());
			dto.setNom(turista.getNombre());
			dto.setCod(turista.getIdturista());
			
			listadto.add(dto);
		}
		return listadto;
		
	}

	@Override
	public void guardar(TuristaDTO turista) {
		
		Turista tur = new Turista();
		tur.setDireccion(turista.getDir());
		tur.setCelular(turista.getCel());
		tur.setNombre(turista.getNom());
		tur.setIdturista(turista.getCod());
		repository.save(tur);

	}

}
