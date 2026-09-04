package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.common.collect.e0 f17907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f17908j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f17911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f17912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final HashMap f17913e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f17914f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f17915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f17916h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f17917i;

        public b(String str, int i10, String str2, int i11) {
            this.f17909a = str;
            this.f17910b = i10;
            this.f17911c = str2;
            this.f17912d = i11;
        }

        private static String k(int i10, String str, int i11, int i12) {
            return r0.D("%d %s/%d/%d", Integer.valueOf(i10), str, Integer.valueOf(i11), Integer.valueOf(i12));
        }

        private static String l(int i10) {
            ob.a.a(i10 < 96);
            if (i10 == 0) {
                return k(0, "PCMU", 8000, 1);
            }
            if (i10 == 8) {
                return k(8, "PCMA", 8000, 1);
            }
            if (i10 == 10) {
                return k(10, "L16", 44100, 2);
            }
            if (i10 == 11) {
                return k(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i10);
        }

        public b i(String str, String str2) {
            this.f17913e.put(str, str2);
            return this;
        }

        public a j() {
            try {
                return new a(this, com.google.common.collect.e0.j(this.f17913e), this.f17913e.containsKey("rtpmap") ? c.a((String) r0.j((String) this.f17913e.get("rtpmap"))) : c.a(l(this.f17912d)));
            } catch (ParserException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public b m(int i10) {
            this.f17914f = i10;
            return this;
        }

        public b n(String str) {
            this.f17916h = str;
            return this;
        }

        public b o(String str) {
            this.f17917i = str;
            return this;
        }

        public b p(String str) {
            this.f17915g = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17921d;

        private c(int i10, String str, int i11, int i12) {
            this.f17918a = i10;
            this.f17919b = str;
            this.f17920c = i11;
            this.f17921d = i12;
        }

        public static c a(String str) throws ParserException {
            String[] strArrZ0 = r0.Z0(str, " ");
            ob.a.a(strArrZ0.length == 2);
            int iH = u.h(strArrZ0[0]);
            String[] strArrY0 = r0.Y0(strArrZ0[1].trim(), "/");
            ob.a.a(strArrY0.length >= 2);
            return new c(iH, strArrY0[0], u.h(strArrY0[1]), strArrY0.length == 3 ? u.h(strArrY0[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f17918a == cVar.f17918a && this.f17919b.equals(cVar.f17919b) && this.f17920c == cVar.f17920c && this.f17921d == cVar.f17921d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f17918a) * 31) + this.f17919b.hashCode()) * 31) + this.f17920c) * 31) + this.f17921d;
        }
    }

    public com.google.common.collect.e0 a() {
        String str = (String) this.f17907i.get("fmtp");
        if (str == null) {
            return com.google.common.collect.e0.q();
        }
        String[] strArrZ0 = r0.Z0(str, " ");
        ob.a.b(strArrZ0.length == 2, str);
        String[] strArrSplit = strArrZ0[1].split(";\\s?", 0);
        com.google.common.collect.e0.a aVar = new com.google.common.collect.e0.a();
        for (String str2 : strArrSplit) {
            String[] strArrZ1 = r0.Z0(str2, "=");
            aVar.g(strArrZ1[0], strArrZ1[1]);
        }
        return aVar.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17899a.equals(aVar.f17899a) && this.f17900b == aVar.f17900b && this.f17901c.equals(aVar.f17901c) && this.f17902d == aVar.f17902d && this.f17903e == aVar.f17903e && this.f17907i.equals(aVar.f17907i) && this.f17908j.equals(aVar.f17908j) && r0.c(this.f17904f, aVar.f17904f) && r0.c(this.f17905g, aVar.f17905g) && r0.c(this.f17906h, aVar.f17906h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f17899a.hashCode()) * 31) + this.f17900b) * 31) + this.f17901c.hashCode()) * 31) + this.f17902d) * 31) + this.f17903e) * 31) + this.f17907i.hashCode()) * 31) + this.f17908j.hashCode()) * 31;
        String str = this.f17904f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17905g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17906h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    private a(b bVar, com.google.common.collect.e0 e0Var, c cVar) {
        this.f17899a = bVar.f17909a;
        this.f17900b = bVar.f17910b;
        this.f17901c = bVar.f17911c;
        this.f17902d = bVar.f17912d;
        this.f17904f = bVar.f17915g;
        this.f17905g = bVar.f17916h;
        this.f17903e = bVar.f17914f;
        this.f17906h = bVar.f17917i;
        this.f17907i = e0Var;
        this.f17908j = cVar;
    }
}
