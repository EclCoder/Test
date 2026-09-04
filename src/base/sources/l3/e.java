package l3;

import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f43846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43849d;

    public e(List list, long j10, long j11) {
        this.f43846a = c0.x(list);
        this.f43847b = j10;
        this.f43848c = j11;
        long j12 = C.TIME_UNSET;
        if (j10 != C.TIME_UNSET && j11 != C.TIME_UNSET) {
            j12 = j10 + j11;
        }
        this.f43849d = j12;
    }
}
