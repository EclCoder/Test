package eo;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements no.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f38092a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38093a;

        a(String str) {
            this.f38093a = str;
        }
    }

    @Override // no.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(String str) {
        return new a(str);
    }

    public void c(String str, c cVar) {
        ip.a.h(str, "Name");
        ip.a.h(cVar, "Authentication scheme factory");
        this.f38092a.put(str.toLowerCase(Locale.ENGLISH), cVar);
    }
}
