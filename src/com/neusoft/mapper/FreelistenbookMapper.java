package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Freelistenbook;
import com.neusoft.vo.FreelistenbookVo;

public interface FreelistenbookMapper {

	public List<Freelistenbook> FindFreelistenbook(FreelistenbookVo vo) throws Exception;
	public List<Freelistenbook> findAllFreelistenbook() throws Exception;
	public boolean updateFreelistenbook(int id) throws Exception;
	
}
