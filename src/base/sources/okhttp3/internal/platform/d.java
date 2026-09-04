package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f48995a = new d();

    private d() {
    }

    public final c a() {
        sn.c.f52445a.b();
        c cVarA = a.f48981f.a();
        if (cVarA == null) {
            cVarA = b.f48985f.a();
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    public final Context b() {
        Object objE = c.f48992a.e();
        rn.c cVar = objE instanceof rn.c ? (rn.c) objE : null;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(Context context) {
        Object objE = c.f48992a.e();
        rn.c cVar = objE instanceof rn.c ? (rn.c) objE : null;
        if (cVar != null) {
            cVar.a(context);
        }
    }
}
