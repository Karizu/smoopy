// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko6O;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Blanko6OFragment_ViewBinding implements Unbinder {
  private Blanko6OFragment target;

  private View view7f090147;

  @UiThread
  public Blanko6OFragment_ViewBinding(final Blanko6OFragment target, View source) {
    this.target = target;

    View view;
    target.spinnerMusim = Utils.findRequiredViewAsType(source, R.id.spinner_musim, "field 'spinnerMusim'", MaterialSpinner.class);
    target.spinnerBulan = Utils.findRequiredViewAsType(source, R.id.spinner_bulan, "field 'spinnerBulan'", MaterialSpinner.class);
    target.spinnerPerioda = Utils.findRequiredViewAsType(source, R.id.spinner_perioda, "field 'spinnerPerioda'", MaterialSpinner.class);
    target.notFoundText = Utils.findRequiredViewAsType(source, R.id.notFoundText, "field 'notFoundText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fab_add, "field 'fab_add' and method 'addBlanko6o'");
    target.fab_add = Utils.castView(view, R.id.fab_add, "field 'fab_add'", FloatingActionButton.class);
    view7f090147 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addBlanko6o();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko6OFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerMusim = null;
    target.spinnerBulan = null;
    target.spinnerPerioda = null;
    target.notFoundText = null;
    target.fab_add = null;

    view7f090147.setOnClickListener(null);
    view7f090147 = null;
  }
}
