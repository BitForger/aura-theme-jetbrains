package com.github.bitforger.aurathemejetbrains.services

import com.intellij.openapi.project.Project
import com.github.bitforger.aurathemejetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
