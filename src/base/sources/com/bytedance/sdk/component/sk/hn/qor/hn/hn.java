package com.bytedance.sdk.component.sk.hn.qor.hn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.sk.hn.qor.dkl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private final ImageView.ScaleType aq;
    private final int dkl;
    private final int dse;
    private int gjv;
    private final Bitmap.Config qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12955sk;
    public static final ImageView.ScaleType hnj = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final Bitmap.Config f12954hn = Bitmap.Config.ARGB_4444;
    private final int ojm = 1280;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final int f12956ta = 83886080;

    public hn(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.qor = config;
        this.gjv = i10;
        this.f12955sk = i11;
        this.aq = scaleType;
        this.dkl = i12;
        this.dse = i13;
        hnj(i10, i11);
    }

    private static int hnj(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        double d11 = i11;
        return ((double) i10) * d10 > d11 ? (int) (d11 / d10) : i10;
    }

    static int hnj(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    private float hnj(int i10, int i11, int i12, int i13, int i14) {
        float f10 = i10;
        return Math.max(i13 / (i11 / f10), i14 / (i12 / f10));
    }

    public Bitmap hnj(byte[] bArr, dkl dklVar) {
        Context contextHnj;
        boolean zHn;
        Bitmap bitmapDecodeByteArray;
        if (dklVar != null) {
            contextHnj = dklVar.hnj();
            zHn = dklVar.hn();
        } else {
            contextHnj = null;
            zHn = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.gjv == 0 && this.f12955sk == 0) {
            options.inPreferredConfig = this.qor;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iHnj = hnj(this.gjv, this.f12955sk, i10, i11);
            int iHnj2 = hnj(this.f12955sk, this.gjv, i11, i10);
            options.inJustDecodeBounds = false;
            int iHnj3 = hnj(i10, i11, iHnj, iHnj2, this.dkl, this.dse);
            options.inSampleSize = iHnj3;
            float fHnj = hnj(iHnj3, i10, i11, iHnj, iHnj2);
            boolean z10 = fHnj > 0.0f && fHnj < 1.0f && contextHnj != null && zHn;
            if (z10) {
                options.inScaled = true;
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = Math.round(fHnj * 2.14748365E9f);
            }
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z10 && bitmapDecodeByteArray != null) {
                bitmapDecodeByteArray.setDensity(contextHnj.getResources().getDisplayMetrics().densityDpi);
            }
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iHnj || bitmapDecodeByteArray.getHeight() > iHnj2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iHnj, iHnj2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void hnj(int i10, int i11) {
        if (i10 > 1280 && i11 > 1280) {
            if (i10 > i11) {
                this.gjv = 1280;
                this.f12955sk = (i11 * 1280) / i10;
                return;
            } else {
                this.gjv = (i10 * 1280) / i11;
                this.f12955sk = 1280;
                return;
            }
        }
        if (i10 > 1280) {
            this.gjv = 1280;
            this.f12955sk = (i11 * 1280) / i10;
        } else if (i11 > 1280) {
            this.gjv = (i10 * 1280) / i11;
            this.f12955sk = 1280;
        }
    }
}
