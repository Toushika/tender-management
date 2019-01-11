package com.enigma.dev.service;

import com.enigma.dev.request.TenderDto;
import com.enigma.dev.request.TenderRefIdRequest;
import com.enigma.dev.request.UpdateTenderInfo;
import com.enigma.dev.request.UpdatedTenderRef;
import com.enigma.dev.response.TenderEntity;

import java.util.List;

public interface TenderServiceInterface {
    public boolean saveTender(TenderDto tenderDto);
    public List<TenderEntity> getTender();
    public boolean editTender(UpdatedTenderRef request);
    public boolean editAllTender(UpdateTenderInfo request);
    public boolean deleteTender(TenderRefIdRequest request);

}
