package cn.xzer.springboot.mapper;

import cn.xzer.springboot.model.NCoVCN;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NCoVCNMapper {
    /*
     * 查询全部数据
     * @return
     */
    List<NCoVCN> selectAll();
}
