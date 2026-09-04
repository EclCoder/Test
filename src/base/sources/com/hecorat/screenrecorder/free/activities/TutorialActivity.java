package com.hecorat.screenrecorder.free.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class TutorialActivity extends Activity {
    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        l0.A(this, "grant_overlay_permission");
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        b();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tutorial);
        findViewById(R.id.tutorial_layout).setOnClickListener(new View.OnClickListener() { // from class: ff.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38542a.b();
            }
        });
    }
}
