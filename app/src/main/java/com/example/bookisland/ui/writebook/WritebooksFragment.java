package com.example.bookisland.ui.writebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bookisland.R;
import com.example.bookisland.ui.notifications.NotificationsViewModel;

public class WritebooksFragment extends Fragment {
    private WritebooksViewModel writebooksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        writebooksViewModel =
                new ViewModelProvider(this).get(WritebooksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_writebook, container, false);
        final TextView textView = root.findViewById(R.id.text_writebook);
        writebooksViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
