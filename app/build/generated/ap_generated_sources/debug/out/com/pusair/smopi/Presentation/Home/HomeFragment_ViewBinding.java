// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Home;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  private View view7f090026;

  private View view7f090027;

  private View view7f090029;

  private View view7f09002a;

  private View view7f09029a;

  private View view7f09002b;

  @UiThread
  public HomeFragment_ViewBinding(final HomeFragment target, View source) {
    this.target = target;

    View view;
    target.spinnerDI = Utils.findRequiredViewAsType(source, R.id.spinner_daerahIrigasi, "field 'spinnerDI'", MaterialSpinner.class);
    view = Utils.findRequiredView(source, R.id.blanko_1o, "field 'btnBlanko1o' and method 'openBlanko1O'");
    target.btnBlanko1o = Utils.castView(view, R.id.blanko_1o, "field 'btnBlanko1o'", ImageView.class);
    view7f090026 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openBlanko1O();
      }
    });
    view = Utils.findRequiredView(source, R.id.blanko_1p, "field 'btnBlanko1p' and method 'openBlanko1P'");
    target.btnBlanko1p = Utils.castView(view, R.id.blanko_1p, "field 'btnBlanko1p'", ImageView.class);
    view7f090027 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openBlanko1P();
      }
    });
    view = Utils.findRequiredView(source, R.id.blanko_4o, "field 'btnBlanko4o' and method 'openBlanko4O'");
    target.btnBlanko4o = Utils.castView(view, R.id.blanko_4o, "field 'btnBlanko4o'", ImageView.class);
    view7f090029 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openBlanko4O();
      }
    });
    view = Utils.findRequiredView(source, R.id.blanko_6o, "field 'btnBlanko6o' and method 'openBlanko6o'");
    target.btnBlanko6o = Utils.castView(view, R.id.blanko_6o, "field 'btnBlanko6o'", ImageView.class);
    view7f09002a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openBlanko6o();
      }
    });
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.username, "field 'tvUsername'", TextView.class);
    target.tvArea = Utils.findRequiredViewAsType(source, R.id.area, "field 'tvArea'", TextView.class);
    target.syncDate = Utils.findRequiredViewAsType(source, R.id.sync_date, "field 'syncDate'", TextView.class);
    view = Utils.findRequiredView(source, R.id.sync_btn, "field 'syncBtn' and method 'syncData'");
    target.syncBtn = Utils.castView(view, R.id.sync_btn, "field 'syncBtn'", ImageView.class);
    view7f09029a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.syncData();
      }
    });
    view = Utils.findRequiredView(source, R.id.blanko_8o, "field 'blanko_8o' and method 'openBlanko8o'");
    target.blanko_8o = Utils.castView(view, R.id.blanko_8o, "field 'blanko_8o'", FrameLayout.class);
    view7f09002b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openBlanko8o();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerDI = null;
    target.btnBlanko1o = null;
    target.btnBlanko1p = null;
    target.btnBlanko4o = null;
    target.btnBlanko6o = null;
    target.tvUsername = null;
    target.tvArea = null;
    target.syncDate = null;
    target.syncBtn = null;
    target.blanko_8o = null;

    view7f090026.setOnClickListener(null);
    view7f090026 = null;
    view7f090027.setOnClickListener(null);
    view7f090027 = null;
    view7f090029.setOnClickListener(null);
    view7f090029 = null;
    view7f09002a.setOnClickListener(null);
    view7f09002a = null;
    view7f09029a.setOnClickListener(null);
    view7f09029a = null;
    view7f09002b.setOnClickListener(null);
    view7f09002b = null;
  }
}
