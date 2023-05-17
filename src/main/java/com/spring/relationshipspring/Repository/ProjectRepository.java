package com.spring.relationshipspring.Repository;

import com.spring.relationshipspring.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository  extends JpaRepository<Project,Long> {

    List<Project> findAllByProjectId(long projectId);
}
