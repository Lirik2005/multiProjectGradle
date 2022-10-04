package com.lirik.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        addHelloTask(project)
    }

    void addHelloTask(Project project) {
        def map = [description: "Hello task", group: "lirik", type: DefaultTask]
        project.task(map, "hello-task") {
            println "configuration phase. Task hello"

            doLast {
                println "execution phase, Action 1"
            }
            doFirst {
                println "execution phase, Action 2"
            }
            doLast {
                println "execution phase, Action 3"
            }
            println "task: $description, group: $group, ${actions.size()}"
            println "path task: $path"
        }
    }
}
