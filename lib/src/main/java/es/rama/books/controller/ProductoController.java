package es.rama.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.rama.books.entity.Producto;
import es.rama.books.service.ProductoServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/v1/productos")
public class ProductoController extends BaseControllerImpl<Producto,ProductoServiceImpl>{

	@GetMapping("/search")
	public ResponseEntity<?> search(@RequestParam String filtro){
		try {
			return  ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
		}catch(Exception e) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
	@GetMapping("/searchPaged")
	public ResponseEntity<?> search(@RequestParam String filtro,Pageable pageable){
		try {
			return  ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro,pageable));
		}catch(Exception e) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
		}
		
	}
	
}


