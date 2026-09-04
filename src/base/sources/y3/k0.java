package y3;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class k0 {
    public static final b1 a(Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        return new b1(intent.getData(), intent.getAction(), intent.getType());
    }
}
