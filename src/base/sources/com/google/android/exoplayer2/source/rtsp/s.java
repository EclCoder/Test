package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f18082g = sc.e.f52294c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f18083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Loader f18084b = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f18085c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f18086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f18087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f18088f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void f(byte[] bArr);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f18090a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18091b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f18092c;

        private com.google.common.collect.c0 a(byte[] bArr) {
            ob.a.g(this.f18091b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f18090a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, s.f18082g) : new String(bArr, 0, bArr.length - 2, s.f18082g));
            com.google.common.collect.c0 c0VarX = com.google.common.collect.c0.x(this.f18090a);
            e();
            return c0VarX;
        }

        private com.google.common.collect.c0 b(byte[] bArr) throws ParserException {
            ob.a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, s.f18082g);
            this.f18090a.add(str);
            int i10 = this.f18091b;
            if (i10 == 1) {
                if (!u.f(str)) {
                    return null;
                }
                this.f18091b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long jG = u.g(str);
            if (jG != -1) {
                this.f18092c = jG;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f18092c > 0) {
                this.f18091b = 3;
                return null;
            }
            com.google.common.collect.c0 c0VarX = com.google.common.collect.c0.x(this.f18090a);
            e();
            return c0VarX;
        }

        private static byte[] d(byte b10, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b10, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b11 = dataInputStream.readByte();
                bArr[1] = b11;
                byteArrayOutputStream.write(b11);
            }
        }

        private void e() {
            this.f18090a.clear();
            this.f18091b = 1;
            this.f18092c = 0L;
        }

        public com.google.common.collect.c0 c(byte b10, DataInputStream dataInputStream) throws IOException {
            com.google.common.collect.c0 c0VarB = b(d(b10, dataInputStream));
            while (c0VarB == null) {
                if (this.f18091b == 3) {
                    long j10 = this.f18092c;
                    if (j10 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iD = com.google.common.primitives.g.d(j10);
                    ob.a.g(iD != -1);
                    byte[] bArr = new byte[iD];
                    dataInputStream.readFully(bArr, 0, iD);
                    c0VarB = a(bArr);
                } else {
                    c0VarB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return c0VarB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class f implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DataInputStream f18093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f18094b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f18095c;

        public f(InputStream inputStream) {
            this.f18093a = new DataInputStream(inputStream);
        }

        private void a() throws IOException {
            int unsignedByte = this.f18093a.readUnsignedByte();
            int unsignedShort = this.f18093a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f18093a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) s.this.f18085c.get(Integer.valueOf(unsignedByte));
            if (bVar == null || s.this.f18088f) {
                return;
            }
            bVar.f(bArr);
        }

        private void b(byte b10) {
            if (s.this.f18088f) {
                return;
            }
            s.this.f18083a.c(this.f18094b.c(b10, this.f18093a));
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
            this.f18095c = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            while (!this.f18095c) {
                byte b10 = this.f18093a.readByte();
                if (b10 == 36) {
                    a();
                } else {
                    b(b10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class g implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f18097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f18098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f18099c;

        public g(OutputStream outputStream) {
            this.f18097a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f18098b = handlerThread;
            handlerThread.start();
            this.f18099c = new Handler(handlerThread.getLooper());
        }

        public static /* synthetic */ void a(g gVar, byte[] bArr, List list) {
            gVar.getClass();
            try {
                gVar.f18097a.write(bArr);
            } catch (Exception e10) {
                if (s.this.f18088f) {
                    return;
                }
                s.this.f18083a.b(list, e10);
            }
        }

        public void c(final List list) {
            final byte[] bArrB = u.b(list);
            this.f18099c.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.t
                @Override // java.lang.Runnable
                public final void run() {
                    s.g.a(this.f18101a, bArrB, list);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f18099c;
            final HandlerThread handlerThread = this.f18098b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: ya.c
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f18098b.join();
            } catch (InterruptedException unused) {
                this.f18098b.interrupt();
            }
        }
    }

    public s(d dVar) {
        this.f18083a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f18088f) {
            return;
        }
        try {
            g gVar = this.f18086d;
            if (gVar != null) {
                gVar.close();
            }
            this.f18084b.k();
            Socket socket = this.f18087e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f18088f = true;
        }
    }

    public void h(Socket socket) {
        this.f18087e = socket;
        this.f18086d = new g(socket.getOutputStream());
        this.f18084b.m(new f(socket.getInputStream()), new c(), 0);
    }

    public void i(int i10, b bVar) {
        this.f18085c.put(Integer.valueOf(i10), bVar);
    }

    public void j(List list) {
        ob.a.i(this.f18086d);
        this.f18086d.c(list);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void c(List list);

        default void a(Exception exc) {
        }

        default void b(List list, Exception exc) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements Loader.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c n(f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!s.this.f18088f) {
                s.this.f18083a.a(iOException);
            }
            return Loader.f18745f;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(f fVar, long j10, long j11) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(f fVar, long j10, long j11, boolean z10) {
        }
    }
}
