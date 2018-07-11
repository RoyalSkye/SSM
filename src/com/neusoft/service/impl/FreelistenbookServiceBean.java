package com.neusoft.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.FreelistenbookMapper;
import com.neusoft.po.Freelistenbook;
import com.neusoft.service.FreelistenbookService;
import com.neusoft.tools.Page;

@Service
public class FreelistenbookServiceBean implements FreelistenbookService {

	@Autowired
	private FreelistenbookMapper mapper;
	
	@Override
	public List<Freelistenbook> findFreelistenbook(Map map) throws Exception {
		return mapper.findFreelistenbook(map);
	}

	@Override
	public List<Freelistenbook> findAllFreelistenbook(Page page) throws Exception {
		return mapper.findAllFreelistenbook(page);
	}
	@Override
	public int findCount(int qid) throws Exception{
		return mapper.findCount(qid);
	}

	@Override
	public boolean updateFreelistenbook(int id) throws Exception {
		boolean isok=false;
		int result=mapper.updateFreelistenbook(id);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

}
