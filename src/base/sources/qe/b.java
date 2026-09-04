package qe;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f50641b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f50642a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context appContext) {
        s.h(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f50642a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // qe.o
    public Boolean a() {
        if (this.f50642a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f50642a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // qe.o
    public cm.a b() {
        if (this.f50642a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return cm.a.e(cm.c.s(this.f50642a.getInt("firebase_sessions_sessions_restart_timeout"), cm.d.SECONDS));
        }
        return null;
    }

    @Override // qe.o
    public Object c(kl.f fVar) {
        return o.a.a(this, fVar);
    }

    @Override // qe.o
    public Double d() {
        if (this.f50642a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f50642a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
