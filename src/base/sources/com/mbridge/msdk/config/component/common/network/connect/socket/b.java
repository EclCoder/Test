package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerTCP;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f28672b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28673c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f28674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OutputStream f28675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f28676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f28677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f28678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f28679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f28680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EventListenerTCP f28681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f28683m;

    public b(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f28677g = aVar;
        this.f28679i = aVar3;
        this.f28678h = aVar2;
        this.f28681k = new EventListenerTCP(aVar2.b());
    }

    private void b(String str) throws IOException {
        byte[] bArrA;
        try {
            EventListenerTCP eventListenerTCP = this.f28681k;
            if (eventListenerTCP != null) {
                eventListenerTCP.requestHeadersStart();
            }
            this.f28682l = false;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.put((byte) 2);
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.put((byte) 1);
            } else {
                byteBufferWrap.put(this.f28682l ? (byte) 3 : (byte) 2);
            }
            byteBufferWrap.putShort((short) this.f28672b.getAndIncrement());
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.putInt(0);
                bArrA = null;
            } else {
                bArrA = this.f28682l ? a(str) : str.getBytes();
                byteBufferWrap.putInt(bArrA != null ? bArrA.length : 0);
            }
            this.f28675e.write(byteBufferWrap.array());
            EventListenerTCP eventListenerTCP2 = this.f28681k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.requestHeadersEnd();
            }
            if (bArrA != null) {
                EventListenerTCP eventListenerTCP3 = this.f28681k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.requestBodyStart();
                }
                this.f28675e.write(bArrA);
                EventListenerTCP eventListenerTCP4 = this.f28681k;
                if (eventListenerTCP4 != null) {
                    eventListenerTCP4.requestBodyEnd(bArrA.length);
                }
            }
            this.f28675e.flush();
        } catch (IOException e10) {
            q0.b("JavaSocketConnection", "Failed to send request: " + e10.getMessage());
            throw new IOException("Failed to send request: " + e10.getMessage(), e10);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a d() {
        try {
            JSONObject jSONObjectG = g();
            f();
            b(jSONObjectG.toString());
            return i();
        } catch (ConnectException e10) {
            return a(1002, 1002, "Connection refused: " + e10.getMessage());
        } catch (SocketTimeoutException e11) {
            return a(1001, 1001, "Connection timeout: " + e11.getMessage());
        } catch (UnknownHostException e12) {
            return a(2001, 2001, "Host unreachable: " + e12.getMessage());
        } catch (IOException e13) {
            return a(2003, 2003, "Network error: " + e13.getMessage());
        } catch (Exception e14) {
            return a(1999, 1999, "Unknown error: " + e14.getMessage());
        }
    }

    private void f() {
        try {
            try {
                try {
                    try {
                        EventListenerTCP eventListenerTCP = this.f28681k;
                        if (eventListenerTCP != null) {
                            eventListenerTCP.dnsStart();
                        }
                        this.f28674d = new Socket();
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f28671a, this.f28677g.j());
                        if (inetSocketAddress.isUnresolved()) {
                            throw new IOException("Cannot resolve host: " + this.f28671a);
                        }
                        EventListenerTCP eventListenerTCP2 = this.f28681k;
                        if (eventListenerTCP2 != null) {
                            eventListenerTCP2.dnsEnd(this.f28671a, Arrays.asList(inetSocketAddress.getAddress()));
                        }
                        this.f28674d.setSoTimeout(30000);
                        EventListenerTCP eventListenerTCP3 = this.f28681k;
                        if (eventListenerTCP3 != null) {
                            eventListenerTCP3.connectStart(inetSocketAddress);
                        }
                        this.f28674d.connect(inetSocketAddress, 30000);
                        EventListenerTCP eventListenerTCP4 = this.f28681k;
                        if (eventListenerTCP4 != null) {
                            eventListenerTCP4.connectEnd(inetSocketAddress);
                        }
                        this.f28675e = this.f28674d.getOutputStream();
                        this.f28676f = this.f28674d.getInputStream();
                        q0.a("JavaSocketConnection", "Socket connected to " + this.f28671a + ":");
                        Socket socket = this.f28674d;
                        if (socket == null || !socket.isConnected()) {
                            b();
                        }
                    } catch (ConnectException e10) {
                        EventListenerTCP eventListenerTCP5 = this.f28681k;
                        if (eventListenerTCP5 != null) {
                            eventListenerTCP5.connectFailed(new InetSocketAddress(this.f28671a, this.f28677g.j()), e10);
                        }
                        throw new IOException("Connection refused", e10);
                    }
                } catch (IOException e11) {
                    EventListenerTCP eventListenerTCP6 = this.f28681k;
                    if (eventListenerTCP6 != null) {
                        eventListenerTCP6.connectFailed(new InetSocketAddress(this.f28671a, this.f28677g.j()), e11);
                    }
                    throw new IOException("Connection failed", e11);
                }
            } catch (SocketTimeoutException e12) {
                EventListenerTCP eventListenerTCP7 = this.f28681k;
                if (eventListenerTCP7 != null) {
                    eventListenerTCP7.connectFailed(new InetSocketAddress(this.f28671a, this.f28677g.j()), e12);
                }
                throw new IOException("Connection timeout", e12);
            } catch (UnknownHostException e13) {
                EventListenerTCP eventListenerTCP8 = this.f28681k;
                if (eventListenerTCP8 != null) {
                    eventListenerTCP8.connectFailed(new InetSocketAddress(this.f28671a, this.f28677g.j()), e13);
                }
                throw new IOException("Host unreachable", e13);
            }
        } catch (Throwable th2) {
            Socket socket2 = this.f28674d;
            if (socket2 == null || !socket2.isConnected()) {
                b();
            }
            throw th2;
        }
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f28671a = com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m;
            int iJ = this.f28677g.j();
            Map<String, Object> mapB = this.f28677g.b();
            JSONObject jSONObject2 = new JSONObject();
            if (mapB != null) {
                for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("headers", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("host", this.f28671a);
            jSONObject3.put("port", iJ);
            Map<String, Object> mapA = this.f28677g.a();
            if (mapA != null) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : mapA.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put(DataSchemeDataSource.SCHEME_DATA, jSONObject4);
            }
            jSONObject.put(TtmlNode.TAG_BODY, jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            q0.b("JavaSocketConnection", "Failed to prepare request content: " + e10.getMessage());
            return jSONObject;
        }
    }

    private void h() {
        if (this.f28679i == null) {
            return;
        }
        EventListenerTCP eventListenerTCP = this.f28681k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callEnd();
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(this.f28678h.g())) {
            this.f28679i.b(this.f28678h);
            return;
        }
        if (this.f28678h.g() == 200) {
            this.f28679i.c(this.f28678h);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.f28680j;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.f28680j;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.f28677g.g() > 0) {
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f28683m, this.f28677g, this.f28679i, this.f28678h).c();
        } else {
            this.f28679i.d(this.f28678h);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a i() {
        try {
            EventListenerTCP eventListenerTCP = this.f28681k;
            if (eventListenerTCP != null) {
                eventListenerTCP.responseHeadersStart();
            }
            byte[] bArr = new byte[8];
            if (this.f28676f.read(bArr) != 8) {
                return a(1008, 1008, "Failed to read response header");
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            if (byteBufferWrap.get() != 2) {
                return a(1008, 1008, "Invalid protocol version");
            }
            byte b10 = byteBufferWrap.get();
            byteBufferWrap.getShort();
            int i10 = byteBufferWrap.getInt();
            EventListenerTCP eventListenerTCP2 = this.f28681k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.responseHeadersEnd();
            }
            if (i10 > 0) {
                EventListenerTCP eventListenerTCP3 = this.f28681k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.responseBodyStart();
                }
                boolean z10 = false;
                boolean z11 = b10 == 3;
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f28676f).readFully(bArr2);
                if (i10 > 2) {
                    if (((bArr2[0] << 8) | (bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 8075) {
                        z10 = true;
                    }
                }
                try {
                    this.f28678h.b((z11 && z10) ? a(bArr2) : new String(bArr2));
                    this.f28678h.c(200);
                    this.f28678h.b(1);
                    EventListenerTCP eventListenerTCP4 = this.f28681k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.responseBodyEnd(i10);
                    }
                } catch (Exception e10) {
                    return a(TTAdConstant.IMAGE_MODE_1010, TTAdConstant.IMAGE_MODE_1010, "Failed to process response data: " + e10.getMessage());
                }
            } else {
                this.f28678h.c(200);
                this.f28678h.b(1);
            }
            return this.f28678h;
        } catch (SocketTimeoutException e11) {
            return a(1004, 1004, "Read timeout: " + e11.getMessage());
        } catch (IOException e12) {
            return a(1006, 1006, "Failed to read response: " + e12.getMessage());
        } catch (Exception e13) {
            return a(1999, 1999, "Unknown error while processing response: " + e13.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f28680j = aVar;
    }

    public void c(String str) {
        this.f28683m = str;
    }

    public EventListenerTCP e() {
        return this.f28681k;
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
    }

    private void c() {
        this.f28678h = d();
        if (this.f28673c) {
            a(1999, 1999, "Request cancelled");
        }
        h();
    }

    public void a() {
        this.f28673c = true;
        b();
    }

    private byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private String a(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 > 0) {
                        byteArrayOutputStream.write(bArr2, 0, i10);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toString();
                    }
                }
            } catch (IOException e10) {
                q0.b("JavaSocketConnection", "Failed to decompress GZIP data: " + e10.getMessage());
                throw e10;
            }
        } else {
            return "";
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f28678h.a(str);
        this.f28678h.c(i10);
        this.f28678h.a(i11);
        this.f28678h.b(0);
        EventListenerTCP eventListenerTCP = this.f28681k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callFailed(new IOException(str));
        }
        return this.f28678h;
    }

    private void b() {
        OutputStream outputStream = this.f28675e;
        try {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e10) {
                    q0.b("JavaSocketConnection", "Error closing output stream: " + e10.getMessage());
                }
                this.f28675e = null;
            }
            InputStream inputStream = this.f28676f;
            try {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        q0.b("JavaSocketConnection", "Error closing input stream: " + e11.getMessage());
                    }
                    this.f28676f = null;
                }
                Socket socket = this.f28674d;
                if (socket != null) {
                    try {
                        try {
                            socket.close();
                        } catch (IOException e12) {
                            q0.b("JavaSocketConnection", "Error closing socket: " + e12.getMessage());
                        }
                        this.f28674d = null;
                    } catch (Throwable th2) {
                        this.f28674d = null;
                        throw th2;
                    }
                }
                q0.a("JavaSocketConnection", "All resources closed");
            } catch (Throwable th3) {
                this.f28676f = null;
                throw th3;
            }
        } catch (Throwable th4) {
            this.f28675e = null;
            throw th4;
        }
    }
}
