package com.enigma.dev.repository;


import com.enigma.dev.request.TenderRefIdRequest;
import com.enigma.dev.request.UpdateTenderInfo;
import com.enigma.dev.request.UpdatedTenderRef;
import com.enigma.dev.response.TenderEntity;

import java.util.List;

public interface TenderRepoInterface {
    public boolean saveTender(TenderEntity tenderEntity);
    public List<TenderEntity> getTender();
    public boolean editTender(UpdatedTenderRef rquest);
    public boolean editAllTender(UpdateTenderInfo rquest);
    public boolean deleteTender(TenderRefIdRequest request);
}
