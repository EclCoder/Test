package i2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f40760h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.g f40762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f40763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f40764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f40767g;

    public i(long j10, z1.g gVar, long j11) {
        this(j10, gVar, gVar.f58544a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f40760h.getAndIncrement();
    }

    public i(long j10, z1.g gVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f40761a = j10;
        this.f40762b = gVar;
        this.f40763c = uri;
        this.f40764d = map;
        this.f40765e = j11;
        this.f40766f = j12;
        this.f40767g = j13;
    }
}
