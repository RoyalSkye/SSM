package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Branch;

public interface BranchMapper {
	
	public List<Branch> findAllBranch(int qid) throws Exception;
	public Branch findBranchById(int bid) throws Exception;
	public int deleteBranchById(int bid) throws Exception;
	public int updateBranch(Branch b) throws Exception;
	public int saveBranch(Branch b) throws Exception;
}
