package com.hecorat.screenrecorder.free.activities.image_editor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.d0;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.image_editor.DrawOnBitmapActivity;
import com.hecorat.screenrecorder.free.widget.DrawingOnBitmapView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nh.f0;
import wf.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DrawOnBitmapActivity extends d implements View.OnClickListener, c.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DrawingOnBitmapView f22814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f22815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewGroup f22816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f22817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f22818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f22820i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends d0 {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            DrawOnBitmapActivity.this.A0(null);
        }
    }

    private void B0() {
        if (this.f22815d != null) {
            D0(true);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            final Handler handler = new Handler(Looper.getMainLooper());
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: gf.r
                @Override // java.lang.Runnable
                public final void run() {
                    DrawOnBitmapActivity drawOnBitmapActivity = this.f39163a;
                    f0.H(drawOnBitmapActivity, drawOnBitmapActivity.f22815d, true, new f0.e() { // from class: gf.s
                        @Override // nh.f0.e
                        public final void a(Uri uri) {
                            DrawOnBitmapActivity.y0(drawOnBitmapActivity, handler, uri);
                        }
                    });
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("edit_action", "draw");
            FirebaseAnalytics.getInstance(this).a("edit_photo", bundle);
        }
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
            this.f22816e.setVisibility(0);
        } else {
            this.f22816e.setVisibility(8);
        }
    }

    private void E0() {
        if (this.f22819h == 1) {
            this.f22818g.setImageResource(R.drawable.ic_colorize_white_24dp);
            this.f22819h = 2;
        } else {
            this.f22818g.setImageResource(R.drawable.ic_brush_white_24dp);
            this.f22819h = 1;
        }
        this.f22814c.e(4, this.f22819h);
    }

    public static /* synthetic */ void y0(final DrawOnBitmapActivity drawOnBitmapActivity, Handler handler, final Uri uri) {
        drawOnBitmapActivity.getClass();
        handler.post(new Runnable() { // from class: gf.t
            @Override // java.lang.Runnable
            public final void run() {
                DrawOnBitmapActivity.z0(this.f39167a, uri);
            }
        });
    }

    public static /* synthetic */ void z0(DrawOnBitmapActivity drawOnBitmapActivity, Uri uri) {
        drawOnBitmapActivity.D0(false);
        drawOnBitmapActivity.A0(uri);
    }

    public void A0(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        setResult(-1, intent);
        finish();
    }

    @Override // wf.c.a
    public void a(int i10) {
        this.f22814c.setColor(i10);
        this.f22817f.setColorFilter(i10);
        this.f22820i.B(i10);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.iv_brush) {
            E0();
            return;
        }
        if (id2 == R.id.iv_undo) {
            this.f22814c.i();
        } else if (id2 == R.id.iv_clear_all) {
            this.f22814c.c();
        } else if (id2 == R.id.iv_pick_color) {
            this.f22820i.show();
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_image_draw);
        this.f22816e = (ViewGroup) findViewById(R.id.layout_progress_bar);
        this.f22814c = (DrawingOnBitmapView) findViewById(R.id.iv_draw_image_method_2);
        ImageView imageView = (ImageView) findViewById(R.id.iv_pick_color);
        this.f22817f = imageView;
        imageView.setOnClickListener(this);
        ((ImageView) findViewById(R.id.iv_undo)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.iv_clear_all)).setOnClickListener(this);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_brush);
        this.f22818g = imageView2;
        imageView2.setOnClickListener(this);
        c cVar = new c(this, -16711936, R.string.text_color);
        this.f22820i = cVar;
        cVar.C(this);
        C0();
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), getIntent().getData());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            this.f22815d = bitmapCreateBitmap;
            this.f22814c.d(bitmap, bitmapCreateBitmap);
            this.f22819h = 1;
            this.f22814c.e(4, 1);
            this.f22814c.setColor(-16711936);
            this.f22817f.setColorFilter(-16711936);
        } catch (Exception e10) {
            wp.a.e(e10);
        }
        getOnBackPressedDispatcher().g(this, new a(true));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.draw_image, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.main_action_draw) {
            B0();
        }
        if (menuItem.getItemId() == 16908332) {
            A0(null);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
