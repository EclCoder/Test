package z4;

import android.util.Log;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58613a = new a();

    private a() {
    }

    @Override // z4.e
    public void a(String tag, String message) {
        s.h(tag, "tag");
        s.h(message, "message");
        Log.d(tag, message);
    }
}
