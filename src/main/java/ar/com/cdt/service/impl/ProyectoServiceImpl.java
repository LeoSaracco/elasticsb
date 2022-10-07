package ar.com.cdt.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Proyectos;
import ar.com.cdt.repository.ProyectosRepository;
import ar.com.cdt.service.ProyectoService;

@Service
public class ProyectoServiceImpl implements ProyectoService {

	@Autowired
	ProyectosRepository proyectosRepository;

	@Override
	public Iterable<Proyectos> getProyectos() {
		return proyectosRepository.findAll();
	}

	@Override
	public Optional<Proyectos> getProyectosByID(String id) {
		return proyectosRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> saveProyectos(Proyectos proyectos) {
		try {
			SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
			Date now = new Date(System.currentTimeMillis());
			// System.out.println(sdformat.format(now));
			Date fechaInicio = sdformat.parse(proyectos.getFechaInicio().replace("/", "-"));
			// System.out.println(sdformat.format(fechaInicio));
			// Veo cuando cargan las fechas de inicio de un proyecto y en base a eso
			// determino si está activo o no
			if (fechaInicio.compareTo(now) > 0) {
				System.out.println("Proyecto inactivo");
				proyectos.setEstado("Inactivo");
			} else {
				System.out.println("Proyecto activo");
				proyectos.setEstado("Activo");
			}
			proyectos.setFechaInicio(proyectos.getFechaInicio().replace("/", "-"));
			proyectos.setFechaFin(proyectos.getFechaFin().replace("/", "-"));
			Proyectos save = proyectosRepository.save(proyectos);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public ResponseEntity<?> deleteProyectos(String id) {
		Optional<Proyectos> proyectosToDelete = proyectosRepository.findById(id);
		try {
			proyectosRepository.delete(proyectosToDelete.get());
			return ResponseEntity.ok(proyectosToDelete.get());
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public Boolean checkProyectosDates() throws ParseException {
		try {
			Iterable<Proyectos> listaProyectos = proyectosRepository.findAll();
			ArrayList<Proyectos> listaProyectosClear = new ArrayList<>();
			SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
			Date now = new Date(System.currentTimeMillis());
//			System.out.println(sdformat.format(now));
			for (Proyectos proyectos : listaProyectos) {
				Date fechaInicio = sdformat.parse(proyectos.getFechaInicio());
				Date fechaFin = sdformat.parse(proyectos.getFechaFin());
//				System.out.println("fechaInicio: " + sdformat.format(fechaInicio));
//				System.out.println("fechaFin: " + sdformat.format(fechaFin));
				if (fechaInicio.compareTo(now) < 0 && fechaFin.compareTo(now) > 0) {
//					System.out.println("Proyecto Activo");
					proyectos.setEstado("Activo");
				} else {
//					System.out.println("Proyecto Inactivo");
					proyectos.setEstado("Inactivo");
				}
				listaProyectosClear.add(proyectos);
			}
			proyectosRepository.saveAll(listaProyectosClear);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}