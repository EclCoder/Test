package com.hecorat.screenrecorder.free.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.image_editor.ImageCropActivity;
import ff.v0;
import java.util.Collections;
import nh.f0;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ScreenshotReviewActivity extends v0 implements View.OnClickListener, f0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f22660f;

    public static void B0(Context context, Uri uri) {
        Intent intent = new Intent(context, (Class<?>) ScreenshotReviewActivity.class);
        intent.setData(uri);
        if (AzRecorderApp.e().h()) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(268468224);
        }
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2025) {
            t(i11 == -1);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.fm_view_result) {
            f0.A(this, this.f22660f, 1);
            finish();
            return;
        }
        if (id2 == R.id.iv_share) {
            f0.K(this, this.f22660f, "image/*");
            return;
        }
        if (id2 == R.id.iv_delete) {
            if (Build.VERSION.SDK_INT >= 30) {
                f0.p(this, this.f22660f, this, 2025);
                return;
            } else {
                f0.l(this, Collections.singletonList(this.f22660f), this, 2025);
                return;
            }
        }
        if (id2 != R.id.iv_edit) {
            if (id2 == R.id.iv_close) {
                finish();
            }
        } else {
            Intent intent = new Intent(this, (Class<?>) ImageCropActivity.class);
            intent.setData(this.f22660f);
            intent.putExtra("from", 1);
            intent.addFlags(1);
            startActivity(intent);
            finish();
        }
    }

    @Override // ff.v0, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_screenshot_review);
        super.onCreate(bundle);
        this.f22660f = getIntent().getData();
        ((com.bumptech.glide.k) com.bumptech.glide.c.C(this).r(this.f22660f).e()).A0((ImageView) findViewById(R.id.iv_thumb));
        findViewById(R.id.fm_view_result).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);
        findViewById(R.id.iv_delete).setOnClickListener(this);
        findViewById(R.id.iv_edit).setOnClickListener(this);
        findViewById(R.id.iv_close).setOnClickListener(this);
    }

    @Override // nh.f0.b
    public void t(boolean z10) {
        if (!z10) {
            j0.b(this, R.string.toast_image_was_not_deleted);
            return;
        }
        l0.A(this, "grant_permission_storage");
        j0.b(this, f0.N(this) ? R.string.toast_image_have_been_moved_to_trash : R.string.toast_image_have_been_deleted);
        finish();
    }
}
