package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.BranchMapper;
import com.neusoft.po.Branch;
import com.neusoft.service.BranchService;

@Service
public class BranchServiceBean implements BranchService{

	@Autowired
	private BranchMapper mapper;
	
	@Override
	public List<Branch> findAllBranch() {
		try {
			return mapper.findAllBranch();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public Branch findBranchById(int bid){
		try {
			return mapper.findBranchById(bid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean deleteBranchById(int bid){
		boolean isok=false;
		try {
			int result=mapper.deleteBranchById(bid);
			if(result>0){
				isok=true;
			}else{
				isok=false;
			}
		} catch (Exception e) {
			isok=false;
			e.printStackTrace();
		}
		return isok;
	}
	
	@Override
	public boolean updateBranch(Branch b) {
		boolean isok=false;
		try {
			int result=mapper.updateBranch(b);
			if(result>0){
				isok=true;
			}else{
				isok=false;
			}
		} catch (Exception e) {
			isok=false;
			e.printStackTrace();
		}
		return isok;
	}
	
	@Override
	public boolean saveBranch(Branch b) {
		boolean isok=false;
		try {
			int result=mapper.saveBranch(b);
			if(result>0){
				isok=true;
			}else{
				isok=false;
			}
		} catch (Exception e) {
			isok=false;
			e.printStackTrace();
		}
		return isok;
	}
}
