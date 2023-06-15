package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(schema = "name=emp")
public class Dep {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long depId;
    @Column(name="depName",nullable = false)
    private String depName;
    @Column(name="depAddress",nullable = false)
    private String depAddress;
    @Column(name="depCode",nullable = false)
    private String depCode;

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }
    public String getDepName(){
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(String depAddress) {
        this.depAddress = depAddress;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public Dep(Long depId,String depName,String depAddress,String depCode){
        this.depId=depId;
        this.depName=depName;
        this.depAddress=depAddress;
        this.depCode=depCode;
    }

    public Dep(){

    }
    @Override
    public String toString(){
        return"Dep{" +
                "depId=" +depId +
                "depName='" + depName +'\''+
                "depAddress='" + depAddress + '\'' +
                "depCode='" +depCode +'\'' +
                '}';
    }
}
