package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f15748f = new b(null);
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new u(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15749e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.g0
    public String g() {
        return this.f15749e;
    }

    @Override // com.facebook.login.g0
    public boolean s() {
        return true;
    }

    @Override // com.facebook.login.g0
    public int t(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        boolean z10 = com.facebook.h0.f15099t && com.facebook.internal.g.a() != null && request.q().g();
        String strA = w.f15766m.a();
        androidx.fragment.app.s sVarN = e().n();
        String strB = request.b();
        Set setV = request.v();
        boolean zB = request.B();
        boolean zY = request.y();
        e eVarJ = request.j();
        if (eVarJ == null) {
            eVarJ = e.NONE;
        }
        e eVar = eVarJ;
        String strC = c(request.c());
        String strE = request.e();
        String strT = request.t();
        boolean zX = request.x();
        boolean z11 = request.z();
        boolean zK = request.K();
        String strU = request.u();
        String strF = request.f();
        com.facebook.login.a aVarG = request.g();
        List listQ = com.facebook.internal.u0.q(sVarN, strB, setV, strA, zB, zY, eVar, strC, strE, z10, strT, zX, z11, zK, strU, strF, aVarG != null ? aVarG.name() : null, request.w(), request.p(), request.o(), request.a());
        a("e2e", strA);
        Iterator it = listQ.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            if (F((Intent) it.next(), w.f15766m.b())) {
                return i10;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
        this.f15749e = "katana_proxy_auth";
    }
}
