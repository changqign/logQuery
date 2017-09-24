package com.changing.dao.mapper;

import com.changing.model.db.LogInfos;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface LogInfosMapper extends Mapper<LogInfos> {

    public int insertBatch(List<LogInfos> logInfos);



}
