package org.apache.http.message;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class m implements co.u, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49416b;

    public m(String str, String str2) {
        this.f49415a = (String) ip.a.h(str, "Name");
        this.f49416b = str2;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof co.u) {
            m mVar = (m) obj;
            if (this.f49415a.equals(mVar.f49415a) && ip.f.a(this.f49416b, mVar.f49416b)) {
                return true;
            }
        }
        return false;
    }

    @Override // co.u
    public String getName() {
        return this.f49415a;
    }

    @Override // co.u
    public String getValue() {
        return this.f49416b;
    }

    public int hashCode() {
        return ip.f.d(ip.f.d(17, this.f49415a), this.f49416b);
    }

    public String toString() {
        if (this.f49416b == null) {
            return this.f49415a;
        }
        StringBuilder sb2 = new StringBuilder(this.f49415a.length() + 1 + this.f49416b.length());
        sb2.append(this.f49415a);
        sb2.append("=");
        sb2.append(this.f49416b);
        return sb2.toString();
    }
}
