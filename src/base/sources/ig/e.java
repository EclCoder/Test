package ig;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.image_editor.ImageCropActivity;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends Fragment implements CropImageView.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f41348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CropImageView f41349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageCropActivity f41350c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        RECT,
        CIRCULAR
    }

    public static /* synthetic */ void b(e eVar, Uri uri) {
        if (uri == null) {
            nh.j0.b(eVar.f41350c, R.string.toast_can_not_save_image);
        } else {
            eVar.f41350c.H0(false);
            eVar.f41350c.z0(uri);
        }
    }

    public static /* synthetic */ void d(final e eVar, Handler handler, final Uri uri) {
        eVar.getClass();
        handler.post(new Runnable() { // from class: ig.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f41346a, uri);
            }
        });
    }

    private void f(CropImageView.b bVar) {
        if (bVar.e() != null) {
            nh.j0.b(this.f41350c, R.string.toast_can_not_crop_image);
            return;
        }
        final Bitmap bitmapB = this.f41349b.getCropShape() == CropImageView.c.OVAL ? com.theartofdev.edmodo.cropper.d.b(bVar.a()) : bVar.a();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: ig.b
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f41335a;
                nh.f0.H(eVar.f41350c, bitmapB, true, new nh.f0.e() { // from class: ig.c
                    @Override // nh.f0.e
                    public final void a(Uri uri) {
                        e.d(eVar, handler, uri);
                    }
                });
            }
        });
    }

    public static e g(a aVar, Uri uri) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putString("demo_preset", aVar.name());
        bundle.putParcelable("media_uri", uri);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // com.theartofdev.edmodo.cropper.CropImageView.e
    public void a(CropImageView cropImageView, CropImageView.b bVar) {
        f(bVar);
    }

    public void h(lg.i iVar) {
        this.f41349b.setScaleType(iVar.f44515a);
        this.f41349b.setCropShape(iVar.f44516b);
        this.f41349b.setGuidelines(iVar.f44517c);
        this.f41349b.r(((Integer) iVar.f44518d.first).intValue(), ((Integer) iVar.f44518d.second).intValue());
        this.f41349b.setFixedAspectRatio(iVar.f44521g);
        this.f41349b.setMultiTouchEnabled(iVar.f44522h);
        this.f41349b.setShowCropOverlay(iVar.f44523i);
        this.f41349b.setShowProgressBar(iVar.f44524j);
        this.f41349b.setAutoZoomEnabled(iVar.f44519e);
        this.f41349b.setMaxZoom(iVar.f44520f);
    }

    public void i() {
        lg.i iVar = new lg.i();
        iVar.f44515a = this.f41349b.getScaleType();
        iVar.f44516b = this.f41349b.getCropShape();
        iVar.f44517c = this.f41349b.getGuidelines();
        iVar.f44518d = this.f41349b.getAspectRatio();
        iVar.f44521g = this.f41349b.k();
        iVar.f44523i = this.f41349b.l();
        iVar.f44524j = this.f41349b.m();
        iVar.f44519e = this.f41349b.j();
        iVar.f44520f = this.f41349b.getMaxZoom();
        ((ImageCropActivity) getActivity()).E0(iVar);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 203) {
            f(com.theartofdev.edmodo.cropper.d.a(intent));
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVarValueOf = a.valueOf(getArguments().getString("demo_preset"));
        this.f41348a = (Uri) getArguments().getParcelable("media_uri");
        ImageCropActivity imageCropActivity = (ImageCropActivity) getActivity();
        this.f41350c = imageCropActivity;
        imageCropActivity.D0(this);
        int iOrdinal = aVarValueOf.ordinal();
        if (iOrdinal == 0) {
            return layoutInflater.inflate(R.layout.fragment_main_rect, viewGroup, false);
        }
        if (iOrdinal != 1) {
            return null;
        }
        return layoutInflater.inflate(R.layout.fragment_main_oval, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        CropImageView cropImageView = this.f41349b;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
            this.f41349b.setOnCropImageCompleteListener(null);
        }
    }

    @Override // android.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.main_action_crop) {
            return false;
        }
        this.f41350c.H0(true);
        new Handler().postDelayed(new Runnable() { // from class: ig.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f41333a.f41349b.getCroppedImageAsync();
            }
        }, 200L);
        Bundle bundle = new Bundle();
        bundle.putString("edit_action", "crop");
        FirebaseAnalytics.getInstance(getActivity()).a("edit_photo", bundle);
        return true;
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CropImageView cropImageView = (CropImageView) view.findViewById(R.id.cropImageView);
        this.f41349b = cropImageView;
        cropImageView.setOnCropImageCompleteListener(this);
        i();
        if (bundle == null) {
            try {
                this.f41349b.setImageBitmap(MediaStore.Images.Media.getBitmap(this.f41350c.getContentResolver(), this.f41348a));
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }
}
