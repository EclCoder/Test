package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.V1[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.V1[]) from 0x002a: INVOKE (r0v1 com.inmobi.media.V1[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:43)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class V1 {
    f25865d("UNKNOWN"),
    f25866e("PLAYING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("COMPLETED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U1 f25863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f25864c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25868a;

    static {
        ml.b.a(new V1[]{r0, r1, new V1("PAUSED"), new V1("COMPLETED")});
        f25863b = new U1();
        f25864c = new SparseArray();
        for (V1 v10 : values()) {
            f25864c.put(v10.f25868a, v10);
        }
    }

    public V1(String str) {
        super(str, i);
        this.f25868a = i;
    }

    public static V1 valueOf(String str) {
        return (V1) Enum.valueOf(V1.class, str);
    }

    public static V1[] values() {
        return (V1[]) f25867f.clone();
    }
}
