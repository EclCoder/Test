package ld;

import gl.l0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f44317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f44318c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        s.h(sessionId, "sessionId");
    }

    public final Map a() {
        return this.f44318c;
    }

    public final String b() {
        return this.f44316a;
    }

    public final long c() {
        return this.f44317b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.c(this.f44316a, cVar.f44316a) && this.f44317b == cVar.f44317b && s.c(this.f44318c, cVar.f44318c);
    }

    public int hashCode() {
        return (((this.f44316a.hashCode() * 31) + Long.hashCode(this.f44317b)) * 31) + this.f44318c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f44316a + ", timestamp=" + this.f44317b + ", additionalCustomKeys=" + this.f44318c + ')';
    }

    public c(String sessionId, long j10, Map additionalCustomKeys) {
        s.h(sessionId, "sessionId");
        s.h(additionalCustomKeys, "additionalCustomKeys");
        this.f44316a = sessionId;
        this.f44317b = j10;
        this.f44318c = additionalCustomKeys;
    }

    public /* synthetic */ c(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? l0.h() : map);
    }
}
