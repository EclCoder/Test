package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d implements r5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.e f11294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r5.e f11295c;

    d(r5.e eVar, r5.e eVar2) {
        this.f11294b = eVar;
        this.f11295c = eVar2;
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        this.f11294b.a(messageDigest);
        this.f11295c.a(messageDigest);
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f11294b.equals(dVar.f11294b) && this.f11295c.equals(dVar.f11295c)) {
                return true;
            }
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        return (this.f11294b.hashCode() * 31) + this.f11295c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f11294b + ", signature=" + this.f11295c + '}';
    }
}
