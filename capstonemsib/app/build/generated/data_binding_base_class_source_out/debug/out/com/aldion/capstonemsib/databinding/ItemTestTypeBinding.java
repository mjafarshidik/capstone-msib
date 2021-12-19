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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aldion.capstonemsib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTestTypeBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvTitleTypeTest1;

  private ItemTestTypeBinding(@NonNull CardView rootView, @NonNull Button button,
      @NonNull ImageView imageView2, @NonNull TextView textView5,
      @NonNull TextView tvTitleTypeTest1) {
    this.rootView = rootView;
    this.button = button;
    this.imageView2 = imageView2;
    this.textView5 = textView5;
    this.tvTitleTypeTest1 = tvTitleTypeTest1;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTestTypeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTestTypeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_test_type, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTestTypeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tvTitleTypeTest1;
      TextView tvTitleTypeTest1 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleTypeTest1 == null) {
        break missingId;
      }

      return new ItemTestTypeBinding((CardView) rootView, button, imageView2, textView5,
          tvTitleTypeTest1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
