package cn.xzer.springboot.controller;

import cn.xzer.springboot.model.NCoVCN;
import cn.xzer.springboot.service.NCoVCNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NCoVCNController {

    @Autowired
    private NCoVCNService nCoVCNService;

    @RequestMapping("nCoVCN")
    List<NCoVCN> nCoVCNList(){
        return nCoVCNService.findAll();
    }
}
