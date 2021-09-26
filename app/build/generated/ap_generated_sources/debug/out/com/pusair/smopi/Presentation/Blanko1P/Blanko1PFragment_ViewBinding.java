// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko1P;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Blanko1PFragment_ViewBinding implements Unbinder {
  private Blanko1PFragment target;

  private View view7f09028d;

  private View view7f090285;

  private View view7f090147;

  @UiThread
  public Blanko1PFragment_ViewBinding(final Blanko1PFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.spinner_start_date, "field 'spinnerStartDate' and method 'onClickSpinnerDateStart'");
    target.spinnerStartDate = Utils.castView(view, R.id.spinner_start_date, "field 'spinnerStartDate'", FrameLayout.class);
    view7f09028d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSpinnerDateStart();
      }
    });
    view = Utils.findRequiredView(source, R.id.spinner_end_date, "field 'spinnerEndDate' and method 'onClickSpinnerDateEnd'");
    target.spinnerEndDate = Utils.castView(view, R.id.spinner_end_date, "field 'spinnerEndDate'", FrameLayout.class);
    view7f090285 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSpinnerDateEnd();
      }
    });
    target.spinnerTmt = Utils.findRequiredViewAsType(source, R.id.spinner_tmt, "field 'spinnerTmt'", MaterialSpinner.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.list_blanko_1p, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.fab_add, "field 'fabAdd' and method 'onClickFabAddBlanko1p'");
    target.fabAdd = Utils.castView(view, R.id.fab_add, "field 'fabAdd'", FloatingActionButton.class);
    view7f090147 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFabAddBlanko1p();
      }
    });
    target.tvStartDate = Utils.findRequiredViewAsType(source, R.id.tvStartDate, "field 'tvStartDate'", TextView.class);
    target.tvEndDate = Utils.findRequiredViewAsType(source, R.id.tvEndDate, "field 'tvEndDate'", TextView.class);
    target.notFoundText = Utils.findRequiredViewAsType(source, R.id.notFoundText, "field 'notFoundText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko1PFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerStartDate = null;
    target.spinnerEndDate = null;
    target.spinnerTmt = null;
    target.recyclerView = null;
    target.fabAdd = null;
    target.tvStartDate = null;
    target.tvEndDate = null;
    target.notFoundText = null;

    view7f09028d.setOnClickListener(null);
    view7f09028d = null;
    view7f090285.setOnClickListener(null);
    view7f090285 = null;
    view7f090147.setOnClickListener(null);
    view7f090147 = null;
  }
}
