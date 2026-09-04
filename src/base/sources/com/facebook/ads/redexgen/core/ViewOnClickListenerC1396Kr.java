package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC1396Kr extends AbstractC1883bb implements View.OnClickListener {
    public static byte[] A0E;
    public static String[] A0F = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", "E", "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0G;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C2198gi A05;
    public XO A06;
    public C1402Kx A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final C1877bV A0C;
    public final Map<String, String> A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 28, 38, 18, 41, -27, 18, 23, 24, 38, 28, 26, 33, 93, 91, 77, 90, 75, 84, 81, 75, 83};
    }

    static {
        A04();
        A0G = (int) (XX.A02 * 24.0f);
    }

    public ViewOnClickListenerC1396Kr(C2198gi c2198gi, AbstractC2363jd abstractC2363jd, C1456Na c1456Na, VA va2, InterfaceC1739Yh interfaceC1739Yh, C2143fp c2143fp, Y2 y10, InterfaceC1713Xh interfaceC1713Xh) {
        this(c2198gi, abstractC2363jd.A0w(), c1456Na, abstractC2363jd.A29().A0J().A06(), va2, interfaceC1739Yh, c2143fp, y10, abstractC2363jd.A2A(), interfaceC1713Xh);
        this.A0C.A08(abstractC2363jd);
    }

    public ViewOnClickListenerC1396Kr(C2198gi c2198gi, String str, C1456Na c1456Na, VA va2, InterfaceC1739Yh interfaceC1739Yh, C2143fp c2143fp, Y2 y10, C1462Ng c1462Ng) {
        this(c2198gi, str, c1456Na, false, va2, interfaceC1739Yh, c2143fp, y10, c1462Ng);
    }

    public ViewOnClickListenerC1396Kr(C2198gi c2198gi, String str, C1456Na c1456Na, boolean z10, VA va2, InterfaceC1739Yh interfaceC1739Yh, C2143fp c2143fp, Y2 y10, C1462Ng c1462Ng) {
        super(c2198gi, c1456Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c2198gi;
        this.A0A = z10;
        this.A0C = new C1877bV(c2198gi, str, c2143fp, y10, va2, c1462Ng, interfaceC1739Yh);
        setOnClickListener(this);
        YB.A0G(1001, this);
    }

    public ViewOnClickListenerC1396Kr(C2198gi c2198gi, String str, C1456Na c1456Na, boolean z10, VA va2, InterfaceC1739Yh interfaceC1739Yh, C2143fp c2143fp, Y2 y10, C1462Ng c1462Ng, InterfaceC1713Xh interfaceC1713Xh) {
        super(c2198gi, c1456Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c2198gi;
        this.A0A = z10;
        this.A0C = new C1877bV(c2198gi, str, c2143fp, y10, va2, c1462Ng, interfaceC1739Yh, interfaceC1713Xh);
        setOnClickListener(this);
        YB.A0G(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(YN.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? YM.MESSENGER : YM.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0G, 0, A0G, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            XO xo2 = this.A06;
            if (A0F[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            xo2.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC2363jd abstractC2363jd) {
        return ((long) abstractC2363jd.A25()) > 0 && abstractC2363jd.A23() >= 0;
    }

    public final EnumC1447Mq A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return EnumC1447Mq.A09;
        }
        A03();
        this.A0D.put(A01(0, 12, 6), str);
        this.A0D.put(A01(24, 12, 58), String.valueOf(this.A0B));
        return this.A0C.A05(this.A08, this.A09, this.A0D);
    }

    public final boolean A0F(AbstractC2363jd abstractC2363jd, AbstractC1733Yb abstractC1733Yb) {
        if (this.A06 != null || !A05(abstractC2363jd) || abstractC2363jd.A2D().A02() == null || abstractC2363jd.A2D().A01() == null) {
            return false;
        }
        this.A07 = new C1402Kx(abstractC2363jd.A23(), abstractC2363jd.A25(), abstractC2363jd.A24(), abstractC2363jd.A2D().A02(), abstractC2363jd.A2D().A01(), abstractC1733Yb, this);
        this.A06 = new XO(abstractC2363jd.A25(), this.A07);
        this.A06.A07();
        return true;
    }

    public C1877bV getCtaActionHelper() {
        return this.A0C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A0E(A01(36, 9, 111));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f10 = width - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i10, top, left + i10, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(XS xs) {
        this.A0C.A09(xs);
    }

    public void setCta(C1458Nc c1458Nc, String str, Map<String, String> extraData) {
        setCta(c1458Nc, str, extraData, null);
    }

    public void setCta(C1458Nc c1458Nc, String str, Map<String, String> extraData, InterfaceC1713Xh interfaceC1713Xh, InterfaceC1876bU interfaceC1876bU) {
        setCta(c1458Nc, str, extraData, interfaceC1876bU);
        this.A0C.A0A(interfaceC1713Xh);
    }

    public void setCta(C1458Nc c1458Nc, String str, Map<String, String> extraData, InterfaceC1876bU interfaceC1876bU) {
        this.A08 = str;
        this.A09 = c1458Nc.A05();
        this.A0D.putAll(extraData);
        this.A0C.A0B(interfaceC1876bU);
        String strA04 = c1458Nc.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A0C.A0C(z10);
    }

    public void setV2Design(boolean z10) {
        this.A0B = z10;
    }
}
