package fj;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f38717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f38720d;

    public b(byte[] buffer, long j10, int i10, c type) {
        s.h(buffer, "buffer");
        s.h(type, "type");
        this.f38717a = buffer;
        this.f38718b = j10;
        this.f38719c = i10;
        this.f38720d = type;
    }

    public final byte[] a() {
        return this.f38717a;
    }

    public final int b() {
        return this.f38719c;
    }

    public final long c() {
        return this.f38718b;
    }

    public final c d() {
        return this.f38720d;
    }

    public final void e(long j10) {
        this.f38718b = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.c(this.f38717a, bVar.f38717a) && this.f38718b == bVar.f38718b && this.f38719c == bVar.f38719c && this.f38720d == bVar.f38720d;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.f38717a) * 31) + Long.hashCode(this.f38718b)) * 31) + Integer.hashCode(this.f38719c)) * 31) + this.f38720d.hashCode();
    }

    public String toString() {
        return "FlvPacket(buffer=" + Arrays.toString(this.f38717a) + ", timeStamp=" + this.f38718b + ", length=" + this.f38719c + ", type=" + this.f38720d + ")";
    }

    public /* synthetic */ b(byte[] bArr, long j10, int i10, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new byte[0] : bArr, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? c.AUDIO : cVar);
    }
}
