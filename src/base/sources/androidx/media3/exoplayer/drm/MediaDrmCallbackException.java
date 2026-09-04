package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.g f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f5238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5240d;

    public MediaDrmCallbackException(z1.g gVar, Uri uri, Map map, long j10, Throwable th2) {
        super(th2);
        this.f5237a = gVar;
        this.f5238b = uri;
        this.f5239c = map;
        this.f5240d = j10;
    }
}
