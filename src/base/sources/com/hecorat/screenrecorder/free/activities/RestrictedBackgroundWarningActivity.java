package com.hecorat.screenrecorder.free.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import tf.e0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/RestrictedBackgroundWarningActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Ltf/e0;", "c", "Ltf/e0;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RestrictedBackgroundWarningActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f22653e;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public e0 binding;

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, b warningCallback) {
            s.h(context, "context");
            s.h(warningCallback, "warningCallback");
            Intent intent = new Intent(context, (Class<?>) RestrictedBackgroundWarningActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
            RestrictedBackgroundWarningActivity.f22653e = warningCallback;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface b {
        void a();

        void ignore();
    }

    public static final void B0(RestrictedBackgroundWarningActivity restrictedBackgroundWarningActivity, View view) {
        f22653e = null;
        restrictedBackgroundWarningActivity.finish();
    }

    public static final void C0(RestrictedBackgroundWarningActivity restrictedBackgroundWarningActivity, View view) {
        b bVar = f22653e;
        if (bVar != null) {
            bVar.a();
        }
        f22653e = null;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + restrictedBackgroundWarningActivity.getPackageName()));
        intent.addFlags(268435456);
        restrictedBackgroundWarningActivity.startActivity(intent);
        restrictedBackgroundWarningActivity.finish();
    }

    public static final void D0(RestrictedBackgroundWarningActivity restrictedBackgroundWarningActivity, View view) {
        b bVar = f22653e;
        if (bVar != null) {
            bVar.ignore();
        }
        f22653e = null;
        restrictedBackgroundWarningActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = (e0) androidx.databinding.g.j(this, R.layout.activity_restricted_background_warning);
        setFinishOnTouchOutside(true);
        e0 e0Var = this.binding;
        e0 e0Var2 = null;
        if (e0Var == null) {
            s.w("binding");
            e0Var = null;
        }
        e0Var.A.setOnClickListener(new View.OnClickListener() { // from class: ff.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestrictedBackgroundWarningActivity.B0(this.f38553a, view);
            }
        });
        e0 e0Var3 = this.binding;
        if (e0Var3 == null) {
            s.w("binding");
            e0Var3 = null;
        }
        e0Var3.C.setOnClickListener(new View.OnClickListener() { // from class: ff.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestrictedBackgroundWarningActivity.C0(this.f38556a, view);
            }
        });
        e0 e0Var4 = this.binding;
        if (e0Var4 == null) {
            s.w("binding");
        } else {
            e0Var2 = e0Var4;
        }
        e0Var2.B.setOnClickListener(new View.OnClickListener() { // from class: ff.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestrictedBackgroundWarningActivity.D0(this.f38559a, view);
            }
        });
    }
}
