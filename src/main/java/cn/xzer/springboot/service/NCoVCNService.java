package cn.xzer.springboot.service;

import cn.xzer.springboot.model.NCoVCN;

import java.util.List;

public interface NCoVCNService {
    /**
     * 查询全部用户
     * @return
     */
    List<NCoVCN> findAll();

}
