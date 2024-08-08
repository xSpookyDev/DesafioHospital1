package cl.praxis.proyectoHospitalPost.controller;

import cl.praxis.proyectoHospitalPost.model.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PacienteController {

    private PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }
  @GetMapping()
    public String findAll(Model model){

        model.addAttribute("paciente", service.findAll());

        return "pacienteList";
    }
}
