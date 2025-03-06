package com.akashkumar23.takenote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akashkumar23.takenote.entity.Notes;
import com.akashkumar23.takenote.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
	
	List<Notes> findByUser(User user);

}
