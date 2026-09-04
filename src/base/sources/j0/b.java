package j0;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ int a() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 36 ? i10 * DefaultOggSeeker.MATCH_BYTE_RANGE : Build.VERSION.SDK_INT_FULL;
    }
}
