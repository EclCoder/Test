package ya;

import android.net.Uri;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static com.google.android.exoplayer2.upstream.a a(int i10) {
        return new com.google.android.exoplayer2.upstream.a(Uri.parse(r0.D("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i10))));
    }
}
