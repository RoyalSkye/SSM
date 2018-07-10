package com.neusoft.mapper;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Freelistenbook;

public interface FreelistenbookMapper {
	
	public List<Freelistenbook> findAllFreelistenbook(int qid) throws Exception;
	public List<Freelistenbook> findFreelistenbook(Map map) throws Exception;
	public int updateFreelistenbook(Freelistenbook freelistenbook) throws Exception;
	public int saveFreelistenbook(Freelistenbook freelistenbook) throws Exception;
}
