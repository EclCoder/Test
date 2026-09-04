package com.hecorat.screenrecorder.free.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.s;
import com.hecorat.screenrecorder.free.R;
import java.util.Collections;
import nh.f0;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ScreenshotActionActivity extends s implements f0.b {
    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2025) {
            t(i11 == -1);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("action", -1);
        Uri data = getIntent().getData();
        if (intExtra == R.id.share_ll) {
            f0.K(this, data, "image/*");
        } else if (intExtra == R.id.delete_ll) {
            f0.o(this, Collections.singletonList(data), this, 2025);
        }
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
