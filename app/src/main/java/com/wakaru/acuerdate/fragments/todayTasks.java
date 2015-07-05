package com.wakaru.acuerdate.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.wakaru.acuerdate.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link todayTasks.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link todayTasks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class todayTasks extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    //Parámetros a usar en las vistas
    private ListView lvTodayTasks;
    private List<String> taskList;
    //private VivzAdapterTasks tAdapter;

    private List<String> dateList;
    private List<String> timeList;
    private List<String> subjectList;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment todayTasks.
     */
    // TODO: Rename and change types and number of parameters
    public static todayTasks newInstance(String param1, String param2) {
        todayTasks fragment = new todayTasks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public todayTasks() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        subjectList = new ArrayList<String>();
        dateList = new ArrayList<String>();
        timeList = new ArrayList<String>();

        for(int i = 0; i < 4; i++){
            dateList.add("2015/07/06");
            timeList.add("11:50");
        }
        subjectList.add("Llevar el Informe");
        subjectList.add("Bañar al perro");
        subjectList.add("Comprar pan en el supermercado");
        subjectList.add("Pagar las cuentas");


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_today_tasks, container, false);

        //Elementos de la vista
        lvTodayTasks = (ListView)rootView.findViewById(R.id.tTasks_list);
        /*tAdapter = new VivzAdapterTasks(getActivity() ,subjectList, timeList, dateList);
        lvTodayTasks.setAdapter(tAdapter);*/
        // Inflate the layout for this fragment
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /*@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}

