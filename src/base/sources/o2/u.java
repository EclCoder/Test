package o2;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f48166a = new u() { // from class: o2.t
        @Override // o2.u
        public final p[] createExtractors() {
            return u.d();
        }
    };

    static /* synthetic */ p[] d() {
        return new p[0];
    }

    default p[] a(Uri uri, Map map) {
        return createExtractors();
    }

    p[] createExtractors();

    default u b(l3.r.a aVar) {
        return this;
    }

    default u c(boolean z10) {
        return this;
    }
}
