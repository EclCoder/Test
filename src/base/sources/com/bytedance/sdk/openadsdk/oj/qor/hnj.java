package com.bytedance.sdk.openadsdk.oj.qor;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.eum;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private final SharedPreferences hnj;

    public hnj(Context context) {
        if (eum.hnj(context)) {
            this.hnj = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.hnj = context.getSharedPreferences("pag_monitor_record_" + eum.qor(context), 0);
    }

    public long hnj() {
        return this.hnj.getLong("last_upload_time", 0L);
    }

    public void hnj(long j10) {
        SharedPreferences.Editor editorEdit = this.hnj.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
