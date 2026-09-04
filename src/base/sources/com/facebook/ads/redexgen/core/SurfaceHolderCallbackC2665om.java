package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SurfaceHolderCallbackC2665om implements GQ, InterfaceC11028p, ES, InterfaceC1155Bf, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ AA A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final /* synthetic */ void AD4(C2758qI c2758qI, C6L c6l) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final /* synthetic */ void AD5(long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final /* synthetic */ void AD6(Exception exc) {
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final /* synthetic */ void ADU(int i10, long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final /* synthetic */ void AFy(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final /* synthetic */ void AGV(C2758qI c2758qI, C6L c6l) {
    }

    public SurfaceHolderCallbackC2665om(AA aa2) {
        this.A00 = aa2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final void AD0(String str, long j10, long j11) {
        Iterator it = this.A00.A0H.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (zHasNext) {
                ((InterfaceC11028p) it.next()).AD0(str, j10, j11);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final void AD1(C6I c6i) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC11028p) it.next()).AD1(c6i);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final void AD2(C6I c6i) {
        this.A00.A09 = c6i;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC11028p) it.next()).AD2(c6i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final void AD3(C2758qI c2758qI) {
        this.A00.A07 = c2758qI;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC11028p) it.next()).AD3(c2758qI);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11028p
    public final void AD9(int i10, long j10, long j11) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC11028p) it.next()).AD9(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ES
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADZ(C2706pR c2706pR) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((C3U) it.next()).ADZ(c2706pR);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ES
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADa(List<C2708pT> list) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((C3U) it.next()).ADa(list);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void ADl(int i10, long j10) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((GQ) it.next()).ADl(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1155Bf
    public final void AEt(Metadata metadata, long j10) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((InterfaceC1155Bf) it.next()).AEt(metadata, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AFf(Object obj, long j10) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((GQ) it2.next()).AFf(obj, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGN(String str, long j10, long j11) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((GQ) it.next()).AGN(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGO(C6I c6i) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((GQ) it.next()).AGO(c6i);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGP(C6I c6i) {
        this.A00.A0A = c6i;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (zHasNext) {
                ((GQ) it.next()).AGP(c6i);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGU(C2758qI c2758qI) {
        this.A00.A08 = c2758qI;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (zHasNext) {
                ((GQ) it.next()).AGU(c2758qI);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGb(C2711pW c2711pW) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((C5L) it.next()).AGa(c2711pW.A03, c2711pW.A01, c2711pW.A02, c2711pW.A00);
        }
        for (GQ gq : this.A00.A0K) {
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            gq.AGb(c2711pW);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
