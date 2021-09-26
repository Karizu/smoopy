// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko4O;

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

public class Blanko4OFragment_ViewBinding implements Unbinder {
  private Blanko4OFragment target;

  private View view7f090147;

  private View view7f09002e;

  @UiThread
  public Blanko4OFragment_ViewBinding(final Blanko4OFragment target, View source) {
    this.target = target;

    View view;
    target.spinnerMusim = Utils.findRequiredViewAsType(source, R.id.spinner_musim, "field 'spinnerMusim'", MaterialSpinner.class);
    target.spinnerBulan = Utils.findRequiredViewAsType(source, R.id.spinner_bulan, "field 'spinnerBulan'", MaterialSpinner.class);
    target.spinnerMt = Utils.findRequiredViewAsType(source, R.id.spinner_mt, "field 'spinnerMt'", MaterialSpinner.class);
    target.spinnerPerioda = Utils.findRequiredViewAsType(source, R.id.spinner_perioda, "field 'spinnerPerioda'", MaterialSpinner.class);
    view = Utils.findRequiredView(source, R.id.fab_add, "field 'fabAdd' and method 'openAddBlanko40'");
    target.fabAdd = Utils.castView(view, R.id.fab_add, "field 'fabAdd'", FloatingActionButton.class);
    view7f090147 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openAddBlanko40();
      }
    });
    target.notFoundText = Utils.findRequiredViewAsType(source, R.id.notFoundText, "field 'notFoundText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_blanko4a, "method 'onClickbtn_blanko4a'");
    view7f09002e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickbtn_blanko4a();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko4OFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerMusim = null;
    target.spinnerBulan = null;
    target.spinnerMt = null;
    target.spinnerPerioda = null;
    target.fabAdd = null;
    target.notFoundText = null;

    view7f090147.setOnClickListener(null);
    view7f090147 = null;
    view7f09002e.setOnClickListener(null);
    view7f09002e = null;
  }
}
