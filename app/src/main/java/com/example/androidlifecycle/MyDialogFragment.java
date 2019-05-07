package com.example.androidlifecycle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyDialogFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyDialogFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyDialogFragment extends DialogFragment {


  private OnFragmentInteractionListener mListener;

  public MyDialogFragment() {
    // Required empty public constructor
  }

  /**
   * Use this factory method to create a new instance of
   * this fragment using the provided parameters.
   *
   * @return A new instance of fragment MyDialogFragment.
   */
  // TODO: Rename and change types and number of parameters
  public static MyDialogFragment newInstance() {
    MyDialogFragment fragment = new MyDialogFragment();
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    LifeCycle.logStart();
    super.onCreate(savedInstanceState);
    LifeCycle.logEnd();
  }

  @Override
  public View onCreateView(
          LayoutInflater inflater, ViewGroup container,
          Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    LifeCycle.logStart();
    View view = inflater.inflate(R.layout.fragment_my_dialog, container, false);
    LifeCycle.logEnd();
    return view;
  }

  @Override
  public void onAttach(Context context) {
    LifeCycle.logStart();
    super.onAttach(context);
    if (context instanceof OnFragmentInteractionListener) {
      mListener = (OnFragmentInteractionListener) context;
    } else {
      throw new RuntimeException(context.toString()
                                         + " must implement OnFragmentInteractionListener");
    }
    LifeCycle.logEnd();
  }


  @Override
  public void onActivityCreated(
          @Nullable Bundle savedInstanceState) {
    LifeCycle.logStart();
    super.onActivityCreated(savedInstanceState);
    LifeCycle.logEnd();
  }

  @Override
  public void onAttachFragment(Fragment fragment) {
    LifeCycle.logStart();
    super.onAttachFragment(fragment);
    LifeCycle.logEnd();
  }

  @Override
  public void onStart() {
    LifeCycle.logStart();
    super.onStart();
    LifeCycle.logEnd();
  }

  @Override
  public void onResume() {
    LifeCycle.logStart();
    super.onResume();
    LifeCycle.logEnd();
  }

  @Override
  public void onPause() {
    LifeCycle.logStart();
    super.onPause();
    LifeCycle.logEnd();
  }

  @Override
  public void onSaveInstanceState(@NonNull Bundle outState) {
    super.onSaveInstanceState(outState);
  }

  @Override
  public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);
  }

  @Override
  public void onStop() {
    LifeCycle.logStart();
    super.onStop();
    LifeCycle.logEnd();
  }

  @Override
  public void onDestroy() {
    LifeCycle.logStart();
    super.onDestroy();
    LifeCycle.logEnd();
  }


  @Override
  public void onDetach() {
    LifeCycle.logStart();
    super.onDetach();
    mListener = null;
    LifeCycle.logEnd();
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
