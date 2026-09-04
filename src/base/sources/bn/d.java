package bn;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f9189b;

    public d(c emitter) {
        s.h(emitter, "emitter");
        this.f9188a = TimeUnit.MILLISECONDS.convert(emitter.a(), emitter.b());
    }

    public final float a() {
        return this.f9189b;
    }

    public final long b() {
        return this.f9188a;
    }

    public final d c(int i10) {
        this.f9189b = 1.0f / i10;
        return this;
    }
}
