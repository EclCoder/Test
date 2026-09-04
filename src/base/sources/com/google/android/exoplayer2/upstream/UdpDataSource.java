package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import nb.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class UdpDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f18771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f18772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f18773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f18774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f18775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f18776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18778m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    public int c() {
        DatagramSocket datagramSocket = this.f18774i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // nb.j
    public void close() {
        this.f18773h = null;
        MulticastSocket multicastSocket = this.f18775j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) ob.a.e(this.f18776k));
            } catch (IOException unused) {
            }
            this.f18775j = null;
        }
        DatagramSocket datagramSocket = this.f18774i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f18774i = null;
        }
        this.f18776k = null;
        this.f18778m = 0;
        if (this.f18777l) {
            this.f18777l = false;
            j();
        }
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f18773h;
    }

    @Override // nb.j
    public long h(a aVar) throws UdpDataSourceException {
        Uri uri = aVar.f18779a;
        this.f18773h = uri;
        String str = (String) ob.a.e(uri.getHost());
        int port = this.f18773h.getPort();
        k(aVar);
        try {
            this.f18776k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f18776k, port);
            if (this.f18776k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f18775j = multicastSocket;
                multicastSocket.joinGroup(this.f18776k);
                this.f18774i = this.f18775j;
            } else {
                this.f18774i = new DatagramSocket(inetSocketAddress);
            }
            this.f18774i.setSoTimeout(this.f18770e);
            this.f18777l = true;
            l(aVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f18778m == 0) {
            try {
                ((DatagramSocket) ob.a.e(this.f18774i)).receive(this.f18772g);
                int length = this.f18772g.getLength();
                this.f18778m = length;
                i(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f18772g.getLength();
        int i12 = this.f18778m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f18771f, length2 - i12, bArr, i10, iMin);
        this.f18778m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f18770e = i11;
        byte[] bArr = new byte[i10];
        this.f18771f = bArr;
        this.f18772g = new DatagramPacket(bArr, 0, i10);
    }
}
