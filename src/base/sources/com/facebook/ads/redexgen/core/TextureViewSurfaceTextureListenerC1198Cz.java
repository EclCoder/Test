package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class TextureViewSurfaceTextureListenerC1198Cz extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC2122fU, InterfaceC2138fk, InterfaceC2124fW {
    public static byte[] A0O;
    public static String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C2198gi A0A;
    public EnumC2085et A0B;
    public C2125fX A0C;
    public EnumC2140fm A0D;
    public EnumC2140fm A0E;
    public InterfaceC2141fn A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-56, -11, -11, -14, -11, -93, -20, -15, -93, -56, -5, -14, -45, -17, -28, -4, -24, -11, -93, -25, -8, -24, -93, -9, -14, -93, -14, -15, -42, -8, -11, -23, -28, -26, -24, -41, -24, -5, -9, -8, -11, -24, -57, -24, -10, -9, -11, -14, -4, -24, -25, -93, -25, -8, -11, -20, -15, -22, -93, -10, -24, -9, -39, -20, -25, -24, -14, -42, -8, -11, -23, -28, -26, -24, -93, -24, 27, 18, -13, 15, 4, 28, 8, 21, -61, 8, 21, 21, 18, 21, -61, 23, 21, 12, 10, 10, 8, 21, 8, 7, -61, 5, 28, -61, 18, 17, -10, 24, 21, 9, 4, 6, 8, -9, 8, 27, 23, 24, 21, 8, -25, 8, 22, 23, 21, 18, 28, 8, 7, -61, 7, 24, 21, 12, 17, 10, -61, 19, 4, 24, 22, 8, -61, -26, 14, 14, 6, 11, 4, -65, 0, 11, 22, 0, 24, 18, -65, 19, 7, 17, 14, 22, -65, 0, 13, -65, 4, 23, 2, 4, 15, 19, 8, 14, 13, -65, 22, 8, 19, 7, -65, 18, 4, 19, -31, 0, 2, 10, 6, 17, 14, 20, 13, 3, -29, 17, 0, 22, 0, 1, 11, 4, -65, 14, 13, -65, -19, 14, 20, 6, 0, 19, -65, 0, 1, 14, 21, 4, -51, -65, 18, 14, -65, 22, 4, -65, 18, 8, 11, 4, 13, 19, 11, 24, -65, 8, 6, 13, 14, 17, 4, -65, 8, 19, -51, -92, -52, -52, -60, -55, -62, 125, -66, -55, -44, -66, -42, -48, 125, -47, -59, -49, -52, -44, 125, -66, -53, 125, -62, -43, -64, -62, -51, -47, -58, -52, -53, 125, -44, -58, -47, -59, 125, -48, -62, -47, -93, -52, -49, -62, -60, -49, -52, -46, -53, -63, 125, -52, -53, 125, -85, -52, -46, -60, -66, -47, 125, -66, -65, -52, -45, -62, -117, 125, -48, -52, 125, -44, -62, 125, -48, -58, -55, -62, -53, -47, -55, -42, 125, -58, -60, -53, -52, -49, -62, 125, -58, -47, -117, -62, -43, -48, -47, -37, -116, -33, -32, -51, -32, -47, -116, -49, -44, -51, -38, -45, -47, -48, -116, -32, -37, -116, -25, -27, -18, -27, -14, -23, -29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C1648Up.A20(this.A0A)) {
            EnumC2140fm enumC2140fm = this.A0D;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (enumC2140fm == EnumC2140fm.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AIz();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.ADy(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureViewSurfaceTextureListenerC1198Cz.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC1198Cz(C2198gi c2198gi) {
        super(c2198gi);
        this.A0D = EnumC2140fm.A04;
        this.A0E = EnumC2140fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC2085et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c2198gi;
    }

    public TextureViewSurfaceTextureListenerC1198Cz(C2198gi c2198gi, AttributeSet attributeSet) {
        super(c2198gi, attributeSet);
        this.A0D = EnumC2140fm.A04;
        this.A0E = EnumC2140fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC2085et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c2198gi;
    }

    public TextureViewSurfaceTextureListenerC1198Cz(C2198gi c2198gi, AttributeSet attributeSet, int i10) {
        super(c2198gi, attributeSet, i10);
        this.A0D = EnumC2140fm.A04;
        this.A0E = EnumC2140fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC2085et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c2198gi;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    private void A04() {
        this.A0C = new C2125fX(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity activityA0E = this.A0A.A0E();
            if (activityA0E != null) {
                this.A09 = new MediaController(activityA0E);
                this.A09.setAnchorView(this.A08 == null ? this : this.A08);
                this.A09.setMediaPlayer(new C2131fd(this));
                this.A09.setEnabled(true);
            } else if (A0P[5].charAt(4) != 'y') {
                A0P[6] = "TO7k5EC8ZWp6tpojZW";
                this.A09 = null;
            } else {
                String[] strArr = A0P;
                strArr[0] = "fS";
                strArr[1] = "9d";
                this.A09 = null;
            }
        }
        if (this.A0G != null) {
            String str = this.A0G;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[0] = "Pg";
            strArr2[1] = "vu";
            if (str.length() == 0 || this.A0K) {
                this.A0C.A0F(this.A0A.A02(), this.A06);
            }
        } else {
            this.A0C.A0F(this.A0A.A02(), this.A06);
        }
        setVideoState(EnumC2140fm.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        C2123fV videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(EnumC2140fm.A04);
    }

    private void A08(int i10, int i11) {
        if (i10 != this.A03 || i11 != this.A02) {
            this.A03 = i10;
            this.A02 = i11;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C2125fX.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9d();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void A9d() {
        if (!this.A0H) {
            AGr(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final boolean A9q() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final boolean A9r() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final boolean AAc() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2122fU
    public final void AFL(String str, Exception exc) {
        this.A0A.A0F().ACW(str);
        this.A0A.A0F().A3i(1);
        setVideoState(EnumC2140fm.A03);
        this.A0A.A08().ABC(A03(362, 7, 50), AbstractC1610Td.A1N, new C1611Te(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r3 = com.facebook.ads.redexgen.core.EnumC2140fm.A05;
        r2 = com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC1198Cz.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r2[4].length() == r2[7].length()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC1198Cz.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2122fU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFM(boolean r8, int r9) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC1198Cz.AFM(boolean, int):void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2124fW
    public final void AGa(int i10, int i11, int i12, float f10) {
        A08(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void AGr(boolean z10, int i10) {
        this.A0A.A0F().A3e(i10);
        this.A0E = EnumC2140fm.A05;
        this.A0M = z10;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(EnumC2140fm.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void AK1(int i10) {
        this.A0A.A0F().ACX(i10);
        setVideoState(EnumC2140fm.A09);
        AKF(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void AK6(EnumC2085et enumC2085et, int i10) {
        this.A0A.A0F().A3p(i10);
        this.A0M = false;
        this.A0E = EnumC2140fm.A0A;
        this.A0B = enumC2085et;
        if (this.A0C == null) {
            setup(this.A06);
            return;
        }
        if (this.A0D != EnumC2140fm.A07 && this.A0D != EnumC2140fm.A05 && this.A0D != EnumC2140fm.A06) {
            return;
        }
        this.A0C.A0I(true);
        EnumC2140fm enumC2140fm = EnumC2140fm.A0A;
        String[] strArr = A0P;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[0] = "Wi";
        strArr2[1] = "9L";
        setVideoState(enumC2140fm);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void AKF(int i10) {
        this.A0A.A0F().A3r(i10);
        this.A0E = EnumC2140fm.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC2140fm.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public EnumC2085et getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public EnumC2140fm getState() {
        return this.A0D;
    }

    public EnumC2140fm getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C1648Up.A2l(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC2140fm.A03);
            AKF(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == EnumC2140fm.A05 && !this.A0M) {
            AK6(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                try {
                    this.A0C.A0E(null);
                } catch (Exception e10) {
                    this.A0A.A0F().ACW(A03(0, 75, 53) + e10.getMessage());
                }
            }
        }
        if (this.A0D != EnumC2140fm.A05) {
            try {
                AGr(false, 5);
                return true;
            } catch (Exception e11) {
                this.A0A.A0F().ACW(A03(75, 68, 85) + e11.getMessage());
                return true;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0D != EnumC2140fm.A05) {
                if ((this.A0A.A0H().A01() || C1648Up.A25(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.fc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A9d();
                    return;
                }
            }
            return;
        }
        if (this.A0D != EnumC2140fm.A05 || this.A0M) {
            return;
        }
        AK6(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public final void seekTo(int i10) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i10);
        } else {
            this.A05 = i10;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(143, 102, 81));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0H = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC2133ff(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(245, 94, 15));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setFullScreen(boolean z10) {
        this.A0J = z10;
        if (z10 && !this.A0I) {
            setOnTouchListener(new ViewOnTouchListenerC2132fe(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A0C != null && this.A0D != EnumC2140fm.A08 && this.A0D != EnumC2140fm.A04) {
            this.A0C.A0C(f10);
        }
    }

    public void setTestMode(boolean z10) {
        this.A0K = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC2140fm enumC2140fm) {
        if (enumC2140fm != this.A0D) {
            if (this.A0A.A05().AAO()) {
                String str = A03(339, 23, 30) + enumC2140fm;
            }
            this.A0D = enumC2140fm;
            if (this.A0D == EnumC2140fm.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AGd(enumC2140fm);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setVideoStateChangeListener(InterfaceC2141fn interfaceC2141fn) {
        this.A0F = interfaceC2141fn;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2138fk
    public void setup(Uri uri) {
        this.A0A.A0F().A3h();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
