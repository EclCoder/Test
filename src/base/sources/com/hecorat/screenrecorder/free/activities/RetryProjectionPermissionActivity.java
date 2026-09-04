package com.hecorat.screenrecorder.free.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.b0;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.RetryProjectionPermissionActivity;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import dg.u;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/RetryProjectionPermissionActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Ldg/l;", "c", "Ldg/l;", "getRecordingController", "()Ldg/l;", "setRecordingController", "(Ldg/l;)V", "recordingController", "Ldg/u;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ldg/u;", "getScreenshotController", "()Ldg/u;", "setScreenshotController", "(Ldg/u;)V", "screenshotController", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RetryProjectionPermissionActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public dg.l recordingController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public u screenshotController;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements androidx.lifecycle.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22659c;

        public a(String str, int i10) {
            this.f22658b = str;
            this.f22659c = i10;
        }

        @Override // androidx.lifecycle.j
        public void onStop(b0 owner) {
            s.h(owner, "owner");
            owner.getLifecycle().d(this);
            mh.b.a(RetryProjectionPermissionActivity.this, this.f22658b, this.f22659c);
        }
    }

    public static final void y0(RetryProjectionPermissionActivity retryProjectionPermissionActivity, String str, int i10, View view) {
        ef.a.j().set(false);
        ef.a.o(false);
        RecordService.INSTANCE.d(null);
        retryProjectionPermissionActivity.getLifecycle().a(retryProjectionPermissionActivity.new a(str, i10));
        retryProjectionPermissionActivity.finish();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().r(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retry_projection_permission);
        setFinishOnTouchOutside(true);
        Intent intent = getIntent();
        final int iD = yl.g.d((intent != null ? intent.getIntExtra("projection_retries_left", 1) : 1) - 1, 0);
        final String action = getIntent().getAction();
        if (action == null) {
            action = "start_recording";
        }
        ((Button) findViewById(R.id.ok_btn)).setOnClickListener(new View.OnClickListener() { // from class: ff.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RetryProjectionPermissionActivity.y0(this.f38562a, action, iD, view);
            }
        });
    }
}
