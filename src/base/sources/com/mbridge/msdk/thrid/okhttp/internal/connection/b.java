package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f33143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33144b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33146d;

    public b(List<j> list) {
        this.f33143a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f33144b; i10 < this.f33143a.size(); i10++) {
            if (this.f33143a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws UnknownServiceException {
        j jVar;
        int i10 = this.f33144b;
        int size = this.f33143a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f33143a.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f33144b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f33145c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(jVar, sSLSocket, this.f33146d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f33146d + ", modes=" + this.f33143a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f33146d = true;
        if (!this.f33145c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
