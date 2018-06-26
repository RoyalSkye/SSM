package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Branch;

public interface BranchService {
	public List<Branch> findAllBranch();
	public Branch findBranchById(int bid);
	public boolean deleteBranchById(int bid);
	public boolean updateBranch(Branch b);
	public boolean saveBranch(Branch b);
}
