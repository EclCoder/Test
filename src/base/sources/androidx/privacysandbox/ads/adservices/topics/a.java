package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6522b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0072a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6523a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6524b = true;

        public final a a() {
            return new a(this.f6523a, this.f6524b);
        }

        public final C0072a b(String adsSdkName) {
            s.h(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f6523a = adsSdkName;
            return this;
        }

        public final C0072a c(boolean z10) {
            this.f6524b = z10;
            return this;
        }
    }

    public a(String adsSdkName, boolean z10) {
        s.h(adsSdkName, "adsSdkName");
        this.f6521a = adsSdkName;
        this.f6522b = z10;
    }

    public final String a() {
        return this.f6521a;
    }

    public final boolean b() {
        return this.f6522b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.c(this.f6521a, aVar.f6521a) && this.f6522b == aVar.f6522b;
    }

    public int hashCode() {
        return (this.f6521a.hashCode() * 31) + Boolean.hashCode(this.f6522b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f6521a + ", shouldRecordObservation=" + this.f6522b;
    }
}
