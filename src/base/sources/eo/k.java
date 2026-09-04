package eo;

import java.io.Serializable;
import java.security.Principal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k implements j, Serializable {
    private static final long serialVersionUID = 243343858802739403L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f38113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38114b;

    public k(String str) {
        ip.a.h(str, "Username:password string");
        int iIndexOf = str.indexOf(58);
        if (iIndexOf >= 0) {
            this.f38113a = new h(str.substring(0, iIndexOf));
            this.f38114b = str.substring(iIndexOf + 1);
        } else {
            this.f38113a = new h(str);
            this.f38114b = null;
        }
    }

    @Override // eo.j
    public Principal d() {
        return this.f38113a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && ip.f.a(this.f38113a, ((k) obj).f38113a);
    }

    public int hashCode() {
        return this.f38113a.hashCode();
    }

    public String toString() {
        return this.f38113a.toString();
    }
}
