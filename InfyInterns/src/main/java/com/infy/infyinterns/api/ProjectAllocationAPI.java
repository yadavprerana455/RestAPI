package com.infy.infyinterns.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.dto.ProjectDTO;
import com.infy.infyinterns.exception.InfyInternException;
@RestController
@RequestMapping("/infyinterns")
public class ProjectAllocationAPI
{

    // add new project along with mentor details
    public ResponseEntity<String> allocateProject(ProjectDTO project) throws InfyInternException
    {

	return null;
    }

    // get mentors based on idea owner
    public ResponseEntity<List<MentorDTO>> getMentors(Integer numberOfProjectsMentored) throws InfyInternException
    {

	return null;
    }

    // update the mentor of a project
    public ResponseEntity<String> updateProjectMentor(Integer projectId,
						      Integer mentorId) throws InfyInternException
    {

	return null;
    }

    // delete a project
    public ResponseEntity<String> deleteProject(Integer projectId) throws InfyInternException
    {
	return null;
    }

}
