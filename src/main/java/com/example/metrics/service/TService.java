package com.example.metrics.service;

import com.example.metrics.model.TModel;
import org.springframework.stereotype.Service;

@Service
public class TService {

    TModel tModel = new TModel();

    public TModel getTestModel() {
        if (tModel.getTint() == 0) {
            tModel.setID(0);
            tModel.setTint(255);
            tModel.setTmessage("testModel");
        }
        return tModel;
    }

    public TModel saveTestModel(TModel testModel) {
        tModel.setID(testModel.getID());
        tModel.setTint(testModel.getTint());
        tModel.setTmessage(testModel.getTmessage());
        return tModel;
    }
}
