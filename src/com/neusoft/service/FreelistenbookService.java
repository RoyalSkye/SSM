package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Freelistenbook;
import com.neusoft.tools.Page;

public interface FreelistenbookService {

	public List<Freelistenbook> findFreelistenbook(Map map) throws Exception;
	public List<Freelistenbook> findAllFreelistenbook(Page page) throws Exception;
	public boolean updateFreelistenbook(int id) throws Exception;
	public int findCount(int qid) throws Exception;
}
