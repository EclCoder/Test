package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5 {
    public static byte[] A0G;
    public static String[] A0H = {"pVyOFxmsQ66MTtm1tfRFfgviAXYtJVde", "2uUwIcomsi7SFa7PXkK2f37odc1wLlYz", "QkwYj4Lqiyfn1sjUd74ET1yWKOC2yQQp", "dFCgemChCTNfDzsLBkcDawIxAoCNtdjt", "sEgyiM3VxaELP8J5ElL8PsjgrXzRWZa", "oraRcW9NweHiYSV9WAd4vPrbGQ1KpHw2", "RucdtTHsidUdQvrsj3emf0t2ky4JUHkt", "bkvUCljONwekC27QIXEAtZgyfnOfNHe"};
    public static final Requirements A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public CX A05;
    public List<C1160Bk> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final C2 A0C;
    public final InterfaceC2614nw A0D;
    public final CT A0E;
    public final CopyOnWriteArraySet<C4> A0F;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0H[0].charAt(31) != 'e') {
                throw new RuntimeException();
            }
            A0H[1] = "Q4q55Cq4Bi7IKuCSPoembBRK5ZQkCbyv";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE);
            i13++;
        }
    }

    public static void A03() {
        A0G = new byte[]{34, 31, 8, 55, 11, 6, 30, 2, 21, 93, 35, 8, 16, 9, 11, 8, 6, 3, 42, 6, 9, 6, 0, 2, 21};
    }

    static {
        A03();
        A0I = new Requirements(1);
    }

    public C5(Context context, C5O c5o, MP mp2, C5Y c5y, Executor executor) {
        this(context, new C9w(c5o), new C2620o3(new C2414kT().A06(mp2).A05(c5y), executor));
    }

    public C5(Context context, InterfaceC2614nw interfaceC2614nw, CJ cj2) {
        this.A0A = context.getApplicationContext();
        this.A0D = interfaceC2614nw;
        this.A01 = 3;
        this.A02 = 5;
        this.A07 = true;
        this.A06 = Collections.emptyList();
        this.A0F = new CopyOnWriteArraySet<>();
        Handler handlerA0b = C5C.A0b(new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.By
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A0B(message);
            }
        });
        this.A0B = handlerA0b;
        HandlerThread handlerThread = new HandlerThread(A01(0, 25, 28));
        handlerThread.start();
        this.A0C = new C2(handlerThread, interfaceC2614nw, cj2, handlerA0b, this.A01, this.A02, this.A07);
        CT requirementsListener = new CT() { // from class: com.facebook.ads.redexgen.X.o2
            @Override // com.facebook.ads.redexgen.core.CT
            public final void AFh(CX cx, int i10) {
                this.A00.A07(cx, i10);
            }
        };
        this.A0E = requirementsListener;
        this.A05 = new CX(context, requirementsListener, A0I);
        this.A03 = this.A05.A09();
        this.A04 = 1;
        this.A0C.obtainMessage(0, this.A03, 0).sendToTarget();
    }

    public static C1160Bk A00(C1160Bk c1160Bk, DownloadRequest downloadRequest, int i10, long j10) {
        long j11;
        int i11;
        int i12 = c1160Bk.A02;
        if (i12 == 5 || c1160Bk.A02()) {
            j11 = j10;
        } else {
            j11 = c1160Bk.A05;
        }
        if (i12 == 5 || i12 == 7) {
            i11 = 7;
        } else if (i10 != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return new C1160Bk(c1160Bk.A07.A02(downloadRequest), i11, j11, j10, -1L, i10, 0);
    }

    private void A02() {
        Iterator<C4> it = this.A0F.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0H[2].charAt(11) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[4] = "SmTtusU6hPZNCMRD5EytmTKQlQAuGgF";
            strArr[7] = "GYCdxmdyxLWQsNM7s6qdd5Bkhe8SJ7C";
            if (zHasNext) {
                C4 listener = it.next();
                listener.AGf(this, this.A09);
            } else {
                return;
            }
        }
    }

    private void A04(int i10, int i11) {
        this.A04 -= i10;
        this.A00 = i11;
        if (A0I()) {
            Iterator<C4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().AE6(this);
            }
        }
    }

    private void A05(C0 c10) {
        this.A06 = Collections.unmodifiableList(c10.A02);
        C1160Bk c1160Bk = c10.A00;
        boolean zA0A = A0A();
        if (c10.A03) {
            Iterator<C4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().ADi(this, c1160Bk);
            }
        } else {
            Iterator<C4> it2 = this.A0F.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                if (A0H[5].charAt(25) == 'r') {
                    throw new RuntimeException();
                }
                A0H[5] = "ysMk9cu0SrkjVTb8eZ5DX1SyqV41ya5j";
                if (!zHasNext) {
                    break;
                } else {
                    it2.next().ADh(this, c1160Bk, c10.A01);
                }
            }
        }
        if (zA0A) {
            A02();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(CX cx, int i10) {
        Requirements requirementsA0A = cx.A0A();
        if (this.A03 != i10) {
            this.A03 = i10;
            this.A04++;
            this.A0C.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zA0A = A0A();
        Iterator<C4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next().AFg(this, requirementsA0A, i10);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A08(List<C1160Bk> list) {
        this.A08 = true;
        this.A06 = Collections.unmodifiableList(list);
        boolean zA0A = A0A();
        Iterator<C4> it = this.A0F.iterator();
        while (waitingForRequirementsChanged) {
            it.next().AEB(this);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A09(boolean z10) {
        if (this.A07 == z10) {
            return;
        }
        this.A07 = z10;
        this.A04++;
        this.A0C.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean zA0A = A0A();
        Iterator<C4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (zA0A) {
            A02();
        }
    }

    private boolean A0A() {
        boolean z10 = false;
        boolean waitingForRequirements = this.A07;
        if (!waitingForRequirements && this.A03 != 0) {
            for (int i10 = 0; i10 < this.A06.size(); i10++) {
                if (this.A06.get(i10).A02 == 0) {
                    z10 = true;
                    break;
                }
            }
        }
        boolean waitingForRequirements2 = this.A09;
        boolean z11 = waitingForRequirements2 != z10;
        this.A09 = z10;
        String[] strArr = A0H;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[4] = "HT4e9GATQ3DYWsFwZyJzXpwOkn6HfQP";
        strArr2[7] = "eDZDx6DsGZ1y85uRp2IzKIBDtNa9GCG";
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B(Message message) {
        switch (message.what) {
            case 0:
                A08((List) message.obj);
                return true;
            case 1:
                int i10 = message.arg1;
                int i11 = message.arg2;
                if (A0H[2].charAt(11) == 'k') {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[3] = "sxyw1qPQ7JLPTOY8e9sgs42WDZnpuN2t";
                strArr[6] = "KeBMIxstq15Te8zzUw5dJy9ueqCuctUt";
                A04(i10, i11);
                return true;
            case 2:
                C0 update = (C0) message.obj;
                A05(update);
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final List<C1160Bk> A0D() {
        return this.A06;
    }

    public final void A0E() {
        A09(false);
    }

    public final void A0F(C4 c10) {
        AbstractC09823y.A01(c10);
        this.A0F.add(c10);
    }

    public final void A0G(DownloadRequest downloadRequest) {
        A0H(downloadRequest, 0);
    }

    public final void A0H(DownloadRequest downloadRequest, int i10) {
        this.A04++;
        this.A0C.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
    }

    public final boolean A0I() {
        return this.A00 == 0 && this.A04 == 0;
    }
}
