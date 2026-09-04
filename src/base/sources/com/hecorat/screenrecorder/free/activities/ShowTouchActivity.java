package com.hecorat.screenrecorder.free.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ShowTouchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import tf.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/ShowTouchActivity;", "Lff/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "menuItem", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Ltf/j0;", "c", "Ltf/j0;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowTouchActivity extends ff.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public j0 binding;

    public static final void B0(ShowTouchActivity showTouchActivity, View view) {
        j0 j0Var = showTouchActivity.binding;
        j0 j0Var2 = null;
        if (j0Var == null) {
            s.w("binding");
            j0Var = null;
        }
        if (j0Var.C.getVisibility() == 8) {
            j0 j0Var3 = showTouchActivity.binding;
            if (j0Var3 == null) {
                s.w("binding");
                j0Var3 = null;
            }
            j0Var3.C.setVisibility(0);
            j0 j0Var4 = showTouchActivity.binding;
            if (j0Var4 == null) {
                s.w("binding");
                j0Var4 = null;
            }
            j0Var4.D.setVisibility(8);
            j0 j0Var5 = showTouchActivity.binding;
            if (j0Var5 == null) {
                s.w("binding");
            } else {
                j0Var2 = j0Var5;
            }
            j0Var2.B.setVisibility(0);
            return;
        }
        j0 j0Var6 = showTouchActivity.binding;
        if (j0Var6 == null) {
            s.w("binding");
            j0Var6 = null;
        }
        j0Var6.C.setVisibility(8);
        j0 j0Var7 = showTouchActivity.binding;
        if (j0Var7 == null) {
            s.w("binding");
            j0Var7 = null;
        }
        j0Var7.D.setVisibility(0);
        j0 j0Var8 = showTouchActivity.binding;
        if (j0Var8 == null) {
            s.w("binding");
        } else {
            j0Var2 = j0Var8;
        }
        j0Var2.B.setVisibility(8);
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j0 j0Var = (j0) androidx.databinding.g.j(this, R.layout.activity_show_touch);
        this.binding = j0Var;
        j0 j0Var2 = null;
        if (j0Var == null) {
            s.w("binding");
            j0Var = null;
        }
        View viewB = j0Var.B();
        s.g(viewB, "getRoot(...)");
        y0(viewB);
        j0 j0Var3 = this.binding;
        if (j0Var3 == null) {
            s.w("binding");
            j0Var3 = null;
        }
        u0(j0Var3.F);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
            setTitle(getString(R.string.show_touches));
        }
        j0 j0Var4 = this.binding;
        if (j0Var4 == null) {
            s.w("binding");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.E.setOnClickListener(new View.OnClickListener() { // from class: ff.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowTouchActivity.B0(this.f38583a, view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        s.h(menuItem, "menuItem");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
