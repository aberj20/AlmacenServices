package es.rama.books.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.rama.books.entity.MaquinaRegistradora;
import es.rama.books.service.MaquinaRegistradoraServiceImpl;
@RestController
@RequestMapping(path="/api/v1/maquina_registradora")
@CrossOrigin(origins="*")
public class MaquinaRegistradoraController extends BaseControllerImpl<MaquinaRegistradora,MaquinaRegistradoraServiceImpl> {

}
