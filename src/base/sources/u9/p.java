package u9;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f54305a = new p() { // from class: u9.o
        @Override // u9.p
        public final k[] createExtractors() {
            return p.b();
        }
    };

    static /* synthetic */ k[] b() {
        return new k[0];
    }

    default k[] a(Uri uri, Map map) {
        return createExtractors();
    }

    k[] createExtractors();
}
