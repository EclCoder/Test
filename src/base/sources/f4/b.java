package f4;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38243a = new b();

    private b() {
    }

    public final Object a(Context context, String tag, Function1 manager) {
        s.h(context, "context");
        s.h(tag, "tag");
        s.h(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + a.f38240a.b());
            return null;
        }
    }
}
