package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class m implements r5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f11432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f11433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r5.e f11434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f11435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r5.g f11436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11437j;

    m(Object obj, r5.e eVar, int i10, int i11, Map map, Class cls, Class cls2, r5.g gVar) {
        this.f11429b = m6.k.e(obj);
        this.f11434g = (r5.e) m6.k.f(eVar, "Signature must not be null");
        this.f11430c = i10;
        this.f11431d = i11;
        this.f11435h = (Map) m6.k.e(map);
        this.f11432e = (Class) m6.k.f(cls, "Resource class must not be null");
        this.f11433f = (Class) m6.k.f(cls2, "Transcode class must not be null");
        this.f11436i = (r5.g) m6.k.e(gVar);
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f11429b.equals(mVar.f11429b) && this.f11434g.equals(mVar.f11434g) && this.f11431d == mVar.f11431d && this.f11430c == mVar.f11430c && this.f11435h.equals(mVar.f11435h) && this.f11432e.equals(mVar.f11432e) && this.f11433f.equals(mVar.f11433f) && this.f11436i.equals(mVar.f11436i)) {
                return true;
            }
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        if (this.f11437j == 0) {
            int iHashCode = this.f11429b.hashCode();
            this.f11437j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f11434g.hashCode()) * 31) + this.f11430c) * 31) + this.f11431d;
            this.f11437j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f11435h.hashCode();
            this.f11437j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f11432e.hashCode();
            this.f11437j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f11433f.hashCode();
            this.f11437j = iHashCode5;
            this.f11437j = (iHashCode5 * 31) + this.f11436i.hashCode();
        }
        return this.f11437j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f11429b + ", width=" + this.f11430c + ", height=" + this.f11431d + ", resourceClass=" + this.f11432e + ", transcodeClass=" + this.f11433f + ", signature=" + this.f11434g + ", hashCode=" + this.f11437j + ", transformations=" + this.f11435h + ", options=" + this.f11436i + '}';
    }
}
