package uo;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements no.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f54868a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f54869a;

        a(String str) {
            this.f54869a = str;
        }
    }

    @Override // no.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i a(String str) {
        return new a(str);
    }

    public void c(String str, h hVar) {
        ip.a.h(str, "Name");
        ip.a.h(hVar, "Cookie spec factory");
        this.f54868a.put(str.toLowerCase(Locale.ENGLISH), hVar);
    }
}
