package n0;

import android.os.Build;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static g0 a(Display display, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.d(display.getRoundedCorner(i10));
        }
        return null;
    }
}
