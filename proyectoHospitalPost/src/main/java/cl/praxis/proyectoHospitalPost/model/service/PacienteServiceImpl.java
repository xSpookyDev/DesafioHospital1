package cl.praxis.proyectoHospitalPost.model.service;

import cl.praxis.proyectoHospitalPost.model.dto.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PacienteServiceImpl implements PacienteService{

    List<Paciente> pacienteList;


    public PacienteServiceImpl(){
        pacienteList = new ArrayList<>();
        pacienteList.add(new Paciente(1,"Jairo","Vera","Cancer", "Dolor cronico"));
        pacienteList.add(new Paciente(2,"Martin","Romo","Corona Virus", "Fiebre"));
        pacienteList.add(new Paciente(3,"Pedro","Marmol","Diarrea", "Dolor de guata"));
        pacienteList.add(new Paciente(4,"Marcos","Volados","Balazo en la frente", "Dolor de cabeza"));
        pacienteList.add(new Paciente(5,"Osvaldo","Gonzalez","Diabetes", "Le falta una pierna"));
        pacienteList.add(new Paciente(6,"Daniel","Vera","Fractura craneal", "Dolor en la cabeza"));
        pacienteList.add(new Paciente(7,"Anna","Rosales","Cinucitis", "Dolor en la nariz + mocosidad"));

    }

    @Override
    public List<Paciente> findAll() {
        return pacienteList;
    }

}
