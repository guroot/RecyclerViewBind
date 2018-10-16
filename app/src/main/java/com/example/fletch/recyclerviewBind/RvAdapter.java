package com.example.fletch.recyclerviewBind;

import android.app.Activity;
import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fletch.recyclerviewBind.databinding.EtudiantCellBinding;

import java.util.ArrayList;


public class RvAdapter  extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

        private ArrayList<Etudiant> mDataset;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public static class MyViewHolder extends RecyclerView.ViewHolder {
            public EtudiantCellBinding etudiantItemBinding;
            // each data item is just a string in this case

            public MyViewHolder(EtudiantCellBinding etudiantCellBinding) {
                super(etudiantCellBinding.getRoot());
                etudiantItemBinding = etudiantCellBinding;
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public RvAdapter() {
            mDataset = new ArrayList<>();
            mDataset.add(new Etudiant("Fleury","Jonathan","WA1"));
            mDataset.add(new Etudiant("Duchesne", "Michele", "WA2"));
            mDataset.add(new Etudiant("Fleury","Laurent","WA1"));

        }

        // Create new views (invoked by the layout manager)
        @Override
        public RvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
            // create a new view
             EtudiantCellBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                    R.layout.etudiant_cell , parent, false);
            MyViewHolder vh = new MyViewHolder(binding);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(final MyViewHolder holder,final int position) {
            final Etudiant etudiant = mDataset.get(position);
            holder.etudiantItemBinding.setEtudiant(etudiant);
            holder.etudiantItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm =  ((Activity)holder.etudiantItemBinding.getRoot().getContext()).getFragmentManager();
                    EtudiantFragment etudiantDialog = EtudiantFragment.newInstance(etudiant);
                    etudiantDialog.show(fm,"test");
                    etudiantDialog.setEtudiant(etudiant);
                }
            });

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.size();
        }
    }

