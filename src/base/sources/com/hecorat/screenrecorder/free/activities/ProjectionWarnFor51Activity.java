package com.hecorat.screenrecorder.free.activities;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import com.hecorat.screenrecorder.free.AzRecorderApp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ProjectionWarnFor51Activity extends Activity implements lg.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dg.l f22649a;

    @Override // lg.g
    public void k(int i10) {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        AzRecorderApp.d().y(this);
        super.onCreate(bundle);
        setTheme(R.style.Theme.DeviceDefault.Dialog.NoActionBar);
        if (getIntent() == null) {
            finish();
        }
        wf.g.c(com.hecorat.screenrecorder.free.R.string.app_name, com.hecorat.screenrecorder.free.R.string.dialog_warning_for_android_51_msg, com.hecorat.screenrecorder.free.R.string.ok_understand, R.string.no, R.string.no, com.hecorat.screenrecorder.free.R.drawable.ic_app_icon, "got_it", true).show(getFragmentManager(), "dialog");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f22649a.o0();
        super.onDestroy();
    }

    @Override // lg.g
    public void w(int i10) {
    }
}
