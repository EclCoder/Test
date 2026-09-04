package com.hecorat.screenrecorder.free.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.MutedWarningBelow10Activity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MutedWarningBelow10Activity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f22646c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        void a(boolean z10);
    }

    public static /* synthetic */ void x0(MutedWarningBelow10Activity mutedWarningBelow10Activity, View view) {
        a aVar = f22646c;
        if (aVar != null) {
            mutedWarningBelow10Activity.getClass();
            aVar.a(true);
            f22646c = null;
        }
        mutedWarningBelow10Activity.finish();
    }

    public static void y0(Context context, a aVar) {
        Intent intent = new Intent(context, (Class<?>) MutedWarningBelow10Activity.class);
        if (AzRecorderApp.e().h()) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(268468224);
        }
        context.startActivity(intent);
        f22646c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(true);
        setContentView(R.layout.activity_muted_warning_below10);
        findViewById(R.id.continue_btn).setOnClickListener(new View.OnClickListener() { // from class: ff.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MutedWarningBelow10Activity.x0(this.f38537a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        a aVar = f22646c;
        if (aVar != null) {
            aVar.a(false);
            f22646c = null;
        }
        super.onDestroy();
    }
}
