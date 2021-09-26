// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko6O;

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

public class Blanko6OAddNewFragment_ViewBinding implements Unbinder {
  private Blanko6OAddNewFragment target;

  @UiThread
  public Blanko6OAddNewFragment_ViewBinding(Blanko6OAddNewFragment target, View source) {
    this.target = target;

    target.daerahIrigasi = Utils.findRequiredViewAsType(source, R.id.label_daerahIrigasi, "field 'daerahIrigasi'", TextView.class);
    target.kodeIrigasi = Utils.findRequiredViewAsType(source, R.id.label_kodeIrigasi, "field 'kodeIrigasi'", TextView.class);
    target.luasSawah = Utils.findRequiredViewAsType(source, R.id.label_luasSawah, "field 'luasSawah'", TextView.class);
    target.rvBlanko06Add = Utils.findRequiredViewAsType(source, R.id.rvBlanko06Add, "field 'rvBlanko06Add'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko6OAddNewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.daerahIrigasi = null;
    target.kodeIrigasi = null;
    target.luasSawah = null;
    target.rvBlanko06Add = null;
  }
}
