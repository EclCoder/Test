package com.mbridge.msdk.thrid.okhttp;

import com.google.api.client.http.UrlEncodedParser;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f33503c = u.a(UrlEncodedParser.CONTENT_TYPE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f33504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f33505b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f33506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f33507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f33508c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f33506a.add(s.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f33508c));
            this.f33507b.add(s.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f33508c));
            return this;
        }

        public a(Charset charset) {
            this.f33506a = new ArrayList();
            this.f33507b = new ArrayList();
            this.f33508c = charset;
        }

        public p a() {
            return new p(this.f33506a, this.f33507b);
        }
    }

    p(List<String> list, List<String> list2) {
        this.f33504a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f33505b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f33503c;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) {
        a(dVar, false);
    }

    private long a(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVarA;
        if (z10) {
            cVarA = new com.mbridge.msdk.thrid.okio.c();
        } else {
            cVarA = dVar.a();
        }
        int size = this.f33504a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVarA.writeByte(38);
            }
            cVarA.a(this.f33504a.get(i10));
            cVarA.writeByte(61);
            cVarA.a(this.f33505b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarA.size();
        cVarA.k();
        return size2;
    }
}
