package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LM extends AsyncTask<String, Void, Bitmap[]> implements T4 {
    public static byte[] A0A;
    public static String[] A0B = {"", "", "tk2ciTRcvMIsX7PNNAsbqXfz4cjsZNd3", "5z01THRYCfHu8Ay0wH5meUoLhFHMZyns", "VYXg8wObxMc7BeMRrzz5UEer", "1KBjMNFbEleLBxdQS2J3kw1LUfJ9GnIf", "PvEnCL5gthOso5MBRjJGXOGrZMhqPY73", "dw8jODS3DySi5ymezTFU6bMU1A3tjNXQ"};
    public int A00;
    public int A01;
    public InterfaceC1854b8 A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<C1851b5> A06;
    public final WeakReference<C2198gi> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{45, 47, 36, 47, 56, 35, 41};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Bitmap[] A03(String... strArr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        if (A0B[2].charAt(8) == 'z') {
            throw new RuntimeException();
        }
        A0B[2] = "Jzd8uX0XYQJZtrGuhrAJ2cBOXObB1Sdn";
        try {
            String str = strArr[0];
            Bitmap bitmapA0O = null;
            Bitmap bitmapA01 = null;
            C2198gi c2198gi = this.A07.get();
            String[] strArr2 = A0B;
            if (strArr2[6].charAt(7) == strArr2[5].charAt(7)) {
                throw new RuntimeException();
            }
            A0B[2] = "bv0UYUwFwYp94NQ105UqaFrunwxSHAuK";
            if (c2198gi == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmapA0O = new C1604Sx(c2198gi).A0O(str, this.A00, this.A01);
                if (bitmapA0O != null && !this.A03) {
                    bitmapA01 = YL.A01(c2198gi, bitmapA0O, this.A04, this.A05);
                }
            } catch (Throwable th2) {
                c2198gi.A08().ABC(A00(0, 7, 30), AbstractC1610Td.A1V, new C1611Te(th2));
            }
            return new Bitmap[]{bitmapA0O, bitmapA01};
        } catch (Throwable th3) {
            WU.A00(th3, this);
            String[] strArr3 = A0B;
            if (strArr3[7].charAt(9) == strArr3[3].charAt(9)) {
                return null;
            }
            A0B[2] = "caPrFgLZt2WaPlUZLvOtKYt7S4BN2jGU";
            return null;
        }
    }

    static {
        A01();
    }

    public LM(ViewGroup viewGroup, int i10, int i11, C2198gi c2198gi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c2198gi);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public LM(ViewGroup viewGroup, C2198gi c2198gi) {
        this(viewGroup, 12, 16, c2198gi);
    }

    public LM(ImageView imageView, C2198gi c2198gi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c2198gi);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public LM(C1851b5 c1851b5, C2198gi c2198gi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c2198gi);
        this.A06 = new WeakReference<>(c1851b5);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] bitmapArr) throws Throwable {
        C1851b5 c1851b5;
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (bitmapArr[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(bitmapArr[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(bitmapArr[0]);
                }
            }
            if (this.A06 != null && (c1851b5 = this.A06.get()) != null) {
                c1851b5.setImage(bitmapArr[0], bitmapArr[1]);
            }
            if (this.A09 != null && this.A09.get() != null && bitmapArr[1] != null) {
                YB.A0V(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), bitmapArr[1]));
            }
            if (this.A02 != null) {
                this.A02.AE7(new C1853b7(bitmapArr[0]));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    public final LM A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final LM A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final LM A06(InterfaceC1854b8 interfaceC1854b8) {
        this.A02 = interfaceC1854b8;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.A02 != null) {
                this.A02.AE7(new C1853b7(null));
                return;
            }
            return;
        }
        executeOnExecutor(YG.A06, str);
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final C2198gi A6m() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
