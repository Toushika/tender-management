package com.enigma.dev.service;

import com.enigma.dev.repository.TenderRepo;
import com.enigma.dev.request.TenderDto;
import com.enigma.dev.request.TenderRefIdRequest;
import com.enigma.dev.request.UpdateTenderInfo;
import com.enigma.dev.request.UpdatedTenderRef;
import com.enigma.dev.response.TenderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class TenderService implements  TenderServiceInterface {
    private static Logger logger = LoggerFactory.getLogger(TenderService.class);
    @Autowired
    private TenderRepo tenderDao ;


    @Override
    public boolean saveTender(TenderDto request) {
        logger.info("MovieService::saveMovie:: request:: "+request.toString());
        TenderEntity tenderEntity = new TenderEntity();
        tenderEntity.setTenderRef(request.getTenderRef());
        tenderEntity.setTenderPerson(request.getTenderPerson());
        tenderEntity.setTenderAmount(request.getTenderAmount());
        tenderEntity.setMobileNo(request.getMobileNo());
        logger.info("MovieService::saveMovie:: tenderEntity:: "+tenderEntity.toString());
        return tenderDao.saveTender(tenderEntity);
    }

    @Override
    public List<TenderEntity> getTender() {
        return tenderDao.getTender();
    }

    @Override
    public boolean editTender(UpdatedTenderRef request) {
        return tenderDao.editTender(request);
    }

    public boolean editAllTender(UpdateTenderInfo request){
        return tenderDao.editAllTender(request);
    }

    @Override
    public boolean deleteTender(TenderRefIdRequest request) {
      return tenderDao.deleteTender(request);
    }
}
