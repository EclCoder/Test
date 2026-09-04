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
import com.hecorat.screenrecorder.free.activities.image_editor.BlackWhiteActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nh.f0;
import nh.j0;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class BlackWhiteActivity extends d implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f22808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f22809d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends d0 {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            BlackWhiteActivity.this.B0(null);
        }
    }

    private void A0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: gf.l
            @Override // java.lang.Runnable
            public final void run() {
                BlackWhiteActivity blackWhiteActivity = this.f39151a;
                f0.H(blackWhiteActivity, nh.o.c(blackWhiteActivity.f22808c), true, new f0.e() { // from class: gf.m
                    @Override // nh.f0.e
                    public final void a(Uri uri) {
                        BlackWhiteActivity.y0(blackWhiteActivity, handler, uri);
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
            this.f22809d.setVisibility(0);
        } else {
            this.f22809d.setVisibility(8);
        }
    }

    public static /* synthetic */ void y0(final BlackWhiteActivity blackWhiteActivity, Handler handler, final Uri uri) {
        blackWhiteActivity.getClass();
        handler.post(new Runnable() { // from class: gf.n
            @Override // java.lang.Runnable
            public final void run() {
                BlackWhiteActivity.z0(this.f39155a, uri);
            }
        });
    }

    public static /* synthetic */ void z0(BlackWhiteActivity blackWhiteActivity, Uri uri) {
        blackWhiteActivity.D0(false);
        blackWhiteActivity.B0(uri);
    }

    public void B0(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_image_black_white);
        this.f22809d = (ViewGroup) findViewById(R.id.layout_progress_bar);
        ((Button) findViewById(R.id.button_convert)).setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_main_image);
        C0();
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), getIntent().getData());
            this.f22808c = bitmap;
            imageView.setImageBitmap(bitmap);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_convert) {
            D0(true);
            A0();
            Bundle bundle = new Bundle();
            bundle.putString("edit_action", qnwOeeQSSWa.NtZlUVYuA);
            FirebaseAnalytics.getInstance(this).a("edit_photo", bundle);
        }
    }
}
