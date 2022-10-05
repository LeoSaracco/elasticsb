package ar.com.cdt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Socio;
import ar.com.cdt.repository.SocioRepository;
import ar.com.cdt.service.SocioService;

@Service
public class SocioServiceImpl implements SocioService {

	@Autowired
	SocioRepository socioRepository;

	@Override
	public  Iterable<Socio> getSocios() {
		return socioRepository.findAll();
	}

	@Override
	public Optional<Socio> getSocioByID(String id) {
		return socioRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> saveSocio(Socio socio) {
		try {
			Socio save = socioRepository.save(socio);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public ResponseEntity<?> updateSocio(Socio socio) {
		try {
			Socio save = socioRepository.save(socio);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

//	@Override
//	public ResponseEntity<?> deleteSocio(Long id) {
//		Optional<Socio> socioToDelete = socioRepository.findById(id);
//		try {
//			socioRepository.delete(socioToDelete.get());
//			return ResponseEntity.ok(socioToDelete.get());
//		} catch (Exception e) {
//			return (ResponseEntity<?>) ResponseEntity.internalServerError();
//		}
//	}
}