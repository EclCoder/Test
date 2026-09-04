package p6;

import android.os.Build;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f49556a = Build.VERSION.SDK_INT;

    public static int a(long j10, long j11) {
        return Math.min(Math.max(0, j11 > 0 ? (int) (((j10 * 1.0d) / j11) * 100.0d) : 0), 100);
    }

    public static String b(long j10) {
        StringBuilder sb2 = new StringBuilder();
        long j11 = j10 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j12 = ((j10 % 3600000) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j11 >= 10) {
            sb2.append(j11);
        } else if (j11 > 0) {
            sb2.append(0);
            sb2.append(j11);
        } else {
            sb2.append(0);
            sb2.append(0);
        }
        sb2.append(":");
        if (j12 >= 10) {
            sb2.append(j12);
        } else if (j12 > 0) {
            sb2.append(0);
            sb2.append(j12);
        } else {
            sb2.append(0);
            sb2.append(0);
        }
        return sb2.toString();
    }

    public static void c(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i10 = f49556a;
        if (i10 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i10 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
