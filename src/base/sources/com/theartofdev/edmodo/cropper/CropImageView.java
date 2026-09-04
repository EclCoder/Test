package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CropImageView extends FrameLayout {
    private float A;
    private float B;
    private RectF C;
    private int D;
    private boolean E;
    private Uri F;
    private WeakReference G;
    private WeakReference H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f35592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CropOverlayView f35593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f35594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f35595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ProgressBar f35596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f35597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f35598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.theartofdev.edmodo.cropper.e f35599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap f35600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private k f35608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e f35614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Uri f35615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35616y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f35617z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements CropOverlayView.b {
        a() {
        }

        @Override // com.theartofdev.edmodo.cropper.CropOverlayView.b
        public void a(boolean z10) {
            CropImageView.this.i(z10, true);
            CropImageView.b(CropImageView.this);
            CropImageView.c(CropImageView.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f35619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f35620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f35621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f35622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Exception f35623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f35624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Rect f35625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Rect f35626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f35627i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f35628j;

        b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i10, int i11) {
            this.f35619a = bitmap;
            this.f35620b = uri;
            this.f35621c = bitmap2;
            this.f35622d = uri2;
            this.f35623e = exc;
            this.f35624f = fArr;
            this.f35625g = rect;
            this.f35626h = rect2;
            this.f35627i = i10;
            this.f35628j = i11;
        }

        public Bitmap a() {
            return this.f35621c;
        }

        public float[] b() {
            return this.f35624f;
        }

        public Rect c() {
            return this.f35625g;
        }

        public Exception e() {
            return this.f35623e;
        }

        public Uri f() {
            return this.f35620b;
        }

        public int g() {
            return this.f35627i;
        }

        public int i() {
            return this.f35628j;
        }

        public Uri j() {
            return this.f35622d;
        }

        public Rect l() {
            return this.f35626h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        RECTANGLE,
        OVAL
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void a(CropImageView cropImageView, b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface g {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface h {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum j {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum k {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        Bundle bundleExtra;
        super(context, attributeSet);
        this.f35594c = new Matrix();
        this.f35595d = new Matrix();
        this.f35597f = new float[8];
        this.f35598g = new float[8];
        this.f35609r = false;
        this.f35610s = true;
        this.f35611t = true;
        this.f35612u = true;
        this.f35616y = 1;
        this.f35617z = 1.0f;
        com.theartofdev.edmodo.cropper.f fVar = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            fVar = (com.theartofdev.edmodo.cropper.f) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (fVar == null) {
            fVar = new com.theartofdev.edmodo.cropper.f();
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wj.c.f56351u, 0, 0);
                try {
                    int i10 = wj.c.F;
                    fVar.f35741l = typedArrayObtainStyledAttributes.getBoolean(i10, fVar.f35741l);
                    int i11 = wj.c.f56353v;
                    fVar.f35742m = typedArrayObtainStyledAttributes.getInteger(i11, fVar.f35742m);
                    fVar.f35743n = typedArrayObtainStyledAttributes.getInteger(wj.c.f56355w, fVar.f35743n);
                    fVar.f35734e = k.values()[typedArrayObtainStyledAttributes.getInt(wj.c.U, fVar.f35734e.ordinal())];
                    fVar.f35737h = typedArrayObtainStyledAttributes.getBoolean(wj.c.f56357x, fVar.f35737h);
                    fVar.f35738i = typedArrayObtainStyledAttributes.getBoolean(wj.c.S, fVar.f35738i);
                    fVar.f35739j = typedArrayObtainStyledAttributes.getInteger(wj.c.N, fVar.f35739j);
                    fVar.f35730a = c.values()[typedArrayObtainStyledAttributes.getInt(wj.c.V, fVar.f35730a.ordinal())];
                    fVar.f35733d = d.values()[typedArrayObtainStyledAttributes.getInt(wj.c.H, fVar.f35733d.ordinal())];
                    fVar.f35731b = typedArrayObtainStyledAttributes.getDimension(wj.c.Y, fVar.f35731b);
                    fVar.f35732c = typedArrayObtainStyledAttributes.getDimension(wj.c.Z, fVar.f35732c);
                    fVar.f35740k = typedArrayObtainStyledAttributes.getFloat(wj.c.K, fVar.f35740k);
                    fVar.f35744o = typedArrayObtainStyledAttributes.getDimension(wj.c.E, fVar.f35744o);
                    fVar.f35745p = typedArrayObtainStyledAttributes.getInteger(wj.c.D, fVar.f35745p);
                    int i12 = wj.c.C;
                    fVar.f35746q = typedArrayObtainStyledAttributes.getDimension(i12, fVar.f35746q);
                    fVar.f35747r = typedArrayObtainStyledAttributes.getDimension(wj.c.B, fVar.f35747r);
                    fVar.f35748s = typedArrayObtainStyledAttributes.getDimension(wj.c.A, fVar.f35748s);
                    fVar.f35749t = typedArrayObtainStyledAttributes.getInteger(wj.c.f56360z, fVar.f35749t);
                    fVar.f35750u = typedArrayObtainStyledAttributes.getDimension(wj.c.J, fVar.f35750u);
                    fVar.f35751v = typedArrayObtainStyledAttributes.getInteger(wj.c.I, fVar.f35751v);
                    fVar.f35752w = typedArrayObtainStyledAttributes.getInteger(wj.c.f56359y, fVar.f35752w);
                    fVar.f35735f = typedArrayObtainStyledAttributes.getBoolean(wj.c.W, this.f35610s);
                    fVar.f35736g = typedArrayObtainStyledAttributes.getBoolean(wj.c.X, this.f35611t);
                    fVar.f35746q = typedArrayObtainStyledAttributes.getDimension(i12, fVar.f35746q);
                    fVar.f35753x = (int) typedArrayObtainStyledAttributes.getDimension(wj.c.R, fVar.f35753x);
                    fVar.f35754y = (int) typedArrayObtainStyledAttributes.getDimension(wj.c.Q, fVar.f35754y);
                    fVar.f35755z = (int) typedArrayObtainStyledAttributes.getFloat(wj.c.P, fVar.f35755z);
                    fVar.A = (int) typedArrayObtainStyledAttributes.getFloat(wj.c.O, fVar.A);
                    fVar.B = (int) typedArrayObtainStyledAttributes.getFloat(wj.c.M, fVar.B);
                    fVar.C = (int) typedArrayObtainStyledAttributes.getFloat(wj.c.L, fVar.C);
                    int i13 = wj.c.G;
                    fVar.S = typedArrayObtainStyledAttributes.getBoolean(i13, fVar.S);
                    fVar.T = typedArrayObtainStyledAttributes.getBoolean(i13, fVar.T);
                    this.f35609r = typedArrayObtainStyledAttributes.getBoolean(wj.c.T, this.f35609r);
                    if (typedArrayObtainStyledAttributes.hasValue(i11) && typedArrayObtainStyledAttributes.hasValue(i11) && !typedArrayObtainStyledAttributes.hasValue(i10)) {
                        fVar.f35741l = true;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
        }
        fVar.a();
        this.f35608q = fVar.f35734e;
        this.f35612u = fVar.f35737h;
        this.f35613v = fVar.f35739j;
        this.f35610s = fVar.f35735f;
        this.f35611t = fVar.f35736g;
        this.f35603l = fVar.S;
        this.f35604m = fVar.T;
        View viewInflate = LayoutInflater.from(context).inflate(wj.b.f56310a, (ViewGroup) this, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(wj.a.f56309c);
        this.f35592a = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(wj.a.f56307a);
        this.f35593b = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new a());
        cropOverlayView.setInitialAttributeValues(fVar);
        this.f35596e = (ProgressBar) viewInflate.findViewById(wj.a.f56308b);
        u();
    }

    static /* synthetic */ g b(CropImageView cropImageView) {
        cropImageView.getClass();
        return null;
    }

    static /* synthetic */ f c(CropImageView cropImageView) {
        cropImageView.getClass();
        return null;
    }

    private void d(float f10, float f11, boolean z10, boolean z11) {
        if (this.f35600i != null) {
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            this.f35594c.invert(this.f35595d);
            RectF cropWindowRect = this.f35593b.getCropWindowRect();
            this.f35595d.mapRect(cropWindowRect);
            this.f35594c.reset();
            this.f35594c.postTranslate((f10 - this.f35600i.getWidth()) / 2.0f, (f11 - this.f35600i.getHeight()) / 2.0f);
            n();
            int i10 = this.f35602k;
            if (i10 > 0) {
                this.f35594c.postRotate(i10, com.theartofdev.edmodo.cropper.c.q(this.f35597f), com.theartofdev.edmodo.cropper.c.r(this.f35597f));
                n();
            }
            float fMin = Math.min(f10 / com.theartofdev.edmodo.cropper.c.x(this.f35597f), f11 / com.theartofdev.edmodo.cropper.c.t(this.f35597f));
            k kVar = this.f35608q;
            if (kVar == k.FIT_CENTER || ((kVar == k.CENTER_INSIDE && fMin < 1.0f) || (fMin > 1.0f && this.f35612u))) {
                this.f35594c.postScale(fMin, fMin, com.theartofdev.edmodo.cropper.c.q(this.f35597f), com.theartofdev.edmodo.cropper.c.r(this.f35597f));
                n();
            }
            float f12 = this.f35603l ? -this.f35617z : this.f35617z;
            float f13 = this.f35604m ? -this.f35617z : this.f35617z;
            this.f35594c.postScale(f12, f13, com.theartofdev.edmodo.cropper.c.q(this.f35597f), com.theartofdev.edmodo.cropper.c.r(this.f35597f));
            n();
            this.f35594c.mapRect(cropWindowRect);
            if (z10) {
                this.A = f10 > com.theartofdev.edmodo.cropper.c.x(this.f35597f) ? 0.0f : Math.max(Math.min((f10 / 2.0f) - cropWindowRect.centerX(), -com.theartofdev.edmodo.cropper.c.u(this.f35597f)), getWidth() - com.theartofdev.edmodo.cropper.c.v(this.f35597f)) / f12;
                this.B = f11 <= com.theartofdev.edmodo.cropper.c.t(this.f35597f) ? Math.max(Math.min((f11 / 2.0f) - cropWindowRect.centerY(), -com.theartofdev.edmodo.cropper.c.w(this.f35597f)), getHeight() - com.theartofdev.edmodo.cropper.c.p(this.f35597f)) / f13 : 0.0f;
            } else {
                this.A = Math.min(Math.max(this.A * f12, -cropWindowRect.left), (-cropWindowRect.right) + f10) / f12;
                this.B = Math.min(Math.max(this.B * f13, -cropWindowRect.top), (-cropWindowRect.bottom) + f11) / f13;
            }
            this.f35594c.postTranslate(this.A * f12, this.B * f13);
            cropWindowRect.offset(this.A * f12, this.B * f13);
            this.f35593b.setCropWindowRect(cropWindowRect);
            n();
            this.f35593b.invalidate();
            if (z11) {
                this.f35599h.b(this.f35597f, this.f35594c);
                this.f35592a.startAnimation(this.f35599h);
            } else {
                this.f35592a.setImageMatrix(this.f35594c);
            }
            w(false);
        }
    }

    private void e() {
        Bitmap bitmap = this.f35600i;
        if (bitmap != null && (this.f35607p > 0 || this.f35615x != null)) {
            bitmap.recycle();
        }
        this.f35600i = null;
        this.f35607p = 0;
        this.f35615x = null;
        this.f35616y = 1;
        this.f35602k = 0;
        this.f35617z = 1.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.f35594c.reset();
        this.F = null;
        this.f35592a.setImageBitmap(null);
        t();
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 == 1073741824) {
            return i11;
        }
        return i10 == Integer.MIN_VALUE ? Math.min(i12, i11) : i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    public void i(boolean z10, boolean z11) {
        float fMax;
        int width = getWidth();
        int height = getHeight();
        if (this.f35600i == null || width <= 0 || height <= 0) {
            return;
        }
        RectF cropWindowRect = this.f35593b.getCropWindowRect();
        if (z10) {
            if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                d(width, height, false, false);
                return;
            }
            return;
        }
        if (this.f35612u || this.f35617z > 1.0f) {
            if (this.f35617z < this.f35613v) {
                float f10 = width;
                if (cropWindowRect.width() < f10 * 0.5f) {
                    float f11 = height;
                    if (cropWindowRect.height() < 0.5f * f11) {
                        fMax = Math.min(this.f35613v, Math.min(f10 / ((cropWindowRect.width() / this.f35617z) / 0.64f), f11 / ((cropWindowRect.height() / this.f35617z) / 0.64f)));
                    } else {
                        fMax = 0.0f;
                    }
                } else {
                    fMax = 0.0f;
                }
            } else {
                fMax = 0.0f;
            }
            if (this.f35617z > 1.0f) {
                float f12 = width;
                if (cropWindowRect.width() > f12 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                    fMax = Math.max(1.0f, Math.min(f12 / ((cropWindowRect.width() / this.f35617z) / 0.51f), height / ((cropWindowRect.height() / this.f35617z) / 0.51f)));
                }
            }
            float f13 = this.f35612u ? fMax : 1.0f;
            if (f13 <= 0.0f || f13 == this.f35617z) {
                return;
            }
            if (z11) {
                if (this.f35599h == null) {
                    this.f35599h = new com.theartofdev.edmodo.cropper.e(this.f35592a, this.f35593b);
                }
                this.f35599h.c(this.f35597f, this.f35594c);
            }
            this.f35617z = f13;
            d(width, height, true, z11);
        }
    }

    private void n() {
        float[] fArr = this.f35597f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.f35600i.getWidth();
        float[] fArr2 = this.f35597f;
        fArr2[3] = 0.0f;
        fArr2[4] = this.f35600i.getWidth();
        this.f35597f[5] = this.f35600i.getHeight();
        float[] fArr3 = this.f35597f;
        fArr3[6] = 0.0f;
        fArr3[7] = this.f35600i.getHeight();
        this.f35594c.mapPoints(this.f35597f);
        float[] fArr4 = this.f35598g;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f35594c.mapPoints(fArr4);
    }

    private void s(Bitmap bitmap, int i10, Uri uri, int i11, int i12) {
        Bitmap bitmap2 = this.f35600i;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f35592a.clearAnimation();
            e();
            this.f35600i = bitmap;
            this.f35592a.setImageBitmap(bitmap);
            this.f35615x = uri;
            this.f35607p = i10;
            this.f35616y = i11;
            this.f35602k = i12;
            d(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f35593b;
            if (cropOverlayView != null) {
                cropOverlayView.r();
                t();
            }
        }
    }

    private void t() {
        CropOverlayView cropOverlayView = this.f35593b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f35610s || this.f35600i == null) ? 4 : 0);
        }
    }

    private void u() {
        this.f35596e.setVisibility(this.f35611t && ((this.f35600i == null && this.G != null) || this.H != null) ? 0 : 4);
    }

    private void w(boolean z10) {
        if (this.f35600i != null && !z10) {
            this.f35593b.t(getWidth(), getHeight(), (this.f35616y * 100.0f) / com.theartofdev.edmodo.cropper.c.x(this.f35598g), (this.f35616y * 100.0f) / com.theartofdev.edmodo.cropper.c.t(this.f35598g));
        }
        this.f35593b.s(z10 ? null : this.f35597f, getWidth(), getHeight());
    }

    public Bitmap f(int i10, int i11, j jVar) {
        Bitmap bitmap;
        if (this.f35600i == null) {
            return null;
        }
        this.f35592a.clearAnimation();
        j jVar2 = j.NONE;
        int i12 = jVar != jVar2 ? i10 : 0;
        int i13 = jVar != jVar2 ? i11 : 0;
        if (this.f35615x == null || (this.f35616y <= 1 && jVar != j.SAMPLING)) {
            bitmap = com.theartofdev.edmodo.cropper.c.g(this.f35600i, getCropPoints(), this.f35602k, this.f35593b.m(), this.f35593b.getAspectRatioX(), this.f35593b.getAspectRatioY(), this.f35603l, this.f35604m).f35715a;
        } else {
            bitmap = com.theartofdev.edmodo.cropper.c.d(getContext(), this.f35615x, getCropPoints(), this.f35602k, this.f35600i.getWidth() * this.f35616y, this.f35600i.getHeight() * this.f35616y, this.f35593b.m(), this.f35593b.getAspectRatioX(), this.f35593b.getAspectRatioY(), i12, i13, this.f35603l, this.f35604m).f35715a;
        }
        return com.theartofdev.edmodo.cropper.c.y(bitmap, i12, i13, jVar);
    }

    public void g(int i10, int i11, j jVar) {
        if (this.f35614w == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        v(i10, i11, jVar, null, null, 0);
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f35593b.getAspectRatioX()), Integer.valueOf(this.f35593b.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f35593b.getCropWindowRect();
        float[] fArr = new float[8];
        float f10 = cropWindowRect.left;
        fArr[0] = f10;
        float f11 = cropWindowRect.top;
        fArr[1] = f11;
        float f12 = cropWindowRect.right;
        fArr[2] = f12;
        fArr[3] = f11;
        fArr[4] = f12;
        float f13 = cropWindowRect.bottom;
        fArr[5] = f13;
        fArr[6] = f10;
        fArr[7] = f13;
        this.f35594c.invert(this.f35595d);
        this.f35595d.mapPoints(fArr);
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = fArr[i10] * this.f35616y;
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i10 = this.f35616y;
        Bitmap bitmap = this.f35600i;
        if (bitmap == null) {
            return null;
        }
        return com.theartofdev.edmodo.cropper.c.s(getCropPoints(), bitmap.getWidth() * i10, bitmap.getHeight() * i10, this.f35593b.m(), this.f35593b.getAspectRatioX(), this.f35593b.getAspectRatioY());
    }

    public c getCropShape() {
        return this.f35593b.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f35593b;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        return f(0, 0, j.NONE);
    }

    public void getCroppedImageAsync() {
        g(0, 0, j.NONE);
    }

    public d getGuidelines() {
        return this.f35593b.getGuidelines();
    }

    public int getImageResource() {
        return this.f35607p;
    }

    public Uri getImageUri() {
        return this.f35615x;
    }

    public int getMaxZoom() {
        return this.f35613v;
    }

    public int getRotatedDegrees() {
        return this.f35602k;
    }

    public k getScaleType() {
        return this.f35608q;
    }

    public Rect getWholeImageRect() {
        int i10 = this.f35616y;
        Bitmap bitmap = this.f35600i;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    public boolean j() {
        return this.f35612u;
    }

    public boolean k() {
        return this.f35593b.m();
    }

    public boolean l() {
        return this.f35610s;
    }

    public boolean m() {
        return this.f35611t;
    }

    void o(com.theartofdev.edmodo.cropper.a.C0488a c0488a) {
        this.H = null;
        u();
        e eVar = this.f35614w;
        if (eVar != null) {
            eVar.a(this, new b(this.f35600i, this.f35615x, c0488a.f35693a, c0488a.f35694b, c0488a.f35695c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), c0488a.f35697e));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f35605n <= 0 || this.f35606o <= 0) {
            w(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f35605n;
        layoutParams.height = this.f35606o;
        setLayoutParams(layoutParams);
        if (this.f35600i == null) {
            w(true);
            return;
        }
        float f10 = i12 - i10;
        float f11 = i13 - i11;
        d(f10, f11, true, false);
        if (this.C == null) {
            if (this.E) {
                this.E = false;
                i(false, false);
                return;
            }
            return;
        }
        int i14 = this.D;
        if (i14 != this.f35601j) {
            this.f35602k = i14;
            d(f10, f11, true, false);
        }
        this.f35594c.mapRect(this.C);
        this.f35593b.setCropWindowRect(this.C);
        i(false, false);
        this.f35593b.i();
        this.C = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int width;
        int height;
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        Bitmap bitmap = this.f35600i;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < this.f35600i.getWidth() ? ((double) size) / ((double) this.f35600i.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < this.f35600i.getHeight() ? ((double) size2) / ((double) this.f35600i.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = this.f35600i.getWidth();
            height = this.f35600i.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) this.f35600i.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) this.f35600i.getWidth()) * height2);
            height = size2;
        }
        int iH = h(mode, size, width);
        int iH2 = h(mode2, size2, height);
        this.f35605n = iH;
        this.f35606o = iH2;
        setMeasuredDimension(iH, iH2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        CropImageView cropImageView;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.G == null && this.f35615x == null && this.f35600i == null && this.f35607p == 0) {
            Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
            if (uri != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string == null) {
                    cropImageView = this;
                } else {
                    Pair pair = com.theartofdev.edmodo.cropper.c.f35714g;
                    Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) com.theartofdev.edmodo.cropper.c.f35714g.second).get();
                    com.theartofdev.edmodo.cropper.c.f35714g = null;
                    if (bitmap == null || bitmap.isRecycled()) {
                        cropImageView = this;
                    } else {
                        cropImageView = this;
                        cropImageView.s(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                }
                if (cropImageView.f35615x == null) {
                    setImageUriAsync(uri);
                }
            } else {
                cropImageView = this;
                int i10 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i10 > 0) {
                    setImageResource(i10);
                } else {
                    Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                    if (uri2 != null) {
                        setImageUriAsync(uri2);
                    }
                }
            }
            int i11 = bundle.getInt("DEGREES_ROTATED");
            cropImageView.D = i11;
            cropImageView.f35602k = i11;
            Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                cropImageView.f35593b.setInitialCropWindowRect(rect);
            }
            RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                cropImageView.C = rectF;
            }
            cropImageView.f35593b.setCropShape(c.valueOf(bundle.getString("CROP_SHAPE")));
            cropImageView.f35612u = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            cropImageView.f35613v = bundle.getInt("CROP_MAX_ZOOM");
            cropImageView.f35603l = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            cropImageView.f35604m = bundle.getBoolean("CROP_FLIP_VERTICALLY");
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        com.theartofdev.edmodo.cropper.b bVar;
        if (this.f35615x == null && this.f35600i == null && this.f35607p < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uriD = this.f35615x;
        if (this.f35609r && uriD == null && this.f35607p < 1) {
            uriD = com.theartofdev.edmodo.cropper.c.D(getContext(), this.f35600i, this.F);
            this.F = uriD;
        }
        if (uriD != null && this.f35600i != null) {
            String string = UUID.randomUUID().toString();
            com.theartofdev.edmodo.cropper.c.f35714g = new Pair(string, new WeakReference(this.f35600i));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.G;
        if (weakReference != null && (bVar = (com.theartofdev.edmodo.cropper.b) weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.b());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriD);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f35607p);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f35616y);
        bundle.putInt("DEGREES_ROTATED", this.f35602k);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f35593b.getInitialCropWindowRect());
        RectF rectF = com.theartofdev.edmodo.cropper.c.f35710c;
        rectF.set(this.f35593b.getCropWindowRect());
        this.f35594c.invert(this.f35595d);
        this.f35595d.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f35593b.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f35612u);
        bundle.putInt("CROP_MAX_ZOOM", this.f35613v);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f35603l);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f35604m);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.E = i12 > 0 && i13 > 0;
    }

    void p(com.theartofdev.edmodo.cropper.b.a aVar) {
        this.G = null;
        u();
        if (aVar.f35707e == null) {
            int i10 = aVar.f35706d;
            this.f35601j = i10;
            s(aVar.f35704b, 0, aVar.f35703a, aVar.f35705c, i10);
        }
    }

    public void q(int i10) {
        if (this.f35600i != null) {
            int i11 = i10 < 0 ? (i10 % 360) + 360 : i10 % 360;
            boolean z10 = !this.f35593b.m() && ((i11 > 45 && i11 < 135) || (i11 > 215 && i11 < 305));
            RectF rectF = com.theartofdev.edmodo.cropper.c.f35710c;
            rectF.set(this.f35593b.getCropWindowRect());
            float fHeight = (z10 ? rectF.height() : rectF.width()) / 2.0f;
            float fWidth = (z10 ? rectF.width() : rectF.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.f35603l;
                this.f35603l = this.f35604m;
                this.f35604m = z11;
            }
            this.f35594c.invert(this.f35595d);
            float[] fArr = com.theartofdev.edmodo.cropper.c.f35711d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f35595d.mapPoints(fArr);
            this.f35602k = (this.f35602k + i11) % 360;
            d(getWidth(), getHeight(), true, false);
            Matrix matrix = this.f35594c;
            float[] fArr2 = com.theartofdev.edmodo.cropper.c.f35712e;
            matrix.mapPoints(fArr2, fArr);
            float fSqrt = (float) (((double) this.f35617z) / Math.sqrt(Math.pow(fArr2[4] - fArr2[2], 2.0d) + Math.pow(fArr2[5] - fArr2[3], 2.0d)));
            this.f35617z = fSqrt;
            this.f35617z = Math.max(fSqrt, 1.0f);
            d(getWidth(), getHeight(), true, false);
            this.f35594c.mapPoints(fArr2, fArr);
            double dSqrt = Math.sqrt(Math.pow(fArr2[4] - fArr2[2], 2.0d) + Math.pow(fArr2[5] - fArr2[3], 2.0d));
            float f10 = (float) (((double) fHeight) * dSqrt);
            float f11 = (float) (((double) fWidth) * dSqrt);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            rectF.set(f12 - f10, f13 - f11, f12 + f10, f13 + f11);
            this.f35593b.r();
            this.f35593b.setCropWindowRect(rectF);
            d(getWidth(), getHeight(), true, false);
            i(false, false);
            this.f35593b.i();
        }
    }

    public void r(int i10, int i11) {
        this.f35593b.setAspectRatioX(i10);
        this.f35593b.setAspectRatioY(i11);
        setFixedAspectRatio(true);
    }

    public void setAutoZoomEnabled(boolean z10) {
        if (this.f35612u != z10) {
            this.f35612u = z10;
            i(false, false);
            this.f35593b.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f35593b.setInitialCropWindowRect(rect);
    }

    public void setCropShape(c cVar) {
        this.f35593b.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f35593b.setFixedAspectRatio(z10);
    }

    public void setFlippedHorizontally(boolean z10) {
        if (this.f35603l != z10) {
            this.f35603l = z10;
            d(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z10) {
        if (this.f35604m != z10) {
            this.f35604m = z10;
            d(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(d dVar) {
        this.f35593b.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f35593b.setInitialCropWindowRect(null);
        s(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i10) {
        if (i10 != 0) {
            this.f35593b.setInitialCropWindowRect(null);
            s(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference weakReference = this.G;
            com.theartofdev.edmodo.cropper.b bVar = weakReference != null ? (com.theartofdev.edmodo.cropper.b) weakReference.get() : null;
            if (bVar != null) {
                bVar.cancel(true);
            }
            e();
            this.C = null;
            this.D = 0;
            this.f35593b.setInitialCropWindowRect(null);
            WeakReference weakReference2 = new WeakReference(new com.theartofdev.edmodo.cropper.b(this, uri));
            this.G = weakReference2;
            ((com.theartofdev.edmodo.cropper.b) weakReference2.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            u();
        }
    }

    public void setMaxZoom(int i10) {
        if (this.f35613v == i10 || i10 <= 0) {
            return;
        }
        this.f35613v = i10;
        i(false, false);
        this.f35593b.invalidate();
    }

    public void setMultiTouchEnabled(boolean z10) {
        if (this.f35593b.u(z10)) {
            i(false, false);
            this.f35593b.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(e eVar) {
        this.f35614w = eVar;
    }

    public void setRotatedDegrees(int i10) {
        int i11 = this.f35602k;
        if (i11 != i10) {
            q(i10 - i11);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z10) {
        this.f35609r = z10;
    }

    public void setScaleType(k kVar) {
        if (kVar != this.f35608q) {
            this.f35608q = kVar;
            this.f35617z = 1.0f;
            this.B = 0.0f;
            this.A = 0.0f;
            this.f35593b.r();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z10) {
        if (this.f35610s != z10) {
            this.f35610s = z10;
            t();
        }
    }

    public void setShowProgressBar(boolean z10) {
        if (this.f35611t != z10) {
            this.f35611t = z10;
            u();
        }
    }

    public void setSnapRadius(float f10) {
        if (f10 >= 0.0f) {
            this.f35593b.setSnapRadius(f10);
        }
    }

    public void v(int i10, int i11, j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i12) {
        Bitmap bitmap = this.f35600i;
        if (bitmap != null) {
            this.f35592a.clearAnimation();
            WeakReference weakReference = this.H;
            com.theartofdev.edmodo.cropper.a aVar = weakReference != null ? (com.theartofdev.edmodo.cropper.a) weakReference.get() : null;
            if (aVar != null) {
                aVar.cancel(true);
            }
            j jVar2 = j.NONE;
            int i13 = jVar != jVar2 ? i10 : 0;
            int i14 = jVar != jVar2 ? i11 : 0;
            int width = this.f35616y * bitmap.getWidth();
            int height = bitmap.getHeight();
            int i15 = this.f35616y;
            int i16 = height * i15;
            if (this.f35615x == null || (i15 <= 1 && jVar != j.SAMPLING)) {
                this.H = new WeakReference(new com.theartofdev.edmodo.cropper.a(this, bitmap, getCropPoints(), this.f35602k, this.f35593b.m(), this.f35593b.getAspectRatioX(), this.f35593b.getAspectRatioY(), i13, i14, this.f35603l, this.f35604m, jVar, uri, compressFormat, i12));
            } else {
                this.H = new WeakReference(new com.theartofdev.edmodo.cropper.a(this, this.f35615x, getCropPoints(), this.f35602k, width, i16, this.f35593b.m(), this.f35593b.getAspectRatioX(), this.f35593b.getAspectRatioY(), i13, i14, this.f35603l, this.f35604m, jVar, uri, compressFormat, i12));
            }
            ((com.theartofdev.edmodo.cropper.a) this.H.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            u();
        }
    }

    public void setOnCropWindowChangedListener(h hVar) {
    }

    public void setOnSetCropOverlayMovedListener(f fVar) {
    }

    public void setOnSetCropOverlayReleasedListener(g gVar) {
    }

    public void setOnSetImageUriCompleteListener(i iVar) {
    }
}
