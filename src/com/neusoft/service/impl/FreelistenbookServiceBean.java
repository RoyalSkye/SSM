package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.mapper.FreelistenbookMapper;
import com.neusoft.po.Freelistenbook;
import com.neusoft.service.FreelistenbookService;
import com.neusoft.vo.FreelistenbookVo;

public class FreelistenbookServiceBean implements FreelistenbookService {

	@Autowired
	FreelistenbookMapper mapper;
	
	@Override
	public List<Freelistenbook> FindFreelistenbook(FreelistenbookVo vo) throws Exception {
		
		return mapper.FindFreelistenbook(vo);
	}

	@Override
	public List<Freelistenbook> findAllFreelistenbook() throws Exception {
		// TODO Auto-generated method stub
		return mapper.findAllFreelistenbook();
	}

	@Override
	public boolean updateFreelistenbook(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateFreelistenbook(id);
	}

}
