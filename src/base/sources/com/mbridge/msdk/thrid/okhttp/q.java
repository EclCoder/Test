package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f33509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f33510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f33511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f33512d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f33509a = d0Var;
        this.f33510b = gVar;
        this.f33511c = list;
        this.f33512d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.f33511c;
    }

    public d0 c() {
        return this.f33509a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f33509a.equals(qVar.f33509a) && this.f33510b.equals(qVar.f33510b) && this.f33511c.equals(qVar.f33511c) && this.f33512d.equals(qVar.f33512d);
    }

    public int hashCode() {
        return ((((((this.f33509a.hashCode() + 527) * 31) + this.f33510b.hashCode()) * 31) + this.f33511c.hashCode()) * 31) + this.f33512d.hashCode();
    }

    public g a() {
        return this.f33510b;
    }
}
