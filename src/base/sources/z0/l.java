package z0;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final boolean a(File file, File toFile) {
        kotlin.jvm.internal.s.h(file, "<this>");
        kotlin.jvm.internal.s.h(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? a.f58211a.a(file, toFile) : file.renameTo(toFile);
    }
}
