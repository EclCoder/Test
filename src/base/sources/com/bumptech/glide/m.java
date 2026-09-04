package com.bumptech.glide;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k6.c f11588a = k6.a.b();

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final k6.c c() {
        return this.f11588a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return m6.l.d(this.f11588a, ((m) obj).f11588a);
        }
        return false;
    }

    public int hashCode() {
        k6.c cVar = this.f11588a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
