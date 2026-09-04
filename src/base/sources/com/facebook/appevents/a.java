package com.facebook.appevents;

import com.facebook.internal.e1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0260a f14904c = new C0260a(null);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14906b;

    /* JADX INFO: renamed from: com.facebook.appevents.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0260a {
        public /* synthetic */ C0260a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0260a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0261a f14907c = new C0261a(null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f14909b;

        /* JADX INFO: renamed from: com.facebook.appevents.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0261a {
            public /* synthetic */ C0261a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0261a() {
            }
        }

        public b(String str, String appId) {
            kotlin.jvm.internal.s.h(appId, "appId");
            this.f14908a = str;
            this.f14909b = appId;
        }

        private final Object readResolve() {
            return new a(this.f14908a, this.f14909b);
        }
    }

    public a(String str, String applicationId) {
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        this.f14905a = applicationId;
        this.f14906b = e1.e0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new b(null, this.f14905a);
    }

    public final String d() {
        return this.f14906b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e1.e(aVar.f14906b, this.f14906b) && e1.e(aVar.f14905a, this.f14905a);
    }

    public final String g() {
        return this.f14905a;
    }

    public int hashCode() {
        String str = this.f14906b;
        return (str != null ? str.hashCode() : 0) ^ this.f14905a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.facebook.a accessToken) {
        this(accessToken.p(), com.facebook.h0.n());
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
    }
}
