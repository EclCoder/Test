package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.internal.e1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b\u0016\u0018\u0000  2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\f¨\u0006!"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/s;", "<init>", "()V", "Lfl/g0;", "m0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/Fragment;", "l0", "()Landroidx/fragment/app/Fragment;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "dump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "<set-?>", "a", "Landroidx/fragment/app/Fragment;", "k0", "currentFragment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FacebookActivity extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14840c = FacebookActivity.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Fragment currentFragment;

    /* JADX INFO: renamed from: com.facebook.FacebookActivity$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    private final void m0() {
        Intent requestIntent = getIntent();
        kotlin.jvm.internal.s.g(requestIntent, "requestIntent");
        FacebookException facebookExceptionV = com.facebook.internal.u0.v(com.facebook.internal.u0.A(requestIntent));
        Intent intent = getIntent();
        kotlin.jvm.internal.s.g(intent, "intent");
        setResult(0, com.facebook.internal.u0.p(intent, null, facebookExceptionV));
        finish();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public void dump(String prefix, FileDescriptor fd2, PrintWriter writer, String[] args) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(prefix, "prefix");
            kotlin.jvm.internal.s.h(writer, "writer");
            a8.a.f150a.a();
            super.dump(prefix, fd2, writer, args);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    protected Fragment l0() {
        Intent intent = getIntent();
        androidx.fragment.app.f0 supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.s.g(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentK0 = supportFragmentManager.k0("SingleFragment");
        if (fragmentK0 != null) {
            return fragmentK0;
        }
        if (kotlin.jvm.internal.s.c("FacebookDialogFragment", intent.getAction())) {
            com.facebook.internal.n nVar = new com.facebook.internal.n();
            nVar.setRetainInstance(true);
            nVar.show(supportFragmentManager, "SingleFragment");
            return nVar;
        }
        com.facebook.login.a0 a0Var = new com.facebook.login.a0();
        a0Var.setRetainInstance(true);
        supportFragmentManager.q().b(com.facebook.common.c.f15044c, a0Var, "SingleFragment").g();
        return a0Var;
    }

    @Override // androidx.activity.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.currentFragment;
        if (fragment != null) {
            fragment.onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (!h0.K()) {
            e1.l0(f14840c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.s.g(applicationContext, "applicationContext");
            h0.R(applicationContext);
        }
        setContentView(com.facebook.common.d.f15048a);
        if (kotlin.jvm.internal.s.c("PassThrough", intent.getAction())) {
            m0();
        } else {
            this.currentFragment = l0();
        }
    }
}
