package com.cjc.service;

import java.util.List;

import com.cjc.model.Parent;
import com.cjc.model.Tutor;

public interface ParentService {

	Parent saveParent(Parent parent);

	Parent getSingleData(int id);

	List<Parent> getAllData();

	Parent deleteParent(int parent);

	/* List<Tutor> findByTlocation(String tlocation); */

}
