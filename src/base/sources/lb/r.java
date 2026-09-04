package lb;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.v0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface r extends u {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ra.v f44219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f44220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44221c;

        public a(ra.v vVar, int... iArr) {
            this(vVar, iArr, 0);
        }

        public a(ra.v vVar, int[] iArr, int i10) {
            if (iArr.length == 0) {
                ob.u.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f44219a = vVar;
            this.f44220b = iArr;
            this.f44221c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        r[] a(a[] aVarArr, nb.d dVar, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var);
    }

    boolean d(int i10, long j10);

    void disable();

    void e(long j10, long j11, long j12, List list, ta.o[] oVarArr);

    void enable();

    int evaluateQueueSize(long j10, List list);

    boolean f(int i10, long j10);

    default boolean g(long j10, ta.f fVar, List list) {
        return false;
    }

    v0 getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    void onPlaybackSpeed(float f10);

    default void a() {
    }

    default void c() {
    }

    default void b(boolean z10) {
    }
}
