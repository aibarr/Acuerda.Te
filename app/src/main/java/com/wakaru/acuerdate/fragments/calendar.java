package com.wakaru.acuerdate.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wakaru.acuerdate.R;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;


public class calendar extends DialogFragment  {


    private OnDateSetListener mDateSetListener;

    public calendar() {
        // nothing to see here, move along
    }

    public static calendar newInstance() {
        calendar fragment = new calendar();
        Bundle args = new Bundle();
        return fragment;
    }

    public calendar(OnDateSetListener callback) {
        mDateSetListener = (OnDateSetListener) callback;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar cal = Calendar.getInstance();

        return new DatePickerDialog(getActivity(),
                mDateSetListener, cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
    }





}
