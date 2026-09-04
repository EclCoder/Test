package qn;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final int a(String str, int i10) {
        s.h(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
