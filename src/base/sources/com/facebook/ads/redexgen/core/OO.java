package com.facebook.ads.redexgen.core;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class OO extends Handler {
    public static byte[] A09;
    public static String[] A0A = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public Messenger A00;
    public InterfaceC1713Xh A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final InterfaceC1424Lt A06;
    public final C2194ge A07;
    public final AbstractRunnableC1685Wc A08;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, -128, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, 12, -3, -18, -16, -8, -18, -12, -14, 12, -10, -5, 0, 1, -18, -7, -7, -14, -15, 12, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public OO(C2194ge c2194ge) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ON(this);
        this.A07 = c2194ge;
        this.A05 = new Messenger(this);
        InterfaceC1428Lx funnelModule = c2194ge.A00(c2194ge);
        if (funnelModule != null) {
            this.A06 = funnelModule.ACM();
        } else {
            this.A06 = new C2418kX();
        }
        this.A08 = new C2298iO(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Messenger messenger) {
        Message messageObtain = Message.obtain((Handler) null, 1);
        messageObtain.replyTo = this.A05;
        messageObtain.setData(OX.A00(this.A07));
        try {
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A07.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(String str, InterfaceC1713Xh interfaceC1713Xh, int i10) {
        if (this.A02) {
            this.A06.AIN(i10);
            this.A01 = interfaceC1713Xh;
            Message messageObtain = Message.obtain((Handler) null, i10);
            messageObtain.replyTo = this.A05;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(A05(88, 15, 88), str);
                messageObtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(messageObtain);
                    return;
                }
                return;
            } catch (RemoteException e10) {
                this.A06.AIO(e10.toString());
                return;
            }
        }
        InterfaceC1424Lt interfaceC1424Lt = this.A06;
        if (A0A[3].charAt(16) != '0') {
            throw new RuntimeException();
        }
        A0A[1] = "UrwnsONYHFKEsBm1tj1C3JCQoMa7O9rm";
        interfaceC1424Lt.AIP();
    }

    public final void A0B(boolean z10) {
        this.A06.AIK();
        this.A02 = OM.A04(this.A07, z10, this.A03);
        if (this.A02) {
            Messenger messenger = this.A00;
            if (A0A[2].length() != 17) {
                throw new RuntimeException();
            }
            A0A[6] = "P62SHD49IwhaYJMd1yj6mhn8O1XS0mYq";
            if (messenger == null) {
                this.A04.postDelayed(this.A08, AbstractC1651Us.A01(this.A07));
                return;
            }
            return;
        }
        U5.A05(this.A07);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                OM.A02(this.A07, message);
                this.A06.AIJ();
                return;
            }
            if (message.what == 20 || message.what == 40 || message.what == 30) {
                this.A06.AIL(message.what);
                if (message.what == 20) {
                    AbstractC1651Us.A07(this.A07);
                }
                String str = A05(0, 33, 15) + message.what;
                U5.A05(this.A07);
                return;
            }
            if (message.what == 4) {
                this.A06.AIM();
                Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z10 = data.getBoolean(A05(33, 30, 0), false);
                    String strA05 = A05(88, 15, 88);
                    if (A0A[3].charAt(16) != '0') {
                        throw new RuntimeException();
                    }
                    A0A[0] = "zzNr3SVv6qtYyPyvWR";
                    if (z10) {
                        this.A01.AF5(data.getString(strA05));
                    } else if (data.getBoolean(A05(63, 25, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE), false)) {
                        this.A01.AF6(data.getString(strA05));
                    }
                }
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
