package com.neusoft.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.FreelistenbookMapper;
import com.neusoft.po.Freelistenbook;
import com.neusoft.service.FreelistenbookService;

@Service
public class FreelistenbookServiceBean implements FreelistenbookService {

	@Autowired
	private FreelistenbookMapper mapper;
	
	@Override
	public List<Freelistenbook> findFreelistenbook(Map map) throws Exception {
		return mapper.findFreelistenbook(map);
	}

	@Override
	public List<Freelistenbook> findAllFreelistenbook(int qid) throws Exception {
		return mapper.findAllFreelistenbook(qid);
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
