package com.hecorat.screenrecorder.free.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MutedWarningActivity extends androidx.appcompat.app.d {
    public static void y0(Context context) {
        Intent intent = new Intent(context, (Class<?>) MutedWarningActivity.class);
        if (AzRecorderApp.e().h()) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(268468224);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_muted_warning);
        findViewById(R.id.ok_btn).setOnClickListener(new View.OnClickListener() { // from class: ff.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38534a.finish();
            }
        });
    }
}
