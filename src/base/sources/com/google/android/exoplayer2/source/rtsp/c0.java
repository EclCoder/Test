package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.e0 f17931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.c0 f17932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f17937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17942l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f17943a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.collect.c0.a f17944b = new com.google.common.collect.c0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17945c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f17946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f17947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f17948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Uri f17949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f17950h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f17951i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f17952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f17953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f17954l;

        public b m(String str, String str2) {
            this.f17943a.put(str, str2);
            return this;
        }

        public b n(com.google.android.exoplayer2.source.rtsp.a aVar) {
            this.f17944b.a(aVar);
            return this;
        }

        public c0 o() {
            return new c0(this);
        }

        public b p(int i10) {
            this.f17945c = i10;
            return this;
        }

        public b q(String str) {
            this.f17950h = str;
            return this;
        }

        public b r(String str) {
            this.f17953k = str;
            return this;
        }

        public b s(String str) {
            this.f17951i = str;
            return this;
        }

        public b t(String str) {
            this.f17947e = str;
            return this;
        }

        public b u(String str) {
            this.f17954l = str;
            return this;
        }

        public b v(String str) {
            this.f17952j = str;
            return this;
        }

        public b w(String str) {
            this.f17946d = str;
            return this;
        }

        public b x(String str) {
            this.f17948f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f17949g = uri;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f17936f == c0Var.f17936f && this.f17931a.equals(c0Var.f17931a) && this.f17932b.equals(c0Var.f17932b) && r0.c(this.f17934d, c0Var.f17934d) && r0.c(this.f17933c, c0Var.f17933c) && r0.c(this.f17935e, c0Var.f17935e) && r0.c(this.f17942l, c0Var.f17942l) && r0.c(this.f17937g, c0Var.f17937g) && r0.c(this.f17940j, c0Var.f17940j) && r0.c(this.f17941k, c0Var.f17941k) && r0.c(this.f17938h, c0Var.f17938h) && r0.c(this.f17939i, c0Var.f17939i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f17931a.hashCode()) * 31) + this.f17932b.hashCode()) * 31;
        String str = this.f17934d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17933c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17935e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f17936f) * 31;
        String str4 = this.f17942l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f17937g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f17940j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17941k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f17938h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f17939i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    private c0(b bVar) {
        this.f17931a = com.google.common.collect.e0.j(bVar.f17943a);
        this.f17932b = bVar.f17944b.m();
        this.f17933c = (String) r0.j(bVar.f17946d);
        this.f17934d = (String) r0.j(bVar.f17947e);
        this.f17935e = (String) r0.j(bVar.f17948f);
        this.f17937g = bVar.f17949g;
        this.f17938h = bVar.f17950h;
        this.f17936f = bVar.f17945c;
        this.f17939i = bVar.f17951i;
        this.f17940j = bVar.f17953k;
        this.f17941k = bVar.f17954l;
        this.f17942l = bVar.f17952j;
    }
}
