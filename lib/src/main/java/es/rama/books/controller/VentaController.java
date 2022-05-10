package es.rama.books.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.rama.books.entity.Venta;
import es.rama.books.service.VentaServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/v1/ventas")
public class VentaController extends BaseControllerImpl<Venta,VentaServiceImpl> {

}
