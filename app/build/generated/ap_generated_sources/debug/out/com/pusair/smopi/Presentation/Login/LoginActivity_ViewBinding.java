// Generated code from Butter Knife. Do not modify!
package com.pusair.smopi.Presentation.Login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.pusair.smopi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view7f090031;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target._inputUsername = Utils.findRequiredViewAsType(source, R.id.ed_username, "field '_inputUsername'", EditText.class);
    target._inputPassword = Utils.findRequiredViewAsType(source, R.id.ed_password, "field '_inputPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_login, "field '_loginButton' and method 'doLogin'");
    target._loginButton = Utils.castView(view, R.id.btn_login, "field '_loginButton'", Button.class);
    view7f090031 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.doLogin();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target._inputUsername = null;
    target._inputPassword = null;
    target._loginButton = null;

    view7f090031.setOnClickListener(null);
    view7f090031 = null;
  }
}
