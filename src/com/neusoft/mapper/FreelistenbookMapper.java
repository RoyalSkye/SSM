package com.neusoft.mapper;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Freelistenbook;

public interface FreelistenbookMapper {
	
	public List<Freelistenbook> findAllFreelistenbook(int qid) throws Exception;
	public List<Freelistenbook> findFreelistenbook(Map map) throws Exception;
	public int updateFreelistenbook(int id) throws Exception;
	
}
