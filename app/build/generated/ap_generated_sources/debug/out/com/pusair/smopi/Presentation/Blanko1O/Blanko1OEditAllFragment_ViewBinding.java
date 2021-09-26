// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko1O;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Blanko1OEditAllFragment_ViewBinding implements Unbinder {
  private Blanko1OEditAllFragment target;

  @UiThread
  public Blanko1OEditAllFragment_ViewBinding(Blanko1OEditAllFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rvBlanko01EditAll, "field 'recyclerView'", RecyclerView.class);
    target.notFoundText = Utils.findRequiredViewAsType(source, R.id.notFoundText, "field 'notFoundText'", TextView.class);
    target.keputusanMT1LsIrigasi = Utils.findRequiredViewAsType(source, R.id.KeputusanMT1LsIrigasi, "field 'keputusanMT1LsIrigasi'", TextView.class);
    target.keputusanMT2LsIrigasi = Utils.findRequiredViewAsType(source, R.id.keputusanMT2LsIrigasi, "field 'keputusanMT2LsIrigasi'", TextView.class);
    target.keputusanMT3LsIrigasi = Utils.findRequiredViewAsType(source, R.id.keputusanMT3LsIrigasi, "field 'keputusanMT3LsIrigasi'", TextView.class);
    target.usulanMT1LsIrigasi = Utils.findRequiredViewAsType(source, R.id.usulanMT1LsIrigasi, "field 'usulanMT1LsIrigasi'", TextView.class);
    target.usulanMT2LsIrigasi = Utils.findRequiredViewAsType(source, R.id.usulanMT2LsIrigasi, "field 'usulanMT2LsIrigasi'", TextView.class);
    target.usulanMT3LsIrigasi = Utils.findRequiredViewAsType(source, R.id.usulanMT3LsIrigasi, "field 'usulanMT3LsIrigasi'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko1OEditAllFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.notFoundText = null;
    target.keputusanMT1LsIrigasi = null;
    target.keputusanMT2LsIrigasi = null;
    target.keputusanMT3LsIrigasi = null;
    target.usulanMT1LsIrigasi = null;
    target.usulanMT2LsIrigasi = null;
    target.usulanMT3LsIrigasi = null;
  }
}
