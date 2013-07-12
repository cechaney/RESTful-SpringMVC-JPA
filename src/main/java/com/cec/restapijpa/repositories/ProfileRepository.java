/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cec.restapijpa.repositories;

import com.cec.restapijpa.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
}
