package com.hecorat.screenrecorder.free.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import ig.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/StopOptionsActivity;", "Lff/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StopOptionsActivity extends ff.b {
    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_preference_screen);
        View viewFindViewById = findViewById(R.id.root);
        s.g(viewFindViewById, "findViewById(...)");
        y0(viewFindViewById);
        if (savedInstanceState == null) {
            getSupportFragmentManager().q().o(R.id.settings, new c0()).g();
        }
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        androidx.appcompat.app.a aVarL1 = l0();
        if (aVarL1 != null) {
            aVarL1.A(true);
        }
        androidx.appcompat.app.a aVarL2 = l0();
        if (aVarL2 != null) {
            aVarL2.w(0.0f);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.h(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }
}
