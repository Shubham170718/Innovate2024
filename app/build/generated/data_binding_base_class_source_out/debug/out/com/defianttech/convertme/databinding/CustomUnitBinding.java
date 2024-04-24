// Generated by view binder compiler. Do not edit!
package com.defianttech.convertme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.defianttech.convertme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomUnitBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView btnDeleteUnit;

  @NonNull
  public final ImageView btnEditUnit;

  @NonNull
  public final TextView unitBaseText;

  @NonNull
  public final LinearLayout unitItemContainer;

  @NonNull
  public final TextView unitName;

  private CustomUnitBinding(@NonNull CardView rootView, @NonNull ImageView btnDeleteUnit,
      @NonNull ImageView btnEditUnit, @NonNull TextView unitBaseText,
      @NonNull LinearLayout unitItemContainer, @NonNull TextView unitName) {
    this.rootView = rootView;
    this.btnDeleteUnit = btnDeleteUnit;
    this.btnEditUnit = btnEditUnit;
    this.unitBaseText = unitBaseText;
    this.unitItemContainer = unitItemContainer;
    this.unitName = unitName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomUnitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomUnitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_unit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomUnitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDeleteUnit;
      ImageView btnDeleteUnit = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteUnit == null) {
        break missingId;
      }

      id = R.id.btnEditUnit;
      ImageView btnEditUnit = ViewBindings.findChildViewById(rootView, id);
      if (btnEditUnit == null) {
        break missingId;
      }

      id = R.id.unitBaseText;
      TextView unitBaseText = ViewBindings.findChildViewById(rootView, id);
      if (unitBaseText == null) {
        break missingId;
      }

      id = R.id.unitItemContainer;
      LinearLayout unitItemContainer = ViewBindings.findChildViewById(rootView, id);
      if (unitItemContainer == null) {
        break missingId;
      }

      id = R.id.unitName;
      TextView unitName = ViewBindings.findChildViewById(rootView, id);
      if (unitName == null) {
        break missingId;
      }

      return new CustomUnitBinding((CardView) rootView, btnDeleteUnit, btnEditUnit, unitBaseText,
          unitItemContainer, unitName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}