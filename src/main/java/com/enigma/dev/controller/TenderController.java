package com.enigma.dev.controller;

import com.enigma.dev.request.TenderDto;
import com.enigma.dev.request.TenderRefIdRequest;
import com.enigma.dev.request.UpdateTenderInfo;
import com.enigma.dev.request.UpdatedTenderRef;
import com.enigma.dev.response.TenderEntity;
import com.enigma.dev.service.TenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TenderController {
    private static Logger logger = LoggerFactory.getLogger(TenderController.class);

    @Autowired
    private TenderService tenderService;

    @PostMapping("/saveTenderInfo")
    public ResponseEntity<?> saveTender(@RequestBody TenderDto request) {
        logger.info("TenderController :: saveTenderInfo:: request:: " + request.toString());
        boolean isSaved = tenderService.saveTender(request);
        logger.info("TenderController:: saveTenderInfo :: response:: " + isSaved);
        return new ResponseEntity(isSaved, HttpStatus.OK);
    }

    @PostMapping("/getAllTenderInfo")
    public ResponseEntity<?> getTender() {
        logger.info("TenderController:: getTender :: ");
        List<TenderEntity> tenderEntityList = tenderService.getTender();
        logger.info("TenderController:: getTender :: TenderEntity:: " + tenderEntityList);
        return new ResponseEntity(tenderEntityList, HttpStatus.OK);
    }


  @PostMapping("/editTenderInfo")
    public ResponseEntity<?> editTender( @RequestBody UpdatedTenderRef request) {
        logger.info("TenderController :: editTenderInfo :: Request"+ request);
        tenderService.editTender(request);
        return new ResponseEntity("", HttpStatus.OK);
    }


    @PostMapping("/editAllTenderInfo")
    public ResponseEntity<?> editAllTender(@RequestBody UpdateTenderInfo request) {
        logger.info("TenderController :: editTenderInfo :: Request"+ request);
        tenderService.editAllTender(request);
        return new ResponseEntity("", HttpStatus.OK);
    }


    @PostMapping("/deleteTenderInfo")
    public ResponseEntity<?> deleteTender(@RequestBody TenderRefIdRequest request) {
        logger.info("TenderController:: deleteTenderInfo :: " + request);
        tenderService.deleteTender(request);
        return new ResponseEntity("", HttpStatus.OK);

    }
}
