package edu.uady.escolar.service;

import edu.uady.escolar.entity.Pago;
import edu.uady.escolar.error.CajaAcademiaException;
import edu.uady.escolar.repository.PagoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public Kardex createPago(Pago pago){
        log.info("crea pago: " + pago.toString());
        return pagoRepository.save(pago);
    }

    public Pago updatePago(Pago pago){
        log.info("actualiza pago: " + pago.toString());
        return pagoRepository.save(pago);
    }

    public List<Pago> getAllPagos() throws Exception{
        List<Kardex> pagos = pagoRepository.findAll();
        if(pagos.isEmpty()){
            throw new CajaAcademiaException("no se encontraron datos");
        }
        return pagos;
    }

    public void deletePago(Long id){
        pagoRepository.deleteById(id);
    }
}
