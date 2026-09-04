package ql;

import java.io.File;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends h {
    public static final d j(File file, e direction) {
        s.h(file, "<this>");
        s.h(direction, "direction");
        return new d(file, direction);
    }

    public static final d k(File file) {
        s.h(file, "<this>");
        return j(file, e.BOTTOM_UP);
    }

    public static d l(File file) {
        s.h(file, "<this>");
        return j(file, e.TOP_DOWN);
    }
}
