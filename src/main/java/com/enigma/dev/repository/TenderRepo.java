package com.enigma.dev.repository;

import com.enigma.dev.request.TenderRefIdRequest;
import com.enigma.dev.request.UpdateTenderInfo;
import com.enigma.dev.request.UpdatedTenderRef;
import com.enigma.dev.response.TenderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class TenderRepo implements TenderRepoInterface {
    private static Logger logger = LoggerFactory.getLogger(TenderRepo.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean saveTender(TenderEntity request) {
        logger.info("MovieDao::saveMovie:: request:: " + request.toString());

        boolean isSaved = false;
        try {
            this.entityManager.persist(request);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<TenderEntity> getTender() {
        logger.info("TenderRepo:: getTender:: List<TenderEntity> ");
        List<TenderEntity> tenderEntityList = null;
        String qrystr = "SELECT * FROM tender_info";
        try {
            Query query = this.entityManager.createNativeQuery(qrystr, TenderEntity.class);
            tenderEntityList = (List<TenderEntity>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenderEntityList;

    }

    @Override
    public boolean editTender(UpdatedTenderRef request) {
        logger.info("TenderRepo:: editTender :: request:: " + request+" :: update:: "+request.getTenderRef());
        String qrystr = "SELECT *  FROM  tender_info WHERE tender_ref=?1";
        List<TenderEntity> tenderEntityList  =null;
        try{
            Query query = this.entityManager.createNativeQuery(qrystr,TenderEntity.class);
            query.setParameter(1,request.getTenderRef());

            tenderEntityList= (List<TenderEntity>)query.getResultList();

            TenderEntity tenderEntity = tenderEntityList.get(0);
            tenderEntity.setTenderRef(request.getUpdatedTenderRef());
            logger.info("TenderRepo:: editTender :: request:: " +tenderEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editAllTender(UpdateTenderInfo request) {
        logger.info("TenderRepo:: editAllTender :: request:: " + request+" :: update:: "+request.getTenderRef());
        String qrystr = "SELECT *  FROM  tender_info WHERE tender_ref=?1 AND tender_person=?2 AND tender_amount=?3 AND mobile_no=?4 ";
        List<TenderEntity> tenderEntityList  =null;
        try{
            Query query = this.entityManager.createNativeQuery(qrystr,TenderEntity.class);
            query.setParameter(1,request.getTenderRef());
            query.setParameter(2,request.getTenderPerson());
            query.setParameter(3,request.getTenderAmount());
            query.setParameter(4,request.getMobileNo());


            tenderEntityList= (List<TenderEntity>)query.getResultList();

            TenderEntity tenderEntity = tenderEntityList.get(0);
            tenderEntity.setTenderRef(request.getUpdatedTenderRef());
            tenderEntity.setTenderPerson(request.getUpdatedTenderPerson());
            tenderEntity.setTenderAmount(request.getUpdatedTenderAmount());
            tenderEntity.setMobileNo(request.getUpdatedMobileNo());

            logger.info("TenderRepo:: editTender :: request:: " +tenderEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

    @Override
    public boolean deleteTender(TenderRefIdRequest request) {
        logger.info("TenderRepo:: deleteTender :: " + request);
        String qrystr = "DELETE from tender_info WHERE tender_ref=" + request.getTenderRef();
//        String qrystr = "DELETE from tender_info WHERE tender_ref=?1";
        try {
            Query query = this.entityManager.createNativeQuery(qrystr, TenderEntity.class);
            query.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

}
