package l3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    private static int a(k kVar, long j10) {
        if (j10 == C.TIME_UNSET) {
            return 0;
        }
        int nextEventTimeIndex = kVar.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = kVar.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || kVar.getEventTime(nextEventTimeIndex + (-1)) != j10) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    private static void b(k kVar, int i10, w1.h hVar) {
        long eventTime = kVar.getEventTime(i10);
        List cues = kVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i10 == kVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = kVar.getEventTime(i10 + 1) - kVar.getEventTime(i10);
        if (eventTime2 > 0) {
            hVar.accept(new e(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void c(k kVar, r.b bVar, w1.h hVar) {
        boolean z10;
        int iA = a(kVar, bVar.f43875a);
        if (bVar.f43875a == C.TIME_UNSET || iA >= kVar.getEventTimeCount()) {
            z10 = false;
        } else {
            List cues = kVar.getCues(bVar.f43875a);
            long eventTime = kVar.getEventTime(iA);
            if (cues.isEmpty()) {
                z10 = false;
            } else {
                long j10 = bVar.f43875a;
                if (j10 < eventTime) {
                    hVar.accept(new e(cues, j10, eventTime - j10));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iA; i10 < kVar.getEventTimeCount(); i10++) {
            b(kVar, i10, hVar);
        }
        if (bVar.f43876b) {
            if (z10) {
                iA--;
            }
            for (int i11 = 0; i11 < iA; i11++) {
                b(kVar, i11, hVar);
            }
            if (z10) {
                hVar.accept(new e(kVar.getCues(bVar.f43875a), kVar.getEventTime(iA), bVar.f43875a - kVar.getEventTime(iA)));
            }
        }
    }
}
