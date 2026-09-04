package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09171h extends AQ {
    public int A00;
    public Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public MulticastSocket A04;
    public boolean A05;
    public final int A06;
    public final DatagramPacket A07;
    public final byte[] A08;

    public C09171h() {
        this(2000);
    }

    public C09171h(int i10) {
        this(i10, 8000);
    }

    public C09171h(int i10, int i11) {
        super(true);
        this.A06 = i11;
        this.A08 = new byte[i10];
        this.A07 = new DatagramPacket(this.A08, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final Uri A9P() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final long AGi(C10185i c10185i) throws C2680p1 {
        this.A01 = c10185i.A06;
        String str = (String) AbstractC09823y.A01(this.A01.getHost());
        int port = this.A01.getPort();
        A0G(c10185i);
        try {
            this.A03 = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.A03, port);
            if (this.A03.isMulticastAddress()) {
                this.A04 = new MulticastSocket(inetSocketAddress);
                this.A04.joinGroup(this.A03);
                this.A02 = this.A04;
            } else {
                this.A02 = new DatagramSocket(inetSocketAddress);
            }
            this.A02.setSoTimeout(this.A06);
            this.A05 = true;
            A0H(c10185i);
            return -1L;
        } catch (IOException e10) {
            throw new C2680p1(e10, 2001);
        } catch (SecurityException e11) {
            throw new C2680p1(e11, 2006);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
    public final void close() {
        this.A01 = null;
        if (this.A04 != null) {
            try {
                this.A04.leaveGroup((InetAddress) AbstractC09823y.A01(this.A03));
            } catch (IOException unused) {
            }
            this.A04 = null;
        }
        if (this.A02 != null) {
            this.A02.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            A0E();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09382c
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                ((DatagramSocket) AbstractC09823y.A01(this.A02)).receive(this.A07);
                this.A00 = this.A07.getLength();
                A0F(this.A00);
            } catch (SocketTimeoutException e10) {
                throw new C2680p1(e10, 2002);
            } catch (IOException e11) {
                throw new C2680p1(e11, 2001);
            }
        }
        int length = this.A07.getLength() - this.A00;
        int packetOffset = this.A00;
        int bytesToRead = Math.min(packetOffset, i11);
        System.arraycopy(this.A08, length, bArr, i10, bytesToRead);
        int packetOffset2 = this.A00;
        this.A00 = packetOffset2 - bytesToRead;
        return bytesToRead;
    }
}
