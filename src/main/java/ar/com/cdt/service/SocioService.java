package ar.com.cdt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Socio;

@Service
public interface SocioService {

	List<Socio> getSocios();

//	Optional<Socio> getSocioByID(Long id);
	
	ResponseEntity<?> saveSocio(Socio socio);
	
	ResponseEntity<?> updateSocio(Socio socio);
	
//	ResponseEntity<?> deleteSocio(Long id);
}
