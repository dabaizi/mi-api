package com.dabaizi.mi.service;

import com.dabaizi.mi.dao.DomainNameDao;
import com.dabaizi.mi.domain.DomainName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DomainNameService {

    @Resource
    private DomainNameDao domainNameDao;

    public DomainName getDomainName(Long id) {
        return domainNameDao.query(id);
    }
}
