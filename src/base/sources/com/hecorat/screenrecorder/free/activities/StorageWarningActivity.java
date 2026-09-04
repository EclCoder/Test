package com.hecorat.screenrecorder.free.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class StorageWarningActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22668c;

    public static void z0(Context context, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) StorageWarningActivity.class);
        intent.putExtra("is_video_recorded", z10);
        if (AzRecorderApp.e().h()) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(268468224);
        }
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f22668c) {
            l0.q(this, VideoReviewActivity.class);
        }
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_storage_warning);
        setFinishOnTouchOutside(true);
        this.f22668c = getIntent().getBooleanExtra("is_video_recorded", false);
        findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() { // from class: ff.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38590a.finish();
            }
        });
        findViewById(R.id.root_view).setOnClickListener(new View.OnClickListener() { // from class: ff.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38596a.finish();
            }
        });
    }
}
