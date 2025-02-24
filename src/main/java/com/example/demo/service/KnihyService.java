package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.persistence.knihaEntity;
import com.example.demo.persistence.KnihaRepository;
import java.util.List;
import java.util.LinkedList;


@Service
public class KnihyService {

    @Autowired
    private KnihaRepository knihaRepository;


    public List<knihaDTO> zoznamVsetkychKnih() {
        Iterable<knihaEntity> knihaEntityIterable = knihaRepository.findAll();
        List<knihaDTO> ret = new LinkedList<>();
        for (knihaEntity knihaEntity : knihaEntityIterable) {
            knihaDTO knihaDTO = new knihaDTO(knihaEntity.getId(),
                    knihaEntity.getNazov(), knihaEntity.getAutor(),
                    knihaEntity.getPocetStran());
            knihy.add(knihaDTO);
        }
    }

    public void vytvorKnihu(knihaDTO knihaDTO) {
        knihaEntity knihaEntity = new knihaEntity();
        knihaEntity.setNazov(knihaDTO.getNazov());
        knihaEntity.setAutor(knihaDTO.getAutor());
        knihaEntity.setPocetStran(knihaDTO.getPocetStran());
        knihaRepository.save(knihaEntity);
        return knihaEntity.getId();
    }
}