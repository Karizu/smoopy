// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko8O;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Blanko8OEditFragment_ViewBinding implements Unbinder {
  private Blanko8OEditFragment target;

  @UiThread
  public Blanko8OEditFragment_ViewBinding(Blanko8OEditFragment target, View source) {
    this.target = target;

    target.h_bendung = Utils.findRequiredViewAsType(source, R.id.ed_debit, "field 'h_bendung'", EditText.class);
    target.q_bendung = Utils.findRequiredViewAsType(source, R.id.ed_h, "field 'q_bendung'", EditText.class);
    target.q_ka_ambil = Utils.findRequiredViewAsType(source, R.id.q_pintu_masuk_kanan, "field 'q_ka_ambil'", EditText.class);
    target.h_ka_ambil = Utils.findRequiredViewAsType(source, R.id.h_pintu_masuk_kanan, "field 'h_ka_ambil'", EditText.class);
    target.q_ki_ambil = Utils.findRequiredViewAsType(source, R.id.q_pintu_masuk_kiri, "field 'q_ki_ambil'", EditText.class);
    target.h_ki_ambil = Utils.findRequiredViewAsType(source, R.id.h_pintu_masuk_kiri, "field 'h_ki_ambil'", EditText.class);
    target.qsungai = Utils.findRequiredViewAsType(source, R.id.total_debit_sungai, "field 'qsungai'", TextView.class);
    target.qsungai_rata = Utils.findRequiredViewAsType(source, R.id.rata_rata_debit_sungai, "field 'qsungai_rata'", TextView.class);
    target.label_periode = Utils.findRequiredViewAsType(source, R.id.label_periode, "field 'label_periode'", TextView.class);
    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tabs, "field 'tabLayout'", TabLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko8OEditFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.h_bendung = null;
    target.q_bendung = null;
    target.q_ka_ambil = null;
    target.h_ka_ambil = null;
    target.q_ki_ambil = null;
    target.h_ki_ambil = null;
    target.qsungai = null;
    target.qsungai_rata = null;
    target.label_periode = null;
    target.tabLayout = null;
  }
}
