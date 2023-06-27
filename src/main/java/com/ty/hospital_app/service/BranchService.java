package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.BranchdaoImp;
import com.ty.hospital_app.dto.Branch;

public class BranchService {
	public void saveBranch(int hid, Branch branch) {
		BranchdaoImp branchdaoImp = new BranchdaoImp();
		Branch branch2=branchdaoImp.saveBranch(hid, branch);
		if(branch2 !=null) {
			System.out.println("Branch saved");
		}
		else {
			System.out.println("unfortunatly Branch not saved");
		}
	}
	public Branch getBranchId(int bid) {
		BranchdaoImp branchdaoImp = new BranchdaoImp();
		Branch branch2=branchdaoImp.getBranchId(bid);
		if(branch2 !=null) {
			return branch2;
		}
		else {

			return null;
		}

	}
	public void deletbranchId(int bid) {
		BranchdaoImp branchdaoImp=new BranchdaoImp();
		boolean flag=branchdaoImp.deletbranchId(bid);
		if(flag) {
			System.out.println("data deleated");
		}
		else {
			System.out.println("not deleated");
		}
		
	}
	public Branch updateBranch(int bid, Branch branch) {
		BranchdaoImp branchdaoImp=new BranchdaoImp();
		Branch branch2=branchdaoImp.updateBranch(bid, branch);
		if(branch2!=null) {
			return branch2;
		}
		else {
			return null;
		}
	}
}
