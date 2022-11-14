package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Factura;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class FacturaRestController {

    @Autowired
    private IClienteService clienteService;

    @Secured({ "ROLE_ADMIN", "ROLE_USER" })
    @GetMapping("/facturas/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Factura show(@PathVariable Long id) {
      return clienteService.findFacturaById(id);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/facturas/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
      Map<String, Object> response = new HashMap<>();
      Factura factura = clienteService.findFacturaById(id);
      try {
        clienteService.deleteFacturaById(id);
      } catch (DataAccessException e) {
        response.put("mensaje", "Error en el sistema al eliminar la factura pongase en contacto con soporte tecnico!");
        response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      response.put("mensaje", "La Factura " + factura.getDescripcion() +" se elimino con exito!");
      return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @GetMapping(value="/facturas/filtrar-productos/{termino}")
    public List<Producto> filtrarProductos(@PathVariable String termino) {
        return clienteService.findProductoByNombre(termino);
    }

    @Secured("ROLE_ADMIN")
    @PostMapping(value="/facturas")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura crear(@RequestBody Factura factura) {
        return this.clienteService.saveFactura(factura);
    }

}
