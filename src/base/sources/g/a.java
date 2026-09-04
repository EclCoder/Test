package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0582a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f38819a;

        public C0582a(Object obj) {
            this.f38819a = obj;
        }

        public final Object a() {
            return this.f38819a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0582a b(Context context, Object obj) {
        s.h(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
