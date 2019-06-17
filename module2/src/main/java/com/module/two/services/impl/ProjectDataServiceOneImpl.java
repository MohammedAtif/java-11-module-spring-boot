package com.module.two.services.impl;

import com.module.two.models.ProjectData;
import com.module.two.services.ProjectDataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProjectDataServiceOneImpl implements ProjectDataService {

    @Override
    public ProjectData getProjectData(Long id) {
        return null;
    }
}
