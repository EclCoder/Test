package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class Cea708Cue extends Cue implements Comparable<Cea708Cue> {
    public static final int PRIORITY_UNSET = -1;
    public final int priority;

    public Cea708Cue(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12, z10, i13);
        this.priority = i14;
    }

    @Override // java.lang.Comparable
    public int compareTo(Cea708Cue cea708Cue) {
        int i10 = cea708Cue.priority;
        int i11 = this.priority;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
