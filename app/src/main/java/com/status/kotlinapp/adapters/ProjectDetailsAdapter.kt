/*
package com.status.kotlinapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.toolbox.ImageRequest
import com.status.kotlinapp.holder.ProjectDetailsViewHolder

class ProjectDetailsAdapter(private val projectList: List<ProjectEntry>) : RecyclerView.Adapter<ProjectDetailsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectDetailsViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(,parent, false)
        return ProjectDetailsViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ProjectDetailsViewHolder, position: Int) {
        if(position < projectList.size){
            val project = projectList[position]
            holder.projectName.text = project.title
            holder.projectLang.text = project.lang
//            ImageRequester.setImageFromUrl(holder.projectImage, project.url)
        }
    }

    override fun getItemCount(): Int {
        return projectList.size
    }
}*/
