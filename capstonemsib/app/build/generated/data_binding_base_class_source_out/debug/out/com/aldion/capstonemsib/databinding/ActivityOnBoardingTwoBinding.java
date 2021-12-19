// Generated by view binder compiler. Do not edit!
package com.aldion.capstonemsib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aldion.capstonemsib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOnBoardingTwoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnNext;

  @NonNull
  public final Button btnSkip;

  @NonNull
  public final ImageView ivOB2;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvTitle;

  private ActivityOnBoardingTwoBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnNext,
      @NonNull Button btnSkip, @NonNull ImageView ivOB2, @NonNull TextView tvDescription,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.btnSkip = btnSkip;
    this.ivOB2 = ivOB2;
    this.tvDescription = tvDescription;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOnBoardingTwoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOnBoardingTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_on_boarding_two, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOnBoardingTwoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNext;
      Button btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.btnSkip;
      Button btnSkip = ViewBindings.findChildViewById(rootView, id);
      if (btnSkip == null) {
        break missingId;
      }

      id = R.id.ivOB2;
      ImageView ivOB2 = ViewBindings.findChildViewById(rootView, id);
      if (ivOB2 == null) {
        break missingId;
      }

      id = R.id.tvDescription;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityOnBoardingTwoBinding((ConstraintLayout) rootView, btnNext, btnSkip, ivOB2,
          tvDescription, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
