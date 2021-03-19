package com.dycode.edu.fragmenttambahan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dycode.edu.fragmenttambahan.PageViewModel;

import java.text.BreakIterator;

public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName;
    private TextView txtTTL;
    private TextView txtPendidikan;
    private TextView txtPrestasi;
    public SecondFragment () {
// Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtTTL = view.findViewById(R.id.textViewTTL);
        txtPendidikan = view.findViewById(R.id.textViewPendidikan);
        txtPrestasi = view.findViewById(R.id.textViewPrestasi);
        pageViewModel.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);
                    }
                });
        pageViewModel.getTTL().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtTTL.setText(s);
                    }
                });
        pageViewModel.getpendidikan().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtPendidikan.setText(s);
                    }
                });
        pageViewModel.getprestasi().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtPrestasi.setText(s);
                    }
                });
    }
}