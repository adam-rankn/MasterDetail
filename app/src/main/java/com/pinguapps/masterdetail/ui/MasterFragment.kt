package com.pinguapps.masterdetail.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pinguapps.masterdetail.R
import com.pinguapps.masterdetail.util.isTablet
import androidx.appcompat.app.AppCompatActivity


class MasterFragment : Fragment() {

    companion object {
        fun newInstance() = MasterFragment()
    }
    val masterViewModel: MasterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_master, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val masterRecyclerView: RecyclerView  = view.findViewById(R.id.master_recycler_view)
        val masterRecyclerAdapter = MasterRecyclerAdapter {
            masterViewModel.selectCurrentModelObject(it)
            if (!isTablet(requireContext())){
                //todo new fragment
            }

        }
        val masterLinearLayoutManager = LinearLayoutManager(requireContext())
        masterRecyclerView.adapter = masterRecyclerAdapter
        masterRecyclerView.layoutManager = masterLinearLayoutManager
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
