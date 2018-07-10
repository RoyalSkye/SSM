package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Freelistenbook;

public interface FreelistenbookService {

	public List<Freelistenbook> findFreelistenbook(Map map) throws Exception;
	public List<Freelistenbook> findAllFreelistenbook(int qid) throws Exception;
	public boolean updateFreelistenbook(Freelistenbook freelistenbook) throws Exception;
	public boolean saveFreelistenbook(Freelistenbook freelistenbook) throws Exception;
}
