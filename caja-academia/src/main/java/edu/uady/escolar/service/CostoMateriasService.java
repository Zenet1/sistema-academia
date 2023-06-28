package edu.uady.escolar.service;

import edu.uady.escolar.entity.CostoMateria;
import edu.uady.escolar.repository.CostoMateriasRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CostoMateriasService {
    @Autowired
    private CostoMateriasRepository costoMateriasRepository;

    public CostoMateria createCostoMateria(CostoMateria costoMateria){
        log.info("crea costo materia: " + costoMateria.toString());
        return costoMateriasRepository.save(costoMateria);
    }

    public CostoMateria updateCostoMateria(CostoMateria costoMateria){
        log.info("actualiza costo materia: " + costoMateria.toString());
        return costoMateriasRepository.save(costoMateria);
    }

    public List<CostoMateria> getAllCostoMaterias(){
        return costoMateriasRepository.findAll();
    }

    public void deleteCostoMateria(Long id){
        costoMateriasRepository.deleteById(id);
    }
}
