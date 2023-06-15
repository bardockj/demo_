package com.example.demo.service;

import com.example.demo.entity.Dep;
import com.example.demo.repository.DepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service("depServer")
public class DepServiceImpl implements DepService{

    @Autowired(required = false)
    @Qualifier("depRepository")
    private DepRepository depRepository;


    @Override
    public Dep saveDep(Dep dep){
        return depRepository.save(dep);
    }

    @Override
    public List<Dep> fetchDepList() {
        return (List<Dep>) depRepository.findAll();
    }

    @Override
    public Dep fetchDepById(Long depId) {
        return depRepository.findById(depId).get();
    }

//    @Override
//    public void deleteDepById(Long depId) {
//        depRepository.deleteById(depId);
//    }


    @Override
    public Dep updateDep(Long depId, Dep dep) {
        Dep depDB = depRepository.findById(depId).get();

        if(Objects.nonNull(dep.getDepName()) && !"".equalsIgnoreCase(dep.getDepName())){
            depDB.setDepName(dep.getDepName());
        }

        if(Objects.nonNull(dep.getDepAddress()) && !"".equalsIgnoreCase(dep.getDepAddress())){
            depDB.setDepAddress(dep.getDepAddress());
        }
        if(Objects.nonNull(dep.getDepCode()) && !"".equalsIgnoreCase(dep.getDepCode())){
            depDB.setDepCode(dep.getDepCode());
        }
        return depRepository.save(depDB);
    }

    @Override
//    public Dep fetchDepByName(String depName) {
//        return depRepository.findByDepNameIgnoreCase(depName);
//    }
    public void deleteDepById(Long depId) {
         depRepository.deleteById(depId);
    }


}

