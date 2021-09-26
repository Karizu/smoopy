// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Home;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target, View source) {
    this.target = target;

    target.saveBtn = Utils.findRequiredViewAsType(source, R.id.saveBtn, "field 'saveBtn'", Button.class);
    target.logout = Utils.findRequiredViewAsType(source, R.id.btn_logout, "field 'logout'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.saveBtn = null;
    target.logout = null;
  }
}
