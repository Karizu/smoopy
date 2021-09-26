// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko6O;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Blanko6OAddFragment_ViewBinding implements Unbinder {
  private Blanko6OAddFragment target;

  @UiThread
  public Blanko6OAddFragment_ViewBinding(Blanko6OAddFragment target, View source) {
    this.target = target;

    target.daerahIrigasi = Utils.findRequiredViewAsType(source, R.id.label_daerahIrigasi, "field 'daerahIrigasi'", TextView.class);
    target.kodeIrigasi = Utils.findRequiredViewAsType(source, R.id.label_kodeIrigasi, "field 'kodeIrigasi'", TextView.class);
    target.luasSawah = Utils.findRequiredViewAsType(source, R.id.label_luasSawah, "field 'luasSawah'", TextView.class);
    target.bangtrol = Utils.findRequiredViewAsType(source, R.id.label_bangtrol, "field 'bangtrol'", TextView.class);
    target.petak = Utils.findRequiredViewAsType(source, R.id.label_petak, "field 'petak'", TextView.class);
    target.spinnerBangtrol = Utils.findRequiredViewAsType(source, R.id.spinner_bangtrol, "field 'spinnerBangtrol'", MaterialSpinner.class);
    target.debitAir = Utils.findRequiredViewAsType(source, R.id.ed_debit, "field 'debitAir'", EditText.class);
    target.qLain = Utils.findRequiredViewAsType(source, R.id.ed_qLain, "field 'qLain'", EditText.class);
    target.qHilang = Utils.findRequiredViewAsType(source, R.id.ed_qHilang, "field 'qHilang'", EditText.class);
    target.qSuplesi = Utils.findRequiredViewAsType(source, R.id.ed_qSuplesi, "field 'qSuplesi'", EditText.class);
    target.spinnerCaraUkur = Utils.findRequiredViewAsType(source, R.id.spinner_caraukur, "field 'spinnerCaraUkur'", MaterialSpinner.class);
    target.spinnerKondisiAlat = Utils.findRequiredViewAsType(source, R.id.spinner_kondisialat, "field 'spinnerKondisiAlat'", MaterialSpinner.class);
    target.rvBlanko06Add = Utils.findRequiredViewAsType(source, R.id.rvBlanko06Add, "field 'rvBlanko06Add'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko6OAddFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.daerahIrigasi = null;
    target.kodeIrigasi = null;
    target.luasSawah = null;
    target.bangtrol = null;
    target.petak = null;
    target.spinnerBangtrol = null;
    target.debitAir = null;
    target.qLain = null;
    target.qHilang = null;
    target.qSuplesi = null;
    target.spinnerCaraUkur = null;
    target.spinnerKondisiAlat = null;
    target.rvBlanko06Add = null;
  }
}
