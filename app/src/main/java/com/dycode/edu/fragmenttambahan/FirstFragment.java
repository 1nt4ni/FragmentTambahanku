package com.dycode.edu.fragmenttambahan;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.dycode.edu.fragmenttambahan.PageViewModel;
import com.dycode.edu.fragmenttambahan.R;
import com.google.android.material.textfield.TextInputEditText;

public class FirstFragment extends Fragment {
    private PageViewModel pageViewModel;
    public FirstFragment() {
// Required empty public constructor
    }
    /**
     * Create a new instance of this fragment
     * @return A new instance of fragment FirstFragment.
     */
    public static FirstFragment newInstance() {
        return new FirstFragment();
    }
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// init ViewModel
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable
            Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText nameEditText =
                view.findViewById(R.id.textInputTextName);
        TextInputEditText ttlEditText =
                view.findViewById(R.id.textInputTextTTL);
        TextInputEditText PendidikanEditText =
                view.findViewById(R.id.textInputTextPendidikan);
        TextInputEditText PrestasiEditText =
                view.findViewById(R.id.textInputTextPrestasi);
// Add Text Watcher on name input text
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setName(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        ttlEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setTTL(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        PendidikanEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setCita(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        PrestasiEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setHobi(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
    }
}