package edu.uady.escolar.controller;

import edu.uady.escolar.entity.CostoMateria;
import edu.uady.escolar.service.CostoMateriasService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/costo-materias")
@Log4j2
public class CostoMateriasController {
    @Autowired
    private CostoMateriasService costoMateriasService;

    @GetMapping
    public List<CostoMateria> getAllCostoMaterias() {
        return costoMateriasService.getAllCostoMaterias();
    }

    @PostMapping
    public CostoMateria createCostoMateria(@RequestBody CostoMateria costoMateria){
        log.info("Costo a guardar: " + costoMateria.toString());
        return costoMateriasService.createCostoMateria(costoMateria);
    }

    @PutMapping
    public CostoMateria updateCostoMateria(@RequestBody CostoMateria costoMateria) {
        log.info("Costo a actualizar :" + costoMateria.toString());
        return costoMateriasService.updateCostoMateria(alumno);
    }

    @DeleteMapping("/{id}")
    public void deleteCostoMateria(@PathVariable (value = "id") Long id){
        costoMateriasService.deleteCostoMateria(id);
    }
}
