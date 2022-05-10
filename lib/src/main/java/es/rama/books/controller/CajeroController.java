package es.rama.books.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.rama.books.entity.Cajero;
import es.rama.books.service.CajeroServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v1/cajeros")
public class CajeroController extends BaseControllerImpl<Cajero,CajeroServiceImpl>{

}
