package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class a extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f35674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f35675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f35676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f35677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f35678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f35682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f35683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f35684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f35685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f35686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f35687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f35688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CropImageView.j f35689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Uri f35690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Bitmap.CompressFormat f35691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f35692s;

    a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, int i14, boolean z11, boolean z12, CropImageView.j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i15) {
        this.f35674a = new WeakReference(cropImageView);
        this.f35677d = cropImageView.getContext();
        this.f35675b = bitmap;
        this.f35678e = fArr;
        this.f35676c = null;
        this.f35679f = i10;
        this.f35682i = z10;
        this.f35683j = i11;
        this.f35684k = i12;
        this.f35685l = i13;
        this.f35686m = i14;
        this.f35687n = z11;
        this.f35688o = z12;
        this.f35689p = jVar;
        this.f35690q = uri;
        this.f35691r = compressFormat;
        this.f35692s = i15;
        this.f35680g = 0;
        this.f35681h = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0488a doInBackground(Void... voidArr) {
        c.a aVarG;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f35676c;
            if (uri != null) {
                aVarG = c.d(this.f35677d, uri, this.f35678e, this.f35679f, this.f35680g, this.f35681h, this.f35682i, this.f35683j, this.f35684k, this.f35685l, this.f35686m, this.f35687n, this.f35688o);
            } else {
                Bitmap bitmap = this.f35675b;
                if (bitmap == null) {
                    return new C0488a((Bitmap) null, 1);
                }
                aVarG = c.g(bitmap, this.f35678e, this.f35679f, this.f35682i, this.f35683j, this.f35684k, this.f35687n, this.f35688o);
            }
            Bitmap bitmapY = c.y(aVarG.f35715a, this.f35685l, this.f35686m, this.f35689p);
            Uri uri2 = this.f35690q;
            if (uri2 == null) {
                return new C0488a(bitmapY, aVarG.f35716b);
            }
            c.C(this.f35677d, bitmapY, uri2, this.f35691r, this.f35692s);
            if (bitmapY != null) {
                bitmapY.recycle();
            }
            return new C0488a(this.f35690q, aVarG.f35716b);
        } catch (Exception e10) {
            return new C0488a(e10, this.f35690q != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C0488a c0488a) {
        CropImageView cropImageView;
        if (c0488a != null) {
            if (!isCancelled() && (cropImageView = (CropImageView) this.f35674a.get()) != null) {
                cropImageView.o(c0488a);
                return;
            }
            Bitmap bitmap = c0488a.f35693a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0488a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f35693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f35694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Exception f35695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f35696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f35697e;

        C0488a(Bitmap bitmap, int i10) {
            this.f35693a = bitmap;
            this.f35694b = null;
            this.f35695c = null;
            this.f35696d = false;
            this.f35697e = i10;
        }

        C0488a(Uri uri, int i10) {
            this.f35693a = null;
            this.f35694b = uri;
            this.f35695c = null;
            this.f35696d = true;
            this.f35697e = i10;
        }

        C0488a(Exception exc, boolean z10) {
            this.f35693a = null;
            this.f35694b = null;
            this.f35695c = exc;
            this.f35696d = z10;
            this.f35697e = 1;
        }
    }

    a(CropImageView cropImageView, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, CropImageView.j jVar, Uri uri2, Bitmap.CompressFormat compressFormat, int i17) {
        this.f35674a = new WeakReference(cropImageView);
        this.f35677d = cropImageView.getContext();
        this.f35676c = uri;
        this.f35678e = fArr;
        this.f35679f = i10;
        this.f35682i = z10;
        this.f35683j = i13;
        this.f35684k = i14;
        this.f35680g = i11;
        this.f35681h = i12;
        this.f35685l = i15;
        this.f35686m = i16;
        this.f35687n = z11;
        this.f35688o = z12;
        this.f35689p = jVar;
        this.f35690q = uri2;
        this.f35691r = compressFormat;
        this.f35692s = i17;
        this.f35675b = null;
    }
}
