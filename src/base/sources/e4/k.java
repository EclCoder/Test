package e4;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final b a(BackEvent backEvent) {
        s.h(backEvent, "backEvent");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new b(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
