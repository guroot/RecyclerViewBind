package com.example.fletch.recyclerviewBind;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fletch.recyclerviewBind.databinding.FragmentEtudiantBinding;



public class EtudiantFragment extends DialogFragment {


    private FragmentEtudiantBinding binding;

    // TODO: Rename and change types of parameters
    private Etudiant mEtudiant;

    public EtudiantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment EtudiantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EtudiantFragment newInstance(Etudiant etudiant) {
        EtudiantFragment fragment = new EtudiantFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setEtudiant(Etudiant etudiant){
        mEtudiant = etudiant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_etudiant , container, false);
        binding.setEtudiant(this.mEtudiant);
        View view = binding.getRoot();
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
