package com.github.eranbergmanokta.intellijpublicpocplugin.services

import com.intellij.openapi.project.Project
import com.github.eranbergmanokta.intellijpublicpocplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
