package com.my.service;

import java.util.List;

import com.my.model.Branch;
import com.my.model.College;

public interface MaintenanceService {
	boolean addBranch(Branch branch);

	boolean deleteBranch(long Id);

	boolean updateBranch(Branch branch);

	Branch getBranch(long Id);

	public List<Branch> getAllBranches();

	boolean addCollege(College college);

	boolean deleteCollege(long Id);

	boolean updateCollege(College college);

	College getCollege(long Id);

	public List<College> getAllColleges();

}
