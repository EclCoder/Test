package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import z1.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends z1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f4723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f4724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f4725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f4726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f4727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f4728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4730m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws UdpDataSourceException {
        Uri uri = gVar.f58544a;
        this.f4725h = uri;
        String str = (String) w1.a.e(uri.getHost());
        int port = this.f4725h.getPort();
        f(gVar);
        try {
            this.f4728k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4728k, port);
            if (this.f4728k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4727j = multicastSocket;
                multicastSocket.joinGroup(this.f4728k);
                this.f4726i = this.f4727j;
            } else {
                this.f4726i = new DatagramSocket(inetSocketAddress);
            }
            this.f4726i.setSoTimeout(this.f4722e);
            this.f4729l = true;
            g(gVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f4725h = null;
        MulticastSocket multicastSocket = this.f4727j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) w1.a.e(this.f4728k));
            } catch (IOException unused) {
            }
            this.f4727j = null;
        }
        DatagramSocket datagramSocket = this.f4726i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4726i = null;
        }
        this.f4728k = null;
        this.f4730m = 0;
        if (this.f4729l) {
            this.f4729l = false;
            e();
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f4725h;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f4730m == 0) {
            try {
                ((DatagramSocket) w1.a.e(this.f4726i)).receive(this.f4724g);
                int length = this.f4724g.getLength();
                this.f4730m = length;
                d(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f4724g.getLength();
        int i12 = this.f4730m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f4723f, length2 - i12, bArr, i10, iMin);
        this.f4730m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f4722e = i11;
        byte[] bArr = new byte[i10];
        this.f4723f = bArr;
        this.f4724g = new DatagramPacket(bArr, 0, i10);
    }
}
