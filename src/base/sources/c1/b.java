package c1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        s.h(context, "<this>");
        s.h(name, "name");
        return y0.a.a(context, name + ".preferences_pb");
    }
}
