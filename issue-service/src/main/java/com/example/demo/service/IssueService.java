package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Issue;

public interface IssueService {
	
	public Issue createNewIssue(Issue issue);
	public List<Issue> getAllIssues();
	public Optional<Issue> findById(String id);

}
