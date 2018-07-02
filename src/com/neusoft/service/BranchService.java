package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Branch;

public interface BranchService {
	public List<Branch> findAllBranch() throws Exception;
	public Branch findBranchById(int bid) throws Exception;
	public boolean deleteBranchById(int bid) throws Exception;
	public boolean updateBranch(Branch b) throws Exception;
	public boolean saveBranch(Branch b) throws Exception;
}
