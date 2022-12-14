package idatcom.TuristaMIcroServicioIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idatcom.TuristaMIcroServicioIIIE.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
