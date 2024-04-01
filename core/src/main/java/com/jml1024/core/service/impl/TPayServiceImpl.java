package com.jml1024.core.service.impl;

import com.jml1024.common.service.impl.BaseServiceImpl;
import com.jml1024.core.domain.TPay;
import com.jml1024.core.persistence.TPayMapper;
import com.jml1024.core.service.TPayService;
import org.springframework.stereotype.Service;

@Service
public class TPayServiceImpl extends BaseServiceImpl<TPay, Long> implements TPayService {
    private TPayMapper tPayMapper;

    public TPayServiceImpl(TPayMapper tPayMapper) {
        super(tPayMapper);
        this.tPayMapper = tPayMapper;
    }
}
