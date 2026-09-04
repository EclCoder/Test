package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f35698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f35699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f35700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35702e;

    public b(CropImageView cropImageView, Uri uri) {
        this.f35699b = uri;
        this.f35698a = new WeakReference(cropImageView);
        this.f35700c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        double d10 = f10 > 1.0f ? 1.0f / f10 : 1.0d;
        this.f35701d = (int) (((double) displayMetrics.widthPixels) * d10);
        this.f35702e = (int) (((double) displayMetrics.heightPixels) * d10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) throws Throwable {
        try {
            if (isCancelled()) {
                return null;
            }
            c.a aVarL = c.l(this.f35700c, this.f35699b, this.f35701d, this.f35702e);
            if (isCancelled()) {
                return null;
            }
            c.b bVarA = c.A(aVarL.f35715a, this.f35700c, this.f35699b);
            return new a(this.f35699b, bVarA.f35717a, aVarL.f35716b, bVarA.f35718b);
        } catch (Exception e10) {
            return new a(this.f35699b, e10);
        }
    }

    public Uri b() {
        return this.f35699b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        CropImageView cropImageView;
        if (aVar != null) {
            if (!isCancelled() && (cropImageView = (CropImageView) this.f35698a.get()) != null) {
                cropImageView.p(aVar);
                return;
            }
            Bitmap bitmap = aVar.f35704b;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f35703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f35704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Exception f35707e;

        a(Uri uri, Bitmap bitmap, int i10, int i11) {
            this.f35703a = uri;
            this.f35704b = bitmap;
            this.f35705c = i10;
            this.f35706d = i11;
            this.f35707e = null;
        }

        a(Uri uri, Exception exc) {
            this.f35703a = uri;
            this.f35704b = null;
            this.f35705c = 0;
            this.f35706d = 0;
            this.f35707e = exc;
        }
    }
}
