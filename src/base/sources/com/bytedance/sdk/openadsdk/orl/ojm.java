package com.bytedance.sdk.openadsdk.orl;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    private final AudioManager hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14585hn = -1;
    private boolean qor = false;

    public ojm(Context context) {
        this.hnj = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public int hnj() {
        return this.f14585hn;
    }

    public void hnj(boolean z10) {
        hnj(z10, false);
    }

    public void hnj(boolean z10, boolean z11) {
        if (this.hnj == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int iDse = DeviceUtils.dse();
            if (iDse != 0) {
                this.f14585hn = iDse;
            } else if (!z11) {
                return;
            }
            hnj(3, 0, 0);
            this.qor = true;
            return;
        }
        int iOjm = this.f14585hn;
        if (iOjm == 0) {
            iOjm = DeviceUtils.ojm() / 15;
        } else {
            if (iOjm == -1) {
                if (!z11) {
                    return;
                } else {
                    iOjm = DeviceUtils.ojm() / 15;
                }
            }
            this.f14585hn = -1;
            hnj(3, iOjm, i10);
            this.qor = true;
        }
        i10 = 1;
        this.f14585hn = -1;
        hnj(3, iOjm, i10);
        this.qor = true;
    }

    private void hnj(int i10, int i11, int i12) {
        try {
            this.hnj.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
