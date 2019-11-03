package demo.service;


import demo.dao.LabelDao;
import demo.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.pkcs11.wrapper.CK_LOCKMUTEX;

import java.util.List;
import java.util.concurrent.locks.Lock;

@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    public List<Label> findAll() {
        String b="1";
        if (b == null){

        }
        return  labelDao.findAll();

    }




}
