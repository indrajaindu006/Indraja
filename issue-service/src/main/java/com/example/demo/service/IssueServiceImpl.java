package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.IssueNotFound;
import com.example.demo.model.Issue;
import com.example.demo.repo.IssueRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IssueServiceImpl implements IssueService {

	private IssueRepository issueRepository;

	@Autowired
	public IssueServiceImpl(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}

	@Override
	public Issue createNewIssue(Issue issue) {
		log.info("within create issue service");
		return issueRepository.insert(issue);
	}

	@Override
	public List<Issue> getAllIssues() {
		log.info("within display issue service");
		return issueRepository.findAll();
	}

	@Override
	public Optional<Issue> findById(String id) {
		log.info("within find by id issue service");
		Optional<Issue> optional = issueRepository.findById(id);
		if (optional.isEmpty()) {
			throw new IssueNotFound("Issue not found");
		}

		return optional;
	}

}
