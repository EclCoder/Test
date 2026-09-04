package com.mbridge.msdk.config.component.common.network.listener;

import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.config.component.nori.monitor.a;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.system.NoProGuard;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class EventListenerTCP implements NoProGuard {
    private static final String TAG = "EventListenerTCP";
    private a monitorLink;

    public EventListenerTCP(a aVar) {
        this.monitorLink = aVar;
    }

    public void callEnd() {
        q0.b(TAG, "callEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void callFailed(IOException iOException) {
        q0.b(TAG, "callFailed");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.a(iOException);
        }
    }

    public void callStart() {
        q0.b(TAG, "callStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void connectEnd(InetSocketAddress inetSocketAddress) {
        q0.b(TAG, "connectEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void connectFailed(InetSocketAddress inetSocketAddress, IOException iOException) {
        q0.b(TAG, "connectFailed");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void connectStart(InetSocketAddress inetSocketAddress) {
        q0.b(TAG, "connectStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.e();
        }
    }

    public void connectionAcquired() {
        q0.b(TAG, "connectionAcquired");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.f();
        }
    }

    public void connectionReleased() {
        q0.b(TAG, "connectionReleased");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.g();
        }
    }

    public void dnsEnd(String str, List<InetAddress> list) {
        q0.b(TAG, "dnsEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.h();
        }
    }

    public void dnsStart() {
        q0.b(TAG, "dnsStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.i();
        }
    }

    public void markParsingStart() {
        q0.b(TAG, "markParsingStart");
    }

    public void requestBodyEnd(long j10) {
        q0.b(TAG, "requestBodyEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.a(j10);
        }
    }

    public void requestBodyStart() {
        q0.b(TAG, "requestBodyStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.n();
        }
    }

    public void requestHeadersEnd() {
        q0.b(TAG, "requestHeadersEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.o();
        }
    }

    public void requestHeadersStart() {
        q0.b(TAG, "requestHeadersStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.p();
        }
    }

    public void responseBodyEnd(long j10) {
        q0.b(TAG, "responseBodyEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.b(j10);
        }
    }

    public void responseBodyStart() {
        q0.b(TAG, "responseBodyStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.q();
        }
    }

    public void responseHeadersEnd() {
        q0.b(TAG, "responseHeadersEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.r();
        }
    }

    public void responseHeadersStart() {
        q0.b(TAG, "responseHeadersStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.s();
        }
    }

    public void secureConnectEnd() {
        q0.b(TAG, "secureConnectEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.t();
        }
    }

    public void secureConnectStart() {
        q0.b(TAG, "secureConnectStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.u();
        }
    }

    public void markParsingEnd() {
        q0.b(Lykgign.scFpaH, "markParsingEnd");
    }
}
