package com.hecorat.screenrecorder.free.activities.image_editor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.d0;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.image_editor.BlurActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nh.f0;
import nh.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BlurActivity extends d implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f22811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f22812d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends d0 {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            BlurActivity.this.B0(null);
        }
    }

    private void A0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: gf.o
            @Override // java.lang.Runnable
            public final void run() {
                BlurActivity blurActivity = this.f39157a;
                f0.H(blurActivity, nh.o.b(blurActivity, blurActivity.f22811c, 10.5f), true, new f0.e() { // from class: gf.p
                    @Override // nh.f0.e
                    public final void a(Uri uri) {
                        BlurActivity.y0(blurActivity, handler, uri);
                    }
                });
            }
        });
    }

    private void C0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitleTextColor(-1);
        u0(toolbar);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        aVarL0.t(true);
        aVarL0.A(true);
    }

    private void D0(boolean z10) {
        if (z10) {
            this.f22812d.setVisibility(0);
        } else {
            this.f22812d.setVisibility(8);
        }
    }

    public static /* synthetic */ void x0(BlurActivity blurActivity, Uri uri) {
        blurActivity.D0(false);
        blurActivity.B0(uri);
    }

    public static /* synthetic */ void y0(final BlurActivity blurActivity, Handler handler, final Uri uri) {
        blurActivity.getClass();
        handler.post(new Runnable() { // from class: gf.q
            @Override // java.lang.Runnable
            public final void run() {
                BlurActivity.x0(this.f39161a, uri);
            }
        });
    }

    public void B0(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        setResult(-1, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_convert) {
            D0(true);
            A0();
            Bundle bundle = new Bundle();
            bundle.putString("edit_action", "blur");
            FirebaseAnalytics.getInstance(this).a("edit_photo", bundle);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_image_blur);
        this.f22812d = (ViewGroup) findViewById(R.id.layout_progress_bar);
        ((Button) findViewById(R.id.button_convert)).setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_main_image);
        C0();
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), getIntent().getData());
            this.f22811c = bitmap;
            imageView.setImageBitmap(bitmap);
        } catch (Exception e10) {
            wp.a.e(e10);
            j0.b(this, R.string.toast_can_not_open_file);
            finish();
        }
        getOnBackPressedDispatcher().g(this, new a(true));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            B0(null);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
