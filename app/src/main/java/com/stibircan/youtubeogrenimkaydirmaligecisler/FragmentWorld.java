package com.stibircan.youtubeogrenimkaydirmaligecisler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentWorld extends Fragment
{
    private View syView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        syView = inflater.inflate(R.layout.fragment_world, null);

        return syView;
    }
}
