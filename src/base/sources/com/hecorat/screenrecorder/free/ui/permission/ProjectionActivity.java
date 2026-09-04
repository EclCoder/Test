package com.hecorat.screenrecorder.free.ui.permission;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.RetryProjectionPermissionActivity;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.hecorat.screenrecorder.free.ui.permission.ProjectionActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import lg.a;
import nh.j0;
import nh.l0;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010)\u001a\u0004\b\u001a\u0010*\"\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010/R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/permission/ProjectionActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "Lzg/p;", "a", "Lzg/p;", "c", "()Lzg/p;", "setGlobalBubbleManager", "(Lzg/p;)V", "globalBubbleManager", "Landroid/media/projection/MediaProjectionManager;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/media/projection/MediaProjectionManager;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Landroid/media/projection/MediaProjectionManager;", "setMediaProjectionManager", "(Landroid/media/projection/MediaProjectionManager;)V", "mediaProjectionManager", "Llg/a;", "Llg/a;", "e", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "firebaseAnalytics", "", "Ljava/lang/String;", "action", "f", "I", "retriesLeft", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProjectionActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public p globalBubbleManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MediaProjectionManager mediaProjectionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a preferenceManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public FirebaseAnalytics firebaseAnalytics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String action;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int retriesLeft = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ProjectionActivity projectionActivity, String str, int i10) {
        Intent intent = new Intent(projectionActivity, (Class<?>) RetryProjectionPermissionActivity.class);
        intent.setAction(str);
        intent.putExtra("projection_retries_left", i10);
        projectionActivity.startActivity(intent);
    }

    public final FirebaseAnalytics b() {
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        s.w("firebaseAnalytics");
        return null;
    }

    public final p c() {
        p pVar = this.globalBubbleManager;
        if (pVar != null) {
            return pVar;
        }
        s.w("globalBubbleManager");
        return null;
    }

    public final MediaProjectionManager d() {
        MediaProjectionManager mediaProjectionManager = this.mediaProjectionManager;
        if (mediaProjectionManager != null) {
            return mediaProjectionManager;
        }
        s.w("mediaProjectionManager");
        return null;
    }

    public final a e() {
        a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("preferenceManager");
        return null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 88) {
            return;
        }
        ef.a.j().set(false);
        ef.a.o(false);
        boolean z10 = resultCode != -1 || data == null;
        if (z10) {
            RecordService.INSTANCE.d(null);
        }
        if (ef.a.e()) {
            p.t(c(), 16, false, 2, null);
        }
        Bundle bundle = new Bundle();
        Intent action = new Intent(this, (Class<?>) RecordService.class).setAction("process_" + this.action);
        s.g(action, "setAction(...)");
        if (z10) {
            p.t(c(), 62, false, 2, null);
            final int i10 = this.retriesLeft;
            if (i10 > 0) {
                final String str = this.action;
                finish();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: mh.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProjectionActivity.f(this.f46251a, str, i10);
                    }
                });
            } else {
                j0.b(this, s.c(this.action, "start_recording") ? R.string.recording_failed_please_try_again : R.string.screenshot_failed_please_try_again);
                finish();
            }
            bundle.putString("permission_granting", "deny_in_system_dialog");
        } else {
            action.putExtra("result_intent", data);
            l0.f47742a.E(this, action);
            bundle.putString("permission_granting", "allow_in_system_dialog");
            finish();
        }
        b().a("ask_media_projection_permission", bundle);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Intent intentCreateScreenCaptureIntent;
        AzRecorderApp.d().k(this);
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        this.action = intent != null ? intent.getAction() : null;
        Intent intent2 = getIntent();
        this.retriesLeft = intent2 != null ? intent2.getIntExtra("projection_retries_left", 1) : 1;
        if (Build.VERSION.SDK_INT < 34 || e().b(R.string.pref_enable_single_app, false)) {
            intentCreateScreenCaptureIntent = d().createScreenCaptureIntent();
        } else {
            MediaProjectionConfig mediaProjectionConfigCreateConfigForDefaultDisplay = MediaProjectionConfig.createConfigForDefaultDisplay();
            s.g(mediaProjectionConfigCreateConfigForDefaultDisplay, "createConfigForDefaultDisplay(...)");
            intentCreateScreenCaptureIntent = d().createScreenCaptureIntent(mediaProjectionConfigCreateConfigForDefaultDisplay);
        }
        s.e(intentCreateScreenCaptureIntent);
        try {
            startActivityForResult(intentCreateScreenCaptureIntent, 88);
            if (ef.a.e()) {
                c().u(16);
            }
        } catch (ActivityNotFoundException e10) {
            j0.b(this, R.string.toast_not_supported_device);
            com.google.firebase.crashlytics.a.b().d(e10);
            ef.a.j().set(false);
            ef.a.o(false);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ef.a.j().set(false);
    }
}
