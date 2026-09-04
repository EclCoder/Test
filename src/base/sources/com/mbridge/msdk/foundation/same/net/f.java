package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile AtomicInteger f30582b = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f30583a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("SocketThreadPool");
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f30585a;

        b(c cVar) {
            this.f30585a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30585a.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static f f30596a = new f(null);
    }

    /* synthetic */ f(a aVar) {
        this();
    }

    public static f b() {
        return d.f30596a;
    }

    private f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f30583a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, UserVerificationMethods.USER_VERIFY_ALL);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    public void a(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar, boolean z11) {
        if (z11) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, "p=" + URLEncoder.encode(v0.b(jSONObject.optString(DataSchemeDataSource.SCHEME_DATA), "ebmclXzZOhtU2sRlZxGL8A"), C.UTF8_NAME));
                str2 = jSONObject.toString();
            } catch (Exception e10) {
                q0.b("SocketManager", "send error", e10);
            }
        }
        this.f30583a.execute(new b(new c(str, i10, str2, z10, bVar)));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ByteBuffer f30587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f30588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f30589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.b f30590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private OutputStream f30591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f30592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Socket f30593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f30594h;

        c(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.f30588b = str;
            this.f30592f = i10;
            this.f30594h = str2;
            this.f30589c = z10;
            this.f30590d = bVar;
        }

        public void a() {
            int length;
            try {
                Socket socket = new Socket(this.f30588b, this.f30592f);
                this.f30593g = socket;
                socket.setSoTimeout(15000);
                boolean z10 = this.f30588b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30627j) || this.f30588b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f30629l);
                q0.b("SocketManager", "Socket connect : " + this.f30588b + " : " + this.f30592f + " isAnalytics : " + z10);
                this.f30591e = this.f30593g.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                this.f30587a = byteBufferWrap;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                this.f30587a.put((byte) 2);
                if (TextUtils.isEmpty(this.f30594h)) {
                    this.f30587a.put((byte) 1);
                } else {
                    this.f30587a.put(this.f30589c ? (byte) 3 : (byte) 2);
                }
                this.f30587a.putShort((short) f.f30582b.getAndIncrement());
                if (TextUtils.isEmpty(this.f30594h)) {
                    this.f30587a.putInt(0);
                    this.f30591e.write(this.f30587a.array());
                    length = 0;
                } else {
                    byte[] bArrA = this.f30589c ? f.this.a(this.f30594h) : this.f30594h.getBytes();
                    length = bArrA.length;
                    this.f30587a.putInt(length);
                    this.f30591e.write(this.f30587a.array());
                    this.f30591e.write(bArrA);
                }
                this.f30591e.flush();
                q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f30587a.array()) + " length : " + length);
                InputStream inputStream = this.f30593g.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                this.f30587a = byteBufferWrap2;
                byteBufferWrap2.order(byteOrder);
                int i10 = this.f30587a.getInt(4);
                byte b10 = bArr[1];
                boolean z11 = b10 == 3;
                boolean z12 = b10 == 2;
                q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i10 + " isGzip : " + z11);
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f30593g.getInputStream()).readFully(bArr2);
                if (!z11 && i10 > 2 && ((bArr2[0] << 8) | (bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 8075) {
                    z11 = true;
                }
                com.mbridge.msdk.foundation.same.net.b bVar = this.f30590d;
                if (bVar == null) {
                    Socket socket2 = this.f30593g;
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            this.f30587a = null;
                            this.f30591e.close();
                            return;
                        } catch (IOException e10) {
                            q0.b("SocketManager", e10.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z12 && i10 == 0) {
                    bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(204, null, null)));
                    Socket socket3 = this.f30593g;
                    if (socket3 != null) {
                        try {
                            socket3.close();
                            this.f30587a = null;
                            this.f30591e.close();
                            return;
                        } catch (IOException e11) {
                            q0.b("SocketManager", e11.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i10 < 1) {
                    a("The response data less than 1");
                    Socket socket4 = this.f30593g;
                    if (socket4 != null) {
                        try {
                            socket4.close();
                            this.f30587a = null;
                            this.f30591e.close();
                            return;
                        } catch (IOException e12) {
                            q0.b("SocketManager", e12.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z10) {
                    if (bArr2[0] == 1) {
                        bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                    } else {
                        a("The server returns fail");
                    }
                    Socket socket5 = this.f30593g;
                    if (socket5 != null) {
                        try {
                            socket5.close();
                            this.f30587a = null;
                            this.f30591e.close();
                            return;
                        } catch (IOException e13) {
                            q0.b("SocketManager", e13.getMessage());
                            return;
                        }
                    }
                    return;
                }
                try {
                    String strA = z11 ? f.this.a(bArr2) : new String(bArr2);
                    JSONObject jSONObject = !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null;
                    q0.b("SocketManager", "Socket Response length : " + i10 + " " + strA.length());
                    this.f30590d.onSuccess(e.a(jSONObject, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    q0.b("SocketManager", th2.getMessage());
                    if (TextUtils.isEmpty(message)) {
                        message = "The JSON data is illegal";
                    }
                    a(message);
                }
                inputStream.close();
                Socket socket6 = this.f30593g;
                if (socket6 != null) {
                    try {
                        socket6.close();
                        this.f30587a = null;
                        this.f30591e.close();
                    } catch (IOException e14) {
                        q0.b("SocketManager", e14.getMessage());
                    }
                }
            } catch (Throwable th3) {
                try {
                    String message2 = th3.getMessage();
                    q0.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                } finally {
                    Socket socket7 = this.f30593g;
                    if (socket7 != null) {
                        try {
                            socket7.close();
                            this.f30587a = null;
                            this.f30591e.close();
                        } catch (IOException e15) {
                            q0.b("SocketManager", e15.getMessage());
                        }
                    }
                }
            }
        }

        private void a(String str) {
            if (this.f30590d != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f30590d.onError(new com.mbridge.msdk.foundation.same.net.exception.a(13, new com.mbridge.msdk.foundation.same.net.toolbox.a(404, str.getBytes(), null)));
            }
        }
    }
}
