// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko1O;

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

public class Blanko1OFragment_ViewBinding implements Unbinder {
  private Blanko1OFragment target;

  private View view7f090147;

  private View view7f09002f;

  @UiThread
  public Blanko1OFragment_ViewBinding(final Blanko1OFragment target, View source) {
    this.target = target;

    View view;
    target.spinnerMusim = Utils.findRequiredViewAsType(source, R.id.spinner_musim, "field 'spinnerMusim'", MaterialSpinner.class);
    target.spinnerIp3a = Utils.findRequiredViewAsType(source, R.id.spinner_ip3a, "field 'spinnerIp3a'", MaterialSpinner.class);
    view = Utils.findRequiredView(source, R.id.fab_add, "field 'fabAdd' and method 'openAddBlanko10'");
    target.fabAdd = Utils.castView(view, R.id.fab_add, "field 'fabAdd'", FloatingActionButton.class);
    view7f090147 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openAddBlanko10();
      }
    });
    target.notFoundText = Utils.findRequiredViewAsType(source, R.id.notFoundText, "field 'notFoundText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_edit_blanko1o, "method 'onClickEditBlanko1O'");
    view7f09002f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickEditBlanko1O();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko1OFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerMusim = null;
    target.spinnerIp3a = null;
    target.fabAdd = null;
    target.notFoundText = null;

    view7f090147.setOnClickListener(null);
    view7f090147 = null;
    view7f09002f.setOnClickListener(null);
    view7f09002f = null;
  }
}
