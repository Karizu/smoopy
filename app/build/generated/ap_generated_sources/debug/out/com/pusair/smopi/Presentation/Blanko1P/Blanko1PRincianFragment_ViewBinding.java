// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko1P;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Blanko1PRincianFragment_ViewBinding implements Unbinder {
  private Blanko1PRincianFragment target;

  private View view7f090147;

  @UiThread
  public Blanko1PRincianFragment_ViewBinding(final Blanko1PRincianFragment target, View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.list_rincian_blanko_1p, "field 'recyclerView'", RecyclerView.class);
    target.tvRuasHm = Utils.findRequiredViewAsType(source, R.id.tv_ruas_hm, "field 'tvRuasHm'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fab_add, "method 'onClickFabAddRincian'");
    view7f090147 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFabAddRincian();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko1PRincianFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.tvRuasHm = null;

    view7f090147.setOnClickListener(null);
    view7f090147 = null;
  }
}
