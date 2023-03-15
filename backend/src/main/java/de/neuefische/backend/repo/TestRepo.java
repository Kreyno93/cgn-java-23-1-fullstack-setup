package de.neuefische.backend.repo;

import de.neuefische.backend.model.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepo {

    public TestRepo(List<Test> tests) {
        this.tests = tests;
    }

    private final List<Test> tests;

}
