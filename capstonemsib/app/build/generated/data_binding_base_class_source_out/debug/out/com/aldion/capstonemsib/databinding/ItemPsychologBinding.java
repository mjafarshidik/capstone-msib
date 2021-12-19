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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aldion.capstonemsib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPsychologBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btnChat;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageView ivPosterImage;

  @NonNull
  public final TextView tvExperience;

  @NonNull
  public final TextView tvNameShow;

  @NonNull
  public final TextView tvType;

  private ItemPsychologBinding(@NonNull CardView rootView, @NonNull Button btnChat,
      @NonNull CardView cardView, @NonNull Guideline guideline2, @NonNull ImageView ivPosterImage,
      @NonNull TextView tvExperience, @NonNull TextView tvNameShow, @NonNull TextView tvType) {
    this.rootView = rootView;
    this.btnChat = btnChat;
    this.cardView = cardView;
    this.guideline2 = guideline2;
    this.ivPosterImage = ivPosterImage;
    this.tvExperience = tvExperience;
    this.tvNameShow = tvNameShow;
    this.tvType = tvType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPsychologBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPsychologBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_psycholog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPsychologBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnChat;
      Button btnChat = ViewBindings.findChildViewById(rootView, id);
      if (btnChat == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.iv_poster_image;
      ImageView ivPosterImage = ViewBindings.findChildViewById(rootView, id);
      if (ivPosterImage == null) {
        break missingId;
      }

      id = R.id.tvExperience;
      TextView tvExperience = ViewBindings.findChildViewById(rootView, id);
      if (tvExperience == null) {
        break missingId;
      }

      id = R.id.tv_name_show;
      TextView tvNameShow = ViewBindings.findChildViewById(rootView, id);
      if (tvNameShow == null) {
        break missingId;
      }

      id = R.id.tv_type;
      TextView tvType = ViewBindings.findChildViewById(rootView, id);
      if (tvType == null) {
        break missingId;
      }

      return new ItemPsychologBinding((CardView) rootView, btnChat, cardView, guideline2,
          ivPosterImage, tvExperience, tvNameShow, tvType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
