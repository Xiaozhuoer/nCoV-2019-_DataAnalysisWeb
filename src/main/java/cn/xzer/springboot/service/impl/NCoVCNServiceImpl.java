package cn.xzer.springboot.service.impl;

import cn.xzer.springboot.mapper.NCoVCNMapper;
import cn.xzer.springboot.model.NCoVCN;
import cn.xzer.springboot.service.NCoVCNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NCoVCNServiceImpl implements NCoVCNService {

    @Autowired
    private NCoVCNMapper nCoVCNMapper;

    @Override
    public List<NCoVCN> findAll(){
        return nCoVCNMapper.selectAll();
    }
}
