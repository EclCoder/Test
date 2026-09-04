package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements r4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7770a = l.f("WrkMgrInitializer");

    @Override // r4.a
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // r4.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v create(Context context) {
        l.c().a(f7770a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        v.e(context, new b.C0101b().a());
        return v.d(context);
    }
}
