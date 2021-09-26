// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Blanko1P;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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

public class Blanko1PAddFragment_ViewBinding implements Unbinder {
  private Blanko1PAddFragment target;

  private View view7f09003b;

  private View view7f090038;

  private View view7f09036f;

  private View view7f09003c;

  private View view7f090039;

  private View view7f090147;

  private View view7f090196;

  @UiThread
  public Blanko1PAddFragment_ViewBinding(final Blanko1PAddFragment target, View source) {
    this.target = target;

    View view;
    target.tvDaerahIrigasi = Utils.findRequiredViewAsType(source, R.id.tvDaerahIrigasi, "field 'tvDaerahIrigasi'", TextView.class);
    target.spiner_saluran = Utils.findRequiredViewAsType(source, R.id.spiner_saluran, "field 'spiner_saluran'", MaterialSpinner.class);
    view = Utils.findRequiredView(source, R.id.cbSaluran, "field 'cbSaluran' and method 'onClickCbSaluran'");
    target.cbSaluran = Utils.castView(view, R.id.cbSaluran, "field 'cbSaluran'", CheckBox.class);
    view7f09003b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCbSaluran();
      }
    });
    view = Utils.findRequiredView(source, R.id.cbBangunan, "field 'cbBangunan' and method 'onClickCbBangunan'");
    target.cbBangunan = Utils.castView(view, R.id.cbBangunan, "field 'cbBangunan'", CheckBox.class);
    view7f090038 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCbBangunan();
      }
    });
    target.spinner_bangunan_kontrol = Utils.findRequiredViewAsType(source, R.id.spinner_bangunan_kontrol, "field 'spinner_bangunan_kontrol'", MaterialSpinner.class);
    view = Utils.findRequiredView(source, R.id.tv_tgl_inspeksi, "field 'tv_tgl_inspeksi' and method 'onClickTglInspeksi'");
    target.tv_tgl_inspeksi = Utils.castView(view, R.id.tv_tgl_inspeksi, "field 'tv_tgl_inspeksi'", TextView.class);
    view7f09036f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTglInspeksi();
      }
    });
    view = Utils.findRequiredView(source, R.id.cbSwakelola, "field 'cbSwakelola' and method 'onClickcbSwakelola'");
    target.cbSwakelola = Utils.castView(view, R.id.cbSwakelola, "field 'cbSwakelola'", CheckBox.class);
    view7f09003c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickcbSwakelola();
      }
    });
    view = Utils.findRequiredView(source, R.id.cbKontraktual, "field 'cbKontraktual' and method 'onClickcbKontraktual'");
    target.cbKontraktual = Utils.castView(view, R.id.cbKontraktual, "field 'cbKontraktual'", CheckBox.class);
    view7f090039 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickcbKontraktual();
      }
    });
    target.etUsulanTindakan = Utils.findRequiredViewAsType(source, R.id.etUsulanTindakan, "field 'etUsulanTindakan'", EditText.class);
    target.et_areal_pelayanan = Utils.findRequiredViewAsType(source, R.id.et_areal_pelayanan, "field 'et_areal_pelayanan'", EditText.class);
    target.etLatitude = Utils.findRequiredViewAsType(source, R.id.etLatitude, "field 'etLatitude'", EditText.class);
    target.etLongitude = Utils.findRequiredViewAsType(source, R.id.etLongitude, "field 'etLongitude'", EditText.class);
    target.etDesaKecamatan = Utils.findRequiredViewAsType(source, R.id.etDesaKecamatan, "field 'etDesaKecamatan'", EditText.class);
    target.img_lampiran_1 = Utils.findRequiredViewAsType(source, R.id.img_lampiran_1, "field 'img_lampiran_1'", ImageView.class);
    target.img_lampiran_2 = Utils.findRequiredViewAsType(source, R.id.img_lampiran_2, "field 'img_lampiran_2'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.fab_add, "method 'onClickFabAddLoc'");
    view7f090147 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFabAddLoc();
      }
    });
    view = Utils.findRequiredView(source, R.id.imd_add, "method 'onClickAddImage'");
    view7f090196 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickAddImage();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Blanko1PAddFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDaerahIrigasi = null;
    target.spiner_saluran = null;
    target.cbSaluran = null;
    target.cbBangunan = null;
    target.spinner_bangunan_kontrol = null;
    target.tv_tgl_inspeksi = null;
    target.cbSwakelola = null;
    target.cbKontraktual = null;
    target.etUsulanTindakan = null;
    target.et_areal_pelayanan = null;
    target.etLatitude = null;
    target.etLongitude = null;
    target.etDesaKecamatan = null;
    target.img_lampiran_1 = null;
    target.img_lampiran_2 = null;

    view7f09003b.setOnClickListener(null);
    view7f09003b = null;
    view7f090038.setOnClickListener(null);
    view7f090038 = null;
    view7f09036f.setOnClickListener(null);
    view7f09036f = null;
    view7f09003c.setOnClickListener(null);
    view7f09003c = null;
    view7f090039.setOnClickListener(null);
    view7f090039 = null;
    view7f090147.setOnClickListener(null);
    view7f090147 = null;
    view7f090196.setOnClickListener(null);
    view7f090196 = null;
  }
}
