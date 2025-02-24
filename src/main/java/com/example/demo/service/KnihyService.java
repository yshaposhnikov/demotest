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


    public List<KnihaDTO> zoznamVsetkychKnih() {
        Iterable<knihaEntity> knihaEntityIterable = knihaRepository.findAll();
        List<KnihaDTO> ret = new LinkedList<>();
        for (knihaEntity knihaEntity : knihaEntityIterable) {
            KnihaDTO knihaDTO = new KnihaDTO(knihaEntity.getId(),
                    knihaEntity.getNazov(), knihaEntity.getAutor(),
                    knihaEntity.getPocetStran());
            ret.add(knihaDTO);

        }
        return ret;
    }

    public Long vytvorKnihu(KnihaDTO knihaDTO) {
        knihaEntity knihaEntity = new knihaEntity();
        knihaEntity.setNazov(knihaDTO.getNazov());
        knihaEntity.setAutor(knihaDTO.getAutor());
        knihaEntity.setPocetStran(knihaDTO.getPocetStran());
        knihaRepository.save(knihaEntity);
        return knihaEntity.getId();
    }
}