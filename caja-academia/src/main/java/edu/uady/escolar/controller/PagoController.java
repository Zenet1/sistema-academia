package edu.uady.escolar.controller;

import edu.uady.escolar.entity.Pago;
import edu.uady.escolar.error.CajaAcademiaException;
import edu.uady.escolar.service.PagoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/pagos")
@Log4j2
public class PagoController {
    @Autowired
    private PagoService pagoService;

    @GetMapping
    public ResponseEntity<?> getAllPagos() {
        try {
            return ResponseEntity.ok().body(pagoService.getAllPagos());
        }catch (CajaAcademiaException ex){
            log.warn("Sin datos");
            log.error(ex);
            return new ResponseEntity<>("datos no encontrados", HttpStatus.OK);
        } catch (Exception e) {
            log.error(e);
            throw new RuntimeException(e);
        }
    }

    @PostMapping
    public Pago createPago(@RequestBody Pago pago){
        log.info("Pago a guardar: " + pago.toString());
        return pagoService.createPago(pago);
    }

    @PutMapping
    public Pago updatePago(@RequestBody Pago pago) {
        log.info("Pago a actualizar :" + pago.toString());
        return pagoService.updatePago(pago);
    }

    @DeleteMapping("/{id}")
    public void deletePago(@PathVariable (value = "id") Long id){
        pagoService.deletePago(id);
    }
}
