package com.example.demo.service;

import com.example.demo.entity.Dep;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DepService {
   public Dep saveDep(Dep dep);

  public List<Dep> fetchDepList();

   public Dep fetchDepById(Long depId);

    public void deleteDepById(Long depId);

   public Dep updateDep(Long depId, Dep dep);

//   public Dep  fetchDepByName(String depName);
}
