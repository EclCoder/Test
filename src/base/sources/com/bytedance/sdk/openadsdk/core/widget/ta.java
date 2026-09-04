package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends dse {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14301hn;
    private long hnj;

    public ta(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public long getDisplayDuration() {
        if (this.hnj == 0) {
            return 0L;
        }
        if (this.f14301hn == 0) {
            this.f14301hn = SystemClock.elapsedRealtime();
        }
        return this.f14301hn - this.hnj;
    }

    public boolean gjv() {
        return this.hnj > 0 && this.f14301hn > 0;
    }

    public void hn(as asVar, int i10) {
        if (isShown()) {
            return;
        }
        hn();
        setVisibility(0);
        this.hnj = SystemClock.elapsedRealtime();
        hnj(asVar, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.dse
    protected boolean hnj() {
        return false;
    }

    public void qor() {
        setVisibility(8);
        if (this.hnj != 0) {
            this.f14301hn = SystemClock.elapsedRealtime();
        }
    }
}
