/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cec.restapijpa.services;

import com.cec.restapijpa.repositories.ProfileRepository;
import com.cec.restapijpa.domain.Profile;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Repository
@Transactional
public class ProfileService {
    
    @Autowired
    ProfileRepository profileRepository;
    
    @PersistenceContext
    EntityManager em;
    
    @Transactional(readOnly = true)
    public List<Profile> findAll(){
        return profileRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Profile findOne(Long id){
        return profileRepository.findOne(id);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public Profile create(Profile profile){
        return profileRepository.saveAndFlush(profile);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public Profile update(Profile profile){
        return profileRepository.saveAndFlush(profile);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Long id){
        profileRepository.delete(id);
    }
    
}