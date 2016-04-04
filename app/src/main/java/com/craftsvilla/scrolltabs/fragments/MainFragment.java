package com.craftsvilla.scrolltabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.craftsvilla.scrolltabs.R;

/**
 * Created by naresh on 31/3/16.
 */
public class MainFragment extends Fragment {
    private static final String KEY_POSITION = "position";

    public static MainFragment newInstance(int position, String name) {
        MainFragment mainFragment = new MainFragment();
        Bundle args = new Bundle();
        args.putInt(KEY_POSITION, position);
        args.putString("name", name);
        mainFragment.setArguments(args);

        return mainFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_saree, container, false);
        EditText editText = (EditText) view.findViewById(R.id.edittext);
        int position = getArguments().getInt(KEY_POSITION, -1);
        String name = getArguments().getString("name");
        Toast.makeText(getActivity(), "I am : " + name, Toast.LENGTH_SHORT).show();
        editText.setText(Integer.toString(position));
        return view;
    }
}
