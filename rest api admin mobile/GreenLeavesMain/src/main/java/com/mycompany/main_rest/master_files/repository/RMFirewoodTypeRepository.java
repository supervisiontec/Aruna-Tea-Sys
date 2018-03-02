/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.repository;

import com.mycompany.main_rest.master_files.model.RMFirewoodType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kavish manjitha
 */
@Repository
public interface RMFirewoodTypeRepository extends JpaRepository<RMFirewoodType, Integer>{
    
    public List<RMFirewoodType> findByBranch(Integer branch);
    
    public List<RMFirewoodType> findByFwtno(String fwtno);
}
