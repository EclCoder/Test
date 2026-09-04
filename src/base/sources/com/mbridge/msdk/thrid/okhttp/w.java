package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33598a;

    w(String str) {
        this.f33598a = str;
    }

    public static w a(String str) throws IOException {
        w wVar = HTTP_1_0;
        if (str.equals(wVar.f33598a)) {
            return wVar;
        }
        w wVar2 = HTTP_1_1;
        if (str.equals(wVar2.f33598a)) {
            return wVar2;
        }
        w wVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(wVar3.f33598a)) {
            return wVar3;
        }
        w wVar4 = HTTP_2;
        if (str.equals(wVar4.f33598a)) {
            return wVar4;
        }
        w wVar5 = SPDY_3;
        if (str.equals(wVar5.f33598a)) {
            return wVar5;
        }
        w wVar6 = QUIC;
        if (str.equals(wVar6.f33598a)) {
            return wVar6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f33598a;
    }
}
