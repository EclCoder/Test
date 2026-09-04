package z0;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final s a(File file) {
        kotlin.jvm.internal.s.h(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.s.g(absolutePath, "file.canonicalFile.absolutePath");
        return t.a(absolutePath);
    }
}
