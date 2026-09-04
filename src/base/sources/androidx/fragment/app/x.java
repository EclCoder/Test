package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f4294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f4296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final f0 f4298e;

    x(s sVar) {
        this(sVar, sVar, new Handler(), 0);
    }

    Activity e() {
        return this.f4294a;
    }

    Context f() {
        return this.f4295b;
    }

    public Handler g() {
        return this.f4296c;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public abstract boolean l(String str);

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.startActivity(this.f4295b, intent, bundle);
    }

    public void n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.l(this.f4294a, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public abstract void o();

    x(Activity activity, Context context, Handler handler, int i10) {
        this.f4298e = new g0();
        this.f4294a = activity;
        this.f4295b = (Context) m0.g.h(context, "context == null");
        this.f4296c = (Handler) m0.g.h(handler, "handler == null");
        this.f4297d = i10;
    }

    public void k(Fragment fragment, String[] strArr, int i10) {
    }
}
