package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.facebook.l f15715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f15713g = new b(null);
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new t(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i10) {
            return new t[i10];
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
    public t(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15714e = "instagram_login";
        this.f15715f = com.facebook.l.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.g0
    public String g() {
        return this.f15714e;
    }

    @Override // com.facebook.login.g0
    public int t(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        w.c cVar = w.f15766m;
        String strA = cVar.a();
        Context contextN = e().n();
        if (contextN == null) {
            contextN = com.facebook.h0.m();
        }
        String strB = request.b();
        Set setV = request.v();
        boolean zB = request.B();
        boolean zY = request.y();
        e eVarJ = request.j();
        if (eVarJ == null) {
            eVarJ = e.NONE;
        }
        Intent intentK = com.facebook.internal.u0.k(contextN, strB, setV, strA, zB, zY, eVarJ, c(request.c()), request.e(), request.t(), request.x(), request.z(), request.K());
        a("e2e", strA);
        return F(intentK, cVar.b()) ? 1 : 0;
    }

    @Override // com.facebook.login.g0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    @Override // com.facebook.login.k0
    public com.facebook.l y() {
        return this.f15715f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
        this.f15714e = "instagram_login";
        this.f15715f = com.facebook.l.INSTAGRAM_APPLICATION_WEB;
    }
}
