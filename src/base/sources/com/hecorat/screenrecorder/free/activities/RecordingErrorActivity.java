package com.hecorat.screenrecorder.free.activities;

import android.os.Bundle;
import android.view.View;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.RecordingErrorActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import nh.l0;
import tf.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/RecordingErrorActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Ltf/c0;", "c", "Ltf/c0;", "binding", "Llg/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llg/a;", "getPreferenceManager", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecordingErrorActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public c0 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    public static final void A0(RecordingErrorActivity recordingErrorActivity, View view) {
        l0.t(recordingErrorActivity);
        recordingErrorActivity.finish();
    }

    public static final void z0(RecordingErrorActivity recordingErrorActivity, View view) {
        recordingErrorActivity.finish();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().a(this);
        super.onCreate(savedInstanceState);
        c0 c0VarY = c0.Y(getLayoutInflater());
        this.binding = c0VarY;
        c0 c0Var = null;
        if (c0VarY == null) {
            s.w("binding");
            c0VarY = null;
        }
        setContentView(c0VarY.B());
        setFinishOnTouchOutside(true);
        c0 c0Var2 = this.binding;
        if (c0Var2 == null) {
            s.w("binding");
            c0Var2 = null;
        }
        c0Var2.A.setText(getString(R.string.ask_az_recorder_community, getString(R.string.az_recorder)));
        c0 c0Var3 = this.binding;
        if (c0Var3 == null) {
            s.w("binding");
            c0Var3 = null;
        }
        c0Var3.D.setOnClickListener(new View.OnClickListener() { // from class: ff.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordingErrorActivity.z0(this.f38544a, view);
            }
        });
        c0 c0Var4 = this.binding;
        if (c0Var4 == null) {
            s.w("binding");
        } else {
            c0Var = c0Var4;
        }
        c0Var.A.setOnClickListener(new View.OnClickListener() { // from class: ff.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordingErrorActivity.A0(this.f38547a, view);
            }
        });
    }
}
