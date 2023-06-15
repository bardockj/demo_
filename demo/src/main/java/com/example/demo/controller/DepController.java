package com.example.demo.controller;

import com.example.demo.entity.Dep;
import com.example.demo.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepController {

    @Autowired(required = false)
    @Qualifier("depServer")
    private DepService depService;


    @PostMapping("/deps")
    public Dep saveDep(@RequestBody Dep dep){
        return depService.saveDep(dep);
    }
    @GetMapping("/deps")
    public List<Dep> fetchDepList(){
       return depService.fetchDepList();
    }
    @GetMapping("/deps/{id}")
    public Dep fetchDepById(@PathVariable("Id")Long depId){
        return depService.fetchDepById(depId);
    }
    @DeleteMapping("/deps/{id}")
    public String deleteDepById(@PathVariable("Id") Long depId){
        depService.deleteDepById(depId);
         return "Deleted";
    }
    @PutMapping("/deps/{id}")
    public Dep updateDep(@PathVariable("Id") Long depId, @RequestBody Dep dep ){
       return depService.updateDep(depId,dep);
    }
//    @GetMapping("/deps/name/{name}")
//    public Dep fetchDepByName(@PathVariable("name") String DepName){
//        return depService.fetchDepByName(depName);
//    }
    }

