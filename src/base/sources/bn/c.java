package bn;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeUnit f9187b;

    public c(long j10, TimeUnit timeUnit) {
        s.h(timeUnit, "timeUnit");
        this.f9186a = j10;
        this.f9187b = timeUnit;
    }

    public final long a() {
        return this.f9186a;
    }

    public final TimeUnit b() {
        return this.f9187b;
    }

    public final d c(int i10) {
        return new d(this).c(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9186a == cVar.f9186a && this.f9187b == cVar.f9187b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f9186a) * 31) + this.f9187b.hashCode();
    }

    public String toString() {
        return "Emitter(duration=" + this.f9186a + ", timeUnit=" + this.f9187b + ")";
    }
}
