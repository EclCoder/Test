package ob;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.Loader;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f48380a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f48381b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f48382c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f48383d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f48384e = "time.android.com";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();

        void b(IOException iOException);
    }

    private static void g(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long h() {
        long j10;
        synchronized (f48381b) {
            try {
                j10 = f48382c ? f48383d : C.TIME_UNSET;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f48381b) {
            str = f48384e;
        }
        return str;
    }

    public static void j(Loader loader, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.m(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f48381b) {
            z10 = f48382c;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long l() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b10 = bArr[0];
            int i10 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            long jN = n(bArr, 24);
            long jN2 = n(bArr, 32);
            long jN3 = n(bArr, 40);
            g((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, jN3);
            long j11 = (j10 + (((jN2 - jN) + (jN3 - j10)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static long m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long n(byte[] bArr, int i10) {
        long jM = m(bArr, i10);
        long jM2 = m(bArr, i10 + 4);
        if (jM == 0 && jM2 == 0) {
            return 0L;
        }
        return ((jM - 2208988800L) * 1000) + ((jM2 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        bArr[i10] = (byte) (j13 >> 24);
        bArr[i10 + 1] = (byte) (j13 >> 16);
        bArr[i10 + 2] = (byte) (j13 >> 8);
        bArr[i10 + 3] = (byte) j13;
        long j14 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j14 >> 24);
        bArr[i10 + 5] = (byte) (j14 >> 16);
        bArr[i10 + 6] = (byte) (j14 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements Loader.e {
        private d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() {
            synchronized (h0.f48380a) {
                synchronized (h0.f48381b) {
                    if (h0.f48382c) {
                        return;
                    }
                    long jL = h0.l();
                    synchronized (h0.f48381b) {
                        long unused = h0.f48383d = jL;
                        boolean unused2 = h0.f48382c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Loader.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f48385a;

        public c(b bVar) {
            this.f48385a = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void i(Loader.e eVar, long j10, long j11) {
            if (this.f48385a != null) {
                if (h0.k()) {
                    this.f48385a.a();
                } else {
                    this.f48385a.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c n(Loader.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f48385a;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return Loader.f18745f;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void e(Loader.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
