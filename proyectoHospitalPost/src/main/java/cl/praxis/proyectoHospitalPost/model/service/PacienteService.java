package cl.praxis.proyectoHospitalPost.model.service;

import cl.praxis.proyectoHospitalPost.model.dto.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacienteService {

    List<Paciente> findAll();
}
