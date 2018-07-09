package com.neusoft.mapper;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Freelisten;

public interface FreelistenMapper {

	public List<Freelisten> findAllFreelisten(int qid) throws Exception;
	public Freelisten findFreelistenById(int fid)throws Exception;
	public int deleteFreelistenById(int fid)throws Exception;
	public int saveFreelisten(Freelisten freelisten)throws Exception;
	public int updateFreelisten(Freelisten freelisten)throws Exception;
}
	

