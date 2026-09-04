package com.hecorat.screenrecorder.free.activities;

import android.os.Bundle;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.activities.NotificationClickActivity;
import com.hecorat.screenrecorder.free.ui.live.LiveHomeActivity;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationClickActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dk.a f22647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dk.a f22648d;

    public static /* synthetic */ void x0(NotificationClickActivity notificationClickActivity, Class cls, boolean z10) {
        if (z10) {
            notificationClickActivity.getClass();
            l0.q(notificationClickActivity, cls);
        }
        notificationClickActivity.finish();
    }

    private void y0(final Class cls) {
        if (!lg.c.c()) {
            lg.c.k(new lg.c.a() { // from class: ff.l0
                @Override // lg.c.a
                public final void a(boolean z10) {
                    NotificationClickActivity.x0(this.f38540a, cls, z10);
                }
            });
        } else {
            l0.q(this, cls);
            finish();
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AzRecorderApp.d().s(this);
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getAction() == null) {
            finish();
            return;
        }
        String action = getIntent().getAction();
        action.getClass();
        switch (action) {
            case "action_start_record":
                ((dg.l) this.f22647c.get()).w0("notification_button");
                finish();
                break;
            case "action_open_live":
                y0(LiveHomeActivity.class);
                break;
            case "action_open_tool":
                y0(ToolboxActivity.class);
                break;
            case "action_stop_live":
                ((dg.a) this.f22648d.get()).q();
                finish();
                break;
            case "action_stop_record":
                ((dg.l) this.f22647c.get()).x0("notification_button");
                finish();
                break;
            case "action_pause_or_resume":
                ((dg.l) this.f22647c.get()).k0();
                finish();
                break;
        }
    }
}
