package com.hecorat.screenrecorder.free.activities.main_setting_drawer;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.g;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.WebViewActivity;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.AboutActivity;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/main_setting_drawer/AboutActivity;", "Lff/b;", "<init>", "()V", "", "url", "Lfl/g0;", "E0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "menuItem", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Ltf/a;", "c", "Ltf/a;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutActivity extends ff.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private tf.a binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(AboutActivity aboutActivity, View view) {
        aboutActivity.E0("https://risenapps.com/az/privacy_policy.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(AboutActivity aboutActivity, View view) {
        aboutActivity.E0("https://risenapps.com/az/tos.html");
    }

    private final void E0(String url) {
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra(WebViewActivity.f22764d, url);
        startActivity(intent);
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tf.a aVar = (tf.a) g.j(this, R.layout.activity_about);
        this.binding = aVar;
        tf.a aVar2 = null;
        if (aVar == null) {
            s.w("binding");
            aVar = null;
        }
        NestedScrollView rootView = aVar.F;
        s.g(rootView, "rootView");
        y0(rootView);
        tf.a aVar3 = this.binding;
        if (aVar3 == null) {
            s.w("binding");
            aVar3 = null;
        }
        u0(aVar3.G);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        setTitle(getString(R.string.az_menu_about));
        int i10 = Calendar.getInstance().get(1);
        tf.a aVar4 = this.binding;
        if (aVar4 == null) {
            s.w("binding");
            aVar4 = null;
        }
        aVar4.D.setText(getString(R.string.copyright, Integer.valueOf(i10)));
        tf.a aVar5 = this.binding;
        if (aVar5 == null) {
            s.w("binding");
            aVar5 = null;
        }
        aVar5.H.setOnClickListener(new View.OnClickListener() { // from class: hf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.C0(this.f40341a, view);
            }
        });
        tf.a aVar6 = this.binding;
        if (aVar6 == null) {
            s.w("binding");
            aVar6 = null;
        }
        aVar6.I.setOnClickListener(new View.OnClickListener() { // from class: hf.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.D0(this.f40342a, view);
            }
        });
        try {
            String str = getString(R.string.version_app) + ' ' + getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            tf.a aVar7 = this.binding;
            if (aVar7 == null) {
                s.w("binding");
            } else {
                aVar2 = aVar7;
            }
            aVar2.J.setText(str);
        } catch (PackageManager.NameNotFoundException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        s.h(menuItem, "menuItem");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }
}
