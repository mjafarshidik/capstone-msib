// Generated by view binder compiler. Do not edit!
package com.aldion.capstonemsib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSignIn;

  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtUsername;

  @NonNull
  public final ImageView ivSignIn;

  @NonNull
  public final TextView tvDescWelcome;

  @NonNull
  public final TextView tvTitlePassword;

  @NonNull
  public final TextView tvTitleUsername;

  @NonNull
  public final TextView tvWelcome;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSignIn,
      @NonNull Button btnSignUp, @NonNull EditText edtPassword, @NonNull EditText edtUsername,
      @NonNull ImageView ivSignIn, @NonNull TextView tvDescWelcome,
      @NonNull TextView tvTitlePassword, @NonNull TextView tvTitleUsername,
      @NonNull TextView tvWelcome) {
    this.rootView = rootView;
    this.btnSignIn = btnSignIn;
    this.btnSignUp = btnSignUp;
    this.edtPassword = edtPassword;
    this.edtUsername = edtUsername;
    this.ivSignIn = ivSignIn;
    this.tvDescWelcome = tvDescWelcome;
    this.tvTitlePassword = tvTitlePassword;
    this.tvTitleUsername = tvTitleUsername;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignIn;
      Button btnSignIn = ViewBindings.findChildViewById(rootView, id);
      if (btnSignIn == null) {
        break missingId;
      }

      id = R.id.btnSignUp;
      Button btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.edtPassword;
      EditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edtUsername;
      EditText edtUsername = ViewBindings.findChildViewById(rootView, id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.ivSignIn;
      ImageView ivSignIn = ViewBindings.findChildViewById(rootView, id);
      if (ivSignIn == null) {
        break missingId;
      }

      id = R.id.tvDescWelcome;
      TextView tvDescWelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvDescWelcome == null) {
        break missingId;
      }

      id = R.id.tvTitlePassword;
      TextView tvTitlePassword = ViewBindings.findChildViewById(rootView, id);
      if (tvTitlePassword == null) {
        break missingId;
      }

      id = R.id.tvTitleUsername;
      TextView tvTitleUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleUsername == null) {
        break missingId;
      }

      id = R.id.tvWelcome;
      TextView tvWelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, btnSignIn, btnSignUp,
          edtPassword, edtUsername, ivSignIn, tvDescWelcome, tvTitlePassword, tvTitleUsername,
          tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
