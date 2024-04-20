/*
package com.status.kotlinapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.status.kotlinapp.adapters.ProjectDetailsAdapter

class ProjectList : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.card_grid_view, container,false)
        (activity as AppCompatActivity).setSupportActionBar(view.findViewById(R.id.toolbar2))
        view.findViewById<RecyclerView>(R.id.recycler_view).setHasFixedSize(true)
        view.findViewById<RecyclerView>(R.id.recycler_view).layoutManager = GridLayoutManager(context,4,RecyclerView.HORIZONTAL, false)
        val adapter = ProjectDetailsAdapter(ProjectEntry.initProjectEntryList(resources))
        view.findViewById<RecyclerView>(R.id.recycler_view).adapter = adapter
        val lardePadding = resources.getDimensionPixelSize(R.dimen.)
        val smallPadding = resources.getDimensionPixelSize()
        view.findViewById<RecyclerView>(R.id.recycler_view).addItemDecoration(Pr)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu)
        super.onCreateOptionsMenu(menu, menuInflater)
    }
}*/
