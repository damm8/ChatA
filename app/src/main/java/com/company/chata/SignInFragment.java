package com.company.chata;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.chata.databinding.FragmentSignInBinding;


public class SignInFragment extends Fragment {

    private FragmentSignInBinding binding;
    private NavController nav;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentSignInBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nav = Navigation.findNavController(view);

        binding.irAlRegistro.setOnClickListener(v -> {
            nav.navigate(R.id.action_signInFragment_to_signUpFragment);
        });
    }
}