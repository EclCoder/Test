package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Qg {
    public static Pg a(String content, String markupType) {
        kotlin.jvm.internal.s.h(content, "content");
        kotlin.jvm.internal.s.h(markupType, "markupType");
        int iHashCode = markupType.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && markupType.equals("htmlUrl")) {
                    return new Z7(content);
                }
            } else if (markupType.equals("html")) {
                return new Y7(content);
            }
        } else if (markupType.equals("inmobiJson")) {
            return new C3296s9(content);
        }
        throw new IllegalArgumentException("Unsupported markup type: " + markupType);
    }
}
