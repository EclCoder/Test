package ra;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f51184h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f51186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f51187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f51188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f51189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f51190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51191g;

    public i(long j10, com.google.android.exoplayer2.upstream.a aVar, long j11) {
        this(j10, aVar, aVar.f18779a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f51184h.getAndIncrement();
    }

    public i(long j10, com.google.android.exoplayer2.upstream.a aVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f51185a = j10;
        this.f51186b = aVar;
        this.f51187c = uri;
        this.f51188d = map;
        this.f51189e = j11;
        this.f51190f = j12;
        this.f51191g = j13;
    }
}
