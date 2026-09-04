package com.google.firebase;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22067c;

    a(long j10, long j11, long j12) {
        this.f22065a = j10;
        this.f22066b = j11;
        this.f22067c = j12;
    }

    @Override // com.google.firebase.n
    public long b() {
        return this.f22066b;
    }

    @Override // com.google.firebase.n
    public long c() {
        return this.f22065a;
    }

    @Override // com.google.firebase.n
    public long d() {
        return this.f22067c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f22065a == nVar.c() && this.f22066b == nVar.b() && this.f22067c == nVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f22065a;
        long j11 = this.f22066b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f22067c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f22065a + dOIDCKnIR.MHxCSjJHzEeVdY + this.f22066b + ", uptimeMillis=" + this.f22067c + mTFeqtajA.mmUZZUVwv;
    }
}
