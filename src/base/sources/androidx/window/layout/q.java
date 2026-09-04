package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7749a = a.f7750a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f7751b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f7750a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f7752c = l0.b(q.class).k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static r f7753d = f.f7697a;

        private a() {
        }

        public final q a(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            return f7753d.a(new s(z.f7766a, b(context)));
        }

        public final p b(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            h hVar = null;
            try {
                WindowLayoutComponent windowLayoutComponentM = l.f7723a.m();
                if (windowLayoutComponentM != null) {
                    hVar = new h(windowLayoutComponentM);
                }
            } catch (Throwable unused) {
                if (f7751b) {
                    Log.d(f7752c, "Failed to load WindowExtensions");
                }
            }
            return hVar == null ? n.f7737c.a(context) : hVar;
        }
    }

    static q a(Context context) {
        return f7749a.a(context);
    }

    hm.e b(Activity activity);
}
